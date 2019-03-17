package domain

import domain.module.IModule

class ModuleNode<InputType, OutputType>(val module: IModule<InputType, OutputType>) {
    var invokeNext: ((OutputType) -> Unit)? = null

    fun direct(data: InputType) {
        val res = module.direct(data)
        invokeNext?.invoke(res)
    }
}