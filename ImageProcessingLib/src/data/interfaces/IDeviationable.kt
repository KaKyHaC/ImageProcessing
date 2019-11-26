package data.interfaces

interface IDeviationable<T> {
    fun calculateDeviation(other: T) : Double
}