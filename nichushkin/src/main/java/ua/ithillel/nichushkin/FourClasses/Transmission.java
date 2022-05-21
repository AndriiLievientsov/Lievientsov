package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

public class Transmission {
    char[] driveType;
    char[] gearboxType;

    public Transmission(char[] driveType, char[] gearboxType){
        this.driveType = driveType;
        this.gearboxType = gearboxType;
    }

    public char[] getDriveType(){
        return driveType;
    }

    public char[] getGearboxType(){
        return gearboxType;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "driveType=" + Arrays.toString(driveType) +
                ", gearboxType=" + Arrays.toString(gearboxType) +
                '}';
    }
}
