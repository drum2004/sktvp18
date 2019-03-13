package p3;

import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true)
            break;
            String answer = scn.next();
            switch (answer) {
                case ("Trolli"):
                   System.out.println("Правильно!");
                   exit = true; 
                   break;
                case ("GiveUp"):
                    System.out.println("Правильный ответ: Trolli.");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }

    }
}
