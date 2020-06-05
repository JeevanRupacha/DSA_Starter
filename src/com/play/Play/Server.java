package com.play.Play;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Server {

    public static void main(String[] args) {
        try{
              /**Initializing server socket */
               ServerSocket serverSocket = new ServerSocket(5000);
               System.out.println("waiting for connection ..............");
               Socket socket = serverSocket.accept();

               /** For reading message from client*/
               /** This step reads message from client like readerFile.readLine() */
               BufferedReader readerFile = new BufferedReader(new InputStreamReader(socket.getInputStream()));

               /** For writing message to response to client */
               /** This step write message to client i.e square number */
               PrintWriter writeFile = new PrintWriter(socket.getOutputStream(),true);


               int number = Integer.valueOf(readerFile.readLine());
               int square =number*number;

               /** This line sends square number to client */
               writeFile.println("From server side  square num is = "+ square);

           }catch (IOException e){
               System.out.println("Server Exception "+ e.getMessage());
           }
       }
    }

