package com.example.irvinmarin.donaciones.lib;


import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by irvinmarin on 24/04/2017.
 */

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION, insertConflict = ConflictAction.IGNORE)
public class AppDatabase {
    public static final String NAME = "DonacionesDB";
    public static final int VERSION = 1;
}
