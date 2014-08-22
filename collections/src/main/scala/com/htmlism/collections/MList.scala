package com.htmlism.collections

class MList[A](val head: A, val tail: MListLike[A]) extends MListLike[A]
