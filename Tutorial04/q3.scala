package Tutorial04

import scala.io.StdIn

object q3 {
  def main(args: Array[String]): Unit = {
    println("Enter a string:")
    val str = StdIn.readLine()

    val upperString = formatNames(str, _.toUpperCase)
    println(upperString)

    val lowerString = formatNames(str, _.toLowerCase)
    println(lowerString)

    val names = List("Benny", "NIroshan", "Saman", "Kumara")

    val formattedString1 = formatNames(names(0), _.toUpperCase)
    println(formattedString1)

    val formattedString2 = formatNames(names(1), capitalizeNAndI)
    println(formattedString2)

    val formattedString3 = formatNames(names(2), _.toLowerCase)
    println(formattedString3)

    val formattedString4 = formatNames(names(3), s => s.init + s.last.toUpper)
    println(formattedString4)
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def capitalizeNAndI(str: String): String = {
    str.map { c =>
      if (c.toLower == 'n' || c.toLower == 'i') c.toUpper else c
    }
  }
}
