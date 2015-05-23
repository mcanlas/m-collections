package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MList extends CollectionFactory[MList] {
  def builder[A] = new ListBuilder[A]
}

trait MList[+A] extends LinearSeq[A] {
  def head: A
  def tail: MList[A]

  def ::[B >: A](x: B): MList[B] = new NonEmptyList(x, this)
}
