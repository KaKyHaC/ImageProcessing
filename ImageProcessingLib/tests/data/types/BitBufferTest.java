package data.types;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

class BitBufferTest {

    @Test
    void writeBits() {
        Data[] dataArray = new Data[2];
        dataArray[0] = new Data(2,8);
        dataArray[1] = new Data(2,8);
        testQueue(dataArray , 65);
    }

    void testQueue(Data[] dataArray, int bufferSize) {
        BitBuffer bitBuffer = new BitBuffer(ByteBuffer.allocate(bufferSize));

        for (int i = 0; i < dataArray.length; i++) {
            bitBuffer.writeBits(dataArray[i].value, dataArray[i].length);
        }

        for (int i = 0; i < dataArray.length; i++) {
            long l = bitBuffer.readBits(dataArray[i].length);
            System.out.println("current " + l + ", expected" + dataArray[i].value);
            assert l == dataArray[i].value;
        }
    }

    class Data {
        long value;
        int length;

        Data(int value, int length) {
            this.value = value;
            this.length = length;
        }
    }
}