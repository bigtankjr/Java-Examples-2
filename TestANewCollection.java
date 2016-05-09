/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testanewcollection;

/**
 *
 * @author levelsfam
 */
import java.util.*;

public class TestANewCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Define variables
        String name;
        boolean flag = true;
        int STOP = 0;
        int selection;
        //Instantiate input object here
        Scanner scan = new Scanner(System.in);
        //Instantiate object list here
        ArrayList<String> collection1 = new ArrayList<>();
        
        
        
        while (flag){
            System.out.print("Enter the name: ");
            name = scan.next();
            collection1.add(name);
            System.out.print("Is there another name?"
                    + "\nType 1 for yes 2 for no: ");
            selection = scan.nextInt();
            if(selection == 2)
                flag = false;
            
        
        
        }
        
        System.out.println("The total number of objects in collection1 are: " + collection1.size());
        if (collection1.contains("Benjamin")){
            System.out.println("The collection contains the name Benjamin.");
        }else{
            System.out.println("This collection doesn't have the name Benjamin in it.");
        }
        
        if (collection1.contains("Terry")){
            collection1.remove("Terry");
            collection1.add("Tahira"); 
            System.out.println("Terry was removed and replaced with Tahira.");
        }
        //Instantiate new ArrayList object
        ArrayList<String> collection2 = new ArrayList<>();
        collection2.add("Chauncy");
        collection2.add("Albert");
        collection2.add("Rema");
        collection2.add("Alfonse");
        collection2.add("Merta");
        collection2.add("Samuel");
        //Instantiate new ArrayList object
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        
        System.out.println("The list of names in the collection are "
                + "\n" + collection1);
        System.out.println("The clone of the list is: " + "\n"
        + c1);
        
        c1.addAll(collection2);
        
        System.out.println("The number of items currently in the collection is: " 
        + c1.size());
        System.out.println("The items in the current collection are: " 
                + "\n" + c1);
        
        c1.removeAll(collection1);
        System.out.println("The current items in the collection after removal of the first collection1 are: "
        + "\n" + c1);
        
        
    }
    
}
