package Ejer5;

public enum Time {
    MORNING("6 a.m. to 12 a.m."),
    AFTERNOON("12 am. until 6 pm."),
    EVENING("6 pm Until 10 o'clock p.m."),
    NIGHT("from 10 p.m. until 6 a.m.");

    private final String TimeLevel;

    private Time(String timeLevel) {
        this.TimeLevel = timeLevel;
    }

    public String getTimeLevel() {
        return TimeLevel;
    }
}

class Main {
    public static void main(String[] args) {
        Time time = Time.AFTERNOON;
        System.out.println(time.getTimeLevel());
    }
}
