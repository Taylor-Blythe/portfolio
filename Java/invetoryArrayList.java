import java.util.Scanner;
import java.util.ArrayList;

//credit to ben for helping with insert and replace
public class Invetory {
     public static void main(String[] args) {
          //Program that keeps track of the animals at the Vet
          //   add, insert, remove, replace, clear the db
          //   if the user types in quit -> the program ends      
          ArrayList<String> petList = new ArrayList<String>();
          Scanner ui = new Scanner(System.in);
          String userInput = "";
          String newPet = "";
          


          while(!userInput.equals("q")){
               System.out.println("What would you like to do? (a)dd,(i)nsert,(r)emove,Re(p)lace,(c)lear,(v)iew, or (q)uit");
               userInput=ui.nextLine();

               if(userInput.equals("a")){
                    System.out.println("add");
                    System.out.println("what pet would you like to add?");
                    userInput=ui.nextLine();
                    petList.add(userInput);
               }else if(userInput.equals("i")){
                    System.out.println(petList);
                    System.out.println("choose ID you want to insert after.(use numbers)");
                    int id = ui.nextInt() - 1;
                    System.out.println("what would you like to add?");
                    newPet = ui.nextLine();
                    newPet = ui.nextLine();
                    petList.add(id, newPet);
                    System.out.println(petList);
                }else if(userInput.equals("r")){
                    System.out.println("remove");
                    System.out.println("what pet woud you like to remove?");
                    userInput=ui.nextLine();
                    petList.remove(userInput);
                }else if(userInput.equals("p")){
                    System.out.println("replace");
                    System.out.println("what would you like to replace(user numbers.)");
                    int id = ui.nextInt() - 1;
                        System.out.println("what would you like to add?");
                        newPet = ui.nextLine();
                        newPet = ui.nextLine();
                        petList.set(id, newPet);
                        System.out.println(petList);
                }else if(userInput.equals("c")){
                    System.out.println("clear");
                    petList.clear();
                }else if(userInput.equals("v")){
                    System.out.println("view");
                    System.out.println(petList);
                }else{
                    System.out.println("Please choose a correct answer");
                }

                //userInput = ui.nextLine();
            }
            System.out.println("bye bye");
        }     
    }