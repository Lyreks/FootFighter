package io.github.lyreks.footfighter.EnemyClasses;

import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy1;
import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy2;
import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy3;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class EnemyHandler {

    private IEnemy currentEnemy;
    //[0] is ID#, [1] is currentHealth, [2] is totalHealth
    private int[] enemyInfo = new int[3];

    public EnemyHandler(int[] enemyConstructionState){
        switch (enemyConstructionState[0]) {
            case 1:
                currentEnemy = new Enemy1(enemyConstructionState);
                break;
            case 2:
                currentEnemy = new Enemy2(enemyConstructionState);
                break;
            case 3:
                currentEnemy = new Enemy3(enemyConstructionState);
                break;
            default:
                break;
        }
        enemyInfo[0] = currentEnemy.GetID();
        enemyInfo[1] = currentEnemy.ReturnCurrentHealth();
        enemyInfo[2] = currentEnemy.ReturnTotalHealth();
    }

    public EnemyHandler(){
        currentEnemy = new Enemy1();
        enemyInfo[0] = currentEnemy.GetID();
        enemyInfo[1] = currentEnemy.ReturnCurrentHealth();
        enemyInfo[2] = currentEnemy.ReturnTotalHealth();
    }

    public int[] ReturnInfo(){
        return enemyInfo;
    }

    public void Update(){
        currentEnemy.UpdateHealth();
        if(currentEnemy.ReturnCurrentHealth() <= 0){
            SwitchEnemy();
        }
        enemyInfo[0] = currentEnemy.GetID();
        enemyInfo[1] = currentEnemy.ReturnCurrentHealth();
        enemyInfo[2] = currentEnemy.ReturnTotalHealth();
    }

    private void SwitchEnemy(){
        switch (currentEnemy.GetID()) {
            case 1:
                currentEnemy = new Enemy2();
                break;
            case 2:
                currentEnemy = new Enemy3();
                break;
            case 3:
                currentEnemy = new Enemy1();
                break;
            default:
                break;
        }
    }
}
