package p4;

public class p6 {

    public static void main(String[] args) {
        /*length()*/
        String sentence = "Я помню чудное мгновение!";
        System.out.println(sentence.length());
        System.out.println();
        /*concat()*/
        String sentence1 = "Я помню чудное мгновение:";
        sentence1 = sentence1.concat(" Передо мной явилась ты");
        System.out.println(sentence1);
        System.out.println();
        /*toUpperCase()*/
        String result = sentence1.toUpperCase();
        System.out.println("В верхнем регистре: " + result);
        System.out.println();
        /**toLowerCase()**/
        String result1 = sentence1.toLowerCase();
        System.out.println("В нижнем регистре: " + result1);
        /*trim()*/
        String s1="   Я помню чудное мгновение:   "; 
        String s2="    Передо мной явилась ты    ";
        System.out.println(s1);
        System.out.println(s2.trim());
       /*substring()*/
        System.out.println(sentence.substring(5));
        System.out.println(sentence.substring(2, 10));
    }
}
