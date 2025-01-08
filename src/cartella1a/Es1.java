package cartella1a;

public class Es1 {
    public static boolean trueFalse(String n){
        return n.length() %2 == 0 ;

    }

    public static boolean annoBisestile (int anno) {
        return anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0) ;
    }
}
