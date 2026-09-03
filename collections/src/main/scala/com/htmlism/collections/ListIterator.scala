package com.htmlism.collections

class ListIterator[A](list: MList[A]) extends Iterator[A]:
  @SuppressWarnings(Array("org.wartremover.warts.Var"))
  private var cur = list

  def hasNext: Boolean =
    cur match
      case MNil => false
      case _    => true

  @SuppressWarnings(Array("org.wartremover.warts.Throw"))
  def next(): A =
    cur match
      case MNil =>
        throw new IllegalStateException("cannot retrieve an element from an exhausted iterator")

      case NonEmptyList(head, tail) =>
        cur = tail
        head
