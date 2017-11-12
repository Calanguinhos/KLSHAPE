package com.calangos.mainApp.dao;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rafael on 07/11/17.
 */

public class DB extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "klshape";
    private static final int DATABASE_VERSION = 1;

    /**
     * Create a helper object to create, open, and/or manage a database.
     * This method always returns very quickly.  The database is not actually
     * created or opened until one of {@link #getWritableDatabase} or
     * {@link #getReadableDatabase} is called.
     *
     * @param context   to use to open or create the database
     * @param //name    of the database file, or null for an in-memory database
     * @param //factory to use for creating cursor objects, or null for the default
     * @param //version number of the database (starting at 1); if the database is older,
     *                  {@link #onUpgrade} will be used to upgrade the database; if the database is
     *                  newer, {@link #onDowngrade} will be used to downgrade the database
     */
    public DB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Create a helper object to create, open, and/or manage a database.
     * The database is not actually created or opened until one of
     * {@link #getWritableDatabase} or {@link #getReadableDatabase} is called.
     * <p>
     * <p>Accepts input param: a concrete instance of {@link DatabaseErrorHandler} to be
     * used to handle corruption when sqlite reports database corruption.</p>
     *
     * @param context      to use to open or create the database
     * @param name         of the database file, or null for an in-memory database
     * @param factory      to use for creating cursor objects, or null for the default
     * @param version      number of the database (starting at 1); if the database is older,
     *                     {@link #onUpgrade} will be used to upgrade the database; if the database is
     *                     newer, {@link #onDowngrade} will be used to downgrade the database
     * @param errorHandler the {@link DatabaseErrorHandler} to be used when sqlite reports database
     */
    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param db The database.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS ALUNOS (" +
                "        _ID_ALUNOS    INTEGER    NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "        ALU_NOME   VARCHAR(50) NOT NULL," +
                "        ALU_RG     VARCHAR(9)  NOT NULL," +
                "        ALU_CPF    VARCHAR(9)  NOT NULL," +
                "        ALU_ENDERECO VARCHAR(50) NOT NULL," +
                "        ALU_EMAIL VARCHAR(60) NOT NULL," +
                "        ALU_SENHA    VARCHAR(25) NOT NULL);" +
                "" +
                "        CREATE TABLE IF NOT EXISTS EXERCICIOS(" +
                "        _ID_EXERCICIOS    INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "        EXE_NOME VARCHAR(45) NOT NULL," +
                "        EXE_DATA DATE NOT NULL);" +
                "" +
                "        CREATE TABLE IF NOT EXISTS NOTIFICACOES(" +
                "        _ID_NOTIFIACOES   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "        NOT_NOME VARCHAR(45) NOT NULL," +
                "        NOT_DESCRICAO VARCHAR(45) NOT NULL," +
                "        NOT_TIPO VARCHAR(45) NOT NULL," +
                "        CONSTRAINT ALUNOS_ID_ALUNOS FOREIGN KEY REFERENCES ALUNOS," +
                "        CONSTRAINT INSTRUTORES_ID_INSTRUTORES FOREING KEY REFERENCES INSTRUTORES);" +
                "" +
                "        CREATE TABLE IF NOT EXISTS INSTRUTORES(" +
                "        _ID_INSTRUTORES INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "        INS_NOME VARCHAR(45) NOT NULL," +
                "        INS_RG VARCHAR(9) NOT NULL," +
                "        INS_CPF VARCHAR(9) NOT NULL," +
                "        INS_ENDERECO VARCHAR(45) NOT NULL," +
                "        INS_EMAIL VARCHAR(45) NOT NULL," +
                "        INS_SENHA VARCHAR(45) NOT NULL);" +
                "" +
                "        CREATE TABLE IF NOT EXISTS TREINAMENTOS(" +
                "        _ID_TREINAMENTOS INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "        CONSTRAINT NOTIFICACOES_ID_NOTIFICACOES FOREING KEY REFERENCES NOTIFICACOES," +
                "        CONSTRAINT NOTIFICACOES_ALUNOS_ID_ALUNOS FOREING KEY REFERENCES NOTIFICACOES," +
                "        CONSTRAINT NOTIFICACOES_INSTRUTORES_ID_INSTRUTORES FOREING KEY REFERENCES NOTIFICACOES," +
                "        CONSTRAINT EXERCICIOS_ID_EXERCICIO FOREING KEY REFERENCES EXERCICIOS);");

    }

    /**
     * Called when the database needs to be upgraded. The implementation
     * should use this method to drop tables, add tables, or do anything else it
     * needs to upgrade to the new schema version.
     * <p>
     * <p>
     * The SQLite ALTER TABLE documentation can be found
     * <a href="http://sqlite.org/lang_altertable.html">here</a>. If you add new columns
     * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
     * you can use ALTER TABLE to rename the old table, then create the new table and then
     * populate the new table with the contents of the old table.
     * </p><p>
     * This method executes within a transaction.  If an exception is thrown, all changes
     * will automatically be rolled back.
     * </p>
     *
     * @param db         The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE ALUNOS;" +
                "DROP TABLE EXERCICIOS;" +
                "DROP TABLE NOTIFICACOES;" +
                "DROP TABLE INSTRUTORES;" +
                "DROP TABLE TREINAMENTOS;");
        onCreate(db);
    }
}
