package com.example.interviewtask.db

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import codeflies.com.saalimmvvm.model.Item

// DatabaseHelper.kt
class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    fun insertData(title: String, imageUrl: String, description: String, amount: Double) {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_TITLE, title)
            put(COLUMN_IMAGE_URL, imageUrl)
            put(COLUMN_DESCRIPTION, description)
            put(COLUMN_AMOUNT, amount)
        }
        db.insert(TABLE_NAME, null, values)
    }

    fun getAllData(): Cursor {
        val db = readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
    }

    fun getAllDataFromDatabase(): List<Item> {
        val itemList = mutableListOf<Item>()
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_NAME", null)
        try {
            if (cursor.moveToFirst()) {
                do {
                    val title = cursor.getString(cursor.getColumnIndex(COLUMN_TITLE))
                    val description = cursor.getString(cursor.getColumnIndex(COLUMN_DESCRIPTION))
                    val amount = cursor.getDouble(cursor.getColumnIndex(COLUMN_AMOUNT))
                    val image = cursor.getString(cursor.getColumnIndex(COLUMN_IMAGE_URL)) // Retrieve image URL
                    itemList.add(Item(title, description, amount, image))
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            cursor.close()
        }
        return itemList
    }



    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "MyDatabase.db"
        const val TABLE_NAME = "my_table"
        const val COLUMN_TITLE = "title"
        const val COLUMN_IMAGE_URL = "image_url"
        const val COLUMN_DESCRIPTION = "description"
        const val COLUMN_AMOUNT = "amount"

        private const val SQL_CREATE_ENTRIES =
            "CREATE TABLE $TABLE_NAME (" +
                    "$COLUMN_TITLE TEXT," +
                    "$COLUMN_IMAGE_URL TEXT," +
                    "$COLUMN_DESCRIPTION TEXT," +
                    "$COLUMN_AMOUNT REAL)"

        private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"
    }
}

