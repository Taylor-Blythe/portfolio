import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
        for(int x=0;x!=3;x++){
            for(int y=2;y>=0;y-=1){
                if((x==2)&&(y==0)){
                System.out.print(y);
            }
            else{
            System.out.print(y+",");
            }
        }
    }
    }
}