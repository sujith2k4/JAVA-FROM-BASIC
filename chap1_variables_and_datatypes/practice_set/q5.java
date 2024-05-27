//Write a program to detect hether a number entered by the user is interger or not.
package chap1_variables_and_datatypes.practice_set;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner ns=new Scanner(System.in);
        System.out.println("Enter you number:");
        System.out.println(ns.hasNextInt());

    }
       
}
