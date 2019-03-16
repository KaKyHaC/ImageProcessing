package domain.module

import domain.data.IData

interface IModule {
    fun direct(data: IData): IData
    fun reverse(data: IData): IData
}