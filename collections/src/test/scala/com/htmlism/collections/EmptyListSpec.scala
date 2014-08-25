package com.htmlism.collections

import org.specs2.mutable.Specification

class EmptyListSpec extends Specification {
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
