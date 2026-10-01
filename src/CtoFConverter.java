import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean valid = false;

        // Loop until a valid number is entered
        while (!valid) {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                if (Double.isFinite(celsius) && celsius >= -273.15) {
                    valid = true;
                } else {
                    System.out.println("Invalid input: must be a real number at or above absolute zero (-273.15 C).");
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a number. Try again.");
            }
        }

        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println(celsius + " C = " + fahrenheit + " F");
        in.close();
    }
}