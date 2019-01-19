import java.time.LocalDateTime
import java.util.*

class TodoItem(
    var title: String,
    var createTime: LocalDateTime = LocalDateTime.now(),
    val id: String = UUID.randomUUID().toString(),
    var success: Boolean = false
) {

    fun complete(): Unit {
        this.success = true
    }

    fun cancellation(): Unit {
        this.success = false
    }
}