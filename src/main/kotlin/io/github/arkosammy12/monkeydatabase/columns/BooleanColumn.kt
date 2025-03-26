package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.BooleanType
import io.github.arkosammy12.monkeydatabase.types.ColumnType

class BooleanColumn<P : Persistable<*, *>, R : Record<P>>(name: String) : Column<P, R, Boolean, BooleanType>(name, ColumnType.Types.BOOLEAN)