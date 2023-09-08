package intra.uninga.mobile;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * Created by allanromanato on 5/27/15.
 */
public class CriaBanco extends SQLiteOpenHelper {
    public CriaBanco(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
        private static final String NOME_BANCO = "banco.db";
        private static final String TABELA = "livros";
        private static final String ID = "_id";
        private static final String TITULO = "titulo";
        private static final String AUTOR = "autor";
        private static final String EDITORA = "editora";
        private static final int VERSAO = 1;

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}