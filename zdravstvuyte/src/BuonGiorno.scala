

object BuonGiorno extends App {
  val who:String = "Mondo"
  val lang:String = "Italian"
  val greeting:String = {
    if (lang=="French") "Bon jour"
    else if (lang=="Italian") "Buon giorno"
    else if (lang=="Spanish") "Buenos dias"
    else if (lang=="Australian") "G'day"
    else if (lang=="Cat") "Miao"
      else "Hello"
  }
  println(greeting + ", " + who + "!")
}