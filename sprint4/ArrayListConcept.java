package sprint4;

import java.util.ArrayList;

public class ArrayListConcept {
    static void xyz(){
        ArrayList my1 = new ArrayList();
        my1.add(100);
        my1.add("Class");
        my1.add((true));
        System.out.println(my1.get(2));
        System.out.println(my1.size());
        System.out.println(my1.remove(2));
        System.out.println(my1.size());

    }

    public static void main(String[] args) {
        xyz();
    }


    }

