

object BuonGiorno extends App {
  val greetings: Map[String, String] = Map(
                      "French"->"Bon jour",
                      "Italian"->"Buon giorno",
                      "Spanish"->"Buenos dias",
                      "Australian"->"G'day",
                      "Cat"->"Miao")
  val recipient: Map[String, String] = Map(
                      "French"->"Monde",
                      "Italian"->"Mondo",
                      "Spanish"->"Mundo",
                      "Australian"->"World",
                      "Cat"->"Purr")
  val lang:String = "French"
  val greeting: String = greetings getOrElse (lang, "Hello")
  val who: String = recipient getOrElse(lang, "World")
  println(greeting + ", " + who + "!")
}