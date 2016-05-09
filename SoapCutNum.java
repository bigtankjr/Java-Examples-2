/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapcutnum;

/**
 *
 * @author levelsfam
 */
import java.util.*;

public class SoapCutNum {

    /**
     * @param args the command line arguments
     */

    //declare global variables
    private static double leftoversoap;
    //private static double soapwidth;
    private static double totalnumsoap;
    private static double loss = .125;
    public static void main(String[] args) {
        // TODO code application logic here
        //declare variables
        double moldlength;
        double soapwidth;
        //Instantiate Constructor Object
        
        //Instantiate Scanner object
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the mold in inches>> ");
        moldlength = scan.nextDouble();
        System.out.println();
        System.out.print("Enter the width of the soap in inches>> ");
        soapwidth = scan.nextDouble();
        SoapCutNum(moldlength,soapwidth);
        
        System.out.println();
        
        System.out.println("The total number bars of soap you can make is>> " + totalnumsoap + "\n"
                            + " and the leftover soap amount is " + leftoversoap);
    }
    
    //method
    public static void SoapCutNum(double m, double s){
        int counter = 0;
    while(m > s){
       
            m = m - (s + loss);
        
            counter += 1;
           
    }
    leftoversoap = m;
    totalnumsoap = counter;
    
    
    }
    
    //set method
    public static void setMoldLength(){
    
    }
    public static void setSoapWidth(){
    
    }
    //get method
    public Double getSoapNum(){
    
        return totalnumsoap;
    }
     public Double getSoapLeftOver(){
    
        return leftoversoap;
    }
    
}
