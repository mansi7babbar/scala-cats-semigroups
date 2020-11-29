import cats.Semigroup

object CustomStringSemigroup {
  // Custom implementation of combine is provided with space between the strings
  implicit val customStringSemigroup: Semigroup[String] = Semigroup.instance[String](_ + " " + _)

  def concatenateStringsWithSpace(string1: String, string2: String): String = {
    Semigroup[String].combine(string1, string2)
  }
}
