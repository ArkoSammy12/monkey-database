package io.github.arkosammy12.monkeydatabase.builders

import io.github.arkosammy12.monkeydatabase.Persistable
import io.github.arkosammy12.monkeydatabase.Record

class QueryBuilder<T : Persistable<T, R>, R : Record<T>>(val operationType: OperationType) {



}