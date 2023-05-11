import java.util.Scanner;

/*
 * File: mainControl.java
 * Author: Kondor Marcell
 * Copyright: 2023 Kondor Marcell
 * Group: Szoftverfejlesztő 1/1
 * Date: 2023.05.11
 * Github:
 */

public class Control {
    public static void main(String[] args) {
        System.out.println("Kondor Marcell , 2023.05.11, szoft/1/n");
        double a = getInput(" A oldal: ");
        double b = getInput("B oldal : ");
        double c = getInput("C : ");
        
        double result = szamitas(a, b, c);
        System.out.println("térfogat: " + result);
    }

    private static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        double input;
        do {
            System.out.print(message);
            while (!scanner.hasNextDouble()) {
                System.out.println("Normális Számot mondj");
                scanner.next();
            }
            input = scanner.nextDouble();
        } while (input <= 0);
        return input;
    }

    static double szamitas(double a, double b, double c) {
        return a * b * c;
    }
    
}
