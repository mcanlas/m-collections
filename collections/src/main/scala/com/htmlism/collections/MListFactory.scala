package com.htmlism.collections

trait MListFactory extends CollectionFactory[NonEmptyList] {
  def apply[B](elements: B*): NonEmptyList[B] = ???

//  def empty: MNonEmptyList = ???
}
