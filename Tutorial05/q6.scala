package Tutorial05

import scala.io.StdIn

object q6 {
  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val input = StdIn.readInt()
    printFibonacci(input)
  }

  def printFibonacci(n: Int): Unit = {
    def fibonacci(n: Int): Int = {
      if (n <= 1) n
      else fibonacci(n - 1) + fibonacci(n - 2)
    }

    println("First " + n + " Fibonacci numbers:")
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
  }
}
