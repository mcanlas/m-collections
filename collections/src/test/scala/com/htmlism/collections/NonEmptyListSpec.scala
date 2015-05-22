package com.htmlism.collections

class NonEmptyListSpec extends SeqSpec {
  def sequence =
    new MNonEmptyList(1,
      new MNonEmptyList(2,
        new MNonEmptyList(3,
          new MNonEmptyList(4, MNil))))

  "A non-empty list" should {
    "have a head" in {
      val list = new MNonEmptyList('foo, MNil)

      list.head === 'foo
    }
  }
}
