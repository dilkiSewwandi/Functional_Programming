package Tutorial05

import scala.io.StdIn

object q5 {
  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val input = StdIn.readInt()
    val result = sumEven(input)
    println("Sum of even numbers less than " + input + ": " + result)
  }

  def sumEven(n: Int): Int = {
    if (n <= 0) 0
    else if (n % 2 == 0) n + sumEven(n - 2)
    else sumEven(n - 1)
  }
}
