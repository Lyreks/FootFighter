package io.github.lyreks.footfighter.EnemyClasses;

import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy1;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class EnemyHandler {

    private IEnemy currentEnemy;
    //[0] is currentHealth, [1] is totalHealth
    private int[] enemyInfo = new int[2];

    public EnemyHandler(){
        currentEnemy = new Enemy1();
        enemyInfo[0] = currentEnemy.ReturnCurrentHealth();
        enemyInfo[1] = currentEnemy.ReturnTotalHealth();
    }

    public int[] ReturnInfo(){
        return enemyInfo;
    }

    public int[] Update(){
        currentEnemy.UpdateHealth();
        enemyInfo[0] = currentEnemy.ReturnCurrentHealth();
        enemyInfo[1] = currentEnemy.ReturnTotalHealth();
        return enemyInfo;
    }
}
