package com.htmlism.collections.builders

import com.htmlism.collections.MVector

class VectorBuilder[A] extends Builder[A, MVector[A]] {
  private val b = new ReverseListBuilder[A]
  private var i = 0

  def +=(element: A) = {
    b += element
    i += 1
  }

  def result = {
    // generically typed arrays are hard?
    val arr = new Array[AnyRef](i)
    i -= 1

    var list = b.result

    while (i > -1) {
      // must relax List[A] into AnyRef
      arr(i) = list.head.asInstanceOf[AnyRef]

      list = list.tail
      i -= 1
    }

    new MVector[A](arr)
  }
}
