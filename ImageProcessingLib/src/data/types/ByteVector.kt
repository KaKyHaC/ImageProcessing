package data.types

import constants.Constants
import data.interfaces.IByteVector
import java.nio.ByteBuffer

/**
 * Non save class
 * Iterator for Array<Byte>
 */
class ByteVector : IByteVector {

    private val byteBuffer = ByteBuffer.allocate(Constants.BYTES_PER_LONG)

    private val data = mutableListOf<Byte>()

    var byteIndex = 0
        private set

    var bitIndex = 0
        private set

    override val bytes: ByteArray
        get() = data.toByteArray()

    override fun writeBits(value: Long, bitLength: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun readBits(bitLength: Int, position: Int?): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator() = data.iterator()

    fun resetIterator() {
        bitIndex = 0
        byteIndex = 0
    }
}
