
object Basics {
  def main(args: Array[String]): Unit = {
    case class Planet(name: String, distance: Int)

    abstract class MyClass {
      def DoSomething(): Unit = println("Hello, World!")
      def DoAnotherThing(x: Int): Unit
    }

    class MySecondClass extends MyClass {
      override def DoAnotherThing(x: Int): Unit = println(x)
    }

    val myValue = new MySecondClass()

    myValue.DoSomething()
    myValue.DoAnotherThing(11)
  }


}