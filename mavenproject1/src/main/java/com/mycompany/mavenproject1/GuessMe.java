package com.mycompany.mavenproject1;

/**
 *
 * @author leahjoneskirwin
 */

import java.util.Scanner;
       
public class GuessMe {
   public static void main(String[] args) {
       
        int my_number;
        my_number = 11; //This is the number to guess//
        
        int your_number; //This is user input guess//
       
    Scanner s = new Scanner(System.in);
    
        System.out.println("I've chosen a number. Betcha can't guess it!!");
        your_number = s.nextInt();
        System.out.println("Your number is: " + your_number);
        

        if(my_number > your_number){
    
            System.out.println(your_number + "? Ha, nice try - too low! I chose" + my_number);
        }
        
        if(my_number < your_number){
    
            System.out.println(your_number + "? Ha, nice try - too high! I chose" + my_number);
        }

        if(my_number == your_number){
    
            System.out.println("Wow! I also chose" + my_number);
       
        }
   }
}   

