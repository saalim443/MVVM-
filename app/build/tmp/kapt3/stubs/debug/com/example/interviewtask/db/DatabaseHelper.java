package com.example.interviewtask.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/example/interviewtask/db/DatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAllData", "Landroid/database/Cursor;", "getAllDataFromDatabase", "", "Lcodeflies/com/saalimmvvm/model/Item;", "insertData", "", "title", "", "imageUrl", "description", "amount", "", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "Companion", "app_debug"})
public final class DatabaseHelper extends android.database.sqlite.SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "MyDatabase.db";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_NAME = "my_table";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_TITLE = "title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_IMAGE_URL = "image_url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_DESCRIPTION = "description";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_AMOUNT = "amount";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SQL_CREATE_ENTRIES = "CREATE TABLE my_table (title TEXT,image_url TEXT,description TEXT,amount REAL)";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS my_table";
    @org.jetbrains.annotations.NotNull
    public static final com.example.interviewtask.db.DatabaseHelper.Companion Companion = null;
    
    public DatabaseHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override
    public void onUpgrade(@org.jetbrains.annotations.NotNull
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    public final void insertData(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    java.lang.String description, double amount) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.database.Cursor getAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.Item> getAllDataFromDatabase() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/interviewtask/db/DatabaseHelper$Companion;", "", "()V", "COLUMN_AMOUNT", "", "COLUMN_DESCRIPTION", "COLUMN_IMAGE_URL", "COLUMN_TITLE", "DATABASE_NAME", "DATABASE_VERSION", "", "SQL_CREATE_ENTRIES", "SQL_DELETE_ENTRIES", "TABLE_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}