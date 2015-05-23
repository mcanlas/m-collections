package com.htmlism.collections

import scala.language.higherKinds

import com.htmlism.collections.builders.Builder

trait CollectionFactory[+CC[X]] {
  def apply[A](elements: A*): CC[A] = ???

  def builder[A]: Builder[A, CC[A]]

//  def empty: A
}
