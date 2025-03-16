
object Basics {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer

    trait Pet {
      val name: String = "Animal"
    }

    class Cat(override val name: String) extends Pet

    class Dog(val color: String) extends Pet {
      override val name: String = "Doggo"
    }

    val cat = new Cat("Sally")

    val dog = new Dog("Brown")

    println(dog.name)


  }
}