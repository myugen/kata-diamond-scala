package dev.mcabsan.diamond

object Diamond {
  def generateFor(character: Char, charForSpace: Char = ' '): String = {
    val levels = DiamondGrid.createFrom(character, charForSpace).levels
    (levels ++ levels.reverse.drop(1)).map {
      _.printLine
    }.mkString("\n")
  }
}
