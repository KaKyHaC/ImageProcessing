package domain

import domain.data.IData
import domain.module.IModule

class ModuleNode<InputType : IData, OutputType : IData>(val module: IModule<InputType, OutputType>) {
    var nextNode: ModuleNode<OutputType, IData>? = null

    fun direct(data: InputType): IData {
        val res = module.direct(data)
        return nextNode?.direct(res) ?: res
    }
}