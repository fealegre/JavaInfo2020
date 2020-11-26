package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl4 {

    public static void main(String[] args) {
        
        int num;
        int fact=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese un numero:>>");
        num=scan.nextInt();

        for (int i = 2; i <= num; i++) {

            fact=fact*i;           
        }

        System.out.printf("\nFactorial de %d = %d",num,fact);
        scan.close();
    }
    
}
