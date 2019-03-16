package domain.data

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
}