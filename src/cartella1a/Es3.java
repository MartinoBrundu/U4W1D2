package cartella1a;

import java.util.Scanner;

public class Es3 {
    public static void main () {
        String carattereDiviso = "" ;
        Scanner myScanner = new Scanner(System.in) ;
        do {
            System.out.println("inserisci una parola");
            carattereDiviso = myScanner.nextLine();
            String[] arrayOfString = carattereDiviso.split("");
            System.out.println(String.join("," , arrayOfString));
        }
        while(!carattereDiviso.equals(":q")) ;
        myScanner.close();
    }

    public static boolean main() {
    }
}
