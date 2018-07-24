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
public class MathOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int first=sc.nextInt();
        System.out.println("enter Second number");
        int second=sc.nextInt();
        int sum=first+second;
        
        
        
        System.out.println("The sum is "+sum);
    }
}
