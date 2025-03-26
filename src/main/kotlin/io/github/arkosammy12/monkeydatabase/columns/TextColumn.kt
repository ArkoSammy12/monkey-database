package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import io.github.arkosammy12.monkeydatabase.types.TextType

class TextColumn<P : Persistable<*, *>, R : Record<P>>(name: String) : Column<P, R, String, TextType>(name, ColumnType.Types.TEXT) {
}