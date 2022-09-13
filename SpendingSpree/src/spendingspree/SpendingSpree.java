/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendingspree;

import java.util.Scanner;

/**
 *
 * @author ivorl
 */
public class SpendingSpree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wallet = 200;
        String thoughts = "";
        
        System.out.println("Honey are you going to the mall?((enter yes/no ): ");
        
        String userChoice = input.nextLine();
        
        if (userChoice.toLowerCase().equals("yes") ){
            wallet = significantOtherGoesToTown(wallet);
        }else {thoughts = "fewf";}
        
        if (wallet <= 0){thoughts = "uh oh";}
        
        System.out.println(thoughts);       
    }
    
    public static Double significantOtherGoesToTown(double wallet){
        
        while (wallet >=0){
            System.out.println("ChaChing $$$");
            wallet -= 50;
            
        }
        return wallet;
        
    }
    
    }
    

