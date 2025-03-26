package io.github.arkosammy12.monkeydatabase

import io.github.arkosammy12.monkeydatabase.columns.Column

abstract class Table<P : Persistable<*, *>, R : Record<P>>(val name: String) {

    internal val columns: MutableMap<String, Column<P, R, *, *>> = mutableMapOf()



}