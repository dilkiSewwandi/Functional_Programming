package Tutorial05

import scala.io.StdIn

object q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    var input = StdIn.readInt()
    println(isPrime(input))
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUtil(divisor: Int): Boolean = {
      if (divisor <= 1) true
      else if (n % divisor == 0) false
      else isPrimeUtil(divisor - 1)
    }

    isPrimeUtil(n / 2)
  }
}
