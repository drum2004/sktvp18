package enums;

public class enums4 {
    static enum Days{
    Esmaspäev, Teisipäev, Kolmapäev, Neljapäev, 
    Reede,Laupäev, Pühapäev}
    
    public static void main(String[] args) {
    Days esmaspaev=Days.Esmaspäev;  
    System.out.printf("Enum value is %s, index %d%n",
       esmaspaev,esmaspaev.ordinal());
    System.out.printf("Day (index=4) %s%n",Days.values()[4]);
    
    System.out.println("===Дни недели===");
    for(Days d: Days.values()){
            System.out.println(d);
        }    
    System.out.println();
    Days days=Days.valueOf("Pühapäev");
    System.out.println(days);
    }
}
