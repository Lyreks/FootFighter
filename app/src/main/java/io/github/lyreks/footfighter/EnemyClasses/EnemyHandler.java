package io.github.lyreks.footfighter.EnemyClasses;

import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy1;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class EnemyHandler {

    private IEnemy currentEnemy;
    //[0] is currentHealth, [1] is totalHealth
    private int[] enemyHealth;

    public EnemyHandler(){
        currentEnemy = new Enemy1();
    }

    public int[] Update(){
        enemyHealth[0] = currentEnemy.UpdateCurrentHealth();
        enemyHealth[1] = currentEnemy.UpdateTotalHealth();
        return enemyHealth;
    }
}
