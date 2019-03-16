package model.modules

import model.data.IData

interface IModule {
    fun direct(data: IData): IData
    fun reverse(data: IData): IData
}