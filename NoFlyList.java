/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noflylist;

/**
 *
 * @author levelsfam
 */
import java.util.*;

public class NoFlyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instantiate object set
        Map<String, Integer > hashMap = new HashMap<>();
        hashMap.put("Benjamin", 39);
        hashMap.put("Tahira", 38);
        hashMap.put("Kiyera", 16);
        hashMap.put("Jonah", 11);
        hashMap.put("Alanna", 6);
        
        
        System.out.println(hashMap + "\n");
        
        Map<String, Integer> treeMap =
        new TreeMap<>(hashMap);
        
        System.out.println(treeMap);
        
        Map<String, Integer> sortedSet = new SortedSet<>();
    }
    
    
}
