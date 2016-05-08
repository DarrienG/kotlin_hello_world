import kotlin.properties.Delegates

open class NewClass(val line: String = "nothing") {
    init {

    }
    open fun printLine() = println(line)
}

class ExtendedNewClass() : NewClass() {
    var name : String by Delegates.observable("") { p,o,n -> println("Name changed from $o to $n")}
    override fun printLine() {
        super.printLine()
    }
}

fun NewClass.printLine(number: Int) {
    this.printLine()
    println("%X04".format(number))
}