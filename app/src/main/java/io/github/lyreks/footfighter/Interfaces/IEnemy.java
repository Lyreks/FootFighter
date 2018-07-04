package io.github.lyreks.footfighter.Interfaces;

import io.github.lyreks.footfighter.EnemyClasses.EnemyInfo;

public interface IEnemy {

    EnemyInfo GetInfo();
    int GetID();
    void UpdateHealth();
    int GetCurrentHealth();
    int GetTotalHealth();
}
