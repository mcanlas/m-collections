package com.htmlism.collections

/**
  * A trait to isolate convenience methods.
  *
  * @tparam A The element type
  */
trait TraversableOperations[+A] {
  self: MTraversable[A] =>

  /**
    * Accumulates the results of some function over each element in the collection,
    * starting from some zero value.
    *
    * @param z The initial value (the "zero")
    * @param f A function that yields a new result, given the old result and current element
    * @tparam B The result type
    * @return The accumulated value
    */
  def foldLeft[B](z: B)(f: (B, A) => B): B = {
    var res = z

    for (x <- this)
      res = f(res, x)

    res
  }

  override def toString = {
    val sb = new StringBuilder(self.getClass.getSimpleName + '(')

    var first = true

    for (x <- self)
      if (first) {
        sb ++= x.toString

        first = false
      } else {
        sb ++= ", "
        sb ++= x.toString
      }

    sb += ')'

    sb.result()
  }
}
