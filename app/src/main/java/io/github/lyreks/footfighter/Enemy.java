package io.github.lyreks.footfighter;

import android.widget.TextView;

public class Enemy {
    private int totalHealth;
    private int currentHealth;
    TextView tvTotalHealth;
    TextView tvCurrentHealth;

    Enemy(){
        totalHealth = 100;
        currentHealth = 101;
    }

    public int updateCurrentHealth(){
        currentHealth--;
        return currentHealth;

    }

}
