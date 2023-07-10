package Tutorial05

import scala.io.StdIn

object q2 {
    def main(args: Array[String]): Unit = {
      println("Enter the number:")
      val input = scala.io.StdIn.readInt()
      println("Prime numbers less than " + input + ":")
      primeSequence(input)
    }

    def primeSequence(n: Int): Unit = {
      def isPrime(k: Int, divisor: Int): Boolean = {
        if (divisor <= 1) true
        else if (k % divisor == 0) false
        else isPrime(k, divisor - 1)
      }

      def printPrimes(k: Int): Unit = {
        if (k <= 1) ()
        else {
          if (isPrime(k, k / 2)) {
            printPrimes(k - 1)
            println(k)
          } else {
            printPrimes(k - 1)
          }
        }
      }

      printPrimes(n - 1)
    }
}



