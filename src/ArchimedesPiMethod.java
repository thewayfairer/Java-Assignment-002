/**
 * @author Trevor Hartman
 * @author Ricky Gutierrez
 * @since Version 1.0
 *
 */







import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sides for the polygon: ");
        int n = scan.nextInt();
        double B = 360.0 / n;
        double A = B / 2;
        double A_rad = Math.toRadians(A);
        double s = 2 * Math.sin(A_rad);
        double p = n * s;
        double PI = p / 2;
        System.out.println("Estimated value of PI: " + PI);
    }
}

