package data.interfaces

interface IByteVector : Iterable<Byte> {

    val bytes: ByteArray

    val size get() = bytes.size

    fun writeBits(value: Long, bitLength: Int)

    fun readBits(bitLength: Int, position: Int?): Long
}