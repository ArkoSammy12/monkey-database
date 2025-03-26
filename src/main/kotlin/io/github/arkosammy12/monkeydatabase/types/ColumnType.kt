package io.github.arkosammy12.monkeydatabase.types

sealed class ColumnType<T : Any>(val name: String) {

    abstract val value: T

    enum class Types {
        BLOB,
        BOOLEAN,
        INTEGER,
        REAL,
        TEXT,
        TIMESTAMP
    }

}