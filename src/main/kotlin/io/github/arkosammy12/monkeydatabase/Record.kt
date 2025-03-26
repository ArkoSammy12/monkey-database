package io.github.arkosammy12.monkeydatabase

interface Record<T : Persistable<*, *>> {

    fun getAsOriginalObject(): T

}