package sprint4;

public class LocalVariableStaticMethod {
    //Create Local Variables
    static void my1(){
        int a =15;
        String name = "Practice";
      System.out.println(a);
      System.out.println(name);
      System.out.println( a+" ,"+name);

    }
    static void my2(){
        double d= 56.2;
        System.out.println(d);

    }

    public static void main(String[] args) {
        my1();
        my2();
    }
}
