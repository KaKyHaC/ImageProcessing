package datasoure.frame

interface INodeFactory {
    fun supportedNodes(): List<INodeType>
    fun create(type: INodeType) : INode
}