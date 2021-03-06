package example

import scala.language.postfixOps

object Cafex extends Menu {
}

trait Menu {
  lazy val menuSize = menu.size
  // Menu is list of items with their tuple of price 
  // and temperature attributes. e.g. hot = true or false
  val menu = Map(
    "Cola" ->((0.50, false)),
    "Coffee" ->((1.0, true)),
    "Cheese Sandwich" -> ((2.0, false)),
    "Steak Sandwich" -> ((4.50, true))
    ).withDefaultValue((0.0, false))

  def cost(items: Seq[String]): Double = items map { menu } map { _ _1 } sum

  // so as not to break the STEP 1 test, total is added to included service charge
  def total(items: Seq[String]): Double = {
    val price = cost(items)
    val (food, hot) = containsFood(items)

    (food, hot) match {
      case (true, true) => serviceCharge(price, 0.2D)
      case (true, _) => serviceCharge(price, 0.1D)
      case _ => price
    }
  }

  def containsFood(items: Seq[String]): (Boolean, Boolean) = {
    val foodItems = items filter { _.contains("Sandwich")}
    val hot = foodItems map { menu } map { _ _2 } contains(true)
    (foodItems.length > 0, hot)
  }

  def serviceCharge(price: Double, charge: Double) : Double = {
    val svc = price * charge min(20.0)
    price + svc
  }
  
}
