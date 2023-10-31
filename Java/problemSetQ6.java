import java.util.Scanner;
public class problemSet1Q6 {

    public static void main(String[] args) {
    

        Scanner ui = new Scanner(System.in);
        System.out.println("enter your first name: ");
        String firstName = ui.nextLine();
        System.out.println("enter your last name: ");
        String lastName = ui.nextLine();
        System.out.println("enter your street address: ");
        String streetAddress = ui.nextLine();
        System.out.println("enter your city: ");
        String city = ui.nextLine();
        System.out.println("enter your state: ");
        String state = ui.nextLine();
        System.out.println("enter ZIP: ");
        String ZIP = ui.nextLine();
        System.out.println("enter amount owed: ");
        double amountOwed = ui.nextDouble();
        System.out.println("enter payment amount: ");
        double paymentAmount = ui.nextDouble();
        System.out.println("enter payment date: ");
        int paymentDate = ui.nextInt();

        System.out.printf("\t\t\t XYZ COMMUNITY HOSIPITAL \t\t\t\n==================================================================================\n\n Last\tFirst\tAddressLine1\tCity,state\tZip\tAmount Owed\tPayment Amt\tPayment date\n\n==================================================================================\n\n%s\t%s\t%s,%s\t%s\t%s\t%s\t%s\t",firstName,lastName,streetAddress,city,state,ZIP,amountOwed,paymentAmount,paymentDate);

    }
    
}