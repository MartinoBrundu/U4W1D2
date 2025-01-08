package cartella1a;

public class    es1 {
    public static boolean trueFalse(String n){
        if (n.length() %2 == 0) {
        return true;}  else {return false;}
    }

    public static boolean annoBisestile (int x) {
        if (x %4 == 0 || x %100 == 0 && x %400 == 0) {
            return true ;
        } else {
            return false ;
        }

    }
}
