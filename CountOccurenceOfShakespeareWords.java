/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countoccurenceofshakespearewords;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author levelsfam
 */
public class CountOccurenceOfShakespeareWords {

   public static void main(String[] args) {
    // Set text in a string
    String ancienttext = "What a piece of work is a man! How noble in reason, "
            + "how infinite in faculty! In form and moving how express and "
            + "admirable! In action how like an angel, in apprehension how "
            + "like a god! The beauty of the world. The paragon of animals. "
            + "And yet, to me, what is this quintessence of dust? "
            + "Man delights not me.";

    // Create a TreeMap to hold words as key and count as value
    Map<String, Integer> map = new TreeMap<>();

    String[] poeticwords = ancienttext.split("[ \n\t\r.,;:!?(){}]");
    for (int i = 0; i < poeticwords.length; i++) {
      String keyword = poeticwords[i].toUpperCase();
      
      if (keyword.length() > 0) {
        if (!map.containsKey(keyword)) {
          map.put(keyword, 1);
        }
        else {
          int value = map.get(keyword);
          value++;
          map.put(keyword, value);
        }
      }
    }

    // Get all entries into a set
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

    // Get key and value from each entry
    for (Map.Entry<String, Integer> entry: entrySet)
      System.out.println(entry.getKey() + "\t" + entry.getValue());
  }
}
