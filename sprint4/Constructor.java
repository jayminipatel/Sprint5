package sprint4;

public class Constructor {
    int a = 20;

    Constructor() {
        a = 10;

        a = 25;

    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println(obj.a);


    }
}
