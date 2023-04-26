package dev.mcabsan.diamond

import scala.collection.immutable.WrappedString
import scala.util.Try

class Diamond private (private val charForSpace: Char, private val levels: Seq[DiamondLevel]) {
  val dimension: Int = levels.size

  def print: String = {
    levels
      .map {
        _.printLine(charForSpace)
      }
      .mkString("\n")
  }
}

object Diamond {
  private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def createFor(character: Char, charForSpace: Char = ' '): Try[Diamond] = {
    val index = alphabet.indexOf(character.toUpper)
    index match
      case -1 =>
        Try(
          throw IllegalArgumentException(
            s"Letter must be in the alphabet $alphabet. Current letter: $character"
          )
        )
      case _ =>
        val allLettersToPrint = alphabet.take(index + 1).toSeq
        Try(Diamond(charForSpace, createLevels(allLettersToPrint)))
  }

  private def createLevels(allLettersToPrint: WrappedString): Seq[DiamondLevel] = {
    val upperSideDiamondLevels = allLettersToPrint.map {
      DiamondLevel.createBasedOn(_, allLettersToPrint)
    }
    val lowerSideDiamondLevels = upperSideDiamondLevels.reverse.drop(1)
    upperSideDiamondLevels ++ lowerSideDiamondLevels
  }
}
