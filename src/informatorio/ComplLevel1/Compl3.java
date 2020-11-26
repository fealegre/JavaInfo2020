package informatorio.ComplLevel1;

import java.util.Scanner;

public class Compl3 {

    public static void main(String[] args) {
        
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese un numero:>>");
        num=scan.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        scan.close();
    }
    
}
