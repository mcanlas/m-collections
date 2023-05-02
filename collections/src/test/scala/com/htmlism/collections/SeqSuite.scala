package com.htmlism.collections

import weaver.FunSuite

trait SeqSuite { self: FunSuite =>
  def seqTest(xs: MSeq[Int]): Unit =
    test("A sequence should support access by index") {
      expect.eql(1, xs(0)) and
        expect.eql(4, xs(3))
    }
}
