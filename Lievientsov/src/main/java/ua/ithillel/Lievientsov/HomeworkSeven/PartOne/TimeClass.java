package ua.ithillel.Lievientsov.HomeworkSeven.PartOne;
/*- Создать класс для представления времени. Предусмотреть возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей выбрасываются исключения.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class TimeClass {
    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args) {
        TimeClass timeClass = new TimeClass(10, 15, 22);
        System.out.println(timeClass);
        timeClass.addHour(23);
        System.out.println(timeClass);
        timeClass.addMinute(190);
        System.out.println(timeClass);
        timeClass.addSecond(20670);
        System.out.println(timeClass);
    }

    public TimeClass(int hour, int minute, int second) {
        try {
            if (!(hour >= 0 && hour <= 23)) {
                throw new IllegalArgumentException("Hour must be from 0 to 23.");
            }
            if (!(minute >= 0 && minute <= 59)) {
                throw new IllegalArgumentException("Minute must be from 0 to 59.");
            }
            if (!(second >= 0 && second <= 59)) {
                throw new IllegalArgumentException("Second must be from 0 to 59.");
            }
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e);
        }
    }

    public void addHour(int hour) {
        if ((this.hour + hour) > 24){
            throw new IllegalArgumentException("\nWrong number entered.\nHour must be from 0 to 23.");
        }
        this.hour = this.hour + hour;
    }

    public void addMinute(int minute) {
        if ((this.minute + minute) >= 60) {
            addHour((this.minute + minute) / 60);
            this.minute = (this.minute + minute) % 60;
        } else {
            this.minute = this.minute + minute;
        }
    }

    public void addSecond(int second) {
        if ((this.second + second) >= 60) {
            addMinute((this.second + second) / 60);
            this.second = (this.second + second) % 60;
        } else {
            this.second = this.second + second;
        }
    }

    public String toString() {
        return "Time: " + hour + ":" + minute + ":" + second;
    }
}
