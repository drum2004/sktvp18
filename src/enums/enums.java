package enums;
public class enums {  
    public enum Seasons {
        WINTER,SUMMER,SPRING,FALL}
    public static void main(String[] args) {
        for(Seasons s : Seasons.values()){
            System.out.println(s);
        }
    }
}
