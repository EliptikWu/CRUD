package Ejer9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> comida = new ArrayList<>();

        String comida1 = "Arroz Paisa";

        comida.add(comida1);

        boolean containsElement =
                comida.contains("Empanada");

        System.out.println(containsElement);
    }


}