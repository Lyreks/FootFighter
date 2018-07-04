package io.github.lyreks.footfighter.EnemyClasses;

import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy1;
import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy2;
import io.github.lyreks.footfighter.EnemyClasses.Enemies.Enemy3;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class EnemyHandler {

    private IEnemy currentEnemy;
    //[0] is ID#, [1] is currentHealth, [2] is totalHealth

    public EnemyHandler(EnemyInfo infoConstruct){
        switch (infoConstruct.getID()) {
            case 1:
                currentEnemy = new Enemy1(infoConstruct);
                break;
            case 2:
                currentEnemy = new Enemy2(infoConstruct);
                break;
            case 3:
                currentEnemy = new Enemy3(infoConstruct);
                break;
            default:
                break;
        }

    }

    public EnemyHandler(){
        currentEnemy = new Enemy1();
    }

    public EnemyInfo GetInfo(){
        return currentEnemy.GetInfo();
    }

    public void Update(){
        currentEnemy.UpdateHealth();
        if(currentEnemy.GetCurrentHealth() <= 0){
            SwitchEnemy();
        }
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
