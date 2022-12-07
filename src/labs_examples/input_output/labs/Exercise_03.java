package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Exercise_03{

    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/files/data.txt";

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))){
            dos.writeInt(150);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeChar('y');

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            //System.out.println(dis.readByte());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
            System.out.println(dis.read());
            System.out.println(dis.read());
            System.out.println(dis.read());
            System.out.println(dis.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}