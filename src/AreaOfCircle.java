/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eleena
 */
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        final float PI=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius=sc.nextFloat();
        float aoc=PI*radius*radius;
        System.out.println("The area of circle is"+aoc);
        
    }
}
