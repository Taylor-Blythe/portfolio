import java.util.Scanner;
import java.lang.Math;
public class practiceProblems2Q2 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length1 = ui.nextDouble();
        double area = (Math.sqrt(3)/4)*(Math.pow(length1,2));
        System.out.printf("Area is: %s",area);
        double volume = area*length1;
        System.out.printf(" \nVolume is: %s",volume);


        

    }
}