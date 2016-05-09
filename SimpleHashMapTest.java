/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplehashmaptest;

/**
 *
 * @author levelsfam
 */
import java.util.HashMap;


public class SimpleHashMapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Jonah Levels",12);
        map.put("Benjamin Levels",39);
        map.put("Tahira Levels",38);
        map.put("Alanna Levels",6);
        map.put("Kiyera Levels",16);
        System.out.println(map.size());
        System.out.println(map.hashCode());
    }
    
}
