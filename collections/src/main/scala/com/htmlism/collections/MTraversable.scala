package com.htmlism.collections

object MTraversable extends CollectionFactory[MTraversable]

trait MTraversable[+A] {
  def foreach[B](f: A => B): Unit
}
