package com.htmlism.collections

class NonEmptyListSpec extends SeqSpec {
  def sequence =
    NonEmptyList(1,
      NonEmptyList(2,
        NonEmptyList(3,
          NonEmptyList(4, MNil))))

  "A non-empty list" should {
    "have a head" in {
      val list = NonEmptyList('foo, MNil)

      list.head === 'foo
    }
  }
}
