
package sptv18_loop;


public class Sptv18_loop {

    public static void main(String[] args) {
        final int MAX_NUMBER= 50;
        System.out.println("Простые числа между 1 и "+MAX_NUMBER);
        for (int number=1; number<MAX_NUMBER;number++){
            boolean isPrime = true;
            int devider = 2;
            do {
            if (number%devider==0&&number!=devider){
                isPrime=false;
            }
            devider++;
            }while(isPrime&&devider<number);
            if (isPrime){
                System.out.print(" " + number);
            }   
        }
    }
}
