package example

import org.scalatest._

class CafexStep2Spec extends FlatSpec with Matchers {

  /**
   * These are the tests for STEP 2
   */
  "No service charge" should "be applied to drinks" in {
    Cafex.cost(List("Cola", "Cola", "Coffee")) shouldEqual 2.0
  }

  "Hot and cold drink" should "not incur service charge" in {
    Cafex.total(List("Cola", "Coffee")) shouldEqual 1.5
  }

  "Order for food" should "be true for a sandwich" in {
    val (food, _) = Cafex.containsFood(List("Steak Sandwich")) 
    food shouldEqual true
  }

  "Order for only drinks" should "not show as food" in {
    val (food, _) = Cafex.containsFood(List("Cola", "Coffee"))
    food shouldEqual false
  }

  "Service charge" should "add 10%" in {
    Cafex.serviceCharge(100D, 0.1D) shouldEqual 110
  }

  // Use a different function so as not to break Step 1 test
  "Order that includes cold food " should "incur 10% service charge" in {
    Cafex.total(List("Cheese Sandwich")) shouldEqual 2.20
  }

  "Order for cold food and hot drink" should "incur 10% service charge" in {
    Cafex.total(List("Coffee", "Cheese Sandwich")) shouldEqual 3.30
  }

  "Order for hot food with drink" should "incur 20% service charge" in {
    Cafex.total(List("Steak Sandwich", "Cola")) shouldEqual 6.00
  }

  "Large order including hot food " should "incur service charge capped at 20.0" in {
    val largeOrder = List.fill(26)( "Steak Sandwich" )
    Cafex.total(largeOrder) shouldEqual BigDecimal(137.00) // 2 decimal places
  }

}
