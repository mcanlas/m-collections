package com.htmlism.collections
package builders

class ListBuilder[A] extends GenListBuilder[A] {
  def result: MList[A] = {
    val builder = new PrependBuilder[A]

    for (e <- acc)
      builder += e

    builder.result
  }
}

class PrependBuilder[A] extends GenListBuilder[A] {
  def result: MList[A] =
    acc
}

abstract class GenListBuilder[A] extends Builder[A, MList[A]] {
  protected var acc: MList[A] =
    MList.empty[A]

  def +=(element: A): Unit =
    acc ::= element
}
