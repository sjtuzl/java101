package com.daft.exercise;
import java.util.Scanner;
//arranging three integers from small to large
public class CH_3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Enter three integers: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        //main judgement: compare number 1 and number 2
        if (number1 <= number2) {
            if (number1 <= number3) {
                //found out that number1 is smallest
                System.out.print(number1 + " ");
                if (number2 <= number3) {
                    System.out.print(number2 + " " + number3);
                }
                else {
                    System.out.print(number3 + " " + number2);
                }
            }
            //found out that number1 is not smallest
            else {
                System.out.print(number3 + " " + number1 + " " + number2);
            }
        }
        else {
            //found out that number1 is not smallest
            if (number1 <= number3) {
                System.out.print(number2 + " " + number1 + " " + number3);
            } else if (number2 <= number3) {
                System.out.print(number2 + " " + number3 + " " + number1);
            }
            else {
                System.out.print(number3 + " " + number2 + " " + number1);
            }
        }
    }
}
