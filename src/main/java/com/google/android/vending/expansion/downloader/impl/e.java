package com.google.android.vending.expansion.downloader.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import expo.modules.contacts.Columns;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static e f43266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f43267i = {"FN", "URI", "ETAG", "TOTALBYTES", "CURRENTBYTES", "LASTMOD", "STATUS", "CONTROL", "FAILCOUNT", "RETRYAFTER", "REDIRECTCOUNT", "FILEIDX"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SQLiteOpenHelper f43268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SQLiteStatement f43269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SQLiteStatement f43270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f43271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f43274g;

    public static class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[][] f43275a = {new String[]{Columns.ID, "INTEGER PRIMARY KEY"}, new String[]{"FILEIDX", "INTEGER UNIQUE"}, new String[]{"URI", "TEXT"}, new String[]{"FN", "TEXT UNIQUE"}, new String[]{"ETAG", "TEXT"}, new String[]{"TOTALBYTES", "INTEGER"}, new String[]{"CURRENTBYTES", "INTEGER"}, new String[]{"LASTMOD", "INTEGER"}, new String[]{"STATUS", "INTEGER"}, new String[]{"CONTROL", "INTEGER"}, new String[]{"FAILCOUNT", "INTEGER"}, new String[]{"RETRYAFTER", "INTEGER"}, new String[]{"REDIRECTCOUNT", "INTEGER"}};
    }

    protected static class b extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[][][] f43276a = {a.f43275a, c.f43278a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f43277b = {"DownloadColumns", "MetadataColumns"};

        b(Context context) {
            super(context, "DownloadsDB", (SQLiteDatabase.CursorFactory) null, 7);
        }

        private String c(String str, String[][] strArr) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(str);
            sb2.append(" (");
            for (String[] strArr2 : strArr) {
                sb2.append(' ');
                sb2.append(strArr2[0]);
                sb2.append(' ');
                sb2.append(strArr2[1]);
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(");");
            return sb2.toString();
        }

        private void n(SQLiteDatabase sQLiteDatabase) {
            for (String str : f43277b) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* JADX INFO: Infinite loop detected, blocks: 4, insns: 0 */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            int length = f43276a.length;
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    sQLiteDatabase.execSQL(c(f43277b[i11], f43276a[i11]));
                } catch (Exception e11) {
                    while (true) {
                        e11.printStackTrace();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            Log.w(b.class.getName(), "Upgrading database from version " + i11 + " to " + i12 + ", which will destroy all old data");
            n(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    public static class c implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[][] f43278a = {new String[]{Columns.ID, "INTEGER PRIMARY KEY"}, new String[]{"APKVERSION", "INTEGER"}, new String[]{"DOWNLOADSTATUS", "INTEGER"}, new String[]{"DOWNLOADFLAGS", "INTEGER"}};
    }

    private e(Context context) {
        this.f43271d = -1L;
        this.f43272e = -1;
        this.f43273f = -1;
        b bVar = new b(context);
        this.f43268a = bVar;
        Cursor cursorRawQuery = bVar.getReadableDatabase().rawQuery("SELECT APKVERSION,_id,DOWNLOADSTATUS,DOWNLOADFLAGS FROM MetadataColumns LIMIT 1", null);
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            this.f43272e = cursorRawQuery.getInt(0);
            this.f43271d = cursorRawQuery.getLong(1);
            this.f43273f = cursorRawQuery.getInt(2);
            this.f43274g = cursorRawQuery.getInt(3);
            cursorRawQuery.close();
        }
        f43266h = this;
    }

    public static synchronized e a(Context context) {
        e eVar = f43266h;
        if (eVar != null) {
            return eVar;
        }
        return new e(context);
    }

    private SQLiteStatement b() {
        if (this.f43269b == null) {
            this.f43269b = this.f43268a.getReadableDatabase().compileStatement("SELECT _id FROM DownloadColumns WHERE FILEIDX = ?");
        }
        return this.f43269b;
    }

    private SQLiteStatement h() {
        if (this.f43270c == null) {
            this.f43270c = this.f43268a.getReadableDatabase().compileStatement("UPDATE DownloadColumns SET CURRENTBYTES = ? WHERE FILEIDX = ?");
        }
        return this.f43270c;
    }

    protected com.google.android.vending.expansion.downloader.impl.b c(String str) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f43268a.getReadableDatabase().query("DownloadColumns", f43267i, "FN = ?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        com.google.android.vending.expansion.downloader.impl.b bVarD = d(cursorQuery);
                        cursorQuery.close();
                        return bVarD;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public com.google.android.vending.expansion.downloader.impl.b d(Cursor cursor) {
        com.google.android.vending.expansion.downloader.impl.b bVar = new com.google.android.vending.expansion.downloader.impl.b(cursor.getInt(11), cursor.getString(0), getClass().getPackage().getName());
        i(bVar, cursor);
        return bVar;
    }

    public com.google.android.vending.expansion.downloader.impl.b[] e() throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f43268a.getReadableDatabase().query("DownloadColumns", f43267i, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        com.google.android.vending.expansion.downloader.impl.b[] bVarArr = new com.google.android.vending.expansion.downloader.impl.b[cursorQuery.getCount()];
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            bVarArr[i11] = d(cursorQuery);
                            if (!cursorQuery.moveToNext()) {
                                cursorQuery.close();
                                return bVarArr;
                            }
                            i11 = i12;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public long f(int i11) {
        SQLiteStatement sQLiteStatementB = b();
        sQLiteStatementB.clearBindings();
        sQLiteStatementB.bindLong(1, i11);
        try {
            return sQLiteStatementB.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return -1L;
        }
    }

    public long g(com.google.android.vending.expansion.downloader.impl.b bVar) {
        return f(bVar.f43217b);
    }

    public void i(com.google.android.vending.expansion.downloader.impl.b bVar, Cursor cursor) {
        bVar.f43216a = cursor.getString(1);
        bVar.f43219d = cursor.getString(2);
        bVar.f43220e = cursor.getLong(3);
        bVar.f43221f = cursor.getLong(4);
        bVar.f43222g = cursor.getLong(5);
        bVar.f43223h = cursor.getInt(6);
        bVar.f43224i = cursor.getInt(7);
        bVar.f43225j = cursor.getInt(8);
        bVar.f43226k = cursor.getInt(9);
        bVar.f43227l = cursor.getInt(10);
    }

    public boolean j(com.google.android.vending.expansion.downloader.impl.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("FILEIDX", Integer.valueOf(bVar.f43217b));
        contentValues.put("FN", bVar.f43218c);
        contentValues.put("URI", bVar.f43216a);
        contentValues.put("ETAG", bVar.f43219d);
        contentValues.put("TOTALBYTES", Long.valueOf(bVar.f43220e));
        contentValues.put("CURRENTBYTES", Long.valueOf(bVar.f43221f));
        contentValues.put("LASTMOD", Long.valueOf(bVar.f43222g));
        contentValues.put("STATUS", Integer.valueOf(bVar.f43223h));
        contentValues.put("CONTROL", Integer.valueOf(bVar.f43224i));
        contentValues.put("FAILCOUNT", Integer.valueOf(bVar.f43225j));
        contentValues.put("RETRYAFTER", Integer.valueOf(bVar.f43226k));
        contentValues.put("REDIRECTCOUNT", Integer.valueOf(bVar.f43227l));
        return k(bVar, contentValues);
    }

    public boolean k(com.google.android.vending.expansion.downloader.impl.b bVar, ContentValues contentValues) {
        long jG = bVar == null ? -1L : g(bVar);
        try {
            SQLiteDatabase writableDatabase = this.f43268a.getWritableDatabase();
            if (jG == -1) {
                return -1 != writableDatabase.insert("DownloadColumns", "URI", contentValues);
            }
            writableDatabase.update("DownloadColumns", contentValues, "DownloadColumns._id = " + jG, null);
            return false;
        } catch (SQLiteException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public void l(com.google.android.vending.expansion.downloader.impl.b bVar) {
        SQLiteStatement sQLiteStatementH = h();
        sQLiteStatementH.clearBindings();
        sQLiteStatementH.bindLong(1, bVar.f43221f);
        sQLiteStatementH.bindLong(2, bVar.f43217b);
        sQLiteStatementH.execute();
    }

    public boolean m(int i11) {
        if (this.f43274g == i11) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("DOWNLOADFLAGS", Integer.valueOf(i11));
        if (!p(contentValues)) {
            return false;
        }
        this.f43274g = i11;
        return true;
    }

    public boolean n(com.google.android.vending.expansion.downloader.impl.b bVar) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f43268a.getReadableDatabase().query("DownloadColumns", f43267i, "FN= ?", new String[]{bVar.f43218c}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
            i(bVar, cursorQuery);
            cursorQuery.close();
            return true;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    public boolean o(int i11, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("APKVERSION", Integer.valueOf(i11));
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i12));
        if (!p(contentValues)) {
            return false;
        }
        this.f43272e = i11;
        this.f43273f = i12;
        return true;
    }

    public boolean p(ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.f43268a.getWritableDatabase();
        if (-1 != this.f43271d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("_id = ");
            sb2.append(this.f43271d);
            return writableDatabase.update("MetadataColumns", contentValues, sb2.toString(), null) != 0;
        }
        long jInsert = writableDatabase.insert("MetadataColumns", "APKVERSION", contentValues);
        if (-1 == jInsert) {
            return false;
        }
        this.f43271d = jInsert;
        return true;
    }

    public boolean q(int i11) {
        if (this.f43273f == i11) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i11));
        if (!p(contentValues)) {
            return false;
        }
        this.f43273f = i11;
        return true;
    }
}
