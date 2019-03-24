

object BuonGiorno extends App {
  val lang:String = "Spanish"
  val values:(String,String) = lang match {
    case "French" => ("Bon jour", "Monde")
    case "Italian" => ("Buon giorno", "Mondo")
    case "Spanish" => ("Buenos dias", "Mundo")
    case "Australian" => ("G'day", "World")
    case "Cat" => ("Miao", "Purr")
    case _ => ("Hello", "World")
  }
  val (greeting, who) = values
  println(greeting + ", " + who + "!")
}