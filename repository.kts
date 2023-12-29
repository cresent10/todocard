import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface TodoRepository : CrudRepository<Todo, Long> {

    @Query("SELECT t FROM Todo t WHERE t.createdBy = :name")
    fun findByCreatedBy(name: String): List<Todo>
}
