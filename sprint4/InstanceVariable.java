package sprint4;

public class InstanceVariable {
    //Declare variables outside the local method.
    int a;
    String name;
    void my1(){
        int a = 18;

    }
    void my2(){
        double d = 15.3;

    }

    public static void main(String[] args) {
        InstanceVariable obj= new InstanceVariable();
        //Assign the value into Ref variable
        obj.a = 10;
        obj.name = "Automation";
        System.out.println(obj.a);
        System.out.println(obj.name);

    }

}
