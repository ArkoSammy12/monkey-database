package io.github.arkosammy12.monkeydatabase.types

import java.sql.Blob

data class BlobType(override val value: Blob) : ColumnType<Blob>("BLOB")
