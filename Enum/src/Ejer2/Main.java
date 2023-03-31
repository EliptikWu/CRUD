package Ejer2;

public class Main {
    Seasons seasons;

    public Main(Seasons seasons) {
        this.seasons = seasons;
    }

    public void tellItLikeItIs() {
        switch (seasons) {
            case WINTER:
                System.out.println("No mosquitoes.");
                break;

            case SPRING:
                System.out.println("Spring is for walking in comfortable and light clothing.");
                break;

            case AUTUMN:
                System.out.println("The color orange abounds.");
                break;

            default:
                System.out.println("Any season is beautiful.");
                break;
        }
    }

    public static void main(String[] args) {
        Main firstSeason = new Main(Seasons.SPRING);
        firstSeason.tellItLikeItIs();
        Main secondSeason = new Main(Seasons.SUMMER);
        secondSeason.tellItLikeItIs();
        Main lastSeason = new Main(Seasons.WINTER);
        lastSeason.tellItLikeItIs();
    }
}
