import java.util.Scanner;
public class keepingTrack{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        String inputNumbers = "";
        String number = "";
        

        while(!number.equals("no")){
            inputNumbers = inputNumbers.concat("\n"+number);

            System.out.println("Enter a number: ");
            number = ui.next();

            

            
        }

        System.out.print(inputNumbers);
        
    }
}