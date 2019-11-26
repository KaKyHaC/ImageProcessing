package data.primitives

import data.interfaces.ISavable
import data.interfaces.IByteVector

data class Size(val width: Short, val height: Short) : ISavable {

    constructor(vector: IByteVector) : this(
        vector.getNextShort()?.toInt() ?: 0,
        vector.getNextShort()?.toInt() ?: 0
    )
    override fun appendByteVector(vector: IByteVector) {
        vector.append(width.toShort())
        vector.append(height.toShort())
    }
}
