package com.htmlism.collections

class NonEmptyList[+A](val head: A, val tail: MList[A]) extends MList[A] {
  private val self = this

  def iterator = new Iterator[A] { // TODO use custom iterator trait
    var remainder = self : MList[A]

    def hasNext: Boolean = remainder match {
      case _: NonEmptyList[_] => true
      case    MNil     => false
    }

    def next(): A = {
      val result = remainder.head
      remainder = remainder.tail
      result
    }
  }
}
