/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukharev;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.print.attribute.Attribute;

/**
 *
 * @author 925
 */
public class Sukharev {

    private static enum animals {
        крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки, свиньи
    }

    private static enum colors {
        зеленый, красный, желтый, белый, черный
    }

    static Scanner scanInput = new Scanner(System.in);
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (;;) {
            System.out.print("Выберите номер задания и нажмите Enter или 666 для выхода: ");

            Integer scanValue = scanInput.nextInt();
            switch (scanValue) {
                case 1:
                    lesson1();
                    break;
                case 2:
                    lesson2();
                    break;
                case 3:
                    lesson3();
                    break;
                case 4:
                    lesson4();
                    break;
                case 5:
                    lesson5();
                    break;
                case 6:
                    lesson6();
                    break;
                case 7:
                    lesson7();
                    break;
                case 8:
                    lesson8();
                    break;
                case 9:
                    lesson9();
                    break;
                case 10:
                    lesson10();
                    break;
                case 666:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Задания с таким номером нет!");
                    break;
            }
        }
    }

    public static void lesson1() {
        System.out.println("Задание 1!");
        System.out.print("Введите температуру: ");
        Integer temp = scanInput.nextInt();
        Double tempF = (temp * 1.8) + 32; // считаем по фарингейту
        System.out.println("Температура " + temp + "°C = " + tempF.intValue() + "°F"); // но выводим только целую часть!
    }

    public static void lesson2() {
        System.out.println("Задание 2!");
        for (;;) {
            System.out.print("Введите трехначное число: ");
            Integer num = scanInput.nextInt();
            if (num > 99 && num < 1000) {
                int sotni = num / 100; // вычисляем сотни
                int ostatok = num % 100;
                int desyatki = ostatok / 10; // вычисляем десятки
                int edinitsi = ostatok % 10; // вычисляем единицы
                System.out.println("Вы ввели число: " + num);
                System.out.println("Сотни: " + sotni);
                System.out.println("Десятки: " + desyatki);
                System.out.println("Единицы: " + edinitsi);
                System.out.println("---------------------------------");
                break;
            } else {
                System.out.println("не мудри, а вводи ТРЕХЗНАЧНОЕ число!");
            }
        }
    }

    public static void lesson3() {
        System.out.println("Задание 3!");
        for (;;) {
            System.out.print("Введите год от 1984 до 9999: ");
            Integer year = scanInput.nextInt();
            if (year >= 1984 && year <= 9999) {
                int yearIndex = (year - 1984) % 12; // определяем индекс для года....
                int colorIndex = ((year - 1984) % 10) / 2; // определяем индекс цвета. 1 цвет = 2 года  
                System.out.println("Год " + animals.values()[yearIndex] + " цвет " + colors.values()[colorIndex]);
                System.out.println("---------------------------------");
                break;
            } else {
                System.out.println("не мудри, а вводи год в указанном диапазоне!");
            }
        }
    }

    public static void lesson4() {
        System.out.println("Задание 4!");
        System.out.println("А теперь проверим твои знания таблицы умножения :)");
        System.out.println("───────────────────────────────");
        int answerRight = 0;
        for (int count = 1; count <= 5; count++) {
            int rndX = rnd.nextInt(9) + 1;
            int rndY = rnd.nextInt(9) + 1;
            System.out.format("%d. %d x %d = ", count, rndX, rndY);
            Integer answer = scanInput.nextInt();
            int ranswer = rndX * rndY;
            if (answer.compareTo(ranswer) == 0) {
                System.out.println((char) 27 + "[32mПравильно!" + (char) 27 + "[0m");
                answerRight++;
            } else {
                System.out.println((char) 27 + "[31mОшибка!" + (char) 27 + "[0m");
            }
        }

        System.out.print("Твоя оценка: ");
        switch (answerRight) {
            case 0:
                System.out.println("Срочно нужно учить таблицу умножения!");
                break;
            case 1:
                System.out.println("Срочно нужно учить таблицу умножения!");
                break;
            case 2:
                System.out.println("Срочно нужно учить таблицу умножения!");
                break;
            case 3:
                System.out.println("Надо бы еще поучить");
                break;
            case 4:
                System.out.println("Надо бы еще поучить");
                break;
            case 5:
                System.out.println("Молодец!");
                break;
        }
    }

    public static void lesson5() {
        System.out.println("Задание 5!");
        System.out.println("Работа с 20ю элементами массива");
        int[] myArray = new int[20]; // создаем пустой массив на 20 элементов...
        int summa = 0; // для подсчета среднего числа
        int rndNum = 0;
        for (int i = 0; i < myArray.length; i++) {
            do {
                rndNum = rnd.nextInt(100) + 1;
            } while (rndNum % 2 > 0); // генерируем до тех пор, пока число не попадется четное

            myArray[i] = rndNum;
            summa += rndNum;
        }
        System.out.format("Массив создан на %d элементов, среднее арифметическое %d", myArray.length, summa / myArray.length);
        System.out.println("");
        System.out.println("───────────────────────────────────────");
        // на случай, если нужно посмотреть, что же у нас в массиве накопилось....
        System.out.println("Сгенерированные числа в массиве:");

        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j]);
            if (j + 1 != myArray.length) {
                System.out.print(", "); // ставим запятую, если это не последний элемент массива
            }
        }
        System.out.println("");
        System.out.println("───────────────────────────────────────");
    }

    public static int generateTemp(int val1, int val2) {
        //Random rand = new Random();
        int result = 0;
        if (val2 > val1) {
            result = rnd.nextInt(val2 - val1 + 1) + val1;
        } else {
            result = rnd.nextInt(val1 - val2 + 1) + val2;
        }
        return result;
    }

    public static void lesson6() {
        System.out.println("Задание 6!");
        int[][] weather = new int[12][31]; // создаем массив 12 месяцев х 31 день 
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // для примера используем 2017 год

        int newRnd = 0;
        // запоним данный массив примерными данными....
        for (int m = 1; m <= 12; m++) {
            for (int d = 1; d <= dayOfMonth[m - 1]; d++) {
                // генерируем число в зависимости от месяца...
                switch (m) {
                    case 1:
                        newRnd = generateTemp(-20, -5);
                        break;
                    case 2:
                        newRnd = generateTemp(-15, 0);
                        break;
                    case 3:
                        newRnd = generateTemp(-2, 10);
                        break;
                    case 4:
                        newRnd = generateTemp(0, 10);
                        break;
                    case 5:
                        newRnd = generateTemp(0, 15);
                        break;
                    case 6:
                        newRnd = generateTemp(10, 25);
                        break;
                    case 7:
                        newRnd = generateTemp(10, 25);
                        break;
                    case 8:
                        newRnd = generateTemp(10, 20);
                        break;
                    case 9:
                        newRnd = generateTemp(5, 15);
                        break;
                    case 10:
                        newRnd = generateTemp(5, 7);
                        break;
                    case 11:
                        newRnd = generateTemp(-5, 5);
                        break;
                    case 12:
                        newRnd = generateTemp(-10, 2);
                        break;
                }
                weather[m - 1][d - 1] = newRnd;
            }
        }

        for (;;) {
            System.out.print("Введите месяц (1-12), для выхода 99: ");
            Integer month = scanInput.nextInt();
            if (month == 99) {
                break;
            }
            if (month >= 1 && month <= 12) {
                System.out.print("Введите число (1-28/31): ");
                Integer day = scanInput.nextInt();

                if (day >= 1 && day <= dayOfMonth[month - 1]) { // на всякий случай проверяем дней в месяце...
                    System.out.println("Ваша погода: " + weather[month - 1][day - 1] + "°C");
                    System.out.println("----------------------------------------");
                } else {
                    System.out.println((char) 27 + "[31mВводи числа от 1 до 31, но не забывай, что не во всех месяцах есть 31 день!" + (char) 27 + "[0m");
                }
            } else {
                System.out.println((char) 27 + "[31mВводи числа от 1 до 12 и не мудри!" + (char) 27 + "[0m");
            }

        }

        //for (int i=0;i<12;i++) {6
        //        System.out.println(Arrays.toString(weather[i]));
        //}
    }

    public static void lesson7() {
        System.out.println("Lesson 7!");
    }

    public static void lesson8() {
        System.out.println("Lesson 8!");
    }

    public static void lesson9() {
        System.out.println("Lesson 9!");
    }

    public static void lesson10() {
        System.out.println("Lesson 10!");
    }

}
