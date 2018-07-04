package io.github.lyreks.footfighter.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import io.github.lyreks.footfighter.Database.User;
import io.github.lyreks.footfighter.Database.UserDao;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}