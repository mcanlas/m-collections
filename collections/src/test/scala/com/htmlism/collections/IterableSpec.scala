package com.htmlism.collections

trait IterableSpec extends TraversableSpec {
  def traversable = iterable
  def iterable: MIterable[Int]
}
