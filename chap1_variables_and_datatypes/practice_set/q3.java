//Write a java program which asks the user to enter his/her name and greets them with "Hello <name>,hava a good day",text.
package chap1_variables_and_datatypes.practice_set;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner ps=new Scanner(System.in);
        System.out.println("Enter you name:");
        String name=ps.nextLine();
        System.out.println("Hello "+name+", have a good day");

    }

    
}
