package com.mycompany.mavenproject1;

import java.util.Random;

/**
 *
 * @author leahjoneskirwin
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = callColor(); // call color method here
        String animal = callAnimal(); // call animal method again here
        String colorAgain = callColor(); // call color method again here
        int weight = callNum(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = callNum(10, 20); // call number method,
            // with a range between 10 - 20
         int number = callNum(1000, 2000); // call number method,
            // with a range between 10000 - 20000
        int time = callNum(2, 6); // call number method,
            // with a range between 2 - 6              

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    //Colour method//
    public static String callColor(){
        Random random = new Random();
        int x = random.nextInt(4);
        switch (x){
            case 0:
                return "blue";
            case 1:
                return "green";
            case 2:
                return "yellow";
            case 3:
                return "orange";
            case 4:
                return "red";
             
        }
        return null;
           
    }

    //Animal method //
    public static String callAnimal() {
        Random random = new Random();
        int x = random.nextInt(4);
        if (x==0) {
            return "Lion";
        } else if (x==1) {
            return "Tiger";
        } else if (x==2) {
            return "Dog";
        } else if (x==3) {
            return "Cat";
        } else if (x==4) {
            return "Snail";            
        }        
        return null;
    }

    
    //Random number method//
    public static int callNum(int x, int y) {
        Random random = new Random();
        int low = x;
        int high = y;
        int randomNum = random.nextInt(high-low)+low;
        return randomNum;
    }
}