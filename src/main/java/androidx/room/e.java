package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0016\u0018\u00002\u00020\u0001Bí\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n\u0012\u0006\u0010&\u001a\u00020\r\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u009f\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\b\b\u0002\u0010&\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b6\u0010HR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010:R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010:R\u0014\u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010<R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010<R\"\u0010Z\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010<\u001a\u0004\b8\u0010X\"\u0004\b;\u0010Y¨\u0006["}, d2 = {"Landroidx/room/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lza/d$c;", "sqliteOpenHelperFactory", "Landroidx/room/b0$e;", "migrationContainer", "", "Landroidx/room/b0$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/b0$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/b0$f;", "prepackagedDatabaseCallback", "typeConverters", "Lua/a;", "autoMigrationSpecs", "allowDestructiveMigrationForAllTables", "Lya/c;", "sqliteDriver", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lza/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;Ljava/util/List;ZLya/c;Lkotlin/coroutines/CoroutineContext;)V", "fromVersion", "toVersion", "e", "(II)Z", "a", "(Landroid/content/Context;Ljava/lang/String;Lza/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;Ljava/util/List;ZLya/c;Lkotlin/coroutines/CoroutineContext;)Landroidx/room/e;", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lza/d$c;", DateTokenConverter.CONVERTER_KEY, "Landroidx/room/b0$e;", "Ljava/util/List;", "f", "Z", "g", "Landroidx/room/b0$d;", "h", "Ljava/util/concurrent/Executor;", IntegerTokenConverter.CONVERTER_KEY, "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "()Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "r", "s", "t", "Lya/c;", "u", "Lkotlin/coroutines/CoroutineContext;", "v", "multiInstanceInvalidation", "w", "()Z", "(Z)V", "useTempTrackingTable", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final za.d.c sqliteOpenHelperFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final b0.e migrationContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final List<b0.b> callbacks;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final b0.d journalMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Executor queryExecutor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Executor transactionExecutor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Intent multiInstanceInvalidationServiceIntent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean requireMigration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> migrationNotRequiredFrom;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final File copyFromFile;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final List<Object> typeConverters;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final List<ua.a> autoMigrationSpecs;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final boolean allowDestructiveMigrationForAllTables;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final ya.c sqliteDriver;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext queryCoroutineContext;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final boolean multiInstanceInvalidation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public e(Context context, String str, za.d.c cVar, b0.e migrationContainer, List<? extends b0.b> list, boolean z11, b0.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar, List<? extends Object> typeConverters, List<? extends ua.a> autoMigrationSpecs, boolean z14, ya.c cVar2, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(migrationContainer, "migrationContainer");
        p013kotlin.jvm.internal.s.k(journalMode, "journalMode");
        p013kotlin.jvm.internal.s.k(queryExecutor, "queryExecutor");
        p013kotlin.jvm.internal.s.k(transactionExecutor, "transactionExecutor");
        p013kotlin.jvm.internal.s.k(typeConverters, "typeConverters");
        p013kotlin.jvm.internal.s.k(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = cVar;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z11;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z12;
        this.allowDestructiveMigrationOnDowngrade = z13;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z14;
        this.sqliteDriver = cVar2;
        this.queryCoroutineContext = coroutineContext;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e b(e eVar, Context context, String str, za.d.c cVar, b0.e eVar2, List list, boolean z11, b0.d dVar, Executor executor, Executor executor2, Intent intent, boolean z12, boolean z13, Set set, String str2, File file, Callable callable, b0.f fVar, List list2, List list3, boolean z14, ya.c cVar2, CoroutineContext coroutineContext, int i11, Object obj) {
        b0.f fVar2;
        CoroutineContext coroutineContext2;
        ya.c cVar3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i11 & 1) != 0 ? eVar.context : context;
        String str3 = (i11 & 2) != 0 ? eVar.name : str;
        za.d.c cVar4 = (i11 & 4) != 0 ? eVar.sqliteOpenHelperFactory : cVar;
        b0.e eVar3 = (i11 & 8) != 0 ? eVar.migrationContainer : eVar2;
        List list4 = (i11 & 16) != 0 ? eVar.callbacks : list;
        boolean z15 = (i11 & 32) != 0 ? eVar.allowMainThreadQueries : z11;
        b0.d dVar2 = (i11 & 64) != 0 ? eVar.journalMode : dVar;
        Executor executor3 = (i11 & 128) != 0 ? eVar.queryExecutor : executor;
        Executor executor4 = (i11 & 256) != 0 ? eVar.transactionExecutor : executor2;
        Intent intent2 = (i11 & 512) != 0 ? eVar.multiInstanceInvalidationServiceIntent : intent;
        boolean z16 = (i11 & 1024) != 0 ? eVar.requireMigration : z12;
        boolean z17 = (i11 & 2048) != 0 ? eVar.allowDestructiveMigrationOnDowngrade : z13;
        Set set2 = (i11 & 4096) != 0 ? eVar.migrationNotRequiredFrom : set;
        String str4 = (i11 & PKIFailureInfo.certRevoked) != 0 ? eVar.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i11 & 16384) != 0 ? eVar.copyFromFile : file;
        Callable callable2 = (i11 & 32768) != 0 ? eVar.copyFromInputStream : callable;
        if ((i11 & 65536) != 0) {
            eVar.getClass();
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        Callable callable3 = callable2;
        List list5 = (i11 & 131072) != 0 ? eVar.typeConverters : list2;
        List list6 = (i11 & 262144) != 0 ? eVar.autoMigrationSpecs : list3;
        boolean z18 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? eVar.allowDestructiveMigrationForAllTables : z14;
        ya.c cVar5 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? eVar.sqliteDriver : cVar2;
        if ((i11 & PKIFailureInfo.badSenderNonce) != 0) {
            cVar3 = cVar5;
            coroutineContext2 = eVar.queryCoroutineContext;
        } else {
            coroutineContext2 = coroutineContext;
            cVar3 = cVar5;
        }
        return eVar.a(context3, str3, cVar4, eVar3, list4, z15, dVar2, executor3, executor4, intent2, z16, z17, set2, str4, file2, callable3, fVar2, list5, list6, z18, cVar3, coroutineContext2);
    }

    public final e a(Context context, String name, za.d.c sqliteOpenHelperFactory, b0.e migrationContainer, List<? extends b0.b> callbacks, boolean allowMainThreadQueries, b0.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent multiInstanceInvalidationServiceIntent, boolean requireMigration, boolean allowDestructiveMigrationOnDowngrade, Set<Integer> migrationNotRequiredFrom, String copyFromAssetPath, File copyFromFile, Callable<InputStream> copyFromInputStream, b0.f prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends ua.a> autoMigrationSpecs, boolean allowDestructiveMigrationForAllTables, ya.c sqliteDriver, CoroutineContext queryCoroutineContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(migrationContainer, "migrationContainer");
        p013kotlin.jvm.internal.s.k(journalMode, "journalMode");
        p013kotlin.jvm.internal.s.k(queryExecutor, "queryExecutor");
        p013kotlin.jvm.internal.s.k(transactionExecutor, "transactionExecutor");
        p013kotlin.jvm.internal.s.k(typeConverters, "typeConverters");
        p013kotlin.jvm.internal.s.k(autoMigrationSpecs, "autoMigrationSpecs");
        return new e(context, name, sqliteOpenHelperFactory, migrationContainer, callbacks, allowMainThreadQueries, journalMode, queryExecutor, transactionExecutor, multiInstanceInvalidationServiceIntent, requireMigration, allowDestructiveMigrationOnDowngrade, migrationNotRequiredFrom, copyFromAssetPath, copyFromFile, copyFromInputStream, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, allowDestructiveMigrationForAllTables, sqliteDriver, queryCoroutineContext);
    }

    public final Set<Integer> c() {
        return this.migrationNotRequiredFrom;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public boolean e(int fromVersion, int toVersion) {
        return wa.i.d(this, fromVersion, toVersion);
    }

    public final void f(boolean z11) {
        this.useTempTrackingTable = z11;
    }
}
