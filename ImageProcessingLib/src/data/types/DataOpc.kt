package data.types

import data.interfaces.IByteVector
import data.interfaces.ICopyable
import data.interfaces.ISavable
import java.math.BigInteger

data class DataOpc(
    val DC: Short?,
    val N: BigInteger,
    val base: ShortArray,
    val signMatrix: Array<BooleanArray>
) : ICopyable<DataOpc>, ISavable {

    override fun copy() = builder().build()

    override fun appendByteVector(vector: IByteVector) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun builder() = Builder(
        base = base,
        signMatrix = signMatrix,
        DC = DC,
        N = N
    )

    data class Builder(
        var base: ShortArray? = null,
        var signMatrix: Array<BooleanArray>? = null,
        var DC: Short? = null,
        var N: BigInteger? = null
    ) {
        fun build() = DataOpc(
            DC = DC,
            N = N!!,
            signMatrix = signMatrix!!,
            base = base!!
        )
    }
}