import java.util.Scanner;
public class problemset1Q3 {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        System.out.println("the driving distance: ");
        double distance = ui.nextDouble();
        System.out.println("the miles per gallon: ");
        double MPG = ui.nextDouble();
        System.out.println("the price per gallon: ");
        double price = ui.nextDouble();

        double drivingCost = distance/MPG*price;
        System.out.printf("the total cost is: %s",drivingCost);

    }
}