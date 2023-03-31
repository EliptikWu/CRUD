package Ejer3;

public enum Lore {
    Epic  (3),
    Rare (2),
    Common (1);


    private final int levelCode;

    private Lore(int levelCode){ this.levelCode = levelCode;}

    public int getLevelCode() {
        return levelCode;
    }
}
class Main {
    public static void main(String[] args) {
        Lore size = Lore.Common;
        System.out.println(size.getLevelCode());
    }
}
