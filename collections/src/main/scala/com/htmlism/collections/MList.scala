package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MList extends CollectionFactory[MList] {
  def builder[A]: ListBuilder[A] = new ListBuilder[A]
}

sealed trait MList[+A] extends LinearSeq[A] {
  def iterator: Iterator[A] = new ListIterator(this)

  def ::[B >: A](x: B): MList[B] = NonEmptyList(x, this)
}

case object MNil extends MList[Nothing]

final case class NonEmptyList[+A](head: A, tail: MList[A]) extends MList[A]

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
