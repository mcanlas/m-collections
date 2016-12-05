package com.htmlism.collections

class ListSpec extends SeqSpec {
  def sequence: MList[Int] = 1 :: 2 :: 3 :: 4 :: MNil

  "An empty list" should {
    "do nothing after traversal" in {
      var i = 0

      MNil.foreach(_ => i += 1)

      i === 0
    }
  }

  "A non-empty list" should {
    "have a head" in {
      val list = NonEmptyList('foo, MNil)

      list.head === 'foo
    }
  }
}
