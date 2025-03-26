package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import io.github.arkosammy12.monkeydatabase.types.IntegerType

class IntegerColumn<P : Persistable<*, *>, R : Record<P>>(name: String) : Column<P, R, Long, IntegerType>(name, ColumnType.Types.INTEGER) {

    infix fun isLowerThan(value: IntegerType) {

    }

    infix fun isHigherThan(value: IntegerType) {

    }

    infix fun isLowerThanOrEqualTo(value: IntegerType) {

    }

    infix fun isHigherThanOrEqualTo(value: IntegerType) {

    }

}