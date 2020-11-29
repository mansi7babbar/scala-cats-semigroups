import cats.Semigroup

object CollectionSemigroup {
  // Scala’s fold() used here to combine strings
  def combineStrings(collection: Seq[String]): String = {
    collection.foldLeft("")(Semigroup[String].combine)
  }
}

/*
Cannot write generic method like
combineAll(collection: Seq[A]): [A]
for the above expression,
because the fallback value will depend on the type of A (”” for String, 0 for Int, etc).

Solution is MONOIDS!!!
 */
