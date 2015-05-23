package com.htmlism.collections

import com.htmlism.collections.builders.VectorBuilder

object MIndexedSeq extends CollectionFactory[MIndexedSeq] {
  def builder[A] = new VectorBuilder[A]
}

trait MIndexedSeq[A] extends MSeq[A]
