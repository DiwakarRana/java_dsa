package Module_3;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to check for Prime");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter "+(i+1)+" number to check for prime");
            int prime = sc.nextInt();
            int count = 0;
            for (int j = 2; j*j <= prime ; j++) {
                if(prime%j == 0) {
                    count++;
                }
            }
            if (count ==0){
                System.out.println("Number "+prime+" is Prime");
            }else System.out.println("Number "+prime+" is not prime");

        }
    }
}
