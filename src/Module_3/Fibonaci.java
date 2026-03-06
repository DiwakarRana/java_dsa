package Module_3;

import java.util.Scanner;

public class Fibonaci {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the Fibonacci series");
        int number = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(a +"  ");
            int c = a +b;
            a = b;
            b = c;
        }

    }
}
