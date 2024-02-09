package com.htmlism.collections

import com.htmlism.collections.builders.*

object MIndexedSeq extends CollectionFactory[MIndexedSeq]:
  def builder[A]: Builder[A, MIndexedSeq[A]] = new VectorBuilder[A]

trait MIndexedSeq[A] extends MSeq[A]
