package p3;
public class p2 {
    public static void main(String[] args) {
        int i0 = 1;
        int i1 = 1;
        int i2;
        System.out.print(i0 + " " + i1 + " ");
        for (int a = 3; a <= 11; a++) {
            i2 = i0 + i1;
            System.out.print(i2 + " ");
            i0 = i1;
            i1 = i2;
        }
        System.out.println();
    }
}
