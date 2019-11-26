package data.types

import constants.Constants

/**
 * Save class
 * Iterator for ArrayList<Byte>
 */
class ByteVector : ArrayList<Byte>() {

    override operator fun get(index: Int): Byte {
        growToIndex(index)
        return super.get(index)
    }

    override operator fun set(index: Int, element: Byte): Byte {
        growToIndex(index)
        return super.set(index, element)
    }

    private fun growToIndex(i: Int) {
        if (i < size) return
        else addAll(List(i - size + 1) { Constants.ZERO_BYTE })
    }
}
