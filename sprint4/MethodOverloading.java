package sprint4;

public class MethodOverloading {
    static int my1(int a,int b){
        return a+b;

    }
    static double my1 (double a,double b){
        return a+b;

    }

    public static void main(String[] args) {
        int total =my1(8,5);
        System.out.println(total);
        double result = my1(8.9,5.7);
        System.out.println(result);



    }
}
