package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.Table
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ColumnDelegate<P : Persistable<*, *>, R : Record<P>, T : Any, V : ColumnType<T>>(val column: Column<P, R, T, V>) : ReadOnlyProperty<Table<P, R>, Column<P, R, T, V>> {

    override fun getValue(thisRef: Table<P, R>, property: KProperty<*>): Column<P, R, T, V> =
        this.column

    operator fun provideDelegate(thisRef: Table<P, R>, property: KProperty<*>): ColumnDelegate<P, R, T, V> {
        thisRef.columns.put(column.name, column)
        return this
    }
}