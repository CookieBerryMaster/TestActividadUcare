package com.example.testactividaducare.db
/*
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testactividaducare.entity.Actividad

@Database(
    entities = [Actividad::class],
    version = 1
)

abstract class DataBaseApp: RoomDatabase() {

    abstract fun actividadDao():ActividadDao


    companion object {
        @Volatile
        private var INSTANCE: DataBaseApp? = null

        fun getDatabase(context: Context): DataBaseApp {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    DataBaseApp::class.java,
                    "Ucaredb")
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}*/