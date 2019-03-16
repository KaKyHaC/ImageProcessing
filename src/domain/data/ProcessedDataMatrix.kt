package domain.data

import domain.data.generic.Matrix

class ProcessedDataMatrix(width: Int, height: Int, init: (Int, Int) -> ProcessedDataUnit) :
    Matrix<ProcessedDataUnit>(width, height, init)