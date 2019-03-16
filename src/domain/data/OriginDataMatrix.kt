package domain.data

import domain.data.generic.Matrix

class OriginDataMatrix(width: Int, height: Int, init: (Int, Int) -> OriginDataUnit) :
    Matrix<OriginDataUnit>(width, height, init)