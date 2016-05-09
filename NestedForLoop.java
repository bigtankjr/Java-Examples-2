/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloop;

/**
 *
 * @author levelsfam
 */
public class NestedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Count to 5 incrementing on each line like so:
        /*
        *   1
        *   12
        *   123
        *   1234
        *   12345
        *   12345
        *   1234
        *   123
        *   12
        *   1
        */
        int outerLoop = 0; int innerLoop= 0;
        for(outerLoop = 1; outerLoop <= 5; outerLoop++){
            for(innerLoop=1; innerLoop <= outerLoop; innerLoop++){
                System.out.print(innerLoop);
            }
            System.out.println();
        }
        for(; outerLoop >= 0; outerLoop--){
            for(innerLoop=1; innerLoop <= outerLoop-1; innerLoop++){
                System.out.print(innerLoop);
            }
            System.out.println();
        }
    
    }

}
