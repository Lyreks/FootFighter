package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy3 implements IEnemy {

    private int enemyID;
    private int totalHealth;
    private int currentHealth;
    private boolean damage;

    public Enemy3(){
        totalHealth = 30;
        currentHealth = 30;
        enemyID = 3;
        damage = true;
    }

    public int GetID(){
        return enemyID;
    }

    public void UpdateHealth(){
        if(damage){
            currentHealth -= 3;
        } else {
            currentHealth++;
        }

        damage = !damage;
    }

    public int ReturnCurrentHealth(){
        return currentHealth;
    }

    public int ReturnTotalHealth(){
        return totalHealth;
    }
}
