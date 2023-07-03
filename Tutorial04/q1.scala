package Tutorial04

import scala.io.StdIn

object q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the amount of depositing ")
    var amount = StdIn.readInt()
    var interest = calculateInterest(amount)
    println("The interest earned on a deposit of Rs." + amount + "  is Rs." + interest)
  }

  def calculateInterest(amount: Double): Double = {
    var interstRate =
    if (amount <= 20000)
      0.02
    else if (amount <= 200000)
      0.04
    else if (amount <= 2000000)
      0.035
    else
      0.065

    amount * interstRate

  }

}
