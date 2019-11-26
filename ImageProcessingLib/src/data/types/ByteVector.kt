package data.types

import constants.Constants

/**
 * Non save class
 * Iterator for Array<Byte>
 */
class ByteVector : Iterable<Byte> {

    private val data = mutableListOf<Byte>()

    val size get() = data.size

    override fun iterator() = data.iterator()

    operator fun get(i: Int): Byte {
        growToIndex(i)
        return data[i]
    }

    operator fun set(i: Int, value: Byte) {
        growToIndex(i)
        data[i] = value
    }

    private fun growToIndex(i: Int) {
        if (i < size) return
        else data.addAll(List(i - size + 1) { Constants.ZERO_BYTE })
    }


}
