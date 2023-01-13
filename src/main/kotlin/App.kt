data class OperatingBlock(val name: String)

fun main(args: Array<String>) {
    val smob = OperatingBlock("SmartOperatingBlock")
    println("Hello World from ${smob.name!}")
}
