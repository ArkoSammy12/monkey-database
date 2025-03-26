package io.github.arkosammy12.monkeydatabase

class Database {

    val tables: List<Table<*, *>> = listOf()

    fun <T : Persistable<T, R>, R : Record<T>> insertInto(table: Table<T, R>) {
        for (storedTable: Table<*, *> in tables) {
            if (storedTable.name == table.name) {

            }
        }
    }

    fun <T : Persistable<T, R>, R : Record<T>> deleteFrom(table: Table<T, R>) {
        for (storedTable: Table<*, *> in tables) {
            if (storedTable.name == table.name) {

            }
        }
    }

}