package ab;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.UUID;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003\u0017\u0013\u0015B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010'\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b#\u0010$*\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lab/h;", "Lza/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lza/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lza/d$a;ZZ)V", "enabled", "Ljn0/h0;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lza/d$a;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lkotlin/Lazy;", "Lab/h$c;", "f", "Lkotlin/Lazy;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "n", "()Lab/h$c;", "getDelegate$delegate", "(Lab/h;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lza/c;", "getWritableDatabase", "()Lza/c;", "writableDatabase", "h", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements za.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final za.d.a callback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useNoBackupDirectory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDataLossOnRecovery;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy<c> lazyDelegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lab/h$b;", "", "Lab/f;", "db", "<init>", "(Lab/f;)V", "a", "Lab/f;", "()Lab/f;", "b", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private f db;

        public b(f fVar) {
            this.db = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getDb() {
            return this.db;
        }

        public final void b(f fVar) {
            this.db = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 @2\u00020\u0001:\u0003(,0B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105¨\u0006A"}, d2 = {"Lab/h$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lab/h$b;", "dbRef", "Lza/d$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lab/h$b;Lza/d$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "B", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "t", "Lza/c;", "o", "(Z)Lza/c;", "sqLiteDatabase", "Lab/f;", "p", "(Landroid/database/sqlite/SQLiteDatabase;)Lab/f;", "Ljn0/h0;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lab/h$b;", "getDbRef", "()Lab/h$b;", "c", "Lza/d$a;", "getCallback", "()Lza/d$a;", DateTokenConverter.CONVERTER_KEY, "Z", "getAllowDataLossOnRecovery", "()Z", "e", "migrated", "Lbb/a;", "f", "Lbb/a;", "lock", "g", "opened", "h", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b dbRef;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final za.d.a callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean migrated;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final bb.a lock;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean opened;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lab/h$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lab/h$c$b;", "callbackName", "", "cause", "<init>", "(Lab/h$c$b;Ljava/lang/Throwable;)V", "a", "Lab/h$c$b;", "()Lab/h$c$b;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final b callbackName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                s.k(callbackName, "callbackName");
                s.k(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lab/h$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: ab.h$c$c, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lab/h$c$c;", "", "<init>", "()V", "Lab/h$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lab/f;", "a", "(Lab/h$b;Landroid/database/sqlite/SQLiteDatabase;)Lab/f;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                s.k(refHolder, "refHolder");
                s.k(sqLiteDatabase, "sqLiteDatabase");
                f db2 = refHolder.getDb();
                if (db2 != null && db2.b0(sqLiteDatabase)) {
                    return db2;
                }
                f fVar = new f(sqLiteDatabase);
                refHolder.b(fVar);
                return fVar;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f906a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f906a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final za.d.a callback, boolean z11) {
            String string;
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: ab.i
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    h.c.n(callback, dbRef, sQLiteDatabase);
                }
            });
            s.k(context, "context");
            s.k(dbRef, "dbRef");
            s.k(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z11;
            if (str == null) {
                string = UUID.randomUUID().toString();
                s.j(string, "toString(...)");
            } else {
                string = str;
            }
            this.lock = new bb.a(string, context.getCacheDir(), false);
        }

        private final SQLiteDatabase B(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.opened;
            if (databaseName != null && !z11 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return t(writable);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return t(writable);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i11 = d.f906a[aVar.getCallbackName().ordinal()];
                        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                            throw cause;
                        }
                        if (i11 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return t(writable);
                    } catch (a e11) {
                        throw e11.getCause();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(za.d.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            Companion companion = INSTANCE;
            s.h(sQLiteDatabase);
            aVar.c(companion.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase t(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                s.h(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            s.h(readableDatabase);
            return readableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                bb.a.c(this.lock, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.lock.d();
            }
        }

        public final za.c o(boolean writable) {
            za.c cVarP;
            try {
                this.lock.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseB = B(writable);
                if (this.migrated) {
                    close();
                    cVarP = o(writable);
                } else {
                    cVarP = p(sQLiteDatabaseB);
                }
                return cVarP;
            } finally {
                this.lock.d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            s.k(db2, "db");
            if (!this.migrated && this.callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.b(p(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            s.k(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.d(p(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
            s.k(db2, "db");
            this.migrated = true;
            try {
                this.callback.e(p(db2), oldVersion, newVersion);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            s.k(db2, "db");
            if (!this.migrated) {
                try {
                    this.callback.f(p(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            s.k(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.g(p(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }

        public final f p(SQLiteDatabase sqLiteDatabase) {
            s.k(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }
    }

    public h(Context context, String str, za.d.a callback, boolean z11, boolean z12) {
        s.k(context, "context");
        s.k(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z11;
        this.allowDataLossOnRecovery = z12;
        this.lazyDelegate = m.b(new wn0.a() { // from class: ab.g
            @Override // wn0.a
            public final Object invoke() {
                return h.o(this.f886a);
            }
        });
    }

    private final c n() {
        return this.lazyDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c o(h hVar) {
        c cVar;
        if (hVar.name == null || !hVar.useNoBackupDirectory) {
            cVar = new c(hVar.context, hVar.name, new b(null), hVar.callback, hVar.allowDataLossOnRecovery);
        } else {
            cVar = new c(hVar.context, new File(za.b.a(hVar.context), hVar.name).getAbsolutePath(), new b(null), hVar.callback, hVar.allowDataLossOnRecovery);
        }
        cVar.setWriteAheadLoggingEnabled(hVar.writeAheadLoggingEnabled);
        return cVar;
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            n().close();
        }
    }

    @Override // za.d
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // za.d
    public za.c getWritableDatabase() {
        return n().o(true);
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.isInitialized()) {
            n().setWriteAheadLoggingEnabled(enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }
}
