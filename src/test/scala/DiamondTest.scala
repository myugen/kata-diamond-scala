package dev.mcabsan.diamond

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DiamondTest extends AnyFunSuite with Matchers {

  test("should create a diamond for letter C") {
    val diamond = Diamond.createFor('C', '*')

    diamond.dimension should be(5)
  }

  test("should print A diamond") {
    val diamond = Diamond.createFor('A')
    diamond.print should be("A")
  }

  test("should print C diamond") {
    val diamond = Diamond.createFor('C', '*')

    diamond.print should be(
      """**A**
        |*B*B*
        |C***C
        |*B*B*
        |**A**""".stripMargin)
  }
}
