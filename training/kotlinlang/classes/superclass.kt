open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    var borderColor; String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectange")
    }

    val fillColor: String get() = super.borderColor
}
