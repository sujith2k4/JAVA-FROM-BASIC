// Use comparison operators to find out whether a given number is greater than the user entered number or not

package chap2_operators_and_expression.practice_set;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner ls =new Scanner(System.in);
        System.out.println("enter a number :");
        int num1=ls.nextInt();
        if (num1>=100){
            System.out.println("you are in range of given number");

        }
        else{
            System.out.println("you are out of range");
        }
    }
    
}
