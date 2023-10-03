package com.htmlism.collections

import com.htmlism.collections.builders.*

object MTraversable extends CollectionFactory[MTraversable] {
  def builder[A]: Builder[A, MTraversable[A]] = new ListBuilder[A]
}

trait MTraversable[+A] extends TraversableOperations[A] {
  def foreach[B](f: A => B): Unit
}
