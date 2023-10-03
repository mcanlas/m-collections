package com.htmlism.collections

import weaver.*

object ListSuite extends FunSuite with SeqSuite with IterableSuite with TraversableSuite {
  private val xs =
    1 :: 2 :: 3 :: 4 :: MNil

  seqTest(xs)
  iterableTest(xs)
  traversableTest(xs)

  test("List: An empty list should do nothing after traversal") {
    var i = 0

    // type annotation evades dead code warning from Nothing type
    (MNil: MList[Int]).foreach(_ => i += 1)

    expect.eql(0, i)
  }

  test("List: A non-empty list should have a head") {
    val list = NonEmptyList("foo", MNil)

    expect.eql("foo", list.head)
  }
}
