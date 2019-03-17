package domain

import domain.data.IData
import domain.module.IModule
import java.util.*

class ModuleCollection {
    private val modules = Vector<IModule<IData, IData>>()

    fun direct(data: IData) {
        var tmp = data
        for (module in modules) {
            tmp = module.direct(tmp)
        }
    }

    fun addModule(module: IModule<IData, IData>) {
        modules.addElement(module)
    }
}