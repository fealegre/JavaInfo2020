package informatorio;

import java.util.Scanner;

public class Compl2 {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese primer valor:>>");
        num1=scan.nextInt();
        System.out.print("Ingrese segundo valor:>>");
        num2=scan.nextInt();
        System.out.printf("%d + %d = %d\n",num1, num2, num1+num2);
        System.out.printf("%d - %d = %d\n",num1, num2, num1-num2);
        System.out.printf("%d * %d = %d\n",num1, num2, num1*num2);
        System.out.printf("%d / %d = %d\n",num1, num2, num1/num2);
        System.out.printf("Resto %d / %d = %d\n",num1, num2, num1%num2);
        scan.close();


    }
    
}
