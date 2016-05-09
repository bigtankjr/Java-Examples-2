/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpriorityqueue;

/**
 *
 * @author levelsfam
 */
public class TestPriorityQueue {
     public static void main(String[] args) {
       Patient patient1 = new Patient("Bernard", 2);
       Patient patient2 = new Patient("Sophia", 1);
       Patient patient3 = new Patient(" Meagan", 5);
       Patient patient4 = new Patient(" Lia", 7);
       
       MyPriorityQueue<Patient> priorityQueue 
         = new MyPriorityQueue<>();
      priorityQueue.enqueue(patient1);
      priorityQueue.enqueue(patient2);
      priorityQueue.enqueue(patient3);
      priorityQueue.enqueue(patient4);
      
      while (priorityQueue.getSize() > 0) 
        System.out.print(priorityQueue.dequeue() + " ");
    }
    
    static class Patient implements Comparable<Patient> {
      private String name;
      private int priority;
      
      public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
      }
     
      @Override
      public String toString() {
        return name + "(priority:" + priority + ")";
      }
      
      @Override
      public int compareTo(Patient patient) {
        return this.priority - patient.priority;
      }
    }
  }
