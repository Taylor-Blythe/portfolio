//side equations from Ben
import java.util.Scanner;
import java.lang.Math;
public class practiceProblems2Q1 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the coordinates of three points of a triangle:");
        System.out.print("Enter x1 y1 for point one: ");
        Double x1 = ui.nextDouble();
        Double y1 = ui.nextDouble();
        System.out.print("Enter x2 y2 for point two: ");
        Double x2 = ui.nextDouble();
        Double y2 = ui.nextDouble();
        System.out.print("Enter x3 y3 for point 3: ");
        Double x3 = ui.nextDouble();
        Double y3 = ui.nextDouble();

        Double side1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        Double side2 = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
        Double side3 = Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
        Double s = (side1 + side2 + side3)/2;
        Double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.println("The area of the triangle is: "+area);
         
        ui.close();
    }
}