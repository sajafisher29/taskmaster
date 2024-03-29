package com.example.taskmaster;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class}, version = 2)
public abstract class TaskMasterDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
