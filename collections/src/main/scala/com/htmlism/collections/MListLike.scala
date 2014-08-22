package com.htmlism.collections

trait MListLike[+A] extends MLinearSeq[A] {
  def head: A
  def tail: MListLike[A]

  def apply(i: Int) =
    if (i == 0)
      head
    else
      tail(i - 1)
}
