package com.htmlism.collections

class ListSpec extends SeqSpec {
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
}
