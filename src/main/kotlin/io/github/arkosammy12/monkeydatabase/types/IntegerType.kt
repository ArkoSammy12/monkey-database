package io.github.arkosammy12.monkeydatabase.types

data class IntegerType(override val value: Long) : ColumnType<Long>("INTEGER") {

}