package io.github.arkosammy12.monkeydatabase.types

import java.sql.Timestamp
import java.time.LocalDateTime

data class TimestampType(override val value: Timestamp) : ColumnType<Timestamp>("TIMESTAMP") {

    constructor(localDateTime: LocalDateTime) : this(Timestamp.valueOf(localDateTime))

}