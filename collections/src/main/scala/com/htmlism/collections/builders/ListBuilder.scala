package com.htmlism.collections
package builders

class ListBuilder[A] extends Builder[A, MList[A]] {
  private var acc =
    MList.empty[A]

  def +=(element: A): Unit = acc ::= element

  def result: MList[A] = {
    var rev = MList.empty[A]

    for (x <- acc)
      rev ::= x

    rev
  }
}

class ReverseListBuilder[A] extends Builder[A, MList[A]] {
  private var acc: MList[A] = MNil

  def +=(element: A): Unit = acc ::= element

  def result: MList[A] = acc
}
