package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MList extends CollectionFactory[MList] {
  def empty[A]: MList[A] =
    MNil

  def builder[A]: ListBuilder[A] = new ListBuilder[A]
}

sealed trait MList[+A] extends LinearSeq[A] {
  def iterator: Iterator[A] = new ListIterator(this)

  def ::[B >: A](x: B): MList[B] = NonEmptyList(x, this)
}

case object MNil extends MList[Nothing]

final case class NonEmptyList[+A](head: A, tail: MList[A]) extends MList[A]
