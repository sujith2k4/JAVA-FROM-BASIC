// A varible is a container that stores a value.This value can be changed during the execution of th program
package chap1_variables_and_datatypes;
import java.util.Scanner;

class varibles {

    public static void main(String[] args) {
        Scanner ns =new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1=ns.nextInt();
        System.out.println("enter number 2");
        int num2=ns.nextInt();
        int number=num1+num2;
        
       
        System.out.println(number*4);
    }
}
