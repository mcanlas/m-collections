package com.htmlism.collections

class MNonEmptyList[+A](val head: A, val tail: MListLike[A]) extends MListLike[A] {
  private val self = this

  def iterator = new Iterator[A] { // TODO use custom iterator trait
    var remainder = self : MListLike[A]

    def hasNext = remainder match {
      case _: MNonEmptyList[_] => true
      case    MNil     => false
    }

    def next() = {
      val result = remainder.head
      remainder = remainder.tail
      result
    }
  }
}