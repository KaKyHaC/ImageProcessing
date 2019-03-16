package domain.data.origin

data class OriginDataUnit(val value: Short) {
    constructor(value: Int) : this(value.toShort())

    fun toInt() = value.toInt()
}