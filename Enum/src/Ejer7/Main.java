package Ejer7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> temperature = new ArrayList<>();

        // Add elements to the list
        temperature.add(15);
        temperature.add(30);
        temperature.add(22);
        System.out.println("List: " + temperature);

        // Access element from the list
        Integer grade = temperature.get(2);
        System.out.println("Accessed Element: " + grade);

        // Remove element from the list
        Integer removedGrade = temperature.remove(1);
        System.out.println("Removed Element: " + removedGrade);
    }
}