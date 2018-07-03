package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy3 implements IEnemy {

    //[0] is ID#, [1] is currentHealth, [2] is totalHealth
    private int[] enemyInfo = new int[3];

    public Enemy3(){
        enemyInfo[0] = 3;
        enemyInfo[1] = 30;
        enemyInfo[2] = 30;
    }

    public Enemy3(int[] enemyConstructionState){
        enemyInfo = enemyConstructionState;
    }

    public int GetID(){
        return enemyInfo[0];
    }

    public void UpdateHealth(){
        enemyInfo[1] -= 3;
    }

    public int ReturnCurrentHealth(){
        return enemyInfo[1];
    }

    public int ReturnTotalHealth(){
        return enemyInfo[2];
    }
}
