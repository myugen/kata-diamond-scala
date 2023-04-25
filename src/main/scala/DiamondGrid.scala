package dev.mcabsan.diamond

case class DiamondGrid(dimension: Int, allLetters: Seq[Char], charForSpace: Char) {
  val levels: Seq[DiamondLevel] = allLetters.map {
    DiamondLevel.createFrom(_, allLetters, charForSpace)
  }
}

object DiamondGrid {
  private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def createFrom(character: Char, charForSpace: Char): DiamondGrid = {
    val index = alphabet.indexOf(character.toUpper)
    val allLettersToPrint = alphabet.take(index + 1).toSeq
    val dimension = allLettersToPrint.length + index

    DiamondGrid(dimension, allLettersToPrint, charForSpace)
  }
}
