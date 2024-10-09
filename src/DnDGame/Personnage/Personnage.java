package DnDGame.Personnage;

import DnDGame.EquipementDefensif.EquipementDefensif;
import DnDGame.EquipementOffensif.EquipementOffensif;

public abstract class Personnage {

    protected String name;
    protected int typeNumber;
    protected String type;
    protected int healthPoints;
    protected int strengthPoints;
    protected EquipementOffensif offensiveEquipment;
    protected EquipementDefensif defensiveEquipment;

    public Personnage(){
    }

    public Personnage(String name){
        this.name = name;
    }

    public Personnage(String type, String name){
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return this.healthPoints;
    }

    public void setHP(int hp) {
        this.healthPoints = hp;
    }

    public int getStrength() {
        return this.strengthPoints;
    }

    public void setStrength(int strength) {
        this.strengthPoints = strength;
    }

    public abstract String getType();

    public String toString() {
        String message = "Votre avatar s'appelle "+ name + "." +
                "\n C'est un " + getType() + "." +
                "\n Il attaque avec un/e " + offensiveEquipment + " et se défend avec un/e " + defensiveEquipment + ".";

        return message;
    }
}
