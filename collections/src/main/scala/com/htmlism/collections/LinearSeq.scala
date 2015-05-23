package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object LinearSeq extends CollectionFactory[LinearSeq] {
  def builder[A] = new ListBuilder[A]
}

trait LinearSeq[+A] extends MSeq[A]
