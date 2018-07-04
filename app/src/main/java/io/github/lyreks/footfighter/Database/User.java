package io.github.lyreks.footfighter.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import io.github.lyreks.footfighter.EnemyClasses.EnemyInfo;

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    private int uid;

    @Embedded
    private EnemyInfo enemyInfo;


    // Getters and setters required for Room to work.

    //uid get & set
    public int getUid(){
        return uid;
    }
    public void setUid(int value){
        uid = value;
    }

    //enemyInfo get & set
    public EnemyInfo getEnemyInfo() {
        return enemyInfo;
    }
    public void setEnemyInfo(EnemyInfo enemyInfo) {
        this.enemyInfo = enemyInfo;
    }

}

