// write a java program to encrypty a grade by adding 8 to it .Decrypt it to show the correct grade
package chap2_operators_and_expression.practice_set;

public class q2 {
    public static void main(String[] args) {
        char grade = 'D';
        grade=(char)(grade+8);
        System.out.println(grade);


        //encryption

        // char grade = 'D';
        grade=(char)(grade-8);
        System.out.println(grade);
    }
    
}
