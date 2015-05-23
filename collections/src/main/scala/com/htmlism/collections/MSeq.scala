package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MSeq extends CollectionFactory[MSeq] {
  def builder[A] = new ListBuilder[A]
}

trait MSeq[+A] extends MIterable[A] {
  def apply(i: Int): A
}
