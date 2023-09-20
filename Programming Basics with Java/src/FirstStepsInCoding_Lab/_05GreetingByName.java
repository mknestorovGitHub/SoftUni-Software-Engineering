package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _05GreetingByName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();

        System.out.printf("Hello, %s!" ,inputName);

    }
}
