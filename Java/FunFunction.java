public class FunFunction{
    //python we created f(x) up here -> in java, do this at the bottom
    //java initializes your global var here
    public static void main(String[] args){
        // static funtions
        // a function that doesn't change
        // print() int() input() classname.method()

        int s = addTwoNumbers(2,2);
        FunFunction.addTwoNumbers(2,2);
        System.out.println(s);
    }
    //synchronous -> runs from top down
    //asynchronous -> not running form top down
    //                               int and int b are local variables
    // public static void addTwoNumbers(int a, int b){
        //public -> Anything can access it/open to public
        //private -> only items on this file or objects can access it
        //static -> is no oject required
        //void -> empty/nothing/epty return, doesn't return*
        // System.out.println(a+b);

    // }
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static void addTwoNumbers(int a, int b, int c){
        System.out.println(a+b);
    }


    public static void addThreeNumbers(int a, int b, int c){
        // a,b,c are local so they can be reused in addTwoNumbers
    }
    public static String addTwoNumbers(int a, String b) {
        return a+b;
    }
    public static String addTwoNumbers(int a) {
        return "$"+a+".00";
    }
}