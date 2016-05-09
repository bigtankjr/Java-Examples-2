/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightededge;
import java.util.*;
/**
 *
 * @author levelsfam
 */
public class TestWeightedEdge {
    public static void main(String[] args){
    List<WeightedEdge> list = new ArrayList<>();
    list.add(new WeightedEdge(1, 2, 3.5)); 
    list.add(new WeightedEdge(2, 3, 4.5)); 
    WeightedEdge e = java.util.Collections.max(list);
    System.out.println(e.u);
    System.out.println(e.v);
    System.out.println(e.weight);
    }
}
