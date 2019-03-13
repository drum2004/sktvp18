package enums;
public class enums3 {
    static enum Days{
    Esmaspaev, Teisipaev, Kolmapaev, Neljapaev, Reede,
    Laupaev, Puhapaev}
    public static void main(String[] args) {
        System.out.println("====Дни недели===="); 
        for(Days d: Days.values()){
            System.out.println(d);
        }
    }
}
