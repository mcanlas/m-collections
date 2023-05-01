package com.htmlism.collections

import org.specs2.mutable.Specification

trait TraversableSpec extends Specification {
  def traversable: MTraversable[Int]

  "A traversable collection" should {
    "support traversal" in {
      var i = 0

      traversable.foreach(_ => i += 1)

      i === 4
    }
  }: Unit
}
