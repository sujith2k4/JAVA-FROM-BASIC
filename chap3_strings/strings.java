import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string::");
        String input = scanner.nextLine();

        System.out.println("You entered: " + input);

        scanner.close();
    }
}