package data.primitives

import data.interfaces.IByteVector
import data.interfaces.ISavable

class Flag constructor() : ISavable {
    private val data = mutableMapOf<Parameter, Boolean>()

    constructor(vector: IByteVector) : this() {
        //TODO()
    }

    fun isChecked(param: Parameter) = data.get(param) ?: false

    fun setChecked(parameter: Parameter, state: Boolean) = data.put(parameter, state)

    fun setTrue(parameter: Parameter) = setChecked(parameter, true)

    fun setFalse(parameter: Parameter) = setChecked(parameter, false)

    override fun appendByteVector(vector: IByteVector) {
        TODO()
    }

    enum class Parameter {
        OneFile, Enlargement, DC, LongCode, GlobalBase, Password, Steganography, Alignment, CompressionUtils, Quantization, Encryption, DCT;

        fun getBinaryValue() = Math.pow(2.0, values().indexOf(this).toDouble())
    }
}