package io.github.arkosammy12.monkeydatabase.types

data class RealType(override val value: Double) : ColumnType<Double>("REAL") {
}