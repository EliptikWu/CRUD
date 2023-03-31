package Ejer1;

public class Ejercicio1 {
    public enum Season { WINTER, SPRING, SUMMER, AUTUMN }
    public static void main(String[] args) {
        for (Season s : Season.values()){
            System.out.println(s);
        }
        System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());

    }
}
