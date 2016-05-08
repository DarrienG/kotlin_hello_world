import java.util.*
import java.lang.Integer as Int16
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    println("Hello world!")
    // Passing an integer, and a function to the function loop
    loop(name()) {
        "Inside loop ${it + 1}"
    }

    // Creating a function mid function, takes an int, returns an int
    fun coolName(value: Int): Int {
        return value + 2
    }

    // Creating a hashmap that takes an int and a function that returns an int
    val something = HashMap<Int, (Int) -> Int>()
    // Passing a function in with a key of zero
    something.put(0, ::coolName)

    // Getting the value of the an object, and printing it out
    operator fun Int.invoke (value: Int): String {
        return (this + value).toString()
    }

    // Checks to see if something with a key of 0 is null, if not, it runs the following function
    // If a function is not defined, it will print that a closure is not found
    something[0]?.let{ { it: Int -> Int
        println("Call this before you do any magic! $it")
        } }?.invoke(1).apply {
        println("This is your value: ${this}")
    } ?: println("Closure not found")

    println(2(1));

    // Creating a hashmap with a key of ints, that holds a list of ints
    val map = HashMap<Int, List<Int>>()
    // Printing the size of the map when only counting values that are empty
    println("Size = ${map.filter { !it.value.isEmpty() }.size}")
    for (number: Int in map.getOrPut(10, {ArrayList<Int>()})) {
        println("$number\n")
    }

    // Redefined version of println()
    thing("Hello world")
    val newThing = NewClass()
    newThing.printLine()
    val ent = ExtendedNewClass()
    ent.name = "test1"
    ent.name = "mrc.ocu"
    ent.name = "mrc.ocu"
    ent.name = "other new thing"

    val anon = object: NewClass() {
        override fun printLine() {
             var number: Double = 3.141592653589793238
            println(number.toString())
        }
    }

    anon.printLine()

    println(measureTimeMillis {
        Thread.sleep(1000)
    })

    class Int2(var value: Int = 0)

    operator fun Int.plus(number: Int2): Int {
        return this + 2 * number.value
    }

    println("10 + 10 = ${10 + Int2(10)}")
}


val range = 0..12

fun loop(number: Number, run: (i: Int) -> String) {
    if (number !is Int) return
    if (number in range) {
        for (i in 0..number) {
            println(run(i))
        }
    } else {
        throw ArrayIndexOutOfBoundsException()
    }
}

fun thing(line: String) = println(line)

fun name(): Int {
    return 5
}