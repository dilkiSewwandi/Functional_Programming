package Tutorial02

object q3 {
  def main(args: Array[String]): Unit = {
    val normalRate = 250.0
    val otRate = 85.0
    val taxRate = 0.12
    val nHours = 40
    val otHours = 30
    val takeHomeSalary = calculateTakeHomeSalary(nHours, otHours, normalRate, otRate, taxRate)
    println("The take-home salary of an employee is " + takeHomeSalary)
  }

  def calculateTakeHomeSalary(nHours: Int, otHours: Int, normalRate: Double, otRate: Double, taxRate: Double): Double = {
    val normalPay = nHours * normalRate
    val otPay = otHours * otRate
    val totalSalary = normalPay + otPay
    val taxAmount = totalSalary * taxRate
    val takeHomeSalary = totalSalary - taxAmount
    takeHomeSalary
  }
}
