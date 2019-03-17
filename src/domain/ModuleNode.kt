package domain

import domain.data.IData
import domain.module.IModule

class ModuleNode<InputType : IData, OutputType : IData>(val module: IModule<InputType, OutputType>) {
    var invokeNext: ((OutputType) -> Unit)? = null

    fun direct(data: InputType) {
        val res = module.direct(data)
        invokeNext?.invoke(res)
    }
}