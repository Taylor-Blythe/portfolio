import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {

    
    Scanner ui = new Scanner(System.in);

    System.out.println("adjective: ");
    String adjective1 = ui.nextLine();
    System.out.println("adjective: " );
    String adjective2 = ui.nextLine();
    System.out.println("type of bird: " );
    String bird = ui.nextLine();
    System.out.println("room in house: " );
    String room = ui.nextLine();
    System.out.println("verb: ");
    String verb1 = ui.nextLine();
    System.out.println("relatives name: ");
    String relative = ui.nextLine();
    System.out.println("noun: ");
    String noun1 = ui.nextLine();
    System.out.println("a liquid: ");
    String liquid = ui.nextLine();
    System.out.println("verb ending in ing: ");
    String ingVerb1 = ui.nextLine();
    System.out.println("part of body(plural): ");
    String bodyPart = ui.nextLine();
    System.out.println("plural noun: ");
    String noun2 = ui.nextLine();
    System.out.println("verb ending in ing: ");
    String ingVerb2 = ui.nextLine();
    System.out.println("noun: ");
    String noun3 = ui.nextLine();

    System.out.printf("it was a %s, cold november day. I woke up to the%s,smell of %s, roasting in the %s, down the stairs to see if I could help %s, the dinner. My mom said, see if %s, needs a fresh %s, so I carried a tray of glasses full of %s, into the %s, When I got there, I couldnt believe my %s,  there were%s, %s, on the %s\n",adjective1,adjective2,bird,room,verb1,verb1,relative,noun1,liquid,ingVerb1,bodyPart,noun2,ingVerb2,noun3);
    }
}