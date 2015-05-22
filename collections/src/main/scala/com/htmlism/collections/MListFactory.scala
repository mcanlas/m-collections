package com.htmlism.collections

trait MListFactory extends CollectionFactory[MNonEmptyList] {
  def apply[B](elements: B*): MNonEmptyList[B] = ???

  def empty: MNonEmptyList = ???
}
