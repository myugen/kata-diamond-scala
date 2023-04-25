package dev.mcabsan.diamond

class Diamond private(private val specialCharacter: Char, private val levels: Seq[DiamondLevel]) {
  val dimension: Int = levels.size

  def print: String = {
    levels.map {
      _.printLine
    }.mkString("\n")
  }
}

object Diamond {
  private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def createFor(character: Char, charForSpace: Char = ' '): Diamond = {
    val index = alphabet.indexOf(character.toUpper)
    val allLetters = alphabet.take(index + 1).toSeq
    val upperSideDiamondLevels = allLetters.map {
      DiamondLevel.createFrom(_, allLetters, charForSpace)
    }
    val lowerSideDiamondLevels = upperSideDiamondLevels.reverse.drop(1)
    val levels = upperSideDiamondLevels ++ lowerSideDiamondLevels

    Diamond(charForSpace, levels)
  }
}
