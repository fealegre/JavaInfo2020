package informatorio;

import java.util.Scanner;

public class Compl5 {
    public static void main(String[] args) {
        
        int factor1;
        int factor2;
        int producto=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese primer factor:>>");
        factor1=scan.nextInt();
        System.out.print("Ingrese segundo factor:>>");
        factor2=scan.nextInt();

        for (int i = 1; i <= factor1; i++) {

            producto+=factor2;           
        }

        System.out.printf("\nProducto de %d * %d = %d",factor1,factor2,producto);
        scan.close();
    }
    
}
