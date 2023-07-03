package Tutorial03
import scala.io.StdIn

object q2 {

  def main(args: Array[String]): Unit = {
    println("Enter the number of strings:")
    val numStrings = StdIn.readInt()

    val inputArray = new Array[String](numStrings)
    for (i <- 0 until numStrings) {
      println(s"Enter string $i:")
      inputArray(i) = StdIn.readLine()
    }

    val filteredArray = inputArray.filter(_.length > 5)

    println("Strings that have a length greater than 5 are :")
    for (string <- filteredArray) {
      println(string)
    }
  }

}

