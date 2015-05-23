package com.htmlism.collections

object MSeq

trait MSeq[+A] extends MIterable[A] {
  def apply(i: Int): A
}
