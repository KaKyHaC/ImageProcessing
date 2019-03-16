package domain.module

interface IModule<InputType, OutputType> {
    fun direct(data: InputType): OutputType
    fun reverse(data: OutputType): InputType
}