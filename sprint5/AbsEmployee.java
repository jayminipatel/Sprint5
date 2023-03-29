package sprint5;

public abstract class AbsEmployee {
    //staff
    //patient
    //Hospital

    public abstract void staff();

    public abstract void patient();
    public abstract void Hospital();

    public void doctor(){
        System.out.println("Doctors are on duty");
    }
}
