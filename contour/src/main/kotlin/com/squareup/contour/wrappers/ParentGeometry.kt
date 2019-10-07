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
import com.squareup.contour.CInt
//import com.squareup.contour.CInt
import com.squareup.contour.constraints.SizeConfig
//import com.squareup.contour.utils.toCInt
import com.squareup.contour.utils.toCInt

internal class ParentGeometry(
  private val widthConfig: SizeConfig,
  private val heightConfig: SizeConfig
) : Geometry {
  override fun left(): CInt = CInt.ZERO
  override fun right(): CInt = widthConfig.resolve().toCInt()
  override fun width(): CInt = widthConfig.resolve().toCInt()
  override fun centerX(): CInt = (widthConfig.resolve() / 2).toCInt()

  override fun top(): CInt = CInt.ZERO
  override fun bottom(): CInt = heightConfig.resolve().toCInt()
  override fun height(): CInt = heightConfig.resolve().toCInt()
  override fun centerY(): CInt = heightConfig.resolve().toCInt() / 2
}
