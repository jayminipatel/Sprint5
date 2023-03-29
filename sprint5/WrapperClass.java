package sprint5;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int a= 15;
        // p to w
    Integer aa = new Integer(a);// Boxing
       // or
     Integer bb =a; // autoboxing wrapper class

    // w to p
 int b = bb.intValue();//unboxing
        // or
     int c= bb; //Auto unboxing

    }
}
