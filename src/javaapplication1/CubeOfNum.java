package javaapplication1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sweety
 */
public class CubeOfNum {

   private int limit;

    public CubeOfNum(int limit) // constructor. because class name is given as method name with no return type
    {
        this.limit = limit;

    }

    void numCube() {
        int i = 1;
        while (i * i * i < limit) {
            System.out.println(i * i * i);
            i++;
        }
       
    }
    void setLimit(int limit){
        this.limit=limit;
    }
    int getLimit(){
        return limit;
    }

void numCube(int lnt) {
        int i = 1;
        while (i * i * i < lnt) {
            System.out.println(i * i * i);
            i++;
        }
       
    }
}