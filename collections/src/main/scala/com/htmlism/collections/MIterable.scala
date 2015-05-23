package com.htmlism.collections

import com.htmlism.collections.builders.ListBuilder

object MIterable extends CollectionFactory[MIterable] {
  def builder[A] = new ListBuilder[A]
}

trait MIterable[+A] extends MTraversable[A] {
  def iterator: Iterator[A]

  def foreach[B](f: A => B) = iterator.foreach(f)
}
