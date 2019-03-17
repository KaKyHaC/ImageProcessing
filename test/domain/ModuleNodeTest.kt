package domain

import datasoure.ModuleNode
import domain.module.IModule
import org.junit.Test

class ModuleNodeTest{
    @Test
    fun testNodes(){
        val node = ModuleNode(IntStringModule())
        val node1 = ModuleNode(StringStringModule("dimas"))
        val node2 = ModuleNode(StringStringModule("valera"))
        val node3 = ModuleNode(StringPrintModule())

        node.append(node1)
        node1.append(node2)
        node2.append(node3)

        node.direct(14)
    }

    class Factory{
        fun create(value:Int): Any{
            return when(value) {
                0 -> IntStringModule()
                1 -> StringStringModule("factory")
                else -> StringPrintModule()
            }
        }
    }

    class IntStringModule : IModule<Int, String> {
        override fun direct(data: Int): String {
            return data.toString()
        }

        override fun reverse(data: String): Int {
            return data.toInt()
        }
    }

    class StringStringModule(val pref:String) : IModule<String, String> {
        override fun direct(data: String): String {
            return pref + data
        }

        override fun reverse(data: String): String {
            return data.removePrefix(pref)
        }
    }

    class StringPrintModule() : IModule<String, Unit> {
        override fun direct(data: String) {
            println(data)
        }

        override fun reverse(data: Unit): String {
            return ""
        }
    }
}