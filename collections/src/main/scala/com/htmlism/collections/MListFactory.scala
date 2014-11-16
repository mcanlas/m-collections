package com.htmlism.collections

trait MListFactory extends CollectionFactory[MList] {
  def apply[B](elements: B*): MList[B] = ???

  def empty: MList = ???
}
