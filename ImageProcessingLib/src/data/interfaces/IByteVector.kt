package data.interfaces

interface IByteVector : Iterable<Byte> {

    val bytes: ByteArray

    val size get() = bytes.size

    fun append(value: Long, bitLength: Int)

    fun getBits(bitLength: Int, position: Int?): Long
}