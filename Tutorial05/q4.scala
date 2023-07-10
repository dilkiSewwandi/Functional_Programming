package Tutorial05

import scala.io.StdIn

object q4{
  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val input = scala.io.StdIn.readInt()
    println("The input number is even :" + isEven(input))
    println("The input number is odd :" + isOdd(input))
  }

  def isEven(n: Int): Boolean = {
    if (n == 0) true
    else if (n < 0) false
    else isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = {
    if (n == 0) false
    else if (n < 0) false
    else isEven(n - 1)
  }
}
