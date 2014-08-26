package com.htmlism.collections

trait MIterable[+A] extends MTraversable[A] {
  def iterator: Iterator[A]

  def foreach[B](f: A => B) = iterator.foreach(f)
}
