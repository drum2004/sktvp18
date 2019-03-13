package sktvp18_1;

import java.util.Scanner;

public class Sktvp18_1 {

    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.printf("Number %d is positive%n", number);
        } else if (number < 0) {
            System.out.printf("Number %d is negative%n", number);
        }else System.out.println("Number is zero");*/

 /*switch_case*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = sc.nextInt();
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        int days = 0;
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
              days=31;
              break;
            case 4:case 6:case 9:case 11:
                days=30;
                break;
            case 2:
            days=(year % 4 == 0&&
            !(year % 100 == 0))||(year % 400 == 0)? 29:28;
            break;
            default:
                System.out.println("Invalid month");
            break;
        }
        System.out.printf("Days in month: %d and year: %d are %d%n", month, year, days);

    }

}
