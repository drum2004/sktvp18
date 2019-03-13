package p2;

public class p2_1 {

    public static void main(String[] args) {
        /*int i;
        int a;
        i=1;
        a=3;
        while(i <= 5){
          System.out.println(i + ": цикл выполняется!");
          if (i == a)
              break;
          i++;
        }*/

        for (int i = 1; i <= 3; i++) {
            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
            for (int a = 1; a <= 10; a++) {
                System.out.println("    Это второй цикл! Я выполняюсь " + a + " раз");
                if (a == 2) 
                    break;
                

            }
        }

    }
}
