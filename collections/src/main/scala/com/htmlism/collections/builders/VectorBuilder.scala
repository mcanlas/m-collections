package com.htmlism.collections
package builders

class VectorBuilder[A] extends Builder[A, MVector[A]] {
  private val b = new ReverseListBuilder[A]
  private var i = 0

  def +=(element: A): Unit = {
    b += element
    i += 1
  }

  def result: MVector[A] = {
    // generically typed arrays are hard?
    val arr = new Array[AnyRef](i)
    i = i - 1

    for (x <- b.result) {
      arr(i) = x.asInstanceOf[AnyRef]
      i = i - 1
    }

    new MVector[A](arr)
  }
}
