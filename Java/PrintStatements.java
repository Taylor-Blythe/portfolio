public class PrintStatements {
    public static void main(String[] args) {
        print("hello world");
        print(7);
        print('H');
    }
    public static void print(String stuff ) {
        System.out.println(stuff);

    }
    public static void print(int stuff ) {
        System.out.println(stuff);
        
    }
    public static void print(char stuff) {
        System.out.println(stuff);
        
    }
    public static String addTwoNumbers(int a, String b) {
        return a+b;
    }
    public static String addTwoNumbers(int a) {
        return "$"+a+".00";
    }
}