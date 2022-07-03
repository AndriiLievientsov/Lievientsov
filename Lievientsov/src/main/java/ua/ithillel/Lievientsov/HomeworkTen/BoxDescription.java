package ua.ithillel.Lievientsov.HomeworkTen;

public class BoxDescription  extends Box{
    private String description;

    public BoxDescription(int width, int height, int length, String description) {
        super(width, height, length);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
