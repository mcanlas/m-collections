package com.htmlism.collections

trait IterableSpec extends TraversableSpec {
  def traversable = iterable
  def iterable: MIterable[Int]

  "An iterable collection" should {
    "generate a non-empty iterator" in {
      iterable.iterator.hasNext === true
    }
  }
}
