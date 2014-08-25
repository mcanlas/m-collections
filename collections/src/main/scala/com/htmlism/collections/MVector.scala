package com.htmlism.collections

class MVector[A](values: Array[A]) extends MIndexedSeq[A] {
  def foreach[B](f: A => B) =
    for (i <- 0 to values.length - 1)
      f(apply(i))

  def apply(i: Int) = values(i)
}
