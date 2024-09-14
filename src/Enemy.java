import java.util.ArrayList;

public class Enemy {
    private int enemyId;
    private String enemyName;
    private String enemySpecialisation;
    private int enemyDamage;
    private int enemyHealth;

    public Enemy(int enemyId, String enemyName, String enemySpecialisation, int enemyDamage, int enemyHealth){
        this.enemyId = enemyId;
        this.enemyName = enemyName;
        this.enemySpecialisation = enemySpecialisation;
        this.enemyDamage = enemyDamage;
        this.enemyHealth = enemyHealth;

    }

    public String getEnemyName(){
        return this.enemyName;
    }

    public String getEnemySpecialisation(){
        return this.enemySpecialisation;
    }

    public int getEnemyDamage(){
        return this.enemyDamage;
    }

    public int getEnemyHealth(){
        return this.enemyHealth;
    }

    public int getEnemyId(){
        return this.enemyId;
    }

    public String toString(){
        return "Enemy id: " + this.enemyId + ", Enemy name: " + this.enemyName + ", Enemy specialisation: " + this.enemySpecialisation + ", Enemy damage: " + this.enemyDamage + ", Enemy health: " + this.enemyHealth;
    }

}
