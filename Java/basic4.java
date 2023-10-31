import java.util.Scanner;
public class basic4 {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number1 = ui.nextDouble();
        System.out.println("Enter a math operator: ");
        ui.nextLine();
        String operator = ui.nextLine();
        System.out.println("Enter a number: ");
        double number2 = ui.nextDouble();
        
        
        if(operator.equals("+")){
            addNumbers(number1, number2);
        }
        else if(operator.equals("-")){
            subtractNumbers(number1,number2);
        }
        else if(operator.equals("*")){
            multiplyNumbers(number1,number2);
        }
        else if(operator.equals("/")){
            divideNumbers(number1,number2);
        }
        else{
            System.out.println("not an operator");
        }
        
    }
//ans = Double.toString(number1,number2);
    public static void addNumbers(double number1, double number2){
        System.out.println(number1+number2);
    }
    public static void subtractNumbers(double number1, double number2){
        System.out.println(number1-number2);
    }
    public static void multiplyNumbers(double number1, double number2){
        System.out.println(number1*number2);
    }
    public static void divideNumbers(double number1, double number2){
        System.out.println(number1/number2);
    }
}