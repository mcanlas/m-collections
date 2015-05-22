package com.htmlism.collections

import scala.language.higherKinds

trait CollectionFactory[A[_]] {
  def apply[B](elements: B*): A[B]

//  def empty: A
}
