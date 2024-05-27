//Write a java program to sum three numbers and take input from the user.
package chap1_variables_and_datatypes.practice_set;

import java.util.Scanner;

/**
 * q1
 */
public class q1 {

    public static void main(String[] args) {
        Scanner ns =new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1=ns.nextInt();
        System.out.println("enter number 2:");
        int num2=ns.nextInt();
        System.out.println("enter number 3:");
        int num3=ns.nextInt();
        int sum=num1+num2+num3;
        System.out.println("Sum of numbers are:"+sum);
    }
}