package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
class Exercise_02{

    public static void main(String[] args) {
        fileEncrypter();
        fileDecrypter();
    }

    public static void fileEncrypter(){
        String filePathIn = "src/labs_examples/input_output/files/example_text.txt";
        String filePathOut = "src/labs_examples/input_output/files/example_text_encrypted.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(filePathIn));
            FileWriter out = new FileWriter(filePathOut)){
            int i;
            while((i = in.read()) != -1){
                if(i == 'a'){
                    out.write('-');
                } else if (i == 'e') {
                    out.write('*');
                } else if (i == 'o') {
                    out.write('^');
                } else out.write((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileDecrypter(){
        String filePathIn = "src/labs_examples/input_output/files/example_text_encrypted.txt";
        String filePathOut = "src/labs_examples/input_output/files/example_text_decrypted.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(filePathIn));
            FileWriter out = new FileWriter(filePathOut)){
            int i;
            while((i = in.read()) != -1){
                if(i == '-'){
                    out.write('a');
                } else if (i == '*') {
                    out.write('e');
                } else if (i == '^') {
                    out.write('o');
                } else out.write((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

