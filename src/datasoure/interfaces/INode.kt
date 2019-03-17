package datasoure.interfaces

interface INode {
    fun getFactory(): INodeFactory
    fun getNext(): INode?
    fun setNext(node: INode)
}