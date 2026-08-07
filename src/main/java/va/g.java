package va;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import ezvcard.property.Gender;
import java.util.Arrays;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0015\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lva/g;", "Lza/d;", "Landroidx/room/f;", "delegate", "Lva/b;", "autoCloser", "<init>", "(Lza/d;Lva/b;)V", "Ljn0/h0;", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "Lza/d;", "getDelegate", "()Lza/d;", "b", "Lva/b;", "c", "()Lva/b;", "Lva/g$a;", "Lva/g$a;", "autoClosingDb", "Lza/c;", "getWritableDatabase", "()Lza/c;", "writableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements za.d, androidx.room.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.d delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final va.b autoCloser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a autoClosingDb;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010)\u001a\u00020!2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\t2\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010'\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010-\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0014R\u0016\u00106\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0014R(\u0010=\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0:\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lva/g$a;", "Lza/c;", "Lva/b;", "autoCloser", "<init>", "(Lva/b;)V", "Ljn0/h0;", "C", "()V", "", "sql", "Lza/g;", "P2", "(Ljava/lang/String;)Lza/g;", "beginTransaction", "i0", "n2", "g2", "", "y3", "()Z", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "l3", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lza/f;", "B0", "(Lza/f;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b1", "(Lza/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "d3", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "Q1", "(Ljava/lang/String;)V", "bindArgs", "h2", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "a", "Lva/b;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "F3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", Gender.UNKNOWN, "()Ljava/util/List;", "attachedDbs", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements za.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final va.b autoCloser;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p implements wn0.l<za.c, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f118525a = new b();

            b() {
                super(1, za.c.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(za.c p11) {
                s.k(p11, "p0");
                return Boolean.valueOf(p11.y3());
            }
        }

        public a(va.b autoCloser) {
            s.k(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 B(String str, Object[] objArr, za.c db2) {
            s.k(db2, "db");
            db2.h2(str, objArr);
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object H(za.c it) {
            s.k(it, "it");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int I(String str, int i11, ContentValues contentValues, String str2, Object[] objArr, za.c db2) {
            s.k(db2, "db");
            return db2.d3(str, i11, contentValues, str2, objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 t(String str, za.c db2) {
            s.k(db2, "db");
            db2.Q1(str);
            return h0.f84049a;
        }

        @Override // za.c
        public Cursor B0(za.f query) {
            s.k(query, "query");
            try {
                return new c(this.autoCloser.j().B0(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        public final void C() {
            this.autoCloser.h(new wn0.l() { // from class: va.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.a.H((za.c) obj);
                }
            });
        }

        @Override // za.c
        public boolean F3() {
            return ((Boolean) this.autoCloser.h(new f0() { // from class: va.g.a.c
                @Override // p013kotlin.jvm.internal.f0, co0.o
                public Object get(Object obj) {
                    return Boolean.valueOf(((za.c) obj).F3());
                }
            })).booleanValue();
        }

        @Override // za.c
        public za.g P2(String sql) {
            s.k(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        @Override // za.c
        public void Q1(final String sql) {
            s.k(sql, "sql");
            this.autoCloser.h(new wn0.l() { // from class: va.d
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.a.t(sql, (za.c) obj);
                }
            });
        }

        @Override // za.c
        public List<Pair<String, String>> U() {
            return (List) this.autoCloser.h(new f0() { // from class: va.g.a.a
                @Override // p013kotlin.jvm.internal.f0, co0.o
                public Object get(Object obj) {
                    return ((za.c) obj).U();
                }
            });
        }

        @Override // za.c
        public Cursor b1(za.f query, CancellationSignal cancellationSignal) {
            s.k(query, "query");
            try {
                return new c(this.autoCloser.j().b1(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // za.c
        public void beginTransaction() {
            try {
                this.autoCloser.j().beginTransaction();
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.f();
        }

        @Override // za.c
        public int d3(final String table, final int conflictAlgorithm, final ContentValues values, final String whereClause, final Object[] whereArgs) {
            s.k(table, "table");
            s.k(values, "values");
            return ((Number) this.autoCloser.h(new wn0.l() { // from class: va.c
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(g.a.I(table, conflictAlgorithm, values, whereClause, whereArgs, (za.c) obj));
                }
            })).intValue();
        }

        @Override // za.c
        public void g2() {
            za.c delegateDatabase = this.autoCloser.getDelegateDatabase();
            s.h(delegateDatabase);
            delegateDatabase.g2();
        }

        @Override // za.c
        public String getPath() {
            return (String) this.autoCloser.h(new f0() { // from class: va.g.a.d
                @Override // p013kotlin.jvm.internal.f0, co0.o
                public Object get(Object obj) {
                    return ((za.c) obj).getPath();
                }
            });
        }

        @Override // za.c
        public void h2(final String sql, final Object[] bindArgs) {
            s.k(sql, "sql");
            s.k(bindArgs, "bindArgs");
            this.autoCloser.h(new wn0.l() { // from class: va.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.a.B(sql, bindArgs, (za.c) obj);
                }
            });
        }

        @Override // za.c
        public void i0() {
            try {
                this.autoCloser.j().i0();
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // za.c
        public boolean isOpen() {
            za.c delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                return delegateDatabase.isOpen();
            }
            return false;
        }

        @Override // za.c
        public Cursor l3(String query) {
            s.k(query, "query");
            try {
                return new c(this.autoCloser.j().l3(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // za.c
        public void n2() {
            try {
                za.c delegateDatabase = this.autoCloser.getDelegateDatabase();
                s.h(delegateDatabase);
                delegateDatabase.n2();
            } finally {
                this.autoCloser.g();
            }
        }

        @Override // za.c
        public boolean y3() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.h(b.f118525a)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u0000 C2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010 \u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010 \u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lva/g$b;", "Lza/g;", "", "sql", "Lva/b;", "autoCloser", "<init>", "(Ljava/lang/String;Lva/b;)V", "T", "Lkotlin/Function1;", "block", "(Lwn0/l;)Ljava/lang/Object;", "", "columnType", "index", "Ljn0/h0;", "C", "(II)V", "Lza/e;", SearchIntents.EXTRA_QUERY, "t", "(Lza/e;)V", "close", "()V", "execute", "W", "()I", "", "F2", "()J", "A", "(I)V", "value", "x", "(IJ)V", "", "G", "(ID)V", "R0", "(ILjava/lang/String;)V", "", "y", "(I[B)V", "B", "a", "Ljava/lang/String;", "b", "Lva/b;", "", "c", "[I", "bindingTypes", "", DateTokenConverter.CONVERTER_KEY, "[J", "longBindings", "", "e", "[D", "doubleBindings", "", "f", "[Ljava/lang/String;", "stringBindings", "g", "[[B", "blobBindings", "h", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b implements za.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sql;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final va.b autoCloser;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings;

        public b(String sql, va.b autoCloser) {
            s.k(sql, "sql");
            s.k(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void C(int columnType, int index) {
            int i11 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i11) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
                s.j(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i11) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
                    s.j(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i11) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
                    s.j(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i11) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
                    s.j(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i11) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i11);
                s.j(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 H(za.g statement) {
            s.k(statement, "statement");
            statement.execute();
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long I(za.g obj) {
            s.k(obj, "obj");
            return obj.F2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int J(za.g obj) {
            s.k(obj, "obj");
            return obj.W();
        }

        private final <T> T T(final wn0.l<? super za.g, ? extends T> block) {
            return (T) this.autoCloser.h(new wn0.l() { // from class: va.k
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.b.b0(this.f118538a, block, (za.c) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object b0(b bVar, wn0.l lVar, za.c db2) {
            s.k(db2, "db");
            za.g gVarP2 = db2.P2(bVar.sql);
            bVar.t(gVarP2);
            return lVar.invoke(gVarP2);
        }

        private final void t(za.e query) {
            int length = this.bindingTypes.length;
            for (int i11 = 1; i11 < length; i11++) {
                int i12 = this.bindingTypes[i11];
                if (i12 == 1) {
                    query.x(i11, this.longBindings[i11]);
                } else if (i12 == 2) {
                    query.G(i11, this.doubleBindings[i11]);
                } else if (i12 == 3) {
                    String str = this.stringBindings[i11];
                    s.h(str);
                    query.R0(i11, str);
                } else if (i12 == 4) {
                    byte[] bArr = this.blobBindings[i11];
                    s.h(bArr);
                    query.y(i11, bArr);
                } else if (i12 == 5) {
                    query.A(i11);
                }
            }
        }

        @Override // za.e
        public void A(int index) {
            C(5, index);
            this.bindingTypes[index] = 5;
        }

        public void B() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // za.g
        public long F2() {
            return ((Number) T(new wn0.l() { // from class: va.i
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Long.valueOf(g.b.I((za.g) obj));
                }
            })).longValue();
        }

        @Override // za.e
        public void G(int index, double value) {
            C(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // za.e
        public void R0(int index, String value) {
            s.k(value, "value");
            C(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // za.g
        public int W() {
            return ((Number) T(new wn0.l() { // from class: va.h
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(g.b.J((za.g) obj));
                }
            })).intValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            B();
        }

        @Override // za.g
        public void execute() {
            T(new wn0.l() { // from class: va.j
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.b.H((za.g) obj);
                }
            });
        }

        @Override // za.e
        public void x(int index, long value) {
            C(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // za.e
        public void y(int index, byte[] value) {
            s.k(value, "value");
            C(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }
    }

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0014J \u0010\u001e\u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"J6\u0010$\u001a(\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0014\u0012\u000e\b\u0001\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b&\u0010\fJ \u0010(\u001a\n \u001d*\u0004\u0018\u00010'0'2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010\"J(\u0010-\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u00103J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b>\u0010\u0011J\u0010\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b?\u0010\tJ\u0010\u0010@\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b@\u0010\u0014J\u0010\u0010A\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bA\u0010\u0014J \u0010C\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bE\u0010DJ \u0010G\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bI\u0010HJ0\u0010L\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010J0J2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bP\u0010\u0014J \u0010R\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\n \u001d*\u0004\u0018\u00010Q0Q2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lva/g$c;", "Landroid/database/Cursor;", "delegate", "Lva/b;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lva/b;)V", "Ljn0/h0;", "close", "()V", "", "getCount", "()I", "getPosition", "p0", "", "move", "(I)Z", "moveToPosition", "moveToFirst", "()Z", "moveToLast", "moveToNext", "moveToPrevious", "isFirst", "isLast", "isBeforeFirst", "isAfterLast", "", "kotlin.jvm.PlatformType", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getColumnCount", "", "getBlob", "(I)[B", "getString", "Landroid/database/CharArrayBuffer;", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "", "getShort", "(I)S", "getInt", "(I)I", "", "getLong", "(I)J", "", "getFloat", "(I)F", "", "getDouble", "(I)D", "getType", "isNull", "deactivate", "requery", "isClosed", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "unregisterContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "unregisterDataSetObserver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "getNotificationUri", "()Landroid/net/Uri;", "getWantsAllOnMoveCalls", "Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "a", "Landroid/database/Cursor;", "b", "Lva/b;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Cursor delegate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final va.b autoCloser;

        public c(Cursor delegate, va.b autoCloser) {
            s.k(delegate, "delegate");
            s.k(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.g();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p11, CharArrayBuffer p12) {
            this.delegate.copyStringToBuffer(p11, p12);
        }

        @Override // android.database.Cursor
        @jn0.e
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p11) {
            return this.delegate.getBlob(p11);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p11) {
            return this.delegate.getColumnIndex(p11);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p11) {
            return this.delegate.getColumnIndexOrThrow(p11);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p11) {
            return this.delegate.getColumnName(p11);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p11) {
            return this.delegate.getDouble(p11);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p11) {
            return this.delegate.getFloat(p11);
        }

        @Override // android.database.Cursor
        public int getInt(int p11) {
            return this.delegate.getInt(p11);
        }

        @Override // android.database.Cursor
        public long getLong(int p11) {
            return this.delegate.getLong(p11);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p11) {
            return this.delegate.getShort(p11);
        }

        @Override // android.database.Cursor
        public String getString(int p11) {
            return this.delegate.getString(p11);
        }

        @Override // android.database.Cursor
        public int getType(int p11) {
            return this.delegate.getType(p11);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p11) {
            return this.delegate.isNull(p11);
        }

        @Override // android.database.Cursor
        public boolean move(int p11) {
            return this.delegate.move(p11);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p11) {
            return this.delegate.moveToPosition(p11);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p11) {
            this.delegate.registerContentObserver(p11);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p11) {
            this.delegate.registerDataSetObserver(p11);
        }

        @Override // android.database.Cursor
        @jn0.e
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p11) {
            return this.delegate.respond(p11);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle p11) {
            this.delegate.setExtras(p11);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p11, Uri p12) {
            this.delegate.setNotificationUri(p11, p12);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p11) {
            this.delegate.unregisterContentObserver(p11);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p11) {
            this.delegate.unregisterDataSetObserver(p11);
        }
    }

    public g(za.d delegate, va.b autoCloser) {
        s.k(delegate, "delegate");
        s.k(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new a(autoCloser);
        autoCloser.l(getDelegate());
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final va.b getAutoCloser() {
        return this.autoCloser;
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // za.d
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.room.f
    public za.d getDelegate() {
        return this.delegate;
    }

    @Override // za.d
    public za.c getWritableDatabase() {
        this.autoClosingDb.C();
        return this.autoClosingDb;
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
