package ua.ithillel.Lievientsov.HomeworkFive.PartTwo;

//5. Создать класс `Transmission`.
//6. В класс `Transmission` добавить:
//   - Поля: `driveType (char[])`, `gearboxType (char[])`.
//   - Конструктор, который принимает все свойства класса.
//   -  `getter`-ы для всех полей.

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
