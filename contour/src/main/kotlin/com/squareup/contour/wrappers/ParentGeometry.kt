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

package com.squareup.contour.wrappers

import com.squareup.contour.Geometry
//import com.squareup.contour.CInt
//import com.squareup.contour.CInt
import com.squareup.contour.constraints.SizeConfig
//import com.squareup.contour.utils.toCInt
//import com.squareup.contour.utils.toCInt

internal class ParentGeometry(
  private val widthConfig: SizeConfig,
  private val heightConfig: SizeConfig
) : Geometry {
  override fun left(): Int = 0
  override fun right(): Int = widthConfig.resolve()
  override fun width(): Int = widthConfig.resolve()
  override fun centerX(): Int = (widthConfig.resolve() / 2)

  override fun top(): Int = 0
  override fun bottom(): Int = heightConfig.resolve()
  override fun height(): Int = heightConfig.resolve()
  override fun centerY(): Int = heightConfig.resolve() / 2
}
