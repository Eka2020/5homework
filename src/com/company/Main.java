package com.company;

public class Main{

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealthBoss(700);
        boss.setDamageBoss(50);
        boss.setDefenceType(40);
        System.out.println("Босс " + "запас жизни " + boss.getHealthBoss() + ", сила атаки " + boss.getDamageBoss() +
                ", степень защиты " + boss.getDefenceType());
    }

}
