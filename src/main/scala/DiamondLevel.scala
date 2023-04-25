package dev.mcabsan.diamond

case class DiamondLevel(character: Char, x: (Int, Int), width: Int, charForSpace: Char) {
  def printLine: String = (0 until width).map { i =>
    if x._1 == i || i == x._2 then
      character
    else
      charForSpace
  }.mkString
}

object DiamondLevel {
  def createFrom(character: Char, allLetters: Seq[Char], charForSpace: Char): DiamondLevel = {
    val currentPosition = allLetters.indexOf(character)
    val middle = allLetters.indices.max
    val width = allLetters.length * 2 - 1
    val x = (middle - currentPosition, middle + currentPosition)
    DiamondLevel(character, x, width, charForSpace)
  }
}
