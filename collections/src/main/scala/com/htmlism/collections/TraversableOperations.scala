package com.htmlism.collections

trait TraversableOperations[+A] {
  self: MTraversable[A] =>

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
