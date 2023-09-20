package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _09YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double squareMetersPrice = 7.61;
        double entireYard = squareMeters * squareMetersPrice;
        double discount = entireYard * 0.18;
        double finalPrice = entireYard - discount;

        System.out.printf("The final price is: %.2f lv.%n" ,finalPrice);
        System.out.printf("The discount is: %.2f lv." ,discount);

    }
}
