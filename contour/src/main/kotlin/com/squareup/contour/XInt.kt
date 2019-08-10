@file:Suppress("EXPERIMENTAL_FEATURE_WARNING", "NOTHING_TO_INLINE", "unused")

package com.squareup.contour

inline class XInt(val value: Int) {

  inline operator fun plus(other: Int) = XInt(value + other)
  inline operator fun plus(other: XInt) = XInt(value + other.value)
  inline operator fun plus(other: Float) = XFloat(value + other)
  inline operator fun plus(other: XFloat) = XFloat(value + other.value)

  inline operator fun minus(other: Int) = XInt(value - other)
  inline operator fun minus(other: XInt) = XInt(value - other.value)
  inline operator fun minus(other: Float) = XFloat(value - other)
  inline operator fun minus(other: XFloat) = XFloat(value - other.value)

  inline operator fun times(other: Int) = XInt(value * other)
  inline operator fun times(other: XInt) = XInt(value * other.value)
  inline operator fun times(other: Float) = XFloat(value * other)
  inline operator fun times(other: XFloat) = XFloat(value * other.value)

  inline operator fun div(other: Int) = XInt(value / other)
  inline operator fun div(other: XInt) = XInt(value / other.value)
  inline operator fun div(other: Float) = XFloat(value / other)
  inline operator fun div(other: XFloat) = XFloat(value / other.value)

  inline fun toY() = YInt(value)

  companion object {
    val ZERO = XInt(0)
    val MIN_VALUE = XInt(Int.MIN_VALUE)
  }
}