package com.htmlism.collections

trait MListLike[+A] extends MLinearSeq[A] {
  def head: A
  def tail: MListLike[A]
}
