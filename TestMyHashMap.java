/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhashmap;

/**
 *
 * @author levelsfam
 */
public class TestMyHashMap {
     public static void main(String[] args) {
       // Create a map
       MyMap<String, Integer> map = new MyHashMap<>(); 
       map.put("Walters", 30);  // Changes made to the map as instructed
       map.put("West", 31);
       map.put("Lee", 29);
       map.put("Hope", 29);
       map.put("Walters", 65);
  
      System.out.println("Entries in map: " + map); 
  
      System.out.println("The age for Lee is " +
        map.get("Lee"));
  
      System.out.println("Is Walters in the map? " + 
        map.containsKey("Walters"));
      System.out.println("Is age 33 in the map? " + 
        map.containsValue(33));
  
      map.remove("Walters");
      System.out.println("Entries in map: " + map);
  
      map.clear();
      System.out.println("Entries in map: " + map);
    }
  } 