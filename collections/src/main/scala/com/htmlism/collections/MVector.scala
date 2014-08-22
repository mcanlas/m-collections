package com.htmlism.collections

class MVector[A](values: Array[A]) extends MIndexedSeq[A] {
  def apply(i: Int) = values(i)
}
