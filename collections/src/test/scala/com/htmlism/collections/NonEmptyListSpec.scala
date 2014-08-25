package com.htmlism.collections

class NonEmptyListSpec extends SeqSpec {
  def sequence =
    new MList(1,
      new MList(2,
        new MList(3,
          new MList(4, MNil))))

  "A non-empty list" should {
    "have a head" in {
      val list = new MList('foo, MNil)

      list.head === 'foo
    }
  }
}
