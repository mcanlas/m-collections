package com.htmlism.collections

object MSeq extends CollectionFactory[MSeq]

trait MSeq[+A] extends MIterable[A] {
  def apply(i: Int): A
}
