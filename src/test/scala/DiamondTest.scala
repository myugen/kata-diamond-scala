package dev.mcabsan.diamond

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DiamondTest extends AnyFunSuite with Matchers {

  test("should create a diamond for letter C") {
    val diamond = Diamond.createFor('C', '*')

    diamond.isSuccess should be(true)
    diamond.get.dimension should be(5)
  }

  test("should throw an error for letter that is not in the alphabet") {
    val diamond = Diamond.createFor('1')

    diamond.isFailure should be(true)
    diamond.failed.get.getMessage should be("Letter must be in the alphabet ABCDEFGHIJKLMNOPQRSTUVWXYZ. Current letter: 1")
  }

  test("should print A diamond") {
    val diamond = Diamond.createFor('A')

    diamond.isSuccess should be(true)
    diamond.get.print should be("A")
  }

  test("should print C diamond") {
    val diamond = Diamond.createFor('C', '*')

    diamond.isSuccess should be(true)
    diamond.get.print should be(
      """**A**
        |*B*B*
        |C***C
        |*B*B*
        |**A**""".stripMargin)
  }
}
