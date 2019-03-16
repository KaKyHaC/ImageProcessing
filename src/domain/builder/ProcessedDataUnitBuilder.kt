package domain.builder

import domain.data.ProcessedDataUnit
import domain.data.SignMatrix
import java.math.BigInteger

class ProcessedDataUnitBuilder {
    var firstElement: Int? = null
    var code: BigInteger? = null
    var baseArray: ShortArray? = null
    var signMatrix: SignMatrix? = null
    var width: Int? = null
    var height: Int? = null

    fun build(): ProcessedDataUnit {
        return ProcessedDataUnit(
            firstElement,
            code!!,
            baseArray!!,
            signMatrix!!,
            width!!,
            height!!
        )
    }
}