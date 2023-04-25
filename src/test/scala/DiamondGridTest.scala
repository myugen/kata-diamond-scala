package dev.mcabsan.diamond

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DiamondGridTest extends AnyFunSuite with Matchers {

  test("should be created based on the input character") {
    val grid = DiamondGrid.createFrom('c', ' ')

    grid.dimension should be(5)
    grid.allLetters should be(Seq('A', 'B', 'C'))
  }

  test("should show diamond levels") {
    val grid = DiamondGrid.createFrom('c', ' ')

    grid.levels should have length 3
    grid.levels should be(Seq(
      DiamondLevel('A', (2, 2), 5, ' '),
      DiamondLevel('B', (1, 3), 5, ' '),
      DiamondLevel('C', (0, 4), 5, ' ')))
  }

}
