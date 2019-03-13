package p4;

public class p8 {

    public static void main(String[] args) {
        String sentence = "Я помню чудное мгновение:";
        boolean b1 = sentence.endsWith("мгновение:");
        boolean b2 = sentence.endsWith("мгновение!");
        System.out.println("Строка " + sentence
                + " заканчивается 'мгновение:'?  " + b1);
        System.out.println("Строка " + sentence
                + " заканчивается 'мгновение!'?  " + b2);
    }
}
