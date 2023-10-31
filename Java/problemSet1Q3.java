import java.util.Scanner;
import java.lang.Math;
public class problemset1Q3 {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = ui.nextDouble();
        System.out.println("Enter interest amount in percentage: ");
        double monthlyInterest = ui.nextDouble();
        System.out.println("Enter number of years : ");
        double years = ui.nextDouble();

        // System.out.printf("investment amount: %s, interest amount: %s, years: %s",investmentAmount,monthlyInterest,years);

        double futureValue =investmentAmount* Math.pow((1+(monthlyInterest/100/12)),years*12);
        System.out.printf("Future value is %s",futureValue);

        ui.close();


    }
}
