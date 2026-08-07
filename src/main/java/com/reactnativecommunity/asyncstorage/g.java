package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
public class g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static g f48468d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f48469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f48470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48471c;

    private g(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f48471c = f.f48467a.longValue() * 1048576;
        this.f48469a = context;
    }

    public static g B(Context context) {
        if (f48468d == null) {
            f48468d = new g(context.getApplicationContext());
        }
        return f48468d;
    }

    private synchronized boolean o() {
        n();
        return this.f48469a.deleteDatabase("RKStorage");
    }

    synchronized void c() {
        t().delete("catalystLocalStorage", null, null);
    }

    public synchronized void n() {
        SQLiteDatabase sQLiteDatabase = this.f48470b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f48470b.close();
            this.f48470b = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 != i12) {
            o();
            onCreate(sQLiteDatabase);
        }
    }

    synchronized boolean p() {
        SQLiteDatabase sQLiteDatabase = this.f48470b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e11 = null;
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 > 0) {
                try {
                    o();
                } catch (SQLiteException e12) {
                    e11 = e12;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f48470b = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f48470b;
        if (sQLiteDatabase2 == null) {
            throw e11;
        }
        sQLiteDatabase2.setMaximumSize(this.f48471c);
        return true;
    }

    public synchronized SQLiteDatabase t() {
        p();
        return this.f48470b;
    }
}
