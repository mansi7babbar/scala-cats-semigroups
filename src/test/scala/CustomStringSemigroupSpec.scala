import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CustomStringSemigroupSpec extends AnyFlatSpec with Matchers {
  "CustomStringSemigroup" should "concatenate two strings with space between them" in {
    assert(CustomStringSemigroup.concatenateStringsWithSpace("Mansi", "Babbar") == "Mansi Babbar")
  }
}
