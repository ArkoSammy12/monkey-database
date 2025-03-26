package io.github.arkosammy12.monkeydatabase.builders

import io.github.arkosammy12.monkeydatabase.columns.Column
import io.github.arkosammy12.monkeydatabase.types.ColumnType

abstract class QueryPredicate<T : Any, V : ColumnType<T>>(column: Column<*, *, T, V>, value: V) {
}