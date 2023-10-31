import java.util.Scanner;
public class problemset1Q2 {

    public static void main(String[] args) {
    

    Scanner ui = new Scanner(System.in);
    System.out.println("enter amount of water in KG: ");
    double waterWeight = ui.nextDouble();
    System.out.println("enter intial temp: ");
    double initialTemp = ui.nextDouble();
    System.out.println("enter final temp: ");
    double finalTemp = ui.nextDouble();

    double Energy_pt1 = finalTemp-initialTemp;
    double finalAnswer = waterWeight*Energy_pt1*4184;
    System.out.printf("the energy needed is: %s\n",finalAnswer);

    ui.close();
    }
}




