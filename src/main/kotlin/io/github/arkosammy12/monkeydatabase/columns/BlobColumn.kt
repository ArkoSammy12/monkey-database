package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.BlobType
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import java.sql.Blob

class BlobColumn<P : Persistable<*, *>, R : Record<P>>(name: String) : Column<P, R, Blob, BlobType>(name, ColumnType.Types.BLOB)