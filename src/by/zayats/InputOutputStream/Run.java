package by.zayats.InputOutputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Run {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
//        String text = "Our company is New HardSkills";
//        byte[] bytes = text.getBytes();
//        fileOutputStream.write(bytes); // строка записывается в файл
//        fileOutputStream.close();
//
//        // считываем и савим нижнее подчеркивание
//        FileInputStream fileInputStream = new FileInputStream("1.txt");
//        StringBuilder stringBuilder = new StringBuilder();
//        int i;
//
//        while ((i = fileInputStream.read()) != -1) {
//            char ch = (char) i;
//            if (ch == ' ') {
//                ch = '_';
//            }
//            stringBuilder.append(ch);
//        }
//        fileInputStream.close();
//        System.out.println(stringBuilder);


        // создаем на диске

        Writer writer = new FileWriter("G://1.txt",false);
        String text = "My company is New HardSkills";
        writer.write(text);// строка записывается в файл
        writer.append('\n');
        writer.write("Hello"); // строка записывается в файл
        writer.flush(); // записывает и освобождает память
        writer.close();


        // считываем

        FileReader fileReader = new FileReader("G//1.txt");
        StringBuilder builder = new StringBuilder();
        int i;
        while ((i = fileReader.read()) != -1){
            builder.append((char) 1);
        }
        System.out.println(builder.toString());
        fileReader.close();


        //создаем папку на диске
        File initDirect = new File(("G://1"));
        boolean created = initDirect.mkdir();
        if(created){
            System.out.println("Папка создана");
        }

        //переиминовать папку

        File newDirect = new File("G://2");
        initDirect.renameTo(newDirect);


        //удаление папки

//        boolean deleted = new newDirect.delete();
//        if(deleted){
//            System.out.println("Папка была удалена");
//        }
    }
}
