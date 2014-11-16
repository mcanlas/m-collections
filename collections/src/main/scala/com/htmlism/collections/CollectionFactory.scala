package com.htmlism.collections

trait CollectionFactory[A[_]] {
  def apply[B](elements: B*): A[B]

  def empty: A
}
