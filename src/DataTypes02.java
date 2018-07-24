/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eleena
 */
// Data types in Java

//1.Primitive Data Type  int,byte,long,short,double,float ,char,boolean
//2.Non Primitive Data Type String, array, user defined class
import java.util.Scanner;
public class DataTypes02 {
    public static void main(String[] args){
        System.out.println("Write your character");
        Scanner sc=new Scanner(System.in);
        char name= sc.next().charAt(0);
        System.out.println("The character you have typed is:"+name);
    }
}
