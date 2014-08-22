package com.htmlism.collections

import org.specs2.mutable.Specification

trait SeqSpec extends Specification {
  def sequence: MSeq[_]

  "A sequence" should {
    "support access by index" in {
      val seq = sequence

      seq(0) === 1
      seq(3) === 4
    }
  }
}
