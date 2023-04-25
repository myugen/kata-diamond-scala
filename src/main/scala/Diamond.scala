package dev.mcabsan.diamond

import scala.collection.immutable.WrappedString

class Diamond private(private val charForSpace: Char, private val levels: Seq[DiamondLevel]) {
  val dimension: Int = levels.size

  def print: String = {
    levels.map {
      _.printLine(charForSpace)
    }.mkString("\n")
  }
}

object Diamond {
  private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def createFor(character: Char, charForSpace: Char = ' '): Diamond = {
    val index = alphabet.indexOf(character.toUpper)
    val allLettersToPrint = alphabet.take(index + 1).toSeq

    Diamond(charForSpace, createLevels(allLettersToPrint))
  }

  private def createLevels(allLettersToPrint: WrappedString): Seq[DiamondLevel] = {
    val upperSideDiamondLevels = allLettersToPrint.map {
      DiamondLevel.createBasedOn(_, allLettersToPrint)
    }
    val lowerSideDiamondLevels = upperSideDiamondLevels.reverse.drop(1)
    upperSideDiamondLevels ++ lowerSideDiamondLevels
  }
}
