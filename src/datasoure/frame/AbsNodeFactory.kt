package datasoure.frame

abstract class AbsNodeFactory {
    abstract fun create(type: AbsNodeType) : AbsNode
}