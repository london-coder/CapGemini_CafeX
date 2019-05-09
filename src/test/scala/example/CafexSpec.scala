package example

import org.scalatest._

class CafexSpec extends FlatSpec with Matchers {

  "The Cafe object" should "contain the menu" in {
    Cafex.menuSize shouldEqual 4
  }
}
