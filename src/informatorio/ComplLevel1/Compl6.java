package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl6 {
    public static void main(String[] args) {
        
        int base;
        int exponente;
        long potencia=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese base:>>");
        base=scan.nextInt();
        System.out.print("Ingrese exponente:>>");
        exponente=scan.nextInt();

        for (int i = 1; i <= exponente; i++) {

            potencia*=base;           
        }

        System.out.printf("\nPotencia de %d elevado a %d = %d",base,exponente,potencia);
        scan.close();
    }
    
}
