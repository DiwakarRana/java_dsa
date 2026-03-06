package Module_3;

import java.util.Scanner;

public class RotateNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to rotate");
        int number = sc.nextInt();
        System.out.println("Enter the rotate number");
        int rotate = sc.nextInt();

        int temp = number;
        int nod = 0;

        while (temp >0){
            temp = temp/10;
            nod++;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1; i<=nod;i++){
            if(i<=rotate){
                div = div*10;
            }else {
                mult = mult *10;
            }
        }
        rotate = rotate%nod;
        if (rotate<0){
            rotate = rotate + nod;
        }
        int quotient = number/div;
        int remainder = number % div;
        int result = remainder * mult + quotient;
        System.out.println("Reversed number is: "+ result);
    }

}
