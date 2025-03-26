package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import io.github.arkosammy12.monkeydatabase.types.TimestampType
import java.sql.Timestamp

class TimestampColumn<P : Persistable<*, *>, R : Record<P>>(name: String) : Column<P, R, Timestamp, TimestampType>(name, ColumnType.Types.TIMESTAMP) {

    infix fun isEarlierThan(value: TimestampType) {

    }

    infix fun isLaterThan(value: TimestampType) {


    }

    infix fun isEarlierThanOrEqualTo(value: TimestampType) {

    }

    infix fun isLaterThanOrEqualTo(value: TimestampType) {

    }

}