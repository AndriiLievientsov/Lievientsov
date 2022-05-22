package ua.ithillel.natochin.four.partthree.student;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private Double averageMark;

    public Student (String firstName, String lastName, String group, Double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark(){
        return this.averageMark;
    }

    public Double getScholarship(){
        return this.getAverageMark() == 5 ? 100.0 : 80.0;
    }


    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + ", (get scholarship " + this.getScholarship() + ")";
    }
}
