/*
 * Copyright 2019 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("EXPERIMENTAL_FEATURE_WARNING", "NOTHING_TO_INLINE", "unused")

package com.squareup.contour

/**
 * Represents an [Int] on the x axis.
 */
inline class CInt(val value: Int) {

  inline operator fun plus(other: Int) = CInt(value + other)
  inline operator fun plus(other: CInt) = CInt(value + other.value)
  inline operator fun plus(other: Float) = CFloat(value + other)
  inline operator fun plus(other: CFloat) = CFloat(value + other.value)

  inline operator fun minus(other: Int) = CInt(value - other)
  inline operator fun minus(other: CInt) = CInt(value - other.value)
  inline operator fun minus(other: Float) = CFloat(value - other)
  inline operator fun minus(other: CFloat) = CFloat(value - other.value)

  inline operator fun times(other: Int) = CInt(value * other)
  inline operator fun times(other: CInt) = CInt(value * other.value)
  inline operator fun times(other: Float) = CFloat(value * other)
  inline operator fun times(other: CFloat) = CFloat(value * other.value)

  inline operator fun div(other: Int) = CInt(value / other)
  inline operator fun div(other: CInt) = CInt(value / other.value)
  inline operator fun div(other: Float) = CFloat(value / other)
  inline operator fun div(other: CFloat) = CFloat(value / other.value)

  companion object {
    val ZERO = CInt(0)
    val MIN_VALUE = CInt(Int.MIN_VALUE)
  }
}
