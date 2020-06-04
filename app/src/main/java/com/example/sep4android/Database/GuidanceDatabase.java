package com.example.sep4android.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sep4android.Models.Guidance;

@Database(entities = {Guidance.class}, version = 1)
public abstract class GuidanceDatabase extends RoomDatabase {

    private static GuidanceDatabase instance;

    public abstract GuidanceDao noteDao();

    public static synchronized GuidanceDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    GuidanceDatabase.class, "guidance_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}