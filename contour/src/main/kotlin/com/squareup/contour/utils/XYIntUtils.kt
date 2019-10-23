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

package com.squareup.contour.utils

import com.squareup.contour.LayoutContainer
//import com.squareup.contour.CFloat
//import com.squareup.contour.CInt


internal inline fun unwrapIntLambda(
  crossinline lambda: (Int) -> Int
): (Int) -> Int =
  { lambda(it) }

internal inline fun unwrapLayoutIntLambda(
  crossinline lambda: LayoutContainer.() -> Int
): LayoutContainer.() -> Int =
  { lambda() }

internal inline fun unwrapFloatLambda(
  crossinline lambda: LayoutContainer.() -> Float
): LayoutContainer.() -> Int =
  { lambda().toInt() }


//internal inline fun Int.toCInt() = CInt(this)
