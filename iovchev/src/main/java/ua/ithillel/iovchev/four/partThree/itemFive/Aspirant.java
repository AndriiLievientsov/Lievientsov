package ua.ithillel.iovchev.four.partThree.itemFive;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }
}
