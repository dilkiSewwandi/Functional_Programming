package Tutorial04

import scala.io.StdIn

object q2 {
  def main(args: Array[String]): Unit = {
    println("Enter a value: ")
    val num = StdIn.readInt()
    val status = decideStatus(num)
    println(status)
  }

  def decideStatus(num: Int): String = num match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }
}
