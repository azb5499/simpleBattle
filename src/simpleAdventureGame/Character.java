package simpleAdventureGame;

public abstract class Character {
    protected int health;
    protected int defense;
    protected Object weapon; // Corrected the type to Object
    
    public Character() {
    	this.health = 100;
    	this.defense = 100;
    	this.weapon = null ;
    	
    }
    // Constructor
    public Character(int health, int defense, Object weapon) {
        this.health = health;
        this.defense = defense;
        this.weapon = weapon;
    }

    // Getter methods
    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public Object getWeapon() {
        return weapon;
    }
    
    public String getStats() {
    	return "Boingo";
    }

    // Setter methods
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setWeapon(Object weapon) {
        this.weapon = weapon;
    }
}

