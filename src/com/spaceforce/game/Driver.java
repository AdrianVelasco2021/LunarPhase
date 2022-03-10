package com.spaceforce.game;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String[] inventory = {"Single Broken Cigarette"};
        Scanner userInput = new Scanner(System.in);

        System.out.println("This is a text based adventure where you lost the company spaceship.");
        System.out.println("In order to not lose your job you need to find it before anyone notices it gone!");
        System.out.println("Will you take on the challenge of not getting fired!");
        System.out.println("Press any key to start the game.");
        userInput.nextLine();

        System.out.println("Welcome to the game.");
        System.out.println("These are your commands.");
        System.out.println("Talk, Look, Pickup, Go, Use, Drop");
        System.out.println("You can try to scream but no one will hear you.");
        System.out.println("You can combine these verbs with either location, person, or item.");
        System.out.println("Example: Go spaceport");
        System.out.println("To look at current inventory. Type in \"Inventory\"");

        System.out.println("Welcome to spaceport that you called home.... for now.");
        System.out.println("In the middle of the room there is an empty paper coffee cup");
        System.out.println("From here you can go to north, which miiiiight be north.");

        System.out.println(" What would you like to do? Hint: go north maybe");
        System.out.println("To quit type in the letter \"Q\"");
        System.out.print(": ");
        String choice = userInput.nextLine();

        if (choice.equalsIgnoreCase("Q")) {
            System.out.println("Whelp, you jumped into a black hole. Goodbye!");
            System.exit(0);
        } else if (choice.equalsIgnoreCase("inventory")){
            for (String item : inventory) {
                System.out.println(item);
            }
        } else if (choice.equalsIgnoreCase("Go North")) {
            System.out.println("You went north!");
            System.out.println("Whoops bad hint. You died!");
            System.out.println("New Hint: I'm an unreliable narrator!");
        }
    }
}
