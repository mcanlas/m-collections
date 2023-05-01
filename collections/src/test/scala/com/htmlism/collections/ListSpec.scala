package com.htmlism.collections

class ListSpec extends SeqSpec {
  def sequence: MList[Int] = 1 :: 2 :: 3 :: 4 :: MNil

  "An empty list" should {
    "do nothing after traversal" in {
      var i = 0

      // type annotation evades dead code warning from Nothing type
      (MNil: MList[Int]).foreach(_ => i += 1)

      i === 0
    }
  }: Unit

  "A non-empty list" should {
    "have a head" in {
      val list = NonEmptyList("foo", MNil)

      list.head === "foo"
    }
  }: Unit
}
