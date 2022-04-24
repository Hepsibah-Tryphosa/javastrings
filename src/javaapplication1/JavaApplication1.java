
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Sweety
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        NewClass ssss = new NewClass();
        ssss.squareOfNum();
        CubeOfNum cube = new CubeOfNum(10);
        cube.numCube();
        cube.setLimit(600);
        cube.numCube(1000);
        
       int i=4;// 4 value is stored in stack.
       int j=4;
     
        CubeOfNum dog = new CubeOfNum(12);//reference memory(new cubeofnum[12]) for reference variable (dog)is stored in stack
        CubeOfNum cat = new CubeOfNum(11);
        CubeOfNum abc=null;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(abc);
        CubeOfNum test;
        test=cat;
        abc=new CubeOfNum(11);
        System.out.println(abc);
        System.out.println(i==j);
        System.out.println(dog==cat);
    
       System.out.println(test==cat);
        System.out.println(test);
        while(true){
            CubeOfNum def=new CubeOfNum(6);
            System.out.println(def);
        }
    }
    
}
