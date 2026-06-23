import java.util.Scanner;

public class CtoFConverter {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String trash = "";
        boolean done = false;
        double celsius = 0;

        do {
            System.out.print("Input a temperature in Celsius: ");

            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input: " + trash + ". Please try again");
            }

        } while (!done);

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);
    }
}
