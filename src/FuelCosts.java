import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons;
        double mpg;
        double price;

        // Gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                if (gallons <= 0 || !Double.isFinite(gallons)) {
                    System.out.println("Invalid input: gallons must be greater than 0.");
                    gallons = -1;
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a number.");
                gallons = -1;
            }
        } while (gallons <= 0);

        // Fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                if (mpg <= 0 || !Double.isFinite(mpg)) {
                    System.out.println("Invalid input: fuel efficiency must be greater than 0.");
                    mpg = -1;
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a number.");
                mpg = -1;
            }
        } while (mpg <= 0);

        // Price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                if (price <= 0 || !Double.isFinite(price)) {
                    System.out.println("Invalid input: price must be greater than 0.");
                    price = -1;
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a number.");
                price = -1;
            }
        } while (price <= 0);

        // Calculations
        double costPer100Miles = (100.0 / mpg) * price;
        double range = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance possible with the gas in the tank: %.1f miles%n", range);

        in.close();
    }
}