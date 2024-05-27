//Write  a program to calculate (GPA Using marks of three subjects out of 100)

package chap1_variables_and_datatypes.practice_set;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner ls=new Scanner(System.in);
        System.out.println("Enter your Mathematics marks:");
        int marks1=ls.nextInt();
        System.out.println("Mathematics:"+marks1);
        System.out.println("Enter your Physics marks:");
        int marks2=ls.nextInt();
        System.out.println("Physics:"+marks2);
        System.out.println("Enter your Chemistry marks:");
        int marks3=ls.nextInt();
        System.out.println("Chemistry:"+marks3);
        double sum=marks1+marks2+marks3;
        double GPA=sum/300*100;
        System.out.println("GPA:"+GPA);

    }
    
}
