package Module_3;

import java.util.Scanner;

public class InverseNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to make the inverse of it: ");
        int number = sc.nextInt();
        int inverse = 0;
        int originalPosition = 1;
        while(number !=0){
            int originalDigit = number%10;
            int inverseDigit = originalPosition;
            int inverserPosition = originalDigit;
            inverse = inverse + inverseDigit*(int)Math.pow(10, inverserPosition-1);
            number = number/10;
            originalPosition++;
        }
        System.out.println(inverse);

    }


}
