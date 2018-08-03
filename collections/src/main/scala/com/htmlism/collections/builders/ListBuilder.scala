package com.htmlism.collections
package builders

class ListBuilder[A] extends Builder[A, MList[A]] {
  private var acc =
    MList.empty[A]

  def +=(element: A): Unit = acc ::= element

  def result: MList[A] = {
    var reversedAcc = MList.empty[A]

    for (x <- acc)
      reversedAcc ::= x

    reversedAcc
  }
}

class ReverseListBuilder[A] extends Builder[A, MList[A]] {
  private var acc: MList[A] = MNil

  def +=(element: A): Unit = acc ::= element

  def result: MList[A] = acc
}
