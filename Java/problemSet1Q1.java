import java.util.Scanner;

public class probemSet1{
    public static void main(String[] args) {

   
    Scanner ui = new Scanner(System.in);
    System.out.println("Miles: ");
    double Miles = ui.nextDouble();
    double kilometers = Miles*1.60934;
    System.out.printf("%s miles is %s kilometers,\n",Miles,kilometers);

    }
}