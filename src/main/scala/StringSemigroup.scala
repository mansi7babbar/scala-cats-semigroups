import cats.Semigroup

object StringSemigroup {
  def defaultStringSemigroup(string1: String, string2: String): String = {
    // The "combine" implementation for String concatenates two strings without a space between them
    Semigroup[String].combine(string1, string2)
  }
}
