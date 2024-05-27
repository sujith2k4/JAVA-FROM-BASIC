//Write a java program to convert kilometers to miles

package chap1_variables_and_datatypes.practice_set;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter kilo meters to convert into miles:");
        double num1=si.nextDouble();
        double miles=0.621*num1;
        System.out.println("miles:"+miles);
    }
}
