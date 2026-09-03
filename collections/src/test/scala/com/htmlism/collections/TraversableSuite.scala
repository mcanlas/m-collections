package com.htmlism.collections

import weaver.FunSuite

trait TraversableSuite:
  self: FunSuite =>
  @SuppressWarnings(Array("org.wartremover.warts.Var"))
  def traversableTest(xs: MTraversable[Int]): Unit =
    test("A traversable collection should supprt traversal"):
      var i = 0

      xs.foreach(_ => i += 1)

      expect.eql(4, i)
