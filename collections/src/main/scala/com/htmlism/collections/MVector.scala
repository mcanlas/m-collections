package com.htmlism.collections

class MVector[A](values: Array[A]) extends MIndexedSeq[A] {
  def iterator = new Iterator[A] {
    var i = 0

    def hasNext = i < values.length

    def next() = {
      i += 1
      values(i - 1)
    }
  }

  def apply(i: Int) = values(i)
}
