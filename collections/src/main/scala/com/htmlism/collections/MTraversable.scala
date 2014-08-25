package com.htmlism.collections

trait MTraversable[+A] {
  def foreach[B](f: A => B): Unit
}
