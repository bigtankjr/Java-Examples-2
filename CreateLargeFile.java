/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createlargefile;

/**
 *
 * @author levelsfam
 */
import java.io.*;
import java.util.*;
   
   public class CreateLargeFile {
     public static void main(String[] args) throws Exception {
       DataOutputStream output = new DataOutputStream(
         new BufferedOutputStream(
         new FileOutputStream("largedata.dat")));
   
       for (int i = 0; i < 800004; i++)
        output.writeInt((int)(Math.random() * 1000000));
  
      output.close();
  
      // Display first 100 numbers
      DataInputStream input = new DataInputStream(
        new BufferedInputStream(new FileInputStream("largedata.dat")));
      List<Integer> arrayList  = new ArrayList<>();
      for (int i = 0; i < 100; i++){
         arrayList.add(input.readInt());
        System.out.print(arrayList + " ");}
      for(int k = 1; k < arrayList.size();k++){
          
        for(int i = 0; i < 100 - 1;i++){
            if(arrayList.get(i)> arrayList.get(i + 1)){
                int temp = arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(temp);
            
            }
            
      }
        
      }
      System.out.println(arrayList + " ");
  
      input.close();
    }
  }              
