/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedninetail;

/**
 *
 * @author levelsfam
 */
import java.util.*;
   
/**
 *
 * @author levelsfam
 * @param <V>
 */
public class UnweightedGraph<V> extends AbstractGraph<V> {
     /** Construct an empty graph */
     public UnweightedGraph() {
     }
       
     /** Construct a graph from vertices and edges stored in arrays */
     public UnweightedGraph(V[] vertices, int[][] edges) {
      super(vertices, edges);
    }
  
    /** Construct a graph from vertices and edges stored in List */
    public UnweightedGraph(List<V> vertices, List<Edge> edges) {
     super(vertices, edges);
   }
  
    /** Construct a graph for integer vertices 0, 1, 2 and edge list */
    public UnweightedGraph(List<Edge> edges, int numberOfVertices) {
      super(edges, numberOfVertices);
    }
    
    /** Construct a graph from integer vertices 0, 1, and edge array */
    public UnweightedGraph(int[][] edges, int numberOfVertices) {
      super(edges, numberOfVertices);
    }
  }
