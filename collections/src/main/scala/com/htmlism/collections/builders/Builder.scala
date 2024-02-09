package com.htmlism.collections.builders

trait Builder[X, +CC]:
  def +=(element: X): Unit

  def result: CC
