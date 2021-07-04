/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otherpackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nat
 */
public class otherclass {
    
    private static Scanner input = new Scanner(System.in);
    private static Random rnd = new Random();
    
    private static String answer, computeranswer;
    private static int number;
    
    public static String choices(int number) {
        String choices[] = new String[5];
        choices[0] = "Rock";
        choices[1] = "Paper";
        choices[2] = "Scissors";
        choices[3] = "Lizard";
        choices[4] = "Spock";
    
        return choices[number];
    }

    public static String getcomputeranswer() {
        number = rnd.nextInt(5);
        computeranswer = choices(number);
        return computeranswer;
    }
    
    public static String getanswer() {
        System.out.println("enter your choice: ");
        answer = input.nextLine();
        return answer;
    }
    
    public static void displayanswers() {
        System.out.println("computer: " + computeranswer);
        System.out.println("player: " + answer);
    }
    
    public static void conditions() {
        if (answer.equalsIgnoreCase("rock") && (computeranswer.equalsIgnoreCase("scissors") || computeranswer.equalsIgnoreCase("lizard"))) {
            System.out.println("u win");
        }
        else if (answer.equalsIgnoreCase("rock") && computeranswer.equalsIgnoreCase("rock")) {
            System.out.println("tie");
        }
        else if (answer.equalsIgnoreCase("paper") && (computeranswer.equalsIgnoreCase("rock") || computeranswer.equalsIgnoreCase("spock"))) {
            System.out.println("u win");
        }
        else if (answer.equalsIgnoreCase("paper") && computeranswer.equalsIgnoreCase("paper")) {
            System.out.println("tie");
        }
        else if (answer.equalsIgnoreCase("scissors") && (computeranswer.equalsIgnoreCase("paper") || computeranswer.equalsIgnoreCase("lizard"))) {
            System.out.println("u win");
        }
        else if (answer.equalsIgnoreCase("scissors") && computeranswer.equalsIgnoreCase("scissors")) {
            System.out.println("tie");
        }
        else if (answer.equalsIgnoreCase("lizard") && (computeranswer.equalsIgnoreCase("paper") || computeranswer.equalsIgnoreCase("spock"))) {
            System.out.println("u win");
        }
        else if (answer.equalsIgnoreCase("lizard") && computeranswer.equalsIgnoreCase("lizard")) {
            System.out.println("tie");
        }
        else if (answer.equalsIgnoreCase("spock") && (computeranswer.equalsIgnoreCase("scissors") || computeranswer.equalsIgnoreCase("rock"))) {
            System.out.println("u win");
        }
        else if (answer.equalsIgnoreCase("spock") && computeranswer.equalsIgnoreCase("spock")) {
            System.out.println("tie");
        }
        else {
            System.out.println("u lose");
        }
    }
    
    public static void playAgain() {
        System.out.println("play again? Y/N");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            run();
        }
        else if (choice.equalsIgnoreCase("n")) {
            System.out.println("ok");
        }
        else {
            System.out.println("invalid response");
            playAgain();
        }
    }
    
    public static void run() {
        getcomputeranswer();
        getanswer();
        displayanswers();
        conditions();
        playAgain();
    }
    
}
