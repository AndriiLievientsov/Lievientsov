package ua.ithillel.natochin.four.parttwo.car.parts;

import java.util.Arrays;

public class Transmission {
    private char[] driveType;
    private char[] gearboxType;

    public Transmission(String driveType, String gearboxType){
        this.driveType = driveType.toCharArray();
        this.gearboxType = gearboxType.toCharArray();
    }

    public char[] getDriveType(){
        return this.driveType;
    }

    public char[] getGearboxType(){
        return this.gearboxType;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.getDriveType()) + " drive and " + Arrays.toString(this.getGearboxType()) + " gear.";
    }
}
