package com.htmlism.collections

object MNil extends MListLike[Nothing] {
  def iterator = Iterator.empty

  def head = throw new NoSuchElementException("an empty list does not have a head")
  def tail = throw new UnsupportedOperationException("an empty list does not have a tail")
}
