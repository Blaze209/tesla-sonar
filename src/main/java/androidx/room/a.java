package androidx.room;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 92\u00020\u0001:\u0002*'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\bJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\bJ\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b&\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Landroidx/room/a;", "", "<init>", "()V", "Lya/b;", "connection", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lya/b;)V", "g", "j", "k", "h", "", "s", "(Lya/b;)Z", "B", "l", "m", "f", "t", "u", "v", "w", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "x", "", "oldVersion", "newVersion", "y", "(Lya/b;II)V", "z", "Landroidx/room/b0$d;", "p", "(Landroidx/room/b0$d;)I", "q", "a", "Z", "isConfigured", "b", "isInitializing", "Landroidx/room/e;", "o", "()Landroidx/room/e;", "configuration", "Landroidx/room/f0;", "r", "()Landroidx/room/f0;", "openDelegate", "", "Landroidx/room/b0$b;", "n", "()Ljava/util/List;", "callbacks", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isConfigured;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isInitializing;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/room/a$b;", "Lya/c;", "actual", "<init>", "(Landroidx/room/a;Lya/c;)V", "", "filename", "Lya/b;", "c", "(Ljava/lang/String;)Lya/b;", "fileName", "a", "Lya/c;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected final class b implements ya.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ya.c actual;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f13612b;

        /* JADX INFO: renamed from: androidx.room.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0223a implements wn0.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f13613a;

            C0223a(String str) {
                this.f13613a = str;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Throwable error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                throw new IllegalStateException("Unable to open database '" + this.f13613a + "'. Was a proper path / name used in Room's database builder?", error);
            }
        }

        public b(a aVar, ya.c actual) {
            p013kotlin.jvm.internal.s.k(actual, "actual");
            this.f13612b = aVar;
            this.actual = actual;
        }

        private final ya.b c(final String filename) {
            ra.b bVar = new ra.b(filename, (this.f13612b.isConfigured || this.f13612b.isInitializing || p013kotlin.jvm.internal.s.f(filename, ":memory:")) ? false : true);
            final a aVar = this.f13612b;
            return (ya.b) bVar.b(new wn0.a() { // from class: androidx.room.b
                @Override // wn0.a
                public final Object invoke() {
                    return a.b.d(aVar, this, filename);
                }
            }, new C0223a(filename));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ya.b d(a aVar, b bVar, String str) throws Exception {
            if (aVar.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            ya.b bVarA = bVar.actual.a(str);
            if (aVar.isConfigured) {
                aVar.g(bVarA);
                return bVarA;
            }
            try {
                aVar.isInitializing = true;
                aVar.i(bVarA);
                return bVarA;
            } finally {
                aVar.isInitializing = false;
            }
        }

        @Override // ya.c
        public ya.b a(String fileName) {
            p013kotlin.jvm.internal.s.k(fileName, "fileName");
            return c(this.f13612b.A(fileName));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13614a;

        static {
            int[] iArr = new int[b0.d.values().length];
            try {
                iArr[b0.d.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13614a = iArr;
        }
    }

    private final void B(ya.b connection) throws Exception {
        l(connection);
        ya.a.a(connection, e0.a(getOpenDelegate().getIdentityHash()));
    }

    private final void f(ya.b connection) throws Exception {
        Object objB;
        if (t(connection)) {
            ya.d dVarL1 = connection.L1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                String strQ3 = dVarL1.I1() ? dVarL1.q3(0) : null;
                un0.a.a(dVarL1, null);
                if (p013kotlin.jvm.internal.s.f(getOpenDelegate().getIdentityHash(), strQ3) || p013kotlin.jvm.internal.s.f(getOpenDelegate().getLegacyIdentityHash(), strQ3)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + strQ3).toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(dVarL1, th2);
                    throw th3;
                }
            }
        }
        ya.a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            f0.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
            getOpenDelegate().h(connection);
            B(connection);
            objB = jn0.s.b(jn0.h0.f84049a);
            if (jn0.s.h(objB)) {
                ya.a.a(connection, "END TRANSACTION");
            }
            Throwable thE = jn0.s.e(objB);
            if (thE == null) {
                jn0.s.a(objB);
            } else {
                ya.a.a(connection, "ROLLBACK TRANSACTION");
                throw thE;
            }
        } catch (Throwable th4) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(ya.b connection) throws Exception {
        k(connection);
        h(connection);
        getOpenDelegate().g(connection);
    }

    private final void h(ya.b connection) throws Exception {
        ya.d dVarL1 = connection.L1("PRAGMA busy_timeout");
        try {
            dVarL1.I1();
            long j11 = dVarL1.getLong(0);
            un0.a.a(dVarL1, null);
            if (j11 < 3000) {
                ya.a.a(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(ya.b connection) throws Exception {
        Object objB;
        j(connection);
        k(connection);
        h(connection);
        ya.d dVarL1 = connection.L1("PRAGMA user_version");
        try {
            dVarL1.I1();
            int i11 = (int) dVarL1.getLong(0);
            un0.a.a(dVarL1, null);
            if (i11 != getOpenDelegate().getVersion()) {
                ya.a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    if (i11 == 0) {
                        x(connection);
                    } else {
                        y(connection, i11, getOpenDelegate().getVersion());
                    }
                    ya.a.a(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objB = jn0.s.b(jn0.h0.f84049a);
                } catch (Throwable th2) {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th2));
                }
                if (jn0.s.h(objB)) {
                    ya.a.a(connection, "END TRANSACTION");
                }
                Throwable thE = jn0.s.e(objB);
                if (thE != null) {
                    ya.a.a(connection, "ROLLBACK TRANSACTION");
                    throw thE;
                }
            }
            z(connection);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                un0.a.a(dVarL1, th3);
                throw th4;
            }
        }
    }

    private final void j(ya.b connection) throws Exception {
        if (getConfiguration().journalMode == b0.d.WRITE_AHEAD_LOGGING) {
            ya.a.a(connection, "PRAGMA journal_mode = WAL");
        } else {
            ya.a.a(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void k(ya.b connection) throws Exception {
        if (getConfiguration().journalMode == b0.d.WRITE_AHEAD_LOGGING) {
            ya.a.a(connection, "PRAGMA synchronous = NORMAL");
        } else {
            ya.a.a(connection, "PRAGMA synchronous = FULL");
        }
    }

    private final void l(ya.b connection) throws Exception {
        ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void m(ya.b connection) throws Exception {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().b(connection);
            return;
        }
        ya.d dVarL1 = connection.L1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List listC = p013kotlin.collections.v.c();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(0);
                if (!p013kotlin.text.t.b0(strQ3, "sqlite_", false, 2, null) && !p013kotlin.jvm.internal.s.f(strQ3, "android_metadata")) {
                    listC.add(jn0.x.a(strQ3, Boolean.valueOf(p013kotlin.jvm.internal.s.f(dVarL1.q3(1), "view"))));
                }
            }
            List<Pair> listA = p013kotlin.collections.v.a(listC);
            un0.a.a(dVarL1, null);
            for (Pair pair : listA) {
                String str = (String) pair.a();
                if (((Boolean) pair.b()).booleanValue()) {
                    ya.a.a(connection, "DROP VIEW IF EXISTS " + str);
                } else {
                    ya.a.a(connection, "DROP TABLE IF EXISTS " + str);
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    private final boolean s(ya.b connection) throws Exception {
        ya.d dVarL1 = connection.L1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (dVarL1.I1() && dVarL1.getLong(0) == 0) {
                z11 = true;
            }
            un0.a.a(dVarL1, null);
            return z11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    private final boolean t(ya.b connection) throws Exception {
        ya.d dVarL1 = connection.L1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z11 = false;
            if (dVarL1.I1() && dVarL1.getLong(0) != 0) {
                z11 = true;
            }
            un0.a.a(dVarL1, null);
            return z11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    private final void u(ya.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((b0.b) it.next()).a(connection);
        }
    }

    private final void v(ya.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((b0.b) it.next()).c(connection);
        }
    }

    private final void w(ya.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((b0.b) it.next()).e(connection);
        }
    }

    public abstract String A(String fileName);

    protected abstract List<b0.b> n();

    /* JADX INFO: renamed from: o */
    protected abstract e getConfiguration();

    protected final int p(b0.d dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        int i11 = c.f13614a[dVar.ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    protected final int q(b0.d dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        int i11 = c.f13614a[dVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    /* JADX INFO: renamed from: r */
    protected abstract f0 getOpenDelegate();

    protected final void x(ya.b connection) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        boolean zS = s(connection);
        getOpenDelegate().a(connection);
        if (!zS) {
            f0.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
        }
        B(connection);
        getOpenDelegate().f(connection);
        u(connection);
    }

    protected final void y(ya.b connection, int oldVersion, int newVersion) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        List<ua.b> listB = wa.i.b(getConfiguration().migrationContainer, oldVersion, newVersion);
        if (listB == null) {
            if (!wa.i.d(getConfiguration(), oldVersion, newVersion)) {
                m(connection);
                v(connection);
                getOpenDelegate().a(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().i(connection);
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            ((ua.b) it.next()).a(connection);
        }
        f0.a aVarJ = getOpenDelegate().j(connection);
        if (aVarJ.isValid) {
            getOpenDelegate().h(connection);
            B(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + aVarJ.expectedFoundMsg).toString());
        }
    }

    protected final void z(ya.b connection) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        f(connection);
        getOpenDelegate().g(connection);
        w(connection);
        this.isConfigured = true;
    }
}
