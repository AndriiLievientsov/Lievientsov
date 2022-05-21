package ua.ithillel.nichushkin.FourClasses;


public class Aspirant extends Student{
    private boolean scientificPaper = true;
    //    public Aspirant(){
//    }
    public Aspirant(String firstName, String lastName, String group,
                    int averageMark, boolean scientificPaper){
        super(firstName, lastName, group, averageMark);
        this.scientificPaper = scientificPaper;
    }
    public double getScholarship(int averageMark) {
        double resault = 0;
        if (averageMark == 5) {
            resault = 200;
        } else {
            resault = 180;
        }
        return resault;
    }

    @Override
    public String toString() {
        return "Аспирант: " + "Имя:" + getFirstName() +
                ", Фамилия: " + getLastName() +
                ", группа = " + getGroup() +
                ", средний бал = " + getAverageMark() +
                ", cтепендия составляет: " + getScholarship(getAverageMark()) + " грн" + "\n";

    }
}
