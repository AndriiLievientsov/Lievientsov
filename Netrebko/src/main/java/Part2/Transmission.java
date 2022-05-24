package Part2;

public class Transmission {
    private String driveType;
    private String gearboxType;

    public Transmission(String driveType, String gearboxType) {
        this.driveType = driveType;
        this.gearboxType = gearboxType;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getGearboxType() {
        return gearboxType;
    }
}
