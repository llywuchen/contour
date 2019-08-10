@file:Suppress("EXPERIMENTAL_FEATURE_WARNING", "NOTHING_TO_INLINE", "unused")

package com.squareup.contour

inline class YInt(val value: Int) {

  inline operator fun plus(other: Int) = YInt(value + other)
  inline operator fun plus(other: YInt) = YInt(value + other.value)
  inline operator fun plus(other: Float) = YFloat(value + other)
  inline operator fun plus(other: YFloat) = YFloat(value + other.value)

  inline operator fun minus(other: Int) = YInt(value - other)
  inline operator fun minus(other: YInt) = YInt(value - other.value)
  inline operator fun minus(other: Float) = YFloat(value - other)
  inline operator fun minus(other: YFloat) = YFloat(value - other.value)

  inline operator fun times(other: Int) = YInt(value * other)
  inline operator fun times(other: YInt) = YInt(value * other.value)
  inline operator fun times(other: Float) = YFloat(value * other)
  inline operator fun times(other: YFloat) = YFloat(value * other.value)

  inline operator fun div(other: Int) = YInt(value / other)
  inline operator fun div(other: YInt) = YInt(value / other.value)
  inline operator fun div(other: Float) = YFloat(value / other)
  inline operator fun div(other: YFloat) = YFloat(value / other.value)

  inline fun toX() = XInt(value)

  companion object {
    val ZERO = YInt(0)
    val MIN_VALUE = YInt(Int.MIN_VALUE)
  }
}