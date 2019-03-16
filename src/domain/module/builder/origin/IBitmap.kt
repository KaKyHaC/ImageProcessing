package domain.module.builder.origin

interface IBitmap {
    val width: Int
    val height: Int
    fun rgbAt(i: Int, j:Int): Int
}