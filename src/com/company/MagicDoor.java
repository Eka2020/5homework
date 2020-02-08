package com.company;

public class MagicDoor {
    public Hero[] createHeroes() {
        Hero[] heroes = new Hero[4];
        Hero Warrior = new Hero(250, 30, 20);
        heroes[0] = Warrior;
        Hero Magic = new Hero(260, 30, 30);
        heroes[1] = Magic;
        Hero Kinetic = new Hero(270, 20, 30);
        heroes[2] = Kinetic;
        Hero Tank = new Hero(300, 10, 45);
        heroes[3] = Tank;
        return heroes;
    }
}