// Copyright (c) 2013-2020 Rob Norris and Contributors
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package doobie.util

import _root_.io.estatico.newtype.macros.newtype

object newtypes {
  @newtype class N1(value: String)
  @newtype class N2(value: String)
}
