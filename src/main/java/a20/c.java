package a20;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import z10.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u0000 ?2\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\n2\u0006\u0010+\u001a\u00020&¢\u0006\u0004\b,\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0004068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010>\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010%R\u0011\u0010A\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"La20/c;", "Lm20/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "namespace", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "orderBy", "", "", "", "l", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Ljn0/h0;", "j", "()V", "Lr20/a;", StatusResponse.PAYLOAD, "a", "(Lr20/a;)V", "k", "", IntegerTokenConverter.CONVERTER_KEY, "(Lr20/a;)J", "", "ids", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Z", "maxSize", "Lio0/b;", "maxAge", "c", "(JJ)V", "size", "()J", "", "queryLimit", "Lm20/b;", "b", "(I)Ljava/util/List;", "range", "h", "Ljava/lang/String;", "Ljava/util/List;", "payloadWaitingList", "Landroid/database/sqlite/SQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "database", "La20/a;", "La20/a;", "dbHelper", "", "e", "[Ljava/lang/String;", "allColumns", "<set-?>", "f", "J", "getLastInsertedRowId", "lastInsertedRowId", "g", "()Z", "databaseOpen", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements m20.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f49h = c.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String namespace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<r20.a> payloadWaitingList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SQLiteDatabase database;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a dbHelper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] allColumns;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long lastInsertedRowId;

    public c(final Context context, String namespace) {
        s.k(context, "context");
        s.k(namespace, "namespace");
        this.namespace = namespace;
        this.payloadWaitingList = new ArrayList();
        this.allColumns = new String[]{"id", "eventData", "dateCreated"};
        this.lastInsertedRowId = -1L;
        g.h(new Callable() { // from class: a20.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c.f(this.f46a, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(c this$0, Context context) {
        s.k(this$0, "this$0");
        s.k(context, "$context");
        this$0.dbHelper = a.INSTANCE.a(context, this$0.namespace);
        this$0.k();
        String TAG = f49h;
        s.j(TAG, "TAG");
        SQLiteDatabase sQLiteDatabase = this$0.database;
        h20.g.a(TAG, "DB Path: %s", sQLiteDatabase != null ? sQLiteDatabase.getPath() : null);
        return null;
    }

    private final void j() {
        if (!g() || this.payloadWaitingList.size() <= 0) {
            return;
        }
        synchronized (this) {
            try {
                Iterator<r20.a> it = this.payloadWaitingList.iterator();
                while (it.hasNext()) {
                    i(it.next());
                }
                this.payloadWaitingList.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final List<Map<String, Object>> l(String query, String orderBy) {
        ArrayList arrayList = new ArrayList();
        if (!g()) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            s.h(sQLiteDatabase);
            cursorQuery = sQLiteDatabase.query("events", this.allColumns, query, null, null, null, orderBy);
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                HashMap map = new HashMap();
                map.put("id", Long.valueOf(cursorQuery.getLong(0)));
                byte[] blob = cursorQuery.getBlob(1);
                s.j(blob, "cursor.getBlob(1)");
                map.put("eventData", i20.c.c(blob));
                map.put("dateCreated", cursorQuery.getString(2));
                cursorQuery.moveToNext();
                arrayList.add(map);
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // m20.c
    public void a(r20.a payload) {
        s.k(payload, "payload");
        if (g()) {
            j();
            i(payload);
        } else {
            synchronized (this) {
                this.payloadWaitingList.add(payload);
            }
        }
    }

    @Override // m20.c
    public List<m20.b> b(int queryLimit) {
        if (!g()) {
            return v.m();
        }
        j();
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map : h(queryLimit)) {
            r20.c cVar = new r20.c();
            Object obj = map.get("eventData");
            Map<String, ? extends Object> map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 != null) {
                cVar.c(map2);
            }
            Object obj2 = map.get("id");
            Long l11 = obj2 instanceof Long ? (Long) obj2 : null;
            if (l11 == null) {
                String TAG = f49h;
                s.j(TAG, "TAG");
                h20.g.b(TAG, "Unable to get ID of an event extracted from the database.", new Object[0]);
            } else {
                arrayList.add(new m20.b(cVar, l11.longValue()));
            }
        }
        return arrayList;
    }

    @Override // m20.c
    public void c(long maxSize, long maxAge) {
        if (g()) {
            j();
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(t.n("\n                DELETE FROM events\n                WHERE id NOT IN (\n                    SELECT id\n                    FROM events\n                    WHERE dateCreated >= datetime('now','-" + io0.b.r(maxAge) + " seconds')\n                    ORDER BY dateCreated DESC, id DESC\n                    LIMIT " + maxSize + "\n                )\n                "));
            }
        }
    }

    @Override // m20.c
    public boolean d(List<Long> ids) {
        int iDelete;
        s.k(ids, "ids");
        if (ids.isEmpty()) {
            return false;
        }
        if (g()) {
            SQLiteDatabase sQLiteDatabase = this.database;
            s.h(sQLiteDatabase);
            iDelete = sQLiteDatabase.delete("events", "id in (" + i20.c.k(ids) + CoreConstants.RIGHT_PARENTHESIS_CHAR, null);
        } else {
            iDelete = -1;
        }
        String TAG = f49h;
        s.j(TAG, "TAG");
        h20.g.a(TAG, "Removed events from database: %s", Integer.valueOf(iDelete));
        return iDelete == ids.size();
    }

    public final boolean g() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return false;
        }
        s.h(sQLiteDatabase);
        return sQLiteDatabase.isOpen();
    }

    public final List<Map<String, Object>> h(int range) {
        return l(null, "id DESC LIMIT " + range);
    }

    public final long i(r20.a payload) {
        s.k(payload, "payload");
        if (g()) {
            byte[] bArrN = i20.c.n(i20.c.m(payload.getMap()));
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("eventData", bArrN);
            SQLiteDatabase sQLiteDatabase = this.database;
            s.h(sQLiteDatabase);
            this.lastInsertedRowId = sQLiteDatabase.insert("events", null, contentValues);
        }
        String TAG = f49h;
        s.j(TAG, "TAG");
        h20.g.a(TAG, "Added event to database: %s", Long.valueOf(this.lastInsertedRowId));
        return this.lastInsertedRowId;
    }

    public final void k() {
        if (g()) {
            return;
        }
        a aVar = this.dbHelper;
        if (aVar == null) {
            s.B("dbHelper");
            aVar = null;
        }
        SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
        this.database = writableDatabase;
        if (writableDatabase != null) {
            writableDatabase.enableWriteAheadLogging();
        }
    }

    @Override // m20.c
    public long size() {
        if (!g()) {
            return this.payloadWaitingList.size();
        }
        j();
        return DatabaseUtils.queryNumEntries(this.database, "events");
    }
}
