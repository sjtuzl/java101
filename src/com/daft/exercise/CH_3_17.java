package com.daft.exercise;
import java.util.Scanner;
//rock paper scissors
public class CH_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comp = (int)(Math.random() * 2);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();
        if (comp == 0) {
            if (user == 0) {
                System.out.println("The computer is scissor. You are scissor. It is a draw.");
            }
            if (user == 1) {
                System.out.println("The computer is scissor. You are rock. You won");
            }
            if (user == 2) {
                System.out.println("The computer is scissor. You are paper. You lost");
            }
        } else if (comp == 1) {
            if (user == 0) {
                System.out.println("The computer is rock. You are scissor. You lost");
            }
            if (user == 1) {
                System.out.println("The computer is rock. You are rock. It is a draw");
            }
            if (user == 2) {
                System.out.println("The computer is rock. You are paper. You won");
            }
        } else if (comp == 2) {
            if (user == 0) {
                System.out.println("The computer is paper. You are scissor. You won");
            }
            if (user == 1) {
                System.out.println("The computer is paper. You are rock. You lost");
            }
            if (user == 2) {
                System.out.println("The computer is paper. You are paper. It is a draw");
            }
        }
    }
}
