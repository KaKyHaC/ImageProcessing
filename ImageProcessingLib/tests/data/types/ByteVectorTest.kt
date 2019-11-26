package data.types

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ByteVectorTest {

    var byteVector = ByteVector()
    @BeforeEach
    fun setUp() {
        byteVector = ByteVector()
    }

    @Test
    fun test1() {
        byteVector[2] = 2;
        assertEquals(byteVector[5], 0)
        assertEquals(byteVector[2], 2)
        assertEquals(byteVector[1], 0)
    }
}