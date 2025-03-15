
object Basics {
  def main(args: Array[String]): Unit = {

    class Point(private var _x: Int, private var _y: Int) {

      private val bound = 100

      def x: Int = _x
      def x_=(newValue: Int): Unit = {
        if (newValue < bound)
          _x = newValue
        else
          printWarning()
      }

      def y: Int = _y
      def y_=(newValue: Int): Unit = {
        if (newValue < bound)
          _y = newValue
        else
          printWarning()
      }

      private def printWarning(): Unit =
        println("WARNING: Out of bounds")
    }

    val point = new Point(1, 2)
    println(point.x)
    point.x = point.x + 1
    println(point.x)

  }
}