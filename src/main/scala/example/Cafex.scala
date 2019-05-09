package example

object Cafex extends Menu {
  println("Cafe X")
}

trait Menu {
  lazy val menuSize = menu.size
  // Menu is list of items with their tuple of price 
  // and temperature attributes. e.g. hot = true or false
  val menu = Map[String, Tuple2[Double, Boolean]](
    "Cola" ->((0.50, false)), 
    "Coffee" ->((1.0, true)), 
    "Cheese Sandwich" -> ((2.0, false)), 
    "Steak Sandwich" -> ((4.50, true)) 
    )

  def cost(items: Seq[String]): Double = {
    items map { menu } map { _ _1 } sum
  }
}
