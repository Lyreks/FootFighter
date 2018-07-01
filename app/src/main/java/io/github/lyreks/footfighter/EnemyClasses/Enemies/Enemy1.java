package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy1 implements IEnemy {

    private int totalHealth;
    private int currentHealth;

    public Enemy1(){
        totalHealth = 100;
        currentHealth = 100;
    }

    public void UpdateHealth(){
        currentHealth--;
    }

    public int ReturnCurrentHealth(){
        return currentHealth;
    }

    public int ReturnTotalHealth(){
        return totalHealth;
    }
}
