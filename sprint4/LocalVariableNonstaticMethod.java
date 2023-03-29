package sprint4;

public class LocalVariableNonstaticMethod {
    //Create Nonstatic Method
    void my1(){
        int a =20;
        double d= 4.5;
       System.out.println(a);
       System.out.println(d);
       System.out.println(a+d);
       System.out.println(a+","+d);


    }
    void my2(){
        int a= 45;
        double e=4.7;
       System.out.println(a);
       System.out.println(e);
       System.out.println(a+" ,"+e);


    }
    void my3(){
        String name = "I am a tester";
        System.out.println(name);

    }

    public static void main(String[] args) {
        //Create object
        LocalVariableNonstaticMethod obj = new LocalVariableNonstaticMethod();
        obj.my1();
        obj.my2();
        obj.my3();
    }
}
