import java.util.stream.IntStream

class TodoApp {

    val list: ArrayList<TodoItem> = ArrayList<TodoItem>()

    fun add(title: String) {
        this.list.add(TodoItem(title))
    }

    fun complete(index: Int) {
        getTodoList()[index - 1].complete()
    }

    fun cancellation(index: Int) {
        getCompleteList()[index - 1].cancellation()
    }

    fun getTodoList(): List<TodoItem> {
        return this.list.filter { item -> !item.success }
    }

    fun getCompleteList(): List<TodoItem> {
        return this.list.filter { item -> item.success }
    }

    fun edit (index: Int, title: String) {
        getTodoList()[index - 1].title = title
    }

    fun show() {
        IntStream.range(0, 20).forEach { println("") }
        println("TODO List")
        getTodoList().forEachIndexed { index, item -> println("${index + 1}: ${item.title}") }
        println("")

        val completeList = getCompleteList()
        if (completeList.isNotEmpty()) {
            println("Complete List")
            completeList.forEachIndexed { index, item -> println("${index + 1}: ${item.title}") }
            println("")
        }
    }

}