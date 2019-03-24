

object BuonGiorno extends App {
  val who:String = "Mondo"
  val lang:String = "Italian"
  val greeting:String = {
    if (lang=="French") "Bon jour"
    else {
      if (lang=="Italian") "Buon giorno"
      else "Hello"
    }
  }
  println(greeting + ", " + who + "!")
}