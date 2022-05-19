package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

public class Body {
    char[] type;
    char[] material;

    public Body(char[] type, char[] material) {
        this.type = type;
        this.material = material;
    }

    public char[] getType() {
        return type;
    }

    public char[] getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type=" + Arrays.toString(type) +
                ", material=" + Arrays.toString(material) +
                '}';
    }
}

