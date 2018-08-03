package com.htmlism.collections
package builders

class ListBuilder[A] extends Builder[A, MList[A]] {
  private var acc =
    MList.empty[A]

  def +=(element: A): Unit =
    acc ::= element

  def result: MList[A] = {
    val builder = new ReverseListBuilder[A]

    for (e <- acc)
      builder += e

    builder.result
  }
}

class ReverseListBuilder[A] extends Builder[A, MList[A]] {
  private var acc =
    MList.empty[A]

  def +=(element: A): Unit =
    acc ::= element

  def result: MList[A] =
    acc
}
