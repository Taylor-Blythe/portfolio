import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
        ArrayList<Student> classroom = new ArrayList<Student>();

        classroom.add(new Student("ty",9));
        classroom.add(new Student("zander",0));
        classroom.add(new Student("blake",10));
        classroom.add(new Student("ben",7));
        classroom.add(new Student("pohl",5));
        classroom.add(new Student("steckler",107));
        classroom.add(new Student("owen",50));
        classroom.add(new Student("sam",1));
        classroom.add(new Student("landon",82));
        classroom.add(new Student("steckler",107));

        printClass(classroom);
        System.out.println(maxGrade(classroom));
        System.out.println(classroom.size());
        System.out.println(minGrade(classroom));
        System.out.println(aveperct(classroom));
        // System.out.println(printTitleCase(classroom));
        System.out.println(stDev(classroom));
        // System.out.println(duplicate(classroom));


    }
        //Modify our name print outs to make sure they are TitleCase
        public static void printTitleCase(ArrayList<Student> c){
            for(int i=0;i<c.size();i++){
                String name = c.get(i).getName();
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                System.out.println(name);
            }
        }
        //find standard deviation of scores
        public static Double stDev(ArrayList<Student> c){
            double mean = aveperct(c);
            double totalDev = 0;
            for(int i=0;i<c.size();i++){
                totalDev = Math.pow(c.get(i).getGrade() - mean,2);
            }
            return Math.sqrt(totalDev/c.size());

        }

        //find duplicate students
        public static void duplicate(ArrayList<Student> c){
            ArrayList<String> names = new ArrayList<String>();
            for(int i=0;i!=c.size(); i++){
                names.add(c.get(i).getName());
                    if(names.contains(c.get(i).getName()));
            }
        }

        //find mode
        public static int mode(ArrayList<Integer> temp){
            //finding the most frequent number
            //find the unique values....
            ArrayList<Integer> uniqueList = new ArrayList<Integer>();
            uniqueList=removeDuplicates(temp);
  
            //create a list of 0's that will count the amount of items in unique list
            ArrayList<Integer> countList = new ArrayList<Integer>();
            // countList=createArrayList(new int[uniqueList.size()]);
            //for each for loop
            for(int n: uniqueList){            //for(item in uniqueList)
                 countList.add(0);
            }
  
            //iterate through the uniqueList and count the frequency...
            for(int n:uniqueList){
                 int c = count(temp,n);
                 countList.set(uniqueList.indexOf(n),c);
            }
  
            //find the max value in the countList
            int modeValue = maxIntAL(countList);
  
            //set mode to the index of uniqueList[countList]
            int mode = uniqueList.get(countList.get(modeValue));
  
            return mode;
       }
        //output will be each student
        //min grade
        public static String minGrade(ArrayList<Student> c){
            int mingrade = Integer.MIN_VALUE;
            String minname = "";
            for(int i=0;i<c.size();i++){
                String curname = c.get(i).getName();
                int curgrade = c.get(i).getGrade();
                if(curgrade<mingrade){
                    mingrade = curgrade;
                    minname = curname;
                }

            }
            return minname;
        }
        //max grade
        public static String maxGrade(ArrayList<Student> c){
            int maxgrade = Integer.MAX_VALUE;
            String maxname = "";
            for(int i=0;i<c.size();i++){
                String curname = c.get(i).getName();
                int curgrade = c.get(i).getGrade();
                if(curgrade>maxgrade){
                    maxgrade = curgrade;
                    maxname = curname;
                }

            }
            return maxname;
        }
        //average grade of students
        public static int aveperct(ArrayList<Student> c){
            int avg = 0;

            for(int i=0;i<c.size();i++){
                avg += c.get(i).getGrade();


            }
            avg = avg/c.size();

            return avg;
        }
        //count of students
    
    
    public static void printClass (ArrayList<Student> c){
        for(int i=0;i<c.size(); i++){
            System.out.println(c.get(i));
        }
    }
}