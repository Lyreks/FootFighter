package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy1 implements IEnemy {

    private int enemyID;
    private int totalHealth;
    private int currentHealth;

    public Enemy1(){
        totalHealth = 10;
        currentHealth = 10;
        enemyID = 1;
    }

    public int GetID(){
        return enemyID;
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
