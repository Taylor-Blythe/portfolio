import java.util.Scanner;
public class GpaCalculator {


    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your grade? ");
        double grade1 = ui.nextDouble();
        System.out.println("What is your grade? ");
        double grade2 = ui.nextDouble();
        System.out.println("What is your grade? ");
        double grade3 = ui.nextDouble();
        System.out.println("What is your grade? ");
        double grade4 = ui.nextDouble();
        double overallGrade = grade1+grade2+grade3+grade4;
        System.out.print(overallGrade/4);
        System.out.print(" is your GPA");

        ui.close();
    }
}
