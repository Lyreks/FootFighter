package io.github.lyreks.footfighter.EnemyClasses;

import android.arch.persistence.room.ColumnInfo;

public class EnemyInfo {
    @ColumnInfo(name = "enemy_id")
    private int ID;
    @ColumnInfo(name = "current_health")
    private int currentHealth;
    @ColumnInfo(name = "total_health")
    private int totalHealth;

    public int getID(){
        return ID;
    }
    public void setID(int value){
        ID = value;
    }

    public int getCurrentHealth(){
        return currentHealth;
    }
    public void setCurrentHealth(int value){
        currentHealth = value;
    }

    public int getTotalHealth(){
        return totalHealth;
    }
    public void setTotalHealth(int value){
        totalHealth = value;
    }

}
