package org.dataStructure.graphs;
import org.dataStructure.graphs.GraphList;
import org.dataStructure.graphs.Node;
public class adjList {
    // Adjacency List = An array/arraylist of linkedlists.
    //			          Each LinkedList has a unique node at the head.
    //			          All adjacent neighbors to that node are added to that node's linkedlist

    //				  runtime complexity to check an Edge: O(v)
    //				  space complexity: O(v + e)
    public void run(){
        GraphList graph = new GraphList();
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        //System.out.println(graph.checkEdge(0, 1));
    }

}