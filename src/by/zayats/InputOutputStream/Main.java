package by.zayats.InputOutputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
                char[] symbols = {'h', 'e', 'l', 'l', 'o'};
                OutputStream outputStream = new FileOutputStream("newFile.txt");
            for (int i = 0; i < symbols.length; i++) {
                outputStream.write(symbols[i]);
            }
            outputStream.close();

            InputStream inputStream = new FileInputStream("newFile.txt");
            int  size = inputStream.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) inputStream.read()+ " ");
            }

            inputStream.close();
        }catch (IOException e){
            System.out.println("Exception");
        }

    }
}
