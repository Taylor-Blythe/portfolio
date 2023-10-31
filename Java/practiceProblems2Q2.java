public class practiceProblems2Q2 {
    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 1;
        double x3 = 2; 
        double x4 = 3;
        double x5 = 4;
        double x6 = 2;
        double x7 = 4;
        double x8 = 6;
        double x9 = 10;
        double x10 = 12;

        double y1 = 0;
        double y2 = 4;
        double y3 = 7;
        double y4 = 9;
        double y5 = 11;
        double y6 = 1;
        double y7 = 2;
        double y8 = 3;
        double y9 = 5;
        double y10 = 7;

        double mid1 = (x1+x6)/2;
        double mid2 = (x2+x7)/2;
        double mid3 = (x3+x8)/2;
        double mid4 = (x4+x9)/2;
        double mid5 = (x5+x10)/2;

        double mid6 = (y1+y6)/2;
        double mid7 = (y2+y7)/2;
        double mid8 = (y3+y8)/2;
        double mid9 = (y4+y9)/2;
        double mid10 = (y5+y10)/2;


        System.out.printf("a\t\tb\t\tMiddle Point\n(%s,%s)\t(%s,%s)\t(%s,%s)\n(%s,%s)\t(%s,%s)\t(%s,%s)\n(%s,%s)\t(%s,%s)\t(%s,%s)\n(%s,%s)\t(%s,%s)\t(%s,%s)\n(%s,%s)\t(%s,%s)\t(%s,%s)\n\t\n",x1,y1,x6,y6,mid1,mid6,x2,y2,x7,y7,mid2,mid7,x3,y3,x8,y8,mid3,mid8,x4,y4,x9,y9,mid4,mid9,x5,y5,x10,y10,mid5,mid10);

        

    }
}