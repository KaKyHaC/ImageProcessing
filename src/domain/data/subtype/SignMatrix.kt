package domain.data.subtype

import domain.data.generic.Matrix

class SignMatrix(width: Int, height: Int, init: (Int, Int) -> Boolean) :
    Matrix<Boolean>(width, height, init)