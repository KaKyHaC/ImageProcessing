package datasoure.frame

interface INodeFactory {
    abstract fun supportedNodes(): List<INodeType>
    abstract fun create(type: INodeType) : INode
}