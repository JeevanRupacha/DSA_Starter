package com.play;

import java.io.*;
import java.util.Scanner;

public class ClassFirst {

    public static void writeFile(){

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
            fileOutputStream.write(Integer.parseInt("content"));
        }catch (IOException e){
            System.out.println("Error is "+ e);
        }
    }

    public static void main(String[] args) throws IOException {



try{
    writeFile();
}catch (NumberFormatException e){
    System.out.println("error is " + e);
}

        File file = new File("Test.txt");
        try (FileInputStream fileInputStream = new FileInputStream("test.txt")) {
            int content;

            while((content = fileInputStream.read()) != -1){
                System.out.println((char)content);
            }
        }catch(IOException e) {
            System.out.println("error is " + e);


        }
    }
}
