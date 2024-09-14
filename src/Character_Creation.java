import java.util.Scanner;

public class Character_Creation {

    private String name;
    private String specialisation;
    private String sex;
    private String moral;
    private int character_damage;
    private int character_health;

    public Character_Creation(String name, String specialisation, String sex, String moral, int character_damage, int character_health){
        this.name = name;
        this.specialisation = specialisation;
        this.sex = sex;
        this.moral = moral;
        this.character_damage = character_damage;
        this.character_health = character_health;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecialisation(){
        return this.specialisation;
    }

    public String getSex(){
        return this.sex;
    }

    public String getMoral(){
        return this.moral;
    }

    public int getCharacter_damage(){
        return this.character_damage;
    }

    public int getCharacter_health(){
        return this.character_health;
    }

    public String toString(){
        return "Character name: " +  this.name + ", Specialisation: " + this.specialisation + ", Sex: " + this.sex + ", Moral: " + this.moral + "Health" + this.character_health;
    }
}
