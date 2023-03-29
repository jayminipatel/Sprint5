package sprint5;

public class AbsTest {
    public static void main(String[] args) {
        AbsReg obj =new AbsReg();
        obj.staff();
        obj.Hospital();
        obj.nurse("tester",125);

        obj.patient();
        obj.doctor();
    }
}
