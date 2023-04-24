package dev.mcabsan.diamond

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DiamondTest extends AnyFunSuite with Matchers {

  test("should return A diamond for letter A") {
    val diamond = Diamond.generateFor('A')
    diamond should be("A")
  }
}