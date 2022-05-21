package ua.ithillel.natochin.four.parttwo.car.parts;

import java.util.Arrays;

public class Body {
    private char[] type;
    private char[] material;

    public Body(String type, String material){
        this.type = type.toCharArray();
        this.material = material.toCharArray();
    }
    public char[] getType(){
        return this.type;
    }

    public char[] getMaterial(){
        return this.material;
    }

    @Override
    public String toString(){
        return "Body type " + Arrays.toString(this.getType()) + " made of " + Arrays.toString(this.getMaterial());
    }
}
