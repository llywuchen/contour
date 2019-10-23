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

@file:Suppress("unused")

package com.squareup.contour

import com.squareup.contour.SizeMode.Exact
import com.squareup.contour.solvers.AxisSolver

interface LayoutContainer {
  val parent: Geometry
}

interface WidthOfOnlyContext : AxisSolver, HasXPositionWithoutWidth
interface HeightOfOnlyContext : AxisSolver, HasYPositionWithoutHeight

interface HasXPositionWithoutWidth {
  fun widthOf(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Int
  ): AxisSolver

  fun widthOfFloat(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Float
  ): AxisSolver
}

interface HasYPositionWithoutHeight {
  fun heightOf(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Int
  ): AxisSolver

  fun heightOfFloat(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Float
  ): AxisSolver
}

interface HasLeft : AxisSolver, HasXPositionWithoutWidth {
  fun rightTo(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Int
  ): AxisSolver

  fun rightToFloat(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Float
  ): AxisSolver
}

interface HasRight : AxisSolver, HasXPositionWithoutWidth {
  fun leftTo(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Int
  ): AxisSolver

  fun leftToFloat(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Float
  ): AxisSolver
}

interface HasTop : AxisSolver, HasYPositionWithoutHeight {
  fun bottomTo(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Int
  ): AxisSolver

  fun bottomToFloat(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Float
  ): AxisSolver
}

interface HasBottom : AxisSolver, HasYPositionWithoutHeight {
  fun topTo(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Int
  ): AxisSolver

  fun topToFloat(
    mode: SizeMode = Exact,
    provider: LayoutContainer.() -> Float
  ): AxisSolver
}
