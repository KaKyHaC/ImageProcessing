package domain.data.processed

import domain.data.generic.Matrix

class SignMatrix(width: Int, height: Int, init: (Int, Int) -> Boolean) :
    Matrix<Boolean>(width, height, init)