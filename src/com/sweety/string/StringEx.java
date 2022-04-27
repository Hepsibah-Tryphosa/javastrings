/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sweety.string;

/**
 *
 * @author Sweety
 */
public class StringEx {

    public static void main(String[] args) {

        String sweety = new String("girl");
        System.out.println(sweety);
         System.out.println("college".substring(2, 5)); 
         
        String phone = "mobile";//"mobile" =new String("mobile");  
        String phone2 = phone.concat("number");
        phone2 = phone.concat("number").concat("12345");
        
        String abc = "mobile" + 2 + 3 + "830";
        String ijk = phone.toUpperCase();
        System.out.println(ijk);
        System.out.println(abc);
        
        
        String swty = String.join("-", "s" , "w", "e", "e", "t", "y");
        System.out.println(swty);
        
        StringBuffer name = new StringBuffer("asdf");
        name.append("qwwe");
        System.out.println(name);
        
        
        Integer sweetyy = 1;
        Integer.signum(9);
    }

}