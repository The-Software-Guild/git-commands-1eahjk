package com.mycompany.mavenproject1.Variables;

/**
 *
 * @author leahjoneskirwin
 */
public class TheOrderOfThings {

    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "COOL";
        size = "medium";
        age = "new";
        shape = "circular";
        color = "red";
        origin = "Parisian";
        material = "denim";
        purpose = "bad";

        noun = "cats";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
    }
}
