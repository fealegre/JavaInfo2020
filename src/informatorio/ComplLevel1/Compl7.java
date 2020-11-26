package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl7 {
    public static void main(String[] args) {

        String palabra;
        var mayusculado = "";
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese una palabra:>>");
        palabra=scan.next();

        for (int k = 0; k < palabra.length(); k++) {

            int minuscula= palabra.codePointAt(k);
            int mayuscula= minuscula-32;
            char caracter=(char)mayuscula;
            mayusculado+=caracter;
            
        }


        System.out.println(mayusculado);
        scan.close();
        

        
        
    }
    
}
