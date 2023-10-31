// final print help from Ben
import java.util.Scanner;
public class practiceProblems2Q3 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        double minutes = ui.nextDouble();
        double days = minutes/(60*24);
        double years = days/365;
        double remainder = years%1;
        double daysRemaining = remainder*365;

        System.out.printf("years: %s, days: %s",years,daysRemaining);



        // double total = 
        ui.close();
    }
}