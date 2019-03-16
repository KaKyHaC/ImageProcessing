package domain.data.generic

open class MatrixContainer<T> (private val data: MutableList<T>) {
    val dimension: Int
        get() = data.size

    operator fun get(i: Int) = data[i]
}