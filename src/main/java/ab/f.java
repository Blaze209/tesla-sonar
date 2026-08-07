package ab;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import ezvcard.property.Gender;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 F2\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$JE\u0010.\u001a\u00020&2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000b2\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00101J)\u00103\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u00102\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010,0+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\u0011J\u0015\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R\u0016\u0010>\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0019R(\u0010E\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0B\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lab/f;", "Lza/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "Ljn0/h0;", "T", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "", "sql", "Lza/g;", "P2", "(Ljava/lang/String;)Lza/g;", "beginTransaction", "()V", "i0", "W0", "I", "n2", "g2", "", "y3", "()Z", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "l3", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lza/f;", "B0", "(Lza/f;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b1", "(Lza/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "d3", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "Q1", "(Ljava/lang/String;)V", "bindArgs", "h2", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "sqLiteDatabase", "b0", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "F3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", Gender.UNKNOWN, "()Ljava/util/List;", "attachedDbs", "b", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements za.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f881c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f882d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lazy<Method> f883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy<Method> f884f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase delegate;

    /* JADX INFO: renamed from: ab.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lab/f$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "c", "beginTransactionMethod", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method c() {
            return (Method) f.f884f.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method d() {
            return (Method) f.f883e.getValue();
        }

        private Companion() {
        }
    }

    static {
        p pVar = p.NONE;
        f883e = m.a(pVar, new wn0.a() { // from class: ab.d
            @Override // wn0.a
            public final Object invoke() {
                return f.J();
            }
        });
        f884f = m.a(pVar, new wn0.a() { // from class: ab.e
            @Override // wn0.a
            public final Object invoke() {
                return f.H();
            }
        });
    }

    public f(SQLiteDatabase delegate) {
        s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method H() {
        Class<?> returnType;
        try {
            Method methodD = INSTANCE.d();
            if (methodD == null || (returnType = methodD.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method J() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final void T(SQLiteTransactionListener transactionListener) throws IllegalAccessException, InvocationTargetException {
        Companion companion = INSTANCE;
        if (companion.c() == null || companion.d() == null) {
            if (transactionListener != null) {
                I(transactionListener);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        Method methodC = companion.c();
        s.h(methodC);
        Method methodD = companion.d();
        s.h(methodD);
        Object objInvoke = methodD.invoke(this.delegate, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodC.invoke(objInvoke, 0, transactionListener, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor c0(za.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        s.h(sQLiteQuery);
        fVar.o(new k(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e0(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor k0(za.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        s.h(sQLiteQuery);
        fVar.o(new k(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // za.c
    public Cursor B0(final za.f query) {
        s.k(query, "query");
        final r rVar = new r() { // from class: ab.b
            @Override // wn0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return f.c0(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ab.c
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return f.e0(rVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getCom.google.android.gms.actions.SearchIntents.EXTRA_QUERY java.lang.String(), f882d, null);
        s.j(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // za.c
    public boolean F3() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    public void I(SQLiteTransactionListener transactionListener) {
        s.k(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // za.c
    public za.g P2(String sql) {
        s.k(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        s.j(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new l(sQLiteStatementCompileStatement);
    }

    @Override // za.c
    public void Q1(String sql) {
        s.k(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // za.c
    public List<Pair<String, String>> U() {
        return this.delegate.getAttachedDbs();
    }

    @Override // za.c
    public void W0() throws IllegalAccessException, InvocationTargetException {
        T(null);
    }

    public final boolean b0(SQLiteDatabase sqLiteDatabase) {
        s.k(sqLiteDatabase, "sqLiteDatabase");
        return s.f(this.delegate, sqLiteDatabase);
    }

    @Override // za.c
    public Cursor b1(final za.f query, CancellationSignal cancellationSignal) {
        s.k(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: ab.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return f.k0(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        String query2 = query.getCom.google.android.gms.actions.SearchIntents.EXTRA_QUERY java.lang.String();
        String[] strArr = f882d;
        s.h(cancellationSignal);
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, query2, strArr, null, cancellationSignal);
        s.j(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // za.c
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // za.c
    public int d3(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs) {
        s.k(table, "table");
        s.k(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f881c[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str);
            objArr[i11] = values.get(str);
            sb2.append("=?");
            i11++;
        }
        if (whereArgs != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr[i12] = whereArgs[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        za.g gVarP2 = P2(sb2.toString());
        za.a.INSTANCE.b(gVarP2, objArr);
        return gVarP2.W();
    }

    @Override // za.c
    public void g2() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // za.c
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // za.c
    public void h2(String sql, Object[] bindArgs) {
        s.k(sql, "sql");
        s.k(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // za.c
    public void i0() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // za.c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // za.c
    public Cursor l3(String query) {
        s.k(query, "query");
        return B0(new za.a(query));
    }

    @Override // za.c
    public void n2() {
        this.delegate.endTransaction();
    }

    @Override // za.c
    public boolean y3() {
        return this.delegate.inTransaction();
    }
}
