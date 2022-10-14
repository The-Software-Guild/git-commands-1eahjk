package com.mycompany.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author leahjoneskirwin
 */
public class SimpleCombination {
    
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

int fal = firstHalf.length;        //determines length of firstArray  
int sal = secondHalf.length;   //determines length of secondArray  
int[] result = new int[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(firstHalf, 0, result, 0, fal);  
System.arraycopy(secondHalf, 0, result, fal, sal);  
System.out.println("All together now!:" + Arrays.toString(result));    //prints the resultant array  
System.out.println("New array length: " + result.length);
}  
}  
