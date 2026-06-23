import java.time.Period;
import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String trash = "";

        boolean l1done = false;
        boolean l2done = false;

        double rLength = 0;
        double rWidth = 0;

        do {
            System.out.print("Input value of length: ");
            if (input.hasNextDouble()) {
                rLength = input.nextDouble();
                input.nextLine();
                l1done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input: " + trash + ". Please try again");
            }
        } while (!l1done);

        do {
            System.out.print("Input value of width: ");
            if (input.hasNextDouble()) {
                rWidth = input.nextDouble();
                input.nextLine();
                l2done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input: " + trash + ". Please try again");
            }
        } while (!l2done);

        double rArea = rLength * rWidth;
        double rPerimeter = 2 * (rLength + rWidth);
        double rDiagonalLength = Math.sqrt(Math.pow(rWidth, 2) + Math.pow(rLength, 2));

        System.out.printf("\n---Rectangle Info---\n");
        System.out.printf("Area: %.2f\n", rArea);
        System.out.printf("Area: %.2f\n", rPerimeter);
        System.out.printf("Area: %.2f\n", rDiagonalLength);

    }
}
