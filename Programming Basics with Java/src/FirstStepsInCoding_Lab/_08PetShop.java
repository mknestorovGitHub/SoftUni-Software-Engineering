package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _08PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = dogFoodPackages * 2.5;
        double catFoodPrice = catFoodPackages * 4;

        System.out.println((dogFoodPrice + catFoodPrice) + " " + "lv.");

    }
}
