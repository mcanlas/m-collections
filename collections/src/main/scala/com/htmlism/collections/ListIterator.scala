package com.htmlism.collections

class ListIterator[A](list: MList[A]) extends Iterator[A] {
  private var cur = list

  def hasNext: Boolean =
    cur match {
      case MNil => false
      case _ => true
    }

  def next(): A =
    cur match {
      case MNil =>
        throw new IllegalStateException("cannot retrieve an element from an exhausted iterator")

      case NonEmptyList(head, tail) =>
        cur = tail
        head
    }
}
