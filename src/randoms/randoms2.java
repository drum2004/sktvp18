package randoms;

import java.util.Scanner;

public class randoms2 {

    public static void main(String[] args) {
        int UnNmr, UsNmr, TrysCount = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 100");
        UnNmr = (int) Math.floor(Math.random() * 100);
        do {
            TrysCount++;
            System.out.print("Введите ваше число: ");
            UsNmr = scn.nextInt();
            if (UsNmr > UnNmr) {
                System.out.println("Моё число меньше.");
            } else if (UsNmr < UnNmr) {
                System.out.println("Моё число больше.");
            } else {
                System.out.println("Вы угадали!");
            }
        } while (UsNmr != UnNmr);

        System.out.println("Количество попыток: " + TrysCount);

    }

}

