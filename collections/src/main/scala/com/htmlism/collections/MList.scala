package com.htmlism.collections

class MList[+A](val head: A, val tail: MListLike[A]) extends MListLike[A] {
  def foreach[B](f: A => B) = {
    f(head)

    tail.foreach(f)
  }
}
