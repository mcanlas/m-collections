package com.htmlism.collections

trait MList[+A] extends LinearSeq[A] {
  def head: A
  def tail: MList[A]

  def apply(i: Int) =
    if (i == 0)
      head
    else
      tail(i - 1)
}
