package io.github.arkosammy12.monkeydatabase.types

data class BooleanType(override val value: Boolean) : ColumnType<Boolean>("BOOLEAN")
