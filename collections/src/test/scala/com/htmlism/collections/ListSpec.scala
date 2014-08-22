package com.htmlism.collections

class ListSpec extends SeqSpec {
  def sequence =
    new MList(1,
      new MList(2,
        new MList(3,
          new MList(4, MNil))))

  "An empty list" should {
    "not support head" in {
      {
        MNil.head
        ()
      } must throwA[NoSuchElementException]
    }

    "not support tail" in {
      {
        MNil.tail
        ()
      } must throwA[UnsupportedOperationException]
    }
  }

  "A non-empty list" should {
    "have a head" in {
      val list = new MList('foo, MNil)

      list.head === 'foo
    }
  }
}
