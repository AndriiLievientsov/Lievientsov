package ua.ithillel.chernovol.four.ClassesPartTwo;

/**
 * @author Chernovol Alexander
 */

public class Body {
    String type;
    String material;

    public Body(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
