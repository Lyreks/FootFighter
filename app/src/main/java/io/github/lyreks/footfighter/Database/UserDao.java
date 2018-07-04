package io.github.lyreks.footfighter.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import io.github.lyreks.footfighter.EnemyClasses.EnemyInfo;


@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT enemy_id, current_health, total_health FROM user WHERE uid = (:userID) LIMIT 1")
    EnemyInfo storedEnemyInfo(int userID);

    @Insert
    void insertUser(User user);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}