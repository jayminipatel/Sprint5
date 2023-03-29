package sprint4;

public class OneDimensionalArray {
    public static void main(String[] args) {
        //int arrays

        //  int a[]= new int[5];
        //   a[0]=10;
        //  a[1]= 20;
        //  a[2]= 30;
        //   a[3]=40;
        //   a[4]=50;
        //  System.out.println(a[0]);
        // System.out.println(a[1]);
        //  System.out.println(a[2]);
        //  System.out.println(a[3]);
        //  System.out.println(a[4]);
        //  System.out.println("a="+a[0]);
        //  System.out.println("a="+a[1]);
        // System.out.println("a="+a[2]);
        // System.out.println("a="+ a[3]);
        //  System.out.println("a="+ a[4]);
        //   for (int i=0;i<5;i++){
        //      System.out.println("A="+a[i]);

        //String Array

        //  String name[] = new String[4];
        //  name[0]= "one";
        //  name[1]= "two";
        // name[2]= "three";
        // name[3]= "four";
        // System.out.println(name[0]);
        //  System.out.println(name[1]);
        // System.out.println(name[2]);
        // System.out.println(name[3]);

        // for (int i =0;i<name.length;i++){
        //   System.out.println("name="+name[i]);

        //Object array
        Object Student[] = new Object[5];
        Student[0] = 10;
        Student[1] = 'J';
        Student[2] = "NAME";
        Student[3] = 11.5;
        Student[4] = 4;
        for (int i = 0; i < Student.length; i++) {
            System.out.println("student= " + Student[i]);

        }

    }
}

