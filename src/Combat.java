import java.util.Scanner;

public class Combat {

    private UI enemy;
    private Character_Creation character;
    private Map_Creation map;
    private Scanner combat_scanner;
    private String[] duelists;

    public Combat(UI enemy, Character_Creation character, Map_Creation map){
        this.enemy = enemy;
        this.character = character;
        this.map = map;;
    }


    
}
