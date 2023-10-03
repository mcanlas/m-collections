package com.htmlism.collections

import com.htmlism.collections.builders.*

object MIterable extends CollectionFactory[MIterable] {
  def builder[A]: Builder[A, MIterable[A]] = new ListBuilder[A]
}

trait MIterable[+A] extends MTraversable[A] {
  def iterator: Iterator[A]

  def foreach[B](f: A => B): Unit = { iterator.foreach(f) }
}
