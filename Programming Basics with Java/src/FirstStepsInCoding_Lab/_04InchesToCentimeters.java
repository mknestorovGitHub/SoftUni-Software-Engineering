package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _04InchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());

        System.out.println(inches * 2.54);
    }
}
