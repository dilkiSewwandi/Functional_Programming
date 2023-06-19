package Tutorial02

object q4 {
  var max = -1 
  def main(args: Array[String]): Unit = {
    println(profit(5), profit(10), profit(15), profit(20))
    println(profit(25), profit(30), profit(35), profit(40))
    println(max)
  }

  def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20

  def revenue(price: Int): Int = attendees(price) * price

  def cost(price: Int): Int = 500 + attendees(price)

  def profit(price: Int): Int = {
    val currentProfit = revenue(price) - cost(price)
    if (currentProfit > max)
      max = currentProfit
    currentProfit
  }
}
