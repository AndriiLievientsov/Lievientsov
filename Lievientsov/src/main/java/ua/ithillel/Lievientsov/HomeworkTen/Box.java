package ua.ithillel.Lievientsov.HomeworkTen;

public class Box implements Interface {
    private int width;
    private int height;
    private int length;

    @Override
    public void print() {

    }
    @AnnotationOne
    public Box() {

    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int getValue() {
        return width * height * length;
    }

    //внутрений класс
    static class Content {
        private final String name;

        Content(String name) {
            this.name = name;
        }
        public void displayContent() {
            System.out.printf("Content" + name);
        }
    }
}
