package com.mycompany.mavenproject1.If.Else;

/**
 *
 * @author leahjoneskirwin
 */
public class LlamasWhalesAndDodosOhMy {

    public static void main(String[] args) {
        int llamas = 14;
        int whales = 15;
        int dodos = 1;

        if (dodos > 6) {
            System.out.println("Egads, I thought dodos were extinct!");
        }

        if(dodos < 0){
            System.out.println("Hold on, how can we have NEGATIVE dodos??!");
        }

        if(llamas > whales){
            System.out.println("Whales may be bigger, but llamas are better, ha!");
        }

        if(llamas > whales){
            System.out.println("Aw man, brawn over brains I guess. Whales beat llamas.");
        }

        System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
        dodos += 100;

        if( (whales + llamas) > dodos){
            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
        }

        if(llamas > whales && llamas > dodos){
            System.out.println("There's been a huge increase in the dodo population via cloning!");
            
        }
    }
}
