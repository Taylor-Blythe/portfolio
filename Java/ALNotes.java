import java.util.ArrayList;
import java.util.Scanner;
public class ALNotes{
    public static void main(String[] args) {
        
        // int[] numbers = new ,int[10];
        // int[] numbers = {1,2,34,5,6,7,8,9,10};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Class<DataType> objName = new Constructor<DataType>();
        
        
        //Create
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jonah");
        names.add("Zander");
        names.add("Ben");
        names.add("Parker");
        names.add("Ty");
        names.add(2,"Blake");
        System.out.println(names);
        //Read
        System.out.println(names.get(4));
        //Update
        //Python names[i]=newData
        names.set(1,"Owen");
        //Delete
        names.remove("Owen");
        names.remove("Blake");
        System.out.println(names);
        names.clear(); //erase all data from ArrayList

        //length of my ArrayList
        System.out.println(names.size());

        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("7");
        row1.add("8");
        row1.add("9");
        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("4");
        row2.add("5");
        row2.add("6");
        ArrayList<String> row3 = new ArrayList<String>();
        row3.add("1");
        row3.add("2");
        row3.add("3");
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);


        /*
         * 7 8 9
         * 4 5 6
         * 1 2 3
         */

    }
}