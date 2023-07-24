package Tutorial06

object q1a {
  def caesarEncrypt(plaintext: String, shift: Int): String = {
    val encryptedText = plaintext.map { char =>
      if (char.isLetter) {
        val isUppercase = char.isUpper
        val normalizedChar = char.toUpper
        val encryptedChar = ((normalizedChar - 'A' + shift) % 26 + 'A').toChar
        if (isUppercase) encryptedChar else encryptedChar.toLower
      } else {
        char
      }
    }
    encryptedText.mkString
  }

  def caesarDecrypt(ciphertext: String, shift: Int): String = {
    val decryptedText = ciphertext.map { char =>
      if (char.isLetter) {
        val isUppercase = char.isUpper
        val normalizedChar = char.toUpper
        val decryptedChar = ((normalizedChar - 'A' - shift + 26) % 26 + 'A').toChar
        if (isUppercase) decryptedChar else decryptedChar.toLower
      } else {
        char
      }
    }
    decryptedText.mkString
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "ABCDE"
    val shift = 2

    //encryption
    val encryptedText = caesarEncrypt(plaintext, shift)
    println(s"Encrypted: $encryptedText")

    //decryption
    val decryptedText = caesarDecrypt(encryptedText, shift)
    println(s"Decrypted: $decryptedText")
    }
}