package com.htmlism.collections

import com.htmlism.collections.builders.Builder

trait CollectionFactory[+CC[X]] {
  def apply[A](elements: A*): CC[A] = {
    val b = builder[A]

    for (e <- elements)
      b += e

    b.result
  }

  def builder[A]: Builder[A, CC[A]]

//  def empty: A
}
