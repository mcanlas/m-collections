package com.htmlism.collections

object MIterable extends CollectionFactory[MIterable]

trait MIterable[+A] extends MTraversable[A] {
  def iterator: Iterator[A]

  def foreach[B](f: A => B) = iterator.foreach(f)
}
