package ua.ithillel.iovchev.four.partTwo;

    /* 5. Создать класс `Transmission`.
       6. В класс `Transmission` добавить:
           - Поля: `driveType (char[])`, `gearboxType (char[])`.
           - Конструктор, который принимает все свойства класса.
           -  `getter`-ы для всех полей.*/

public class Transmission {


    private char[] driveType;
    private char[] gearboxType;

    public Transmission(char[] driveType, char[] gearboxType) {
        this.driveType = driveType;
        this.gearboxType = gearboxType;
    }

    public char[] getDriveType() {
        return driveType;
    }

    public char[] getGearboxType() {
        return gearboxType;
    }
}
