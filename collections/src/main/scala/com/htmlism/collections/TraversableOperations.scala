package com.htmlism.collections

trait TraversableOperations {
  self: MTraversable[_] =>

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
