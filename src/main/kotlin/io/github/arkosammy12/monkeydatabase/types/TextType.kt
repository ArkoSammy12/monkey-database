package io.github.arkosammy12.monkeydatabase.types

data class TextType(override val value: String) : ColumnType<String>("TEXT") {
}