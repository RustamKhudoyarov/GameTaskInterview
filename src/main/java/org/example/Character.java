package org.example;

public abstract class Character {
    private String name;
    protected int health = 10;
    protected int maxHealth = health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void  examine() {
    }
}
