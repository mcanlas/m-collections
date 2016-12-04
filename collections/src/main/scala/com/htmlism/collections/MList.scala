package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MList extends CollectionFactory[MList] {
  def builder[A]: ListBuilder[A] = new ListBuilder[A]
}

sealed trait MList[+A] extends LinearSeq[A] {
  def head: A
  def tail: MList[A]

  def ::[B >: A](x: B): MList[B] = new NonEmptyList(x, this)
}

object MNil extends MList[Nothing] {
  def iterator: Iterator[Nothing] = Iterator.empty // TODO use custom iterator trait

  def head = throw new NoSuchElementException("an empty list does not have a head")
  def tail = throw new UnsupportedOperationException("an empty list does not have a tail")
}

class NonEmptyList[+A](val head: A, val tail: MList[A]) extends MList[A] {
  private val self = this

  def iterator: Iterator[A] = new Iterator[A] { // TODO use custom iterator trait
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
