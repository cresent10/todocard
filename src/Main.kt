import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Todo(
        @Id @GeneratedValue val id: Long? = null,
        val title: String,
        val content: String,
        val dueDate: LocalDateTime,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val createdBy: String
)