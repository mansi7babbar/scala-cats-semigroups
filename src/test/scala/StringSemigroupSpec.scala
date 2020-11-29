import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StringSemigroupSpec extends AnyFlatSpec with Matchers {
  "StringSemigroup" should "concatenate two strings without space between them" in {
    assert(StringSemigroup.defaultStringSemigroup("Mansi", "Babbar") == "MansiBabbar")
  }
}
