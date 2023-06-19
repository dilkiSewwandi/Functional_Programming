package Tutorial01

object TutorialAnswers {
  def main(args: Array[String]): Unit = {
    println("The area of the disk is " + calculateArea(5.0));
    println("Temperature value in Fahrenheit " + calculateTemperature(35.0))
    println("Volume of the sphere is " + calculatevolume(5.0))
    println("The wholesale cost is " + (coverPrice(60) - discount(60) + shippingCost(60)))
    println("The total running time is " + (easyPace(2) + tempo(3) + easyPace(2)))
  }

  //q1
  def calculateArea(radius: Double): Double = math.Pi * radius * radius

  //q2
  def calculateTemperature(celValue: Double): Double = celValue * 1.8000 + 32.00

  //q3
  def calculatevolume(r: Double): Double = 4 / 3 * math.Pi * r * r * r

  //q4
  def coverPrice(num: Int): Double = 24.95 * num

  def discount(num: Int): Double = num * 0.4 * 24.95

  def shippingCost(num: Int): Double = if (num <= 50) {
    num * 3
  } else {
    ((num - 50) * 0.75) + 50 * 3
  }

  //q5
  def easyPace(numEasy: Int): Double = 8 * numEasy

  def tempo(numTempo: Int): Double = 7 * numTempo


}

