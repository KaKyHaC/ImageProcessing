package data.primitives

import data.interfaces.IByteVector
import data.interfaces.ISavable

data class Size(val width: Short, val height: Short) : ISavable {

    constructor(vector: IByteVector) : this(0,0) {
        TODO()
    }

    override fun appendByteVector(vector: IByteVector) {
        TODO()
    }
}
