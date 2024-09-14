import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UI {

    private Character_Creation myCharacter;
    private ArrayList<Character_Creation>characterList;
    private ArrayList<Enemy> enemyList;
    private ArrayList<Enemy>enemyInUSe;
    private Scanner characterScanner;
    private ArrayList<Locations>map;

    public UI(Scanner characterScanner){

        characterList = new ArrayList<>();
        enemyInUSe = new ArrayList<>();
        enemyList = new ArrayList<>();
        map = new ArrayList<>();
        this.characterScanner = characterScanner;
    }

    // method for printing messages and saving user input
    public String promptUser(String message){
        System.out.println(message);
        return characterScanner.nextLine();
    }

    // creating character
    public void createCharacter(){
        while (true){
            System.out.println("Do you want to create anew character ? y/n");
            String command = characterScanner.nextLine();
            if (command.equalsIgnoreCase("n")){
                if (characterList.isEmpty()){
                    System.out.println("No character created, exit the game");
                    break;
                }else {
                    System.out.println("There are your characters:\n" + characterList);
                    break;
                }
            }


            String characterName = promptUser("What is the name of your character ?");
            if (characterName.isEmpty()){
                System.out.println("Wrong input, please try again");
                continue;
            }


            String characterSpecialisation = promptUser("What is your character's specialisation ?");
            if (characterSpecialisation.isEmpty()){
                System.out.println("Wrong input, please try again");
                continue;
            }


            String characterSex = promptUser("M or F");
            if (characterSex.isEmpty()){
                System.out.println("Wrong input, please try again");
                continue;
            }


            String characterMoral = promptUser("What is the moral of your character ?");
            if (characterMoral.isEmpty()){
                System.out.println("Wrong input, please try again");
                continue;
            }

            String character_damage_string = promptUser("What is the damage of you character ?");
            if (character_damage_string.isEmpty()){
                System.out.println("Wrong input, please tray again");
                continue;
            }
            int character_damage = Integer.parseInt(character_damage_string);

            String character_health_string = promptUser("What is the health of you character?");
            if (character_health_string.isEmpty()){
                System.out.println("Wrong input");
            }
            int character_health = Integer.parseInt(character_health_string);

            characterList.add(new Character_Creation(characterName, characterSpecialisation, characterSex, characterMoral, character_damage, character_health));
            System.out.println("Character saved");
        }
    }

    // creating enemies
    public void creatingEnemies(){

        System.out.println("Creating enemies...");
        enemyList.add(new Enemy(0,"Goblin", "Warrior", 10, 100));
        enemyList.add(new Enemy(1,"Imp","Thief", 15, 120));
        enemyList.add(new Enemy(2,"Orc", "Berserk", 25, 180));
        enemyList.add(new Enemy(3,"Shadow", "Mage", 35, 220));
        enemyList.add(new Enemy(4,"Wargest", "Hunter", 40, 250));
        enemyList.add(new Enemy(5,"Gaxanng", "Boss", 50, 500));
    }

    // adding enemies to the game
    public void setEnemy(){
        characterScanner = new Scanner(System.in);
        System.out.println("How many enemies in the game ?");
        int numOfEnemies = characterScanner.nextInt();
        characterScanner.nextLine();

        for (int i = 0; i < numOfEnemies; i++){
            Random randInt = new Random();
            int randomNum = randInt.nextInt(enemyList.size());

            Enemy selectedEnemy = enemyList.get(randomNum);
            if (selectedEnemy.getEnemyId() == 5){
                if (enemyInUSe.contains(selectedEnemy)){
                    i--;// If boss is already in the list, do not count this iteration
                }else {
                    enemyInUSe.add(selectedEnemy);
                    enemyList.remove(selectedEnemy);// remove from enemyList to prevent duplicates
                }
            }else {
                enemyInUSe.add(selectedEnemy);// allow duplicates for non-boss enemies
            }
        }
        System.out.println("Adding enemies to the game...");
        System.out.println(enemyInUSe);

    }

    // setting map
    public void setMap(){
        System.out.println("Create a map for your game");
        while (true){

            String locationName = promptUser("Set a location name");
            if (locationName.isEmpty()){
                System.out.println("An empty input, please try again");
                continue;
            }

            String region = promptUser("Set a region of " + locationName);
            if (region.isEmpty()){
                System.out.println("An empty input, please try again");
                continue;
            }

            System.out.println("Set a threat level (0 -5)");
            int threatLevel = -1; // initialising this variable so it is accessible for catch
                                  // and for the catch block
                                  // -1 value is just for error handling, any other int value possible
            try{
                threatLevel = characterScanner.nextInt();
                if (threatLevel < 0 || threatLevel > 5){
                    System.out.println("Wrong input, (0-5), please try again");
                    continue;
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input, please enter a number between 0 and 5");
                continue;
            }

            characterScanner.nextLine();

            map.add(new Locations(locationName, region, threatLevel));
            System.out.println("Location saved");


            String command = promptUser("Do you want to add another location ? (y/n)");
            if (command.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println(map);
    }

    // printing enemies in the game
    public String printEnemies(){
        String printEnemy = "";
        for (Enemy enemy : enemyInUSe){
            printEnemy = printEnemy + enemy + "\n";
        }
        return printEnemy;
    }

    // printing characters in the game
    public String printCharacters(){
        String printCharacter = "";
        for (Character_Creation character : characterList){
            printCharacter = printCharacter + character +  "\n";
        }
        return printCharacter;
    }
}
