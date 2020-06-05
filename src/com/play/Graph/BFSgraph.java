package com.play.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BFSgraph {

    public static void  BFS(int source ,int vertexCount){
        boolean visited[] = new boolean[vertexCount];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while( queue.size() != 0){

            source = queue.poll();
            System.out.println(source + " ");

            Iterator<Integer> itr = Graph.adjListArray[source].iterator();
            while(itr.hasNext()){
                int n = itr.next();

                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }

            }

        }

    }
}
