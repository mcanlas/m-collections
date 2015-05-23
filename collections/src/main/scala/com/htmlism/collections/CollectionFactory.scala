package com.htmlism.collections

import scala.language.higherKinds

trait CollectionFactory[CC[X]] {
  def apply[A](elements: A*): CC[A] = ???

//  def empty: A
}
