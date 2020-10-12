/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class theGraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');
        theGraph.addVertex('G');
        
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);
        
        System.out.print("Visits: ");
        theGraph.bfs();
        System.out.println();
        
        
//        theGraph.addVertex('A');
//        theGraph.addVertex('B');
//        theGraph.addVertex('C');
//        theGraph.addVertex('D');
//        theGraph.addVertex('E');
//        theGraph.addVertex('F');
//        theGraph.addVertex('G');
//        
//        theGraph.addEdge(0, 1);
//        theGraph.addEdge(1, 2);
//        theGraph.addEdge(0, 3);
//        theGraph.addEdge(3, 4);
//        
//        System.out.print("Visits: ");
//        theGraph.dfs();
//        System.out.println();
        
        
    }
}
