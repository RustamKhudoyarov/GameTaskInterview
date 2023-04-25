package org.example;

public class Warrior extends Character {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }
    public Warrior(String name) {
        super("Vannaka");

    }

    public void heal(int hpHealed) {
        int health = super.health + hpHealed;

    }

    public void takeDamage(int dmgTaken) {
        int remainHealth = super.health - dmgTaken;
    }

    @Override
    public void examine() {
        System.out.println(String.format("My name is %s", getName()));
    }
}
