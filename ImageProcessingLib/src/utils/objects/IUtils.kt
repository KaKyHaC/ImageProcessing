package utils.objects

interface IUtils<I, O> {
    fun direct(input: I): O
    fun reverse(output: O): I
}