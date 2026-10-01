import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width;
        double height;

        // Width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width <= 0 || !Double.isFinite(width)) {
                    System.out.println("Invalid input: width must be greater than 0.");
                    width = -1;
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a number.");
                width = -1;
            }
        } while (width <= 0);

        // Height
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height <= 0 || !Double.isFinite(height)) {
                    System.out.println("Invalid input: height must be greater than 0.");
                    height = -1;
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a number.");
                height = -1;
            }
        } while (height <= 0);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

        in.close();
    }
}