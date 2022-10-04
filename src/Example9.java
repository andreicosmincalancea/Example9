import java.util.Scanner;

public class Example9 {
    public static void main(String [] argv) {
        int age;
        System.out.println("Enter the age");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        age = inputValue.nextInt();

        if (age >=18) {
            System.out.println("You have the legal age");
        } else {
            System.out.println("You don't have the legal age");
        }
    }
}
