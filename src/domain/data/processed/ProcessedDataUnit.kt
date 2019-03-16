package domain.data.processed

import java.math.BigInteger

data class ProcessedDataUnit(
    val firstElement: Int?,
    val code: BigInteger,
    val baseArray: ShortArray,
    val signMatrix: SignMatrix,
    val width: Int,
    val height: Int
) {
    init {
        if (signMatrix.width != width || signMatrix.height != height)
            throw Exception("invalid sign matrix size")

        if (baseArray.size != height)
            throw Exception("invalid base array size")
    }

    class Builder {
        var firstElement: Int? = null
        var code: BigInteger? = null
        var baseArray: ShortArray? = null
        var signMatrix: SignMatrix? = null
        var width: Int? = null
        var height: Int? = null

        fun build(): ProcessedDataUnit {
            return ProcessedDataUnit(firstElement, code!!, baseArray!!, signMatrix!!, width!!, height!!)
        }
    }
}