package io.github.arkosammy12.monkeydatabase

import io.github.arkosammy12.monkeydatabase.types.ColumnType

data class ColumnReference<T : ColumnType<*>>(val name: String, val type: ColumnType.Types)