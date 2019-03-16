package domain.module.builder.origin

interface IBitmap {
    val width: Int
    val height: Int
    fun getRgb(i: Int, j:Int): Int
    fun setRgb(i: Int, j:Int, value: Int)
}