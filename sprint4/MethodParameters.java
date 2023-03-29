package sprint4;

public class MethodParameters {

    static void my1(int a,String name){
        System.out.println(a+" "+name);

    }
    //create nonstatic method parameters
    void my2(int number,String name){
        System.out.println(number+" "+name);





    }

    public static void main(String[] args) {
       // System.out.println(10+" "+"Tester");
        MethodParameters obj = new MethodParameters();
        obj.my2(2023,"March");


    }
}
