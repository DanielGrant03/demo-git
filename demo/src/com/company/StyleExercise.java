package com.company;

import java.util.Scanner;


/**
 * StyleExercise
 *  - fix the style of this program
 */
public class StyleExercise {

    public static void exercise() {

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        while(scanner.hasNext()) {

            String l;
            product p;
            l = scanner.nextLine();
            if(l.equals("done"))
                break;
            p = new product(l); total += p.getCost();

        }

        total *= (1+5/100)*(1+9.975/100);

        System.out.println(total);

    }

}
