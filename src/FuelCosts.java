import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String trash = "";

        boolean l1Done = false;
        boolean l2Done = false;
        boolean l3Done = false;

        double gallonsOfGas = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;

        do {
            System.out.print("Input number of gallons of gas in tank: ");

            if (input.hasNextDouble()) {
                gallonsOfGas = input.nextDouble();
                input.nextLine();
                l1Done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input. Please try again.");
            }

        } while (!l1Done);

        do {
            System.out.print("Input fuel efficiency in miles per gallon: ");

            if (input.hasNextDouble()) {
                fuelEfficiency = input.nextDouble();
                input.nextLine();
                l2Done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input. Please try again.");
            }

        } while (!l2Done);

        do {
            System.out.print("Input price of gas per gallon: ");

            if (input.hasNextDouble()) {
                pricePerGallon = input.nextDouble();
                input.nextLine();
                l3Done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input. Please try again.");
            }

        } while (!l3Done);

        double costToDrive = (100 / fuelEfficiency) * pricePerGallon;
        double totalDistanceFull = gallonsOfGas * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is: $%.2f\nOn a full tank, the car can go %.1f miles.\n", costToDrive, totalDistanceFull);
    }
}
