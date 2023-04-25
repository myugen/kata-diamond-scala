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
  private val DEFAULT_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def createFor(character: Char, charForSpace: Char = ' '): Diamond = {
    val grid = DiamondGrid.createFrom(character, charForSpace)

    Diamond(charForSpace, grid.levels ++ grid.levels.reverse.drop(1))
  }
}
