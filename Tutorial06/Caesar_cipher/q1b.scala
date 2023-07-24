package Tutorial06

object q1b {
  def caesarEncrypt(plaintext: String, shift: Int): String = {

    val encryptedChars = plaintext.map { char =>
      if (char.isLetter) {
        val shiftOffset = if (char.isUpper) 'A' else 'a'
        val encryptedChar = ((char - shiftOffset + shift) % 26 + shiftOffset).toChar
        encryptedChar
      } else
      {
        char
      }
    }
    encryptedChars.mkString
  }

  def caesarDecrypt(ciphertext: String, shift: Int): String = {

    caesarEncrypt(ciphertext, -shift)
  }

  def cipher(text: String, shift: Int, operation: String): String = {
    operation match {
      case "encrypt" => caesarEncrypt(text, shift)
      case "decrypt" => caesarDecrypt(text, shift)
      case _ => throw new IllegalArgumentException("Invalid operation. Use 'encrypt' or 'decrypt'.")
    }
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Abcde"
    val shiftAmount = 2

    // Encryption
    val encryptedText = cipher(plaintext, shiftAmount, "encrypt")
    println("Encrypted:" +encryptedText)

    // Decryption
    val decryptedText =cipher(encryptedText, shiftAmount, "decrypt")
    println("Decrypted:" +decryptedText)
  }
}



