package com.htmlism.collections

object MTraversable

trait MTraversable[+A] {
  def foreach[B](f: A => B): Unit
}
