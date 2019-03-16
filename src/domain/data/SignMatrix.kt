package domain.data

class SignMatrix(private val data: List<List<Boolean>>) {
    constructor(width: Int, height: Int, init: (Int, Int) -> Boolean) :
            this(List(width) { i -> List(height) { j -> init(i, j) } })

    val width: Int
        get() = data.size

    val height: Int
        get() = data.first().size

    fun signAt(i: Int, j: Int) = data[i][j]
}