package xq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class v0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f124004c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f124005d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f124006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f124007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f124008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f124009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f124010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f124011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f124012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<a> f124013l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f124015b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: xq.o0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.c(sQLiteDatabase);
            }
        };
        f124006e = aVar;
        a aVar2 = new a() { // from class: xq.p0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.B(sQLiteDatabase);
            }
        };
        f124007f = aVar2;
        a aVar3 = new a() { // from class: xq.q0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f124008g = aVar3;
        a aVar4 = new a() { // from class: xq.r0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.C(sQLiteDatabase);
            }
        };
        f124009h = aVar4;
        a aVar5 = new a() { // from class: xq.s0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.p(sQLiteDatabase);
            }
        };
        f124010i = aVar5;
        a aVar6 = new a() { // from class: xq.t0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f124011j = aVar6;
        a aVar7 = new a() { // from class: xq.u0
            @Override // xq.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.n(sQLiteDatabase);
            }
        };
        f124012k = aVar7;
        f124013l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    v0(Context context, String str, int i11) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.f124015b = false;
        this.f124014a = i11;
    }

    public static /* synthetic */ void B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void C(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void H(SQLiteDatabase sQLiteDatabase) {
        if (this.f124015b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    private void I(SQLiteDatabase sQLiteDatabase, int i11) {
        H(sQLiteDatabase);
        J(sQLiteDatabase, 0, i11);
    }

    private void J(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        List<a> list = f124013l;
        if (i12 <= list.size()) {
            while (i11 < i12) {
                f124013l.get(i11).a(sQLiteDatabase);
                i11++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i11 + " to " + i12 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f124004c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f124015b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        I(sQLiteDatabase, this.f124014a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        I(sQLiteDatabase, i12);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        H(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        H(sQLiteDatabase);
        J(sQLiteDatabase, i11, i12);
    }
}
