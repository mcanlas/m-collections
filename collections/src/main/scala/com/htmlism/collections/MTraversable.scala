package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MTraversable extends CollectionFactory[MTraversable] {
  def builder[A] = new ListBuilder[A]
}

trait MTraversable[+A] extends TraversableOperations {
  def foreach[B](f: A => B): Unit
}
