package io.github.lyreks.footfighter.EnemyClasses.Enemies;

import io.github.lyreks.footfighter.EnemyClasses.EnemyInfo;
import io.github.lyreks.footfighter.Interfaces.IEnemy;

public class Enemy1 implements IEnemy {

    private EnemyInfo enemyInfo;

    public Enemy1(){
        enemyInfo = new EnemyInfo();
        enemyInfo.setID(1);
        enemyInfo.setCurrentHealth(10);
        enemyInfo.setTotalHealth(10);
    }

    public Enemy1(EnemyInfo enemyConstruct){
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
