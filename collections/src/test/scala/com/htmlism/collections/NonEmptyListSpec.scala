package com.htmlism.collections

class NonEmptyListSpec extends SeqSpec {
  def sequence =
    new NonEmptyList(1,
      new NonEmptyList(2,
        new NonEmptyList(3,
          new NonEmptyList(4, MNil))))

  "A non-empty list" should {
    "have a head" in {
      val list = new NonEmptyList('foo, MNil)

      list.head === 'foo
    }
  }
}
