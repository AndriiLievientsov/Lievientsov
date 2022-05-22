package ua.ithillel.chernovol.four.ClassesPartTwo;

/**
 * @author Chernovol Alexander
 */
public class Transmission {
    String driveType;
    String gearboxType;

    public Transmission(String driveType, String gearboxType) {
        this.driveType = driveType;
        this.gearboxType = gearboxType;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }
}
