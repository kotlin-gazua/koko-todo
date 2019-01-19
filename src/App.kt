import java.util.*

val app = TodoApp()
val scan = Scanner(System.`in`)

fun main (args: Array<String>) {
    println("TODO Start")

    while (true) {
        app.show()
        println("[1리스트] [2추가] [3완료] [4취소] [5수정]")
        print("입력하세요: ")
        command(scan.nextInt())
    }
}

fun command (type: Int = 1) {
    when (type) {
        1 -> {}
        2 -> {
            print("title: ")
            app.add(scan.next())
        }
        3 -> {
            print("완료할 번호를 선택해주세요: ")
            app.complete(scan.nextInt())
        }
        4 -> {
            print("취소할 번호를 선택해주세요: ")
            app.cancellation(scan.nextInt())
        }
        5 -> {
            print("수정할 번호를 선택해주세요: ")
            val idx = scan.nextInt()
            print("내용을 입력해주세요: ")
            val title = scan.next()
            app.edit(idx, title)
        }
    }
    app.show()
}