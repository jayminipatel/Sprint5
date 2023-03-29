package inheritance;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Parental class");
        VegFood obj = new VegFood();
        obj.cooking();
        obj.Digestion();
        obj.healthy();
        obj.Vitamins();
        obj.Energy();

        System.out.println("child class");
        Rice b = new Rice();
        b.cooking();
        b.Digestion();
        b.healthy();
        b.Vitamins();
        b.Energy();

        System.out.println("Child class");
        Pulav p = new Pulav();
        p.cooking();
        p.Digestion();
        p.healthy();
        p.Vitamins();
        p.Energy();

        System.out.println("child class");
        NonVegFood n = new NonVegFood();
        n.CookingTime();




    }
}
