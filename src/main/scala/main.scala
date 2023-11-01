@main
def main(): Unit = {

  def countWordOccurrences(text: String, words: List[String]): List[Int] = {
    val textWords = text.toLowerCase().split("\\W+").toList
    words.map(word => textWords.count(_.equals(word.toLowerCase())))
  }

  val text = "Scala is a modern programming language. Scala is functional, object-oriented, and statically typed."
  val words = List("Scala", "is", "language","programming")

  val wordOccurrences = countWordOccurrences(text, words)
  val o = (words zip wordOccurrences).toMap
  o.foreach{case (word,num)=>println(s"$word: $num")}

}