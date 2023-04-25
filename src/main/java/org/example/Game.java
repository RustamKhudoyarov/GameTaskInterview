package org.example;

public class Game {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Rustam", 100, 50);
        warrior.heal(20);
        warrior.takeDamage(99);
        warrior.examine();
    }

}
