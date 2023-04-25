package dev.mcabsan.diamond

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DiamondLevelTest extends AnyFunSuite with Matchers {
  test("should be created") {
    val level = DiamondLevel.createFrom('C', Seq('A', 'B', 'C'), ' ')

    level.character should be('C')
    level.x should be((0, 4))
    level.width should be(5)
  }
  
  test("should print a line") {
    val level = DiamondLevel('C', (0, 4), 5, ' ')

    level.printLine should be("C   C")
  }

}
