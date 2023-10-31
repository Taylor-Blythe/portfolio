import java.utilScanner;
import java.util.ArrayList;
public class inventory{
    public static void main(String[] args) {
        //Program that keeps track of the animals at the Vet
        // add, insert, rmeove, replace, clear the db
        // if user types quit, program end
        ArrayList<String> petList = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        String userInput = "";

        while(!userInput.equals("q")){
            System.out.println("What would you like to do? (a)dd, (i)sert, (r)emove,Re(p)lace,(c)lear,(v)iew or (q)uit");
            userInput=ui.nextline();

            if(input.equals("a")){
                System.out.println("add");
            }
            else if(input.equals("i")){
                System.out.println("insert");
            }
            else if(input.equals("r")){
                System.out.println("remove");
            }
            else if(input.equals("p")){
                System.out.println("replace");
            }
            else if(input.equals("c")){
                System.out.println("clear");
            }
            else if(input.equals("v")){
                System.out.println("view");
            }
            else{
                System.out.println("Please choose a correct answer");
            }

            userInput = ui.nextLine();

        }
        System.out.println("later gator");
    }
 }