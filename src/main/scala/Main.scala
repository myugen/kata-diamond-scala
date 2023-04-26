package dev.mcabsan.diamond

import scala.io.StdIn.readLine
import scala.util.{Failure, Success, Try}

@main def main(): Unit = {
  val character = readInput match {
    case Success(character) => character
    case Failure(exception) =>
      println(exception.getMessage)
      return // exit the program
  }
  Diamond.createFor(character.toUpper) match {
    case Success(diamond) =>
      println(s"Here is your ${character.toUpper}-shape diamond:")
      println(diamond.print)
    case Failure(exception) => println(exception.getMessage)
  }
}

private def readInput: Try[Char] = {
  println("Hello, please enter the character for the diamond shape:")
  val input = readLine()
  input match {
    case "" => Failure(new IllegalArgumentException("You did not enter anything."))
    case str if str.length > 1 =>
      Failure(new IllegalArgumentException("You entered more than one character."))
    case _ => Success(input.charAt(0).toUpper)
  }
}
