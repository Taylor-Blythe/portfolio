import java.util.Scanner;
public class additionProgram {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        
        double total = 0;
        String userInput = "";
        String output = "";
        // while(!userInput.equals("quit")){
            while(true){
                System.out.println("enter a number or quit:");
                userInput = ui.nextLine();
                if (userInput.equals("quit")){
                    break;
                }
                else{
                    total+=(Double.parseDouble(userInput));
                    output+=(userInput+",");
                }
        }
        System.out.println(total);
        System.out.println(output.substring(0, output.length()-1));


        
    }
}