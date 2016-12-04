package com.htmlism.collections.builders

import com.htmlism.collections.{ MList, MNil }

class ListBuilder[A] extends Builder[A, MList[A]] {
  private var acc: MList[A] = MNil

  def +=(element: A): Unit = acc ::= element

  def result: MList[A] = {
    var rev: MList[A] = MNil

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
