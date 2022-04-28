/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Sweety
 */
public class NewClass {

    int limit;

   public NewClass(int limit) {
        this.limit = limit;
    }

    NewClass() {
        this.limit = 30;
    }

    void squareOfNum() {
        int i = 1;
        while (i * i <= limit) {
            System.out.println(i * i);
            i++;

        }

    }

}
