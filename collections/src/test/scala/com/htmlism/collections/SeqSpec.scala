package com.htmlism.collections

trait SeqSpec extends IterableSpec {
  def iterable = sequence
  def sequence: MSeq[Int]

  "A sequence" should {
    "support access by index" in {
      val seq = sequence

      seq(0) === 1
      seq(3) === 4
    }
  }
}
