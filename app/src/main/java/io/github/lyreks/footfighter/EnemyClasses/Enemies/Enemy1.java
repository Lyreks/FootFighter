package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy1 implements IEnemy {

    private int totalHealth;
    private int currentHealth;

    public Enemy1(){
        totalHealth = 100;
        currentHealth = 101;
    }

    public int UpdateCurrentHealth(){
        currentHealth--;
        return currentHealth;
    }

    public int UpdateTotalHealth(){
        return totalHealth;
    }

}
