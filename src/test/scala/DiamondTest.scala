package dev.mcabsan.diamond

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DiamondTest extends AnyFunSuite with Matchers {

  test("should return A diamond for letter A") {
    val diamond = Diamond.generateFor('A')
    diamond should be("A")
  }

  test("should return a diamond for letter B") {
    val diamond = Diamond.generateFor('B', '*')
    diamond should be(
      """*A*
        |B*B
        |*A*""".stripMargin)
  }
}
