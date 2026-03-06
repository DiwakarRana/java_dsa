package Module_3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to make it reverse: ");
        int number = sc.nextInt();
        while (number > 0) {
            int digit = number%10;
            number = number/10;
            System.out.print(digit);

        }
    }
}
