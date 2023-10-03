package com.htmlism.collections

import com.htmlism.collections.builders.*

object MVector extends CollectionFactory[MVector] {
  def builder[A]: Builder[A, MVector[A]] = new VectorBuilder[A]
}

class MVector[A](values: Array[AnyRef]) extends MIndexedSeq[A] {
  def iterator =
    new Iterator[A] { // TODO use custom iterator trait
      var i = 0

      def hasNext: Boolean = i < values.length

      def next(): A = {
        val v = values(i).asInstanceOf[A]
        i += 1

        v
      }
    }
}
