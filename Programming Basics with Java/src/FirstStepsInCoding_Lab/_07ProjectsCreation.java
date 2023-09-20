package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class _07ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int numberProjects = Integer.parseInt(scanner.nextLine());
        int neededHours = numberProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s." ,architectName ,neededHours ,numberProjects);

    }
}
