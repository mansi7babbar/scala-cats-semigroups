// Type class definition
import cats.kernel.Semigroup

// Import type class instance for type Int
import cats.instances.int._

object IntSemigroup {
  def defaultIntSemigroup(int1: Int, int2: Int): Int = {
    // The "combine" implementation for Int is by default addition
    Semigroup[Int].combine(int1, int2)
  }
}
