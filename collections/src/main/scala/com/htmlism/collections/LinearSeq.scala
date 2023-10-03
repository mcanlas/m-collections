package com.htmlism.collections

import com.htmlism.collections.builders.*

object LinearSeq extends CollectionFactory[LinearSeq] {
  def builder[A]: Builder[A, LinearSeq[A]] = new ListBuilder[A]
}

trait LinearSeq[+A] extends MSeq[A]
