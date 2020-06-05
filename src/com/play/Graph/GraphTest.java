package com.play.Graph;

import org.junit.Test;

public class GraphTest {

    @Test
    public void graph(){
        Graph graph = new Graph(5);

        /*  Adding each vertex */
        Graph.addVertex(0);
        Graph.addVertex(3);
        Graph.addVertex(2);
        Graph.addVertex(4);
        Graph.addVertex(1);

        /* Adding each directed edges */
        Graph.addEdge(0,3);
        Graph.addEdge(3,1);
        Graph.addEdge(4,2);
        Graph.addEdge(1,2);

        BFSgraph.BFS(0,5);


    }
}
