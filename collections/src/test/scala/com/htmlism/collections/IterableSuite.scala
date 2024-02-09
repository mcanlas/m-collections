package com.htmlism.collections

import weaver.FunSuite

trait IterableSuite:
  self: FunSuite =>
  def iterableTest(xs: MIterable[Int]): Unit =
    test("An iterable collection should generate a non-empty iterator"):
      expect.eql(true, xs.iterator.hasNext)
