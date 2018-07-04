package io.github.lyreks.footfighter.EnemyClasses;

public class EnemyInfo {
    private int ID;
    private int currentHealth;
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
