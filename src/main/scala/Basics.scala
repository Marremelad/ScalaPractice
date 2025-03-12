object Basics {
  def main(args: Array[String]): Unit = {
    // Expressions are computable statements:
    1 + 1

    // You can output the results of expressions using println:
    println(1) // 1
    println(1 + 1) // 2
    println("Hello!") // Hello!
    println("Hello, " + "World!") // Hello, World!

    // You can name the results of expressions using the 'val' keyword:
    val x = 1 + 1
    println(x) // 2S
    // Named results such as x here, are called values. Referencing a value does not recompute it.

    // Values cannot be re-assigned:
    // x = 3 this does not compute

    // The type of value can be omitted and inferred, or it can be explicitly stated:
    val y: Int = 1 + 1
    // Notice how the type declaration 'Int' comes after the identifier y. You also need a ':'.
  }
}