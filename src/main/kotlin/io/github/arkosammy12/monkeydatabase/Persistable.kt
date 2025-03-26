package io.github.arkosammy12.monkeydatabase

interface Persistable<T : Persistable<T, R>, R : Record<T>> {

    fun getAsRecord(): R

}