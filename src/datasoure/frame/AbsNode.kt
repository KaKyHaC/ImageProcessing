package datasoure.frame

abstract class AbsNode {
    abstract fun supportedNodes(): List<AbsNodeType>
}