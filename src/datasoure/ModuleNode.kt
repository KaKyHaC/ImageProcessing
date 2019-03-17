package datasoure

import domain.module.IModule

class ModuleNode<InputType, OutputType>(val module: IModule<InputType, OutputType>) {
    private var invokeNext: ((OutputType) -> Unit)? = null

    fun direct(data: InputType) {
        val res = module.direct(data)
        invokeNext?.invoke(res)
    }

    fun <T> append(module: ModuleNode<OutputType, T>) {
        invokeNext = { module.direct(it) }
    }
}