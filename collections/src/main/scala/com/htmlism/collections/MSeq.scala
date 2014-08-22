package com.htmlism.collections

trait MSeq[+A] extends MIterable[A] {
  def apply(i: Int): A
}
