package io.github.arkosammy12.monkeydatabase.columns

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record
import io.github.arkosammy12.monkeydatabase.types.ColumnType
import io.github.arkosammy12.monkeydatabase.types.IntegerType
import io.github.arkosammy12.monkeydatabase.types.RealType

class RealColumn<P : Persistable<*, *>, R : Record<P>>(name: String) : Column<P, R, Double, RealType>(name, ColumnType.Types.REAL) {

    infix fun isLowerThan(value: IntegerType) {

    }

    infix fun isHigherThan(value: IntegerType) {

    }

    infix fun isLowerThanOrEqualTo(value: IntegerType) {

    }

    infix fun isHigherThanOrEqualTo(value: IntegerType) {

    }

}