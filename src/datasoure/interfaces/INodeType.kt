package datasoure.interfaces

interface INodeType {
    fun getKeys(): List<String>
    fun setData(key: String, data: String)
    fun getData(key: String): String
}