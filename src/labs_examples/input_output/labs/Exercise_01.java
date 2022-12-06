package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        String filePathIn = "src/labs_examples/input_output/files/example_text.txt";
        String filePathOut = "src/labs_examples/input_output/files/example_text_copy.txt";

        try(BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(filePathIn), 5);
            FileOutputStream out = new FileOutputStream(filePathOut)){
            int i = 5;
            byte[] b = new byte[5];
            while ((i = in.read(b)) != -1){
                out.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}