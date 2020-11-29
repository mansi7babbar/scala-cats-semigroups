import cats.Semigroup

object AssociativityInSemigroups {
  def aggregateNumbers(int1: Int, int2: Int, int3: Int, int4: Int, int5: Int): Int = {
    // Could run in different threads
    val group1 = Semigroup[Int].combine(int1, int2)
    val group2 = Semigroup[Int].combine(int3, int4)
    val group3 = Semigroup[Int].combine(group1, group2)
    Semigroup[Int].combine(group3, int5)
  }
}
