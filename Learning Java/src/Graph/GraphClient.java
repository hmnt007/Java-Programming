package Graph;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("B", "C", 1);
		graph.addEdge("C", "D", 8);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 45);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 18);
		
		graph.display();
//		System.out.println(graph.numVertex());
//		System.out.println(graph.numEdges());
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		graph.removeEdge("A", "B");
//		graph.display();
//		
//		graph.removeVertex("F");
//		graph.display();
//		
//		graph.addVertex("F");
//		graph.display();
//		
//		graph.addEdge("A", "F", 10);
//		graph.display();
		
//		System.out.println(graph.dfs("A", "F"));
//		graph.removeEdge("A", "D");
//		System.out.println(graph.dfs("A", "F"));
		
//		graph.bft();
//		graph.dft();
		
//		System.out.println(graph.isCyclic());
		
//		System.out.println(graph.isConnected());
		
		System.out.println(graph.getCC()); // get connected components
	}

}