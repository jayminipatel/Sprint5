package sprint4;

public class NonstaticMethod {
    void my1(){
        int a= 14;
        System.out.println(a);

    }

    public static void main(String[] args) {
        //Create object
        NonstaticMethod obj= new NonstaticMethod();
        obj.my1();
    }
}
