package com.htmlism.collections
package builders

class VectorBuilder[A] extends Builder[A, MVector[A]]:
  private val b = new PrependBuilder[A]

  @SuppressWarnings(Array("org.wartremover.warts.Var"))
  private var i = 0

  def +=(element: A): Unit =
    b += element
    i += 1

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  def result: MVector[A] =
    // generically typed arrays are hard?
    val arr = new Array[AnyRef](i)
    i = i - 1

    for x <- b.result do
      arr(i) = x.asInstanceOf[AnyRef]
      i      = i - 1

    new MVector[A](arr)
