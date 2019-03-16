package domain.module.builder.origin

import domain.data.origin.OriginDataContainer
import domain.data.origin.OriginDataMatrix
import domain.data.origin.OriginDataUnit
import domain.module.IModule

class OriginBuilder(val builder: IBitmap.Builder) : IModule<IBitmap, OriginDataContainer> {
    override fun direct(data: IBitmap): OriginDataContainer {
        val matrixList = List(3) { dimension ->
            OriginDataMatrix(data.width, data.height) { i, j ->
                OriginDataUnit((data.getRgb(i, j) shr dimension * 8 and 0xff))
            }
        }
        return OriginDataContainer(matrixList)
    }

    override fun reverse(data: OriginDataContainer): IBitmap {
        return builder.build(data[0].width, data[0].height) { i, j ->
            val blue = data[0][i, j].toInt()
            val green = data[1][i, j].toInt()
            val red = data[2][i, j].toInt()
            blue or (green shl 8) or (red shl 16)
        }
    }
}