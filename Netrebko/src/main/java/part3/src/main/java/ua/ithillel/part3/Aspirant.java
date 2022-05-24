package ua.ithillel.part3;

public class Aspirant extends Student{
    private String workScientific;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String workScientific) {
        super(firstName, lastName, group, averageMark);
        this.workScientific = workScientific;
    }

    @Override
    public void getScholarship() {
        if(super.averageMark == 5.0){
            System.out.println("Suma 200grn.");
        }else{
            System.out.println("Suma 180grn.");
        }

    }
}
