package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT = 20;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAttack * (1 - hero.physDef);
        if(hero.health - attackScore < MIN_HEALTH){
            hero.health -= attackScore;
            hero.health = MIN_HEALTH;
        }else {
            hero.health -= attackScore;
        }
    }

}
