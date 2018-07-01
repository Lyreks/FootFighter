package io.github.lyreks.footfighter.EnemyClasses;

import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy1;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class EnemyHandler {

    private IEnemy currentEnemy;
    //[0] is currentHealth, [1] is totalHealth
    private int[] enemyHealth = new int[2];

    public EnemyHandler(){
        currentEnemy = new Enemy1();
        enemyHealth[0] = currentEnemy.ReturnCurrentHealth();
        enemyHealth[1] = currentEnemy.ReturnTotalHealth();
    }

    public int[] Update(){
        currentEnemy.UpdateHealth();
        enemyHealth[0] = currentEnemy.ReturnCurrentHealth();
        enemyHealth[1] = currentEnemy.ReturnTotalHealth();
        return enemyHealth;
    }
}
