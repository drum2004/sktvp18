package stroki;
public class stroki1 {
    public static void main(String[] args) {
        char[] chars = {'Г', 'р', 'у', 'п', 'п', 'а', ' ',
            'S', 'K', 'T', 'V', 'p', '1', '8'};
        String s1 = "Строки";
        System.out.println(
                "Строка s1 до copyValueOf: 	" + s1);
        s1 = s1.copyValueOf(chars);
        System.out.println(
                "Строка s1 после copyValueOf: 	" + s1);
        
        System.out.println();
        /*с параметарми*/
        char[] chars1 = {'Г', 'р', 'у', 'п', 'п', 'а', ' ',
            'S', 'K', 'T', 'V', 'p', '1', '8'};
        String str1 = "Строки";
        String str2 = str1.copyValueOf(chars1);
        String str3 = str1.copyValueOf(chars1, 2, 7);
        System.out.println(
                "Строка без смещения:	" + str2);
        System.out.println(
                "Строка со смещением в 2 и длинной 7: " + str3);
    }
}
