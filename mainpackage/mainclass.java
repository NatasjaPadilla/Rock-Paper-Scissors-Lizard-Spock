/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import otherpackage.*;

/**
 *
 * @author nat
 */
public class mainclass {
    
    public static void main(String[] args) {
        otherpackage.otherclass oc = new otherpackage.otherclass();
        
        options();
        rules();
        oc.run();
    }
    
    public static void rules() {
        System.out.println("rules:");
        for (int i = 0; i < 10; i++) {
           String r = results(i);
           System.out.println(r);
        }
        System.out.println();
    }
    
    public static String results(int number) {
        String results[] = new String[10];
        results[0] = "scissors cut paper.";
        results[1] = "paper covers rock.";
        results[2] = "rock crushes lizard.";
        results[3] = "lizard poisons spock.";
        results[4] = "spock smashes scissors.";
        results[5] = "scissors decapitate lizard.";
        results[6] = "lizard eats paper.";
        results[7] = "paper disproves spock.";
        results[8] = "spock vaporizes rock.";
        results[9] = "rock crushes scissors.";
        
        return results[number];
    }
        
    public static void options() {
        System.out.println("options: rock, paper, scissors, lizard, spock\n");
    }
    
}
