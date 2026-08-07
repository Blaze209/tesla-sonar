package androidx.room;

import android.database.Cursor;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@jn0.e
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0012\u001b#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"Landroidx/room/h0;", "Lza/d$a;", "Landroidx/room/e;", "configuration", "Landroidx/room/h0$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/e;Landroidx/room/h0$b;Ljava/lang/String;Ljava/lang/String;)V", "Lza/c;", "db", "Ljn0/h0;", "h", "(Lza/c;)V", "j", IntegerTokenConverter.CONVERTER_KEY, "b", DateTokenConverter.CONVERTER_KEY, "", "oldVersion", "newVersion", "g", "(Lza/c;II)V", "e", "f", "c", "Landroidx/room/e;", "", "Landroidx/room/b0$b;", "Ljava/util/List;", "callbacks", "Landroidx/room/h0$b;", "Ljava/lang/String;", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class h0 extends za.d.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e configuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<b0.b> callbacks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b delegate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String identityHash;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String legacyHash;

    /* JADX INFO: renamed from: androidx.room.h0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/room/h0$a;", "", "<init>", "()V", "Lza/c;", "db", "", "c", "(Lza/c;)Z", "b", "Ljn0/h0;", "a", "(Lza/c;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            Cursor cursorL3 = db2.l3("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listC = p013kotlin.collections.v.c();
                while (cursorL3.moveToNext()) {
                    String string = cursorL3.getString(0);
                    p013kotlin.jvm.internal.s.h(string);
                    if (!p013kotlin.text.t.b0(string, "sqlite_", false, 2, null) && !p013kotlin.jvm.internal.s.f(string, "android_metadata")) {
                        listC.add(jn0.x.a(string, Boolean.valueOf(p013kotlin.jvm.internal.s.f(cursorL3.getString(1), "view"))));
                    }
                }
                List<Pair> listA = p013kotlin.collections.v.a(listC);
                sn0.b.a(cursorL3, null);
                for (Pair pair : listA) {
                    String str = (String) pair.a();
                    if (((Boolean) pair.b()).booleanValue()) {
                        db2.Q1("DROP VIEW IF EXISTS " + str);
                    } else {
                        db2.Q1("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorL3, th2);
                    throw th3;
                }
            }
        }

        public final boolean b(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            Cursor cursorL3 = db2.l3("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z11 = false;
                if (cursorL3.moveToFirst() && cursorL3.getInt(0) == 0) {
                    z11 = true;
                }
                sn0.b.a(cursorL3, null);
                return z11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorL3, th2);
                    throw th3;
                }
            }
        }

        public final boolean c(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            Cursor cursorL3 = db2.l3("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z11 = false;
                if (cursorL3.moveToFirst() && cursorL3.getInt(0) != 0) {
                    z11 = true;
                }
                sn0.b.a(cursorL3, null);
                return z11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorL3, th2);
                    throw th3;
                }
            }
        }

        private Companion() {
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/h0$b;", "", "", "version", "<init>", "(I)V", "Lza/c;", "db", "Ljn0/h0;", "dropAllTables", "(Lza/c;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/h0$c;", "onValidateSchema", "(Lza/c;)Landroidx/room/h0$c;", "onPreMigrate", "onPostMigrate", "I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {
        public final int version;

        public b(int i11) {
            this.version = i11;
        }

        public abstract void createAllTables(za.c db2);

        public abstract void dropAllTables(za.c db2);

        public abstract void onCreate(za.c db2);

        public abstract void onOpen(za.c db2);

        public void onPostMigrate(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
        }

        public void onPreMigrate(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
        }

        public c onValidateSchema(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            validateMigration(db2);
            return new c(true, null);
        }

        @jn0.e
        protected void validateMigration(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/h0$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean isValid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String expectedFoundMsg;

        public c(boolean z11, String str) {
            this.isValid = z11;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(identityHash, "identityHash");
        p013kotlin.jvm.internal.s.k(legacyHash, "legacyHash");
        this.callbacks = configuration.callbacks;
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void h(za.c db2) {
        if (!INSTANCE.c(db2)) {
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (cVarOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                j(db2);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        Cursor cursorB0 = db2.B0(new za.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorB0.moveToFirst() ? cursorB0.getString(0) : null;
            sn0.b.a(cursorB0, null);
            if (p013kotlin.jvm.internal.s.f(this.identityHash, string) || p013kotlin.jvm.internal.s.f(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorB0, th2);
                throw th3;
            }
        }
    }

    private final void i(za.c db2) {
        db2.Q1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(za.c db2) {
        i(db2);
        db2.Q1(e0.a(this.identityHash));
    }

    @Override // za.d.a
    public void b(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        super.b(db2);
    }

    @Override // za.d.a
    public void d(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        boolean zB = INSTANCE.b(db2);
        this.delegate.createAllTables(db2);
        if (!zB) {
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (!cVarOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        j(db2);
        this.delegate.onCreate(db2);
        List<b0.b> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((b0.b) it.next()).b(db2);
            }
        }
    }

    @Override // za.d.a
    public void e(za.c db2, int oldVersion, int newVersion) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        g(db2, oldVersion, newVersion);
    }

    @Override // za.d.a
    public void f(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        super.f(db2);
        h(db2);
        this.delegate.onOpen(db2);
        List<b0.b> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((b0.b) it.next()).f(db2);
            }
        }
        this.configuration = null;
    }

    @Override // za.d.a
    public void g(za.c db2, int oldVersion, int newVersion) {
        List<ua.b> listD;
        p013kotlin.jvm.internal.s.k(db2, "db");
        e eVar = this.configuration;
        if (eVar != null && (listD = eVar.migrationContainer.d(oldVersion, newVersion)) != null) {
            this.delegate.onPreMigrate(db2);
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                ((ua.b) it.next()).a(new ta.a(db2));
            }
            c cVarOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (cVarOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                j(db2);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.expectedFoundMsg);
            }
        }
        e eVar2 = this.configuration;
        if (eVar2 == null || eVar2.e(oldVersion, newVersion)) {
            throw new IllegalStateException("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (eVar2.allowDestructiveMigrationForAllTables) {
            INSTANCE.a(db2);
        } else {
            this.delegate.dropAllTables(db2);
        }
        List<b0.b> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((b0.b) it2.next()).d(db2);
            }
        }
        this.delegate.createAllTables(db2);
    }
}
