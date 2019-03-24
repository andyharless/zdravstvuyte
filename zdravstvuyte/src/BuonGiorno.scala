

object BuonGiorno extends App {
  val who:String = "Mondo"
  val lang:String = "Italian"
  val greeting:String = lang match {
    case "French" => "Bon jour"
    case "Italian" => "Buon giorno"
    case "Spanish" => "Buenos dias"
    case "Australian" => "G'day"
    case "Cat" => "Miao"
    case _ => "Hello"
  }
  println(greeting + ", " + who + "!")
}