package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy2 implements IEnemy {

    private int enemyID;
    private int totalHealth;
    private int currentHealth;

    public Enemy2(){
        totalHealth = 20;
        currentHealth = 20;
        enemyID = 2;
    }

    public int GetID(){
        return enemyID;
    }

    public void UpdateHealth(){
        currentHealth -= 2;
    }

    public int ReturnCurrentHealth(){
        return currentHealth;
    }

    public int ReturnTotalHealth(){
        return totalHealth;
    }
}
