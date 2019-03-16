package domain.module.builder.origin

import domain.data.origin.OriginDataContainer
import domain.module.IModule

class OriginBuilder : IModule<IBitmap, OriginDataContainer>{
    override fun direct(data: IBitmap): OriginDataContainer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun reverse(data: OriginDataContainer): IBitmap {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}