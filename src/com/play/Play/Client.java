package com.play.Play;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        /** scanner to get input from user */
        Scanner scanner = new Scanner(System.in);

        try(Socket socket = new Socket("localhost",5000)){

            /** This line is for reading message from server here square number sended from server */
            BufferedReader readFile = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            /** This line is for send number to server ie to be squared */
            PrintWriter writeFile = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Enter the number : ");
            /** sending number to server */
            writeFile.println(scanner.nextLine());

            /** printing message  ie square number from server */
            System.out.println(String.valueOf(readFile.readLine()));

        }catch (IOException e){
            System.out.println("client side Exception " + e.getMessage());
        }
    }
}
