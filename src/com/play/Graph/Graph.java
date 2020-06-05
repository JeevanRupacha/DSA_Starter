package com.play.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    /* Representing graph in adjacent list method */
    public  static LinkedList<Integer>[] adjListArray;

    public Graph(int vertexCount){
        adjListArray = new LinkedList[vertexCount];
    }

    public static void addVertex(int vertexName){
        adjListArray[vertexName] = new LinkedList<>();
    }


    public static void addEdge(int source, int des){
        /* Directed  graph */
        adjListArray[source].add(des);


        /* For undirected graph
        * adjListArray[des].add(source);  */
    }
}
