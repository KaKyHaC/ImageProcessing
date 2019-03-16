package domain.data.generic

open class Matrix<T> (private val data: List<MutableList<T>>) {
    constructor(width: Int, height: Int, init: (Int, Int) -> T) :
            this(List(width) { i -> MutableList(height) { j -> init(i, j) } })

    val width: Int
        get() = data.size

    val height: Int
        get() = data.first().size

    fun getAt(i: Int, j: Int) = data[i][j]
    fun setAt(i: Int, j: Int, value: T) { data[i][j] = value}

    operator fun set(i: Int, j: Int, value: T) { data[i][j] = value}
    operator fun get(i: Int, j: Int) = data[i][j]
}