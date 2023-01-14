data class OperatingBlock(val name: String)

fun main() {
    val smob = OperatingBlock("SmartOperatingBlock")
    println("Hello World from ${smob.name}!")
}
