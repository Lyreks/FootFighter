package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.EnemyClasses.EnemyInfo;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy2 implements IEnemy {

    private EnemyInfo enemyInfo;

    public Enemy2(){
        enemyInfo = new EnemyInfo();
        enemyInfo.setID(2);
        enemyInfo.setCurrentHealth(20);
        enemyInfo.setTotalHealth(20);
    }

    public Enemy2(EnemyInfo enemyConstruct){
        enemyInfo = enemyConstruct;
    }

    public void UpdateHealth(){
        int num = enemyInfo.getCurrentHealth();
        num--;
        enemyInfo.setCurrentHealth(num);
    }

    public EnemyInfo GetInfo(){
        return enemyInfo;
    }

    public int GetID(){
        return enemyInfo.getID();
    }

    public int GetCurrentHealth(){
        return enemyInfo.getCurrentHealth();
    }

    public int GetTotalHealth(){
        return enemyInfo.getTotalHealth();
    }
}
