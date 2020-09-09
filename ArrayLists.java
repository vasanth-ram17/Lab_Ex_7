/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Vasanth
 */
public class ArrayLists {
     public static void main(String[] args) {
    ArrayList array = new ArrayList(); 
    ArrayList array1 = new ArrayList(); 
    ArrayList array2 = new ArrayList(); 
    Random random = new Random();
    int min =10; int max =90; int average =0;
    for(int i =0; i<20 ; i++){
      int a = min+ random.nextInt(max);
      if(a>90){
      a = a-10;
      }
      array.add(a); 
    }
       
    System.out.println("The main array is");
    System.out.println(array);
    
      for(int i =0; i<20 ; i++){
         
        average = (int)array.get(i)+ average;
      }
      average = average/20;
      System.out.println("The average of the array list is : " + average);
       for(int i =0; i<20 ; i++){
         int b  = (int)array.get(i);
         if(b<average){
         array2.add(b);
         }
         else
         array1.add(b);
         
         
       }
         System.out.println("The elements less than average : ");
         System.out.println(array2);
         System.out.println("The elements greater than average : ");
         System.out.println(array1);
     }}
     
     