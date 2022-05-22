package ua.ithillel.natochin.four.partthree.student;

public class Aspirant extends Student {
    private String scienceWorkName;

    public Aspirant(String firstName, String lastName, String group, Double averageMark, String scienceWorkName){
        super (firstName, lastName, group, averageMark);
        this.scienceWorkName = scienceWorkName;
    }

    @Override
    public Double getScholarship(){
        return this.getAverageMark() == 5 ? 200.0 : 180.0;
    }
}
