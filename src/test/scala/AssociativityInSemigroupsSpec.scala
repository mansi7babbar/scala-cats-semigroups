import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AssociativityInSemigroupsSpec extends AnyFlatSpec with Matchers {
  "AssociativityInSemigroups" should "combine numbers in groups" in {
    assert(AssociativityInSemigroups.aggregateNumbers(1, 2, 3, 4, 5) == 15)
  }
}
