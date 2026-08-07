package a20;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ch.qos.logback.core.CoreConstants;
import h20.g;
import java.io.File;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"La20/a;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "databaseName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/database/sqlite/SQLiteDatabase;", "database", "Ljn0/h0;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44b = a.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, a> f45c = new HashMap<>();

    /* JADX INFO: renamed from: a20.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u001dj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"La20/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "newDatabaseFilename", "", "b", "(Landroid/content/Context;Ljava/lang/String;)Z", "namespace", "La20/a;", "a", "(Landroid/content/Context;Ljava/lang/String;)La20/a;", "COLUMN_DATE_CREATED", "Ljava/lang/String;", "COLUMN_EVENT_DATA", "COLUMN_ID", "DATABASE_NAME", "", "DATABASE_VERSION", "I", "METADATA_DATE_CREATED", "METADATA_EVENT_DATA", "METADATA_ID", "TABLE_EVENTS", "kotlin.jvm.PlatformType", "TAG", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "instances", "Ljava/util/HashMap;", "queryCreateTable", "queryDropTable", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Context context, String newDatabaseFilename) {
            File databasePath = context.getDatabasePath("snowplowEvents.sqlite");
            File databasePath2 = context.getDatabasePath("snowplowEvents.sqlite-wal");
            File databasePath3 = context.getDatabasePath("snowplowEvents.sqlite-shm");
            File parentFile = databasePath.getParentFile();
            File file = new File(parentFile, newDatabaseFilename);
            File file2 = new File(parentFile, newDatabaseFilename + "-wal");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(newDatabaseFilename);
            sb2.append("-shm");
            return databasePath.renameTo(file) && databasePath2.renameTo(file2) && databasePath3.renameTo(new File(parentFile, sb2.toString()));
        }

        public final synchronized a a(Context context, String namespace) {
            s.k(context, "context");
            s.k(namespace, "namespace");
            if (a.f45c.containsKey(namespace)) {
                Object obj = a.f45c.get(namespace);
                s.h(obj);
                return (a) obj;
            }
            String str = "snowplowEvents-" + new q("[^a-zA-Z0-9_]+").j(namespace, "-") + ".sqlite";
            b(context, str);
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "context.applicationContext");
            a aVar = new a(applicationContext, str, null);
            a.f45c.put(namespace, aVar);
            return aVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(Context context, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase database) {
        s.k(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        s.k(database, "database");
        String TAG = f44b;
        s.j(TAG, "TAG");
        g.a(TAG, "Upgrade not implemented, resetting database...", new Object[0]);
        database.execSQL("DROP TABLE IF EXISTS 'events'");
        onCreate(database);
    }

    private a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
