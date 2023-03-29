package sprint4;

public class ConstructorParameters {
    int modelnumber = 1256;

    String modelname = "BMW";

    ConstructorParameters(int number,String name){
        modelnumber = 1000;

        modelname = "TOYOTA";


    }

    public static void main(String[] args) {
            ConstructorParameters obj = new ConstructorParameters(1000,"TOYOTA");
        System.out.println(obj.modelnumber+" "+obj.modelname);


    }

}
