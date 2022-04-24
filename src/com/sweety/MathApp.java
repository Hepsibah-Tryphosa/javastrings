/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sweety;

import java.util.Scanner;

/**
 *
 * @author Sweety
 */
public class MathApp {

    public static void main(String[] arg) {
        int num2;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Enter your number -");
            num2 = scanner.nextInt();
            if (num2 == 20) {
                continue;
            }
           if (num2==30){
                break;
            }
            if (num2 > 0) {
                int cube;
                cube = num2 * num2 * num2;
                System.out.println(cube);

            } else {
                System.out.println("thankyou");
                // System.exit(0);

            }

        } while (num2 > 0);
        System.out.println("closing application");
    }

}
