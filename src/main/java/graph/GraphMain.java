package graph;

public class GraphMain {

    public static void main(String args[]) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("c", "D");

        System.out.println("Graph before RemoveVertex");
        myGraph.printGraph();
        myGraph.removeVertex("D");
        System.out.println("Graph after removeVertex");
        myGraph.printGraph();

    }
}
