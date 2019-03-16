package domain.module.builder.origin

import domain.data.origin.OriginDataContainer
import domain.data.origin.OriginDataMatrix
import domain.data.origin.OriginDataUnit
import domain.module.IModule

class OriginBuilder : IModule<IBitmap, OriginDataContainer> {
    override fun direct(data: IBitmap): OriginDataContainer {
        val matrixList = List(3) { dimension ->
            OriginDataMatrix(data.width, data.height) { i, j ->
                OriginDataUnit((data.getRgb(i, j) shr dimension * 8 and 0xff).toShort())
            }
        }
        return OriginDataContainer(matrixList)
    }

    override fun reverse(data: OriginDataContainer): IBitmap {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}