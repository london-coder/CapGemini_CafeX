package example

import org.scalatest._

class CafexStep1Spec extends FlatSpec with Matchers {
  import Cafex._
  /**
   * These are the tests for STEP 1 
   */
  "The Cafe object" should "contain the menu" in {
    menuSize shouldEqual 4
  }

  "The cost of cola coffee and cheese sandwich" should "sum to 3.5" in {
    cost(List("Cola", "Coffee", "Cheese Sandwich")) shouldEqual 3.5
  }

  "The cost of a pie" should "be 0 as it's not a menu item" in {
    cost(List("Pie")) shouldEqual 0.0
  }
}
