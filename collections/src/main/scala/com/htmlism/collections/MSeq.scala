package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MSeq extends CollectionFactory[MSeq] {
  def builder[A] = new ListBuilder[A]
}

trait MSeq[+A] extends MIterable[A] {
  def apply(i: Int): A = {
    val iter = iterator
    var n = 0

    while (n < i && iter.hasNext) {
      iter.next()
      n = n + 1
    }

    if (iter.hasNext)
      iter.next()
    else
      throw new IndexOutOfBoundsException
  }
}
