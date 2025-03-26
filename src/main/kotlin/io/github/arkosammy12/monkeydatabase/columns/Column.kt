package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.BlobType
import io.github.arkosammy12.monkeydatabase.types.BooleanType
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import io.github.arkosammy12.monkeydatabase.types.IntegerType
import io.github.arkosammy12.monkeydatabase.types.RealType
import io.github.arkosammy12.monkeydatabase.types.TextType
import io.github.arkosammy12.monkeydatabase.types.TimestampType
import java.sql.Blob
import java.sql.Timestamp

abstract class Column<P : Persistable<*, *>, R : Record<P>, T : Any, V : ColumnType<T>>(val name: String, val type: ColumnType.Types) {

    infix fun isEqualTo(value: V) {

    }

}

fun <P : Persistable<*, *>, R : Record<P>, T : Persistable<T, R>> integer(name: String): ColumnDelegate<P, R, Long, IntegerType> {
    val column: IntegerColumn<P, R> = IntegerColumn(name)
    return ColumnDelegate(column)
}

fun <P : Persistable<*, *>, R : Record<P>, T : Persistable<T, R>> blob(name: String): ColumnDelegate<P, R, Blob, BlobType> {
    val column: BlobColumn<P, R> = BlobColumn(name)
    return ColumnDelegate(column)
}

fun <P : Persistable<*, *>, R : Record<P>, T : Persistable<T, R>> real(name: String): ColumnDelegate<P, R, Double, RealType> {
    val column: RealColumn<P, R> = RealColumn(name)
    return ColumnDelegate(column)
}

fun <P : Persistable<*, *>, R : Record<P>, T : Persistable<T, R>> boolean(name: String): ColumnDelegate<P, R, Boolean, BooleanType> {
    val column: BooleanColumn<P, R> = BooleanColumn(name)
    return ColumnDelegate(column)
}

fun <P : Persistable<*, *>, R : Record<P>, T : Persistable<T, R>> text(name: String): ColumnDelegate<P, R, String, TextType> {
    val column: TextColumn<P, R> = TextColumn(name)
    return ColumnDelegate(column)
}

fun <P : Persistable<*, *>, R : Record<P>, T : Persistable<T, R>> timestamp(name: String): ColumnDelegate<P, R, Timestamp, TimestampType> {
    val column: TimestampColumn<P, R> = TimestampColumn(name)
    return ColumnDelegate(column)
}