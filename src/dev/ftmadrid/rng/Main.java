package dev.ftmadrid.rng;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        int beggin, limit;
        
        System.out.print("Choose the beggin number: ");
        beggin = input.nextInt();
        System.out.print("\nChoose the limit number: ");
        limit = input.nextInt();
        
        int random_number = random.nextInt(beggin, limit);
        System.out.println("\nThe random number choosen is: "+random_number);
        
        
    }
    
}
