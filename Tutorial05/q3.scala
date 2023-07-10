package Tutorial05

import scala.io.StdIn

object q3 {
  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val input = StdIn.readInt()
    val result = sum(input)
    println(result)
  }

  def sum(n: Int): Int = {
    if (n <= 0) 0
    else n + sum(n - 1)
  }
}
