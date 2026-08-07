package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u001d\b&\u0018\u0000 ®\u00012\u00020\u0001:\f¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J)\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0012J#\u0010\u0017\u001a\u00020\t2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u001a\u0010\"\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0\r\u0012\u0004\u0012\u00020!0 H\u0017¢\u0006\u0004\b%\u0010&J1\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u001a\u0010\"\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0\u0011\u0012\u0004\u0012\u00020!0 H\u0017¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0018H\u0015¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0015¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H$¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000204H\u0000¢\u0006\u0004\b7\u00106J)\u00109\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0#0 H\u0015¢\u0006\u0004\b9\u0010:J)\u0010;\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110#0 H\u0015¢\u0006\u0004\b;\u0010:J\u001d\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0\r0<H\u0017¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0\u00110<H\u0017¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\tH'¢\u0006\u0004\b@\u0010\u0003J+\u0010F\u001a\u00020\t2\u0006\u0010B\u001a\u00020A2\u0012\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0C\"\u00020DH\u0005¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\tH\u0017¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\tH\u0017¢\u0006\u0004\bJ\u0010\u0003JB\u0010S\u001a\u00028\u0000\"\u0004\b\u0000\u0010K2\u0006\u0010L\u001a\u00020A2\"\u0010P\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020N\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000O\u0012\u0006\u0012\u0004\u0018\u00010\u00010MH\u0080@¢\u0006\u0004\bQ\u0010RJ\u000f\u0010V\u001a\u00020AH\u0000¢\u0006\u0004\bT\u0010UJ+\u0010W\u001a\u00020Y2\u0006\u0010W\u001a\u00020D2\u0012\u0010X\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010CH\u0016¢\u0006\u0004\bW\u0010ZJ#\u0010W\u001a\u00020Y2\u0006\u0010W\u001a\u00020[2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\H\u0017¢\u0006\u0004\bW\u0010^J\u0017\u0010a\u001a\u00020`2\u0006\u0010_\u001a\u00020DH\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\tH\u0017¢\u0006\u0004\bc\u0010\u0003J\u000f\u0010d\u001a\u00020\tH\u0017¢\u0006\u0004\bd\u0010\u0003J\u000f\u0010e\u001a\u00020\tH\u0017¢\u0006\u0004\be\u0010\u0003J\u0017\u0010h\u001a\u00020\t2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ#\u0010h\u001a\u00028\u0000\"\u0004\b\u0000\u0010j2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000kH\u0016¢\u0006\u0004\bh\u0010lJ\u0017\u0010o\u001a\u00020\t2\u0006\u0010n\u001a\u00020mH\u0015¢\u0006\u0004\bo\u0010pJ\u0017\u0010o\u001a\u00020\t2\u0006\u0010r\u001a\u00020qH\u0005¢\u0006\u0004\bo\u0010sJ\u000f\u0010t\u001a\u00020AH\u0016¢\u0006\u0004\bt\u0010UR\u001e\u0010u\u001a\u0004\u0018\u00010m8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bu\u0010v\u0012\u0004\bw\u0010\u0003R\u0016\u0010x\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u007f\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u008c\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008b\u0001\u0018\u00010#8\u0004@\u0004X\u0085\u000e¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u0012\u0005\b\u008e\u0001\u0010\u0003R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R$\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018G¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R(\u0010\u0099\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u00010\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R(\u0010\u009b\u0001\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u008a\u0001\u001a\u0005\b\u009c\u0001\u0010U\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010¡\u0001\u001a\u00020|8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010£\u0001\u001a\u00020|8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010 \u0001R\u0016\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010§\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u00100R0\u0010©\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110#0 8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010:R\u0016\u0010ª\u0001\u001a\u00020A8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010UR\u0013\u0010«\u0001\u001a\u00020A8G¢\u0006\u0007\u001a\u0005\b«\u0001\u0010UR\u0016\u0010\u00ad\u0001\u001a\u00020A8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010U¨\u0006µ\u0001"}, d2 = {"Landroidx/room/b0;", "", "<init>", "()V", "Lza/d;", "T", "openHelper", "unwrapOpenHelper", "(Lza/d;)Lza/d;", "Ljn0/h0;", "onClosed", "internalBeginTransaction", "internalEndTransaction", "Ljava/lang/Class;", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lco0/d;", "(Lco0/d;)Ljava/lang/Object;", "kclass", "converter", "addTypeConverter$room_runtime_release", "(Lco0/d;Ljava/lang/Object;)V", "addTypeConverter", "Landroidx/room/e;", "configuration", "init", "(Landroidx/room/e;)V", "Landroidx/room/x;", "createConnectionManager$room_runtime_release", "(Landroidx/room/e;)Landroidx/room/x;", "createConnectionManager", "", "Lua/a;", "autoMigrationSpecs", "", "Lua/b;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "createAutoMigrations", "config", "createOpenHelper", "(Landroidx/room/e;)Lza/d;", "Landroidx/room/g0;", "createOpenDelegate", "()Landroidx/room/g0;", "Landroidx/room/p;", "createInvalidationTracker", "()Landroidx/room/p;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getQueryContext", "()Lkotlin/coroutines/CoroutineContext;", "getTransactionContext$room_runtime_release", "getTransactionContext", "getRequiredTypeConverters", "()Ljava/util/Map;", "getRequiredTypeConverterClasses", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "getRequiredAutoMigrationSpecClasses", "clearAllTables", "", "hasForeignKeys", "", "", "tableNames", "performClear", "(Z[Ljava/lang/String;)V", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "R", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/s0;", "Lkotlin/coroutines/Continuation;", "block", "useConnection$room_runtime_release", "(ZLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useConnection", "inCompatibilityMode$room_runtime_release", "()Z", "inCompatibilityMode", SearchIntents.EXTRA_QUERY, "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lza/f;", "Landroid/os/CancellationSignal;", "signal", "(Lza/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Lza/g;", "compileStatement", "(Ljava/lang/String;)Lza/g;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lza/c;", "db", "internalInitInvalidationTracker", "(Lza/c;)V", "Lya/b;", "connection", "(Lya/b;)V", "inTransaction", "mDatabase", "Lza/c;", "getMDatabase$annotations", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transactionContext", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "connectionManager", "Landroidx/room/x;", "internalTracker", "Landroidx/room/p;", "Lra/a;", "closeBarrier", "Lra/a;", "getCloseBarrier$room_runtime_release", "()Lra/a;", "allowMainThreadQueries", "Z", "Landroidx/room/b0$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "Lva/b;", "autoCloser", "Lva/b;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "", "typeConverters", "Ljava/util/Map;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime_release", "setUseTempTrackingTable$room_runtime_release", "(Z)V", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Lza/d;", "getInvalidationTracker", "invalidationTracker", "getRequiredTypeConverterClassesMap$room_runtime_release", "requiredTypeConverterClassesMap", "isOpen", "isOpenInternal", "isMainThread$room_runtime_release", "isMainThread", "Companion", DateTokenConverter.CONVERTER_KEY, "a", "e", "b", "f", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b0 {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private va.b autoCloser;
    private x connectionManager;
    private CoroutineScope coroutineScope;
    private Executor internalQueryExecutor;
    private p internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile za.c mDatabase;
    private CoroutineContext transactionContext;
    private final ra.a closeBarrier = new ra.a(new g(this));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<co0.d<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010-R\u0016\u0010X\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u0016\u0010Z\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00107R\u0016\u0010\\\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00107R\u0018\u0010^\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010)R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u00107¨\u0006r"}, d2 = {"Landroidx/room/b0$a;", "Landroidx/room/b0;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Lza/d$c;", "factory", "g", "(Lza/d$c;)Landroidx/room/b0$a;", "", "Lua/b;", "migrations", "b", "([Lua/b;)Landroidx/room/b0$a;", "c", "()Landroidx/room/b0$a;", "Ljava/util/concurrent/Executor;", "executor", "h", "(Ljava/util/concurrent/Executor;)Landroidx/room/b0$a;", "e", "", "dropAllTables", "f", "(Z)Landroidx/room/b0$a;", "Landroidx/room/b0$b;", "callback", "a", "(Landroidx/room/b0$b;)Landroidx/room/b0$a;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/room/b0;", "Lco0/d;", "Lco0/d;", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/Function0;", "Lwn0/a;", "", "Ljava/util/List;", "callbacks", "typeConverters", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", IntegerTokenConverter.CONVERTER_KEY, "Lza/d$c;", "supportOpenHelperFactory", "j", "Z", "allowMainThreadQueries", "Landroidx/room/b0$d;", "k", "Landroidx/room/b0$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "", "m", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "n", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/b0$e;", "o", "Landroidx/room/b0$e;", "migrationContainer", "", "", "p", "Ljava/util/Set;", "migrationsNotRequiredFrom", "q", "migrationStartAndEndVersions", "Lua/a;", "r", "autoMigrationSpecs", "s", "requireMigration", "t", "allowDestructiveMigrationOnDowngrade", "u", "allowDestructiveMigrationForAllTables", "v", "copyFromAssetPath", "Ljava/io/File;", "w", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "x", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Lya/c;", "y", "Lya/c;", "driver", "Lkotlin/coroutines/CoroutineContext;", "z", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "A", "inMemoryTrackingTableMode", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a<T extends b0> {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private boolean inMemoryTrackingTableMode;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final co0.d<T> klass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<T> factory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<b> callbacks;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<Object> typeConverters;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Executor queryExecutor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Executor transactionExecutor;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private za.d.c supportOpenHelperFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private d journalMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private long autoCloseTimeout;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final e migrationContainer;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Set<Integer> migrationsNotRequiredFrom;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final Set<Integer> migrationStartAndEndVersions;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final List<ua.a> autoMigrationSpecs;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean requireMigration;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationForAllTables;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private String copyFromAssetPath;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private File copyFromFile;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private Callable<InputStream> copyFromInputStream;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private ya.c driver;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext queryCoroutineContext;

        public a(Context context, Class<T> klass, String str) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = d.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new e();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = vn0.a.e(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        public a<T> a(b callback) {
            p013kotlin.jvm.internal.s.k(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public a<T> b(ua.b... migrations) {
            p013kotlin.jvm.internal.s.k(migrations, "migrations");
            for (ua.b bVar : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.endVersion));
            }
            this.migrationContainer.b((ua.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a<T> c() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T d() {
            za.d.c nVar;
            za.d.c cVar;
            T tInvoke;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorF = p.c.f();
                this.transactionExecutor = executorF;
                this.queryExecutor = executorF;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            c0.b(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            ya.c cVar2 = this.driver;
            if (cVar2 == null && this.supportOpenHelperFactory == null) {
                nVar = new ab.j();
            } else if (cVar2 == null) {
                nVar = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                nVar = null;
            }
            boolean z11 = this.autoCloseTimeout > 0;
            boolean z12 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            if (nVar != null) {
                if (z11) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j11 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    nVar = new va.l(nVar, new va.b(j11, timeUnit, null, 4, null));
                }
                if (z12) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i11 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i12 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i11 + i12 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    nVar = new va.n(str, file, callable, nVar);
                }
                cVar = nVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (z11) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z12) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z13 = this.allowMainThreadQueries;
            d dVarResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor2 = this.queryExecutor;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.transactionExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            androidx.room.e eVar2 = new androidx.room.e(context, str2, cVar, eVar, list, z13, dVarResolve$room_runtime_release, executor2, executor3, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            eVar2.f(this.inMemoryTrackingTableMode);
            wn0.a<T> aVar = this.factory;
            if (aVar == null || (tInvoke = aVar.invoke()) == null) {
                tInvoke = (T) wa.g.b(vn0.a.b(this.klass), null, 2, null);
            }
            tInvoke.init(eVar2);
            return tInvoke;
        }

        @jn0.e
        public a<T> e() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public final a<T> f(boolean dropAllTables) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        public a<T> g(za.d.c factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        public a<T> h(Executor executor) {
            p013kotlin.jvm.internal.s.k(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/room/b0$b;", "", "<init>", "()V", "Lza/c;", "db", "Ljn0/h0;", "b", "(Lza/c;)V", "Lya/b;", "connection", "a", "(Lya/b;)V", DateTokenConverter.CONVERTER_KEY, "c", "f", "e", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {
        public void a(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            if (connection instanceof ta.a) {
                b(((ta.a) connection).getDb());
            }
        }

        public void b(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
        }

        public void c(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            if (connection instanceof ta.a) {
                d(((ta.a) connection).getDb());
            }
        }

        public void d(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
        }

        public void e(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            if (connection instanceof ta.a) {
                f(((ta.a) connection).getDb());
            }
        }

        public void f(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/room/b0$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/b0$d;", "resolve", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public final d resolve$room_runtime_release(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Landroidx/room/b0$e;", "", "<init>", "()V", "", "Lua/b;", "migrations", "Ljn0/h0;", "b", "([Lua/b;)V", "migration", "a", "(Lua/b;)V", "", "", "e", "()Ljava/util/Map;", "start", "end", "", DateTokenConverter.CONVERTER_KEY, "(II)Ljava/util/List;", "startVersion", "endVersion", "", "c", "(II)Z", "migrationStart", "Lkotlin/Pair;", "", "g", "(I)Lkotlin/Pair;", "f", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<Integer, TreeMap<Integer, ua.b>> migrations = new LinkedHashMap();

        public final void a(ua.b migration) {
            p013kotlin.jvm.internal.s.k(migration, "migration");
            int i11 = migration.startVersion;
            int i12 = migration.endVersion;
            Map<Integer, TreeMap<Integer, ua.b>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i11);
            TreeMap<Integer, ua.b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, ua.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i12))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i12)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i12), migration);
        }

        public void b(ua.b... migrations) {
            p013kotlin.jvm.internal.s.k(migrations, "migrations");
            for (ua.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int startVersion, int endVersion) {
            return wa.i.a(this, startVersion, endVersion);
        }

        public List<ua.b> d(int start, int end) {
            return wa.i.b(this, start, end);
        }

        public Map<Integer, Map<Integer, ua.b>> e() {
            return this.migrations;
        }

        public final Pair<Map<Integer, ua.b>, Iterable<Integer>> f(int migrationStart) {
            TreeMap<Integer, ua.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return jn0.x.a(treeMap, treeMap.descendingKeySet());
        }

        public final Pair<Map<Integer, ua.b>, Iterable<Integer>> g(int migrationStart) {
            TreeMap<Integer, ua.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return jn0.x.a(treeMap, treeMap.keySet());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/b0$f;", "", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.a<jn0.h0> {
        g(Object obj) {
            super(0, obj, b0.class, "onClosed", "onClosed()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            o();
            return jn0.h0.f84049a;
        }

        public final void o() {
            ((b0) this.receiver).onClosed();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", i = {}, l = {HttpStatusCode.BAD_GATEWAY_502}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13646n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f13648p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String[] f13649q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/s0;", "connection", "Ljn0/h0;", "<anonymous>", "(Landroidx/room/s0;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 2, 3, 4}, l = {503, 504, 506, 512, 513, SyslogConstants.SYSLOG_PORT}, m = "invokeSuspend", n = {"connection", "connection", "connection", "connection", "connection"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
        static final class a extends SuspendLambda implements wn0.p<s0, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13650n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f13651o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ b0 f13652p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f13653q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String[] f13654r;

            /* JADX INFO: renamed from: androidx.room.b0$h$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/r0;", "Ljn0/h0;", "<anonymous>", "(Landroidx/room/r0;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 1}, l = {508, 510}, m = "invokeSuspend", n = {"$this$withTransaction", "$this$withTransaction", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
            static final class C0224a extends SuspendLambda implements wn0.p<r0<jn0.h0>, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f13655n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f13656o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f13657p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f13658q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private /* synthetic */ Object f13659r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ boolean f13660s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String[] f13661t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0224a(boolean z11, String[] strArr, Continuation<? super C0224a> continuation) {
                    super(2, continuation);
                    this.f13660s = z11;
                    this.f13661t = strArr;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(r0<jn0.h0> r0Var, Continuation<? super jn0.h0> continuation) {
                    return ((C0224a) create(r0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    C0224a c0224a = new C0224a(this.f13660s, this.f13661t, continuation);
                    c0224a.f13659r = obj;
                    return c0224a;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0051  */
                /* JADX WARN: Code duplicated, block: B:21:0x007c  */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
                
                    if (androidx.room.u0.b(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
                
                    if (androidx.room.u0.b(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Instruction removed from duplicated block: B:17:0x0051, please report this as an issue */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r9.f13658q
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r3) goto L26
                        if (r1 != r2) goto L1e
                        int r1 = r9.f13657p
                        int r4 = r9.f13656o
                        java.lang.Object r5 = r9.f13655n
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r9.f13659r
                        androidx.room.r0 r6 = (androidx.room.r0) r6
                        jn0.t.b(r10)
                        goto L7a
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r1 = r9.f13659r
                        androidx.room.r0 r1 = (androidx.room.r0) r1
                        jn0.t.b(r10)
                        goto L47
                    L2e:
                        jn0.t.b(r10)
                        java.lang.Object r10 = r9.f13659r
                        r1 = r10
                        androidx.room.r0 r1 = (androidx.room.r0) r1
                        boolean r10 = r9.f13660s
                        if (r10 == 0) goto L47
                        r9.f13659r = r1
                        r9.f13658q = r3
                        java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r10 = androidx.room.u0.b(r1, r10, r9)
                        if (r10 != r0) goto L47
                        goto L79
                    L47:
                        java.lang.String[] r10 = r9.f13661t
                        int r4 = r10.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r10
                    L4f:
                        if (r4 >= r1) goto L7c
                        r10 = r5[r4]
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "DELETE FROM `"
                        r7.append(r8)
                        r7.append(r10)
                        r10 = 96
                        r7.append(r10)
                        java.lang.String r10 = r7.toString()
                        r9.f13659r = r6
                        r9.f13655n = r5
                        r9.f13656o = r4
                        r9.f13657p = r1
                        r9.f13658q = r2
                        java.lang.Object r10 = androidx.room.u0.b(r6, r10, r9)
                        if (r10 != r0) goto L7a
                    L79:
                        return r0
                    L7a:
                        int r4 = r4 + r3
                        goto L4f
                    L7c:
                        jn0.h0 r10 = jn0.h0.f84049a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.b0.h.a.C0224a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, boolean z11, String[] strArr, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f13652p = b0Var;
                this.f13653q = z11;
                this.f13654r = strArr;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s0 s0Var, Continuation<? super jn0.h0> continuation) {
                return ((a) create(s0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f13652p, this.f13653q, this.f13654r, continuation);
                aVar.f13651o = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x005f  */
            /* JADX WARN: Code duplicated, block: B:21:0x0071 A[PHI: r1
              0x0071: PHI (r1v7 androidx.room.s0) = (r1v4 androidx.room.s0), (r1v4 androidx.room.s0), (r1v9 androidx.room.s0) binds: [B:17:0x005d, B:19:0x006e, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:24:0x0088 A[PHI: r1
              0x0088: PHI (r1v10 androidx.room.s0) = (r1v7 androidx.room.s0), (r1v12 androidx.room.s0) binds: [B:22:0x0085, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:27:0x0094 A[PHI: r1 r8
              0x0094: PHI (r1v13 androidx.room.s0) = (r1v10 androidx.room.s0), (r1v15 androidx.room.s0) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x0094: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:29:0x009c  */
            /* JADX WARN: Code duplicated, block: B:32:0x00aa A[PHI: r1
              0x00aa: PHI (r1v16 androidx.room.s0) = (r1v13 androidx.room.s0), (r1v18 androidx.room.s0) binds: [B:30:0x00a7, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
            
                if (androidx.room.u0.b(r1, "VACUUM", r7) == r0) goto L34;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.b0.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z11, String[] strArr, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f13648p = z11;
            this.f13649q = strArr;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return b0.this.new h(this.f13648p, this.f13649q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f13646n;
            if (i11 == 0) {
                jn0.t.b(obj);
                x xVar = b0.this.connectionManager;
                if (xVar == null) {
                    p013kotlin.jvm.internal.s.B("connectionManager");
                    xVar = null;
                }
                a aVar = new a(b0.this, this.f13648p, this.f13649q, null);
                this.f13646n = 1;
                if (xVar.K(false, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 beginTransaction$lambda$8(b0 b0Var, za.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        b0Var.internalBeginTransaction();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za.d createConnectionManager$lambda$1(b0 b0Var, androidx.room.e config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        return b0Var.createOpenHelper(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 endTransaction$lambda$9(b0 b0Var, za.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        b0Var.internalEndTransaction();
        return jn0.h0.f84049a;
    }

    @jn0.e
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @jn0.e
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        za.c writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.y3()) {
            getInvalidationTracker().B();
        }
        if (writableDatabase.F3()) {
            writableDatabase.i0();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().n2();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        CoroutineScope coroutineScope = this.coroutineScope;
        x xVar = null;
        if (coroutineScope == null) {
            p013kotlin.jvm.internal.s.B("coroutineScope");
            coroutineScope = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        getInvalidationTracker().z();
        x xVar2 = this.connectionManager;
        if (xVar2 == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
        } else {
            xVar = xVar2;
        }
        xVar.F();
    }

    public static /* synthetic */ Cursor query$default(b0 b0Var, za.f fVar, CancellationSignal cancellationSignal, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i11 & 2) != 0) {
            cancellationSignal = null;
        }
        return b0Var.query(fVar, cancellationSignal);
    }

    private final /* synthetic */ <T extends za.d> T unwrapOpenHelper(za.d openHelper) {
        if (openHelper == null) {
            return null;
        }
        while (true) {
            p013kotlin.jvm.internal.s.q(3, "T");
            if (openHelper != null) {
                return (T) openHelper;
            }
            if (!(openHelper instanceof androidx.room.f)) {
                return null;
            }
            openHelper = (T) ((androidx.room.f) openHelper).getDelegate();
        }
    }

    public final void addTypeConverter$room_runtime_release(co0.d<?> kclass, Object converter) {
        p013kotlin.jvm.internal.s.k(kclass, "kclass");
        p013kotlin.jvm.internal.s.k(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @jn0.e
    public void beginTransaction() {
        assertNotMainThread();
        va.b bVar = this.autoCloser;
        if (bVar == null) {
            internalBeginTransaction();
        } else {
            bVar.h(new wn0.l() { // from class: androidx.room.a0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return b0.beginTransaction$lambda$8(this.f13615a, (za.c) obj);
                }
            });
        }
    }

    public abstract void clearAllTables();

    public void close() {
        this.closeBarrier.b();
    }

    public za.g compileStatement(String sql) {
        p013kotlin.jvm.internal.s.k(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().P2(sql);
    }

    public List<ua.b> createAutoMigrations(Map<co0.d<? extends ua.a>, ? extends ua.a> autoMigrationSpecs) {
        p013kotlin.jvm.internal.s.k(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(p013kotlin.collections.v0.e(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(vn0.a.b((co0.d) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final x createConnectionManager$room_runtime_release(androidx.room.e configuration) {
        f0 f0Var;
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        try {
            g0 g0VarCreateOpenDelegate = createOpenDelegate();
            p013kotlin.jvm.internal.s.i(g0VarCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            f0Var = (f0) g0VarCreateOpenDelegate;
        } catch (jn0.q unused) {
            f0Var = null;
        }
        return f0Var == null ? new x(configuration, (wn0.l<? super androidx.room.e, ? extends za.d>) new wn0.l() { // from class: androidx.room.z
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b0.createConnectionManager$lambda$1(this.f13905a, (e) obj);
            }
        }) : new x(configuration, f0Var);
    }

    protected abstract p createInvalidationTracker();

    protected g0 createOpenDelegate() {
        throw new jn0.q(null, 1, null);
    }

    @jn0.e
    protected za.d createOpenHelper(androidx.room.e config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        throw new jn0.q(null, 1, null);
    }

    @jn0.e
    public void endTransaction() {
        va.b bVar = this.autoCloser;
        if (bVar == null) {
            internalEndTransaction();
        } else {
            bVar.h(new wn0.l() { // from class: androidx.room.y
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return b0.endTransaction$lambda$9(this.f13904a, (za.c) obj);
                }
            });
        }
    }

    @jn0.e
    public List<ua.b> getAutoMigrations(Map<Class<? extends ua.a>, ua.a> autoMigrationSpecs) {
        p013kotlin.jvm.internal.s.k(autoMigrationSpecs, "autoMigrationSpecs");
        return p013kotlin.collections.v.m();
    }

    /* JADX INFO: renamed from: getCloseBarrier$room_runtime_release, reason: from getter */
    public final ra.a getCloseBarrier() {
        return this.closeBarrier;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        p013kotlin.jvm.internal.s.B("coroutineScope");
        return null;
    }

    public p getInvalidationTracker() {
        p pVar = this.internalTracker;
        if (pVar != null) {
            return pVar;
        }
        p013kotlin.jvm.internal.s.B("internalTracker");
        return null;
    }

    public za.d getOpenHelper() {
        x xVar = this.connectionManager;
        if (xVar == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar = null;
        }
        za.d dVarG = xVar.G();
        if (dVarG != null) {
            return dVarG;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final CoroutineContext getQueryContext() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            p013kotlin.jvm.internal.s.B("coroutineScope");
            coroutineScope = null;
        }
        return coroutineScope.getCoroutineContext();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        p013kotlin.jvm.internal.s.B("internalQueryExecutor");
        return null;
    }

    public Set<co0.d<? extends ua.a>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends ua.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(vn0.a.e((Class) it.next()));
        }
        return p013kotlin.collections.v.r1(arrayList);
    }

    @jn0.e
    public Set<Class<? extends ua.a>> getRequiredAutoMigrationSpecs() {
        return d1.d();
    }

    protected Map<co0.d<?>, List<co0.d<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            co0.d dVarE = vn0.a.e(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(vn0.a.e((Class) it2.next()));
            }
            Pair pairA = jn0.x.a(dVarE, arrayList);
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        return linkedHashMap;
    }

    public final Map<co0.d<?>, List<co0.d<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return p013kotlin.collections.v0.i();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final CoroutineContext getTransactionContext$room_runtime_release() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        p013kotlin.jvm.internal.s.B("transactionContext");
        return null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        p013kotlin.jvm.internal.s.B("internalTransactionExecutor");
        return null;
    }

    @jn0.e
    public <T> T getTypeConverter(Class<T> klass) {
        p013kotlin.jvm.internal.s.k(klass, "klass");
        return (T) this.typeConverters.get(vn0.a.e(klass));
    }

    /* JADX INFO: renamed from: getUseTempTrackingTable$room_runtime_release, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        x xVar = this.connectionManager;
        if (xVar == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar = null;
        }
        return xVar.G() != null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().y3();
    }

    public void init(androidx.room.e configuration) {
        CoroutineContext coroutineContext;
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = createConnectionManager$room_runtime_release(configuration);
        this.internalTracker = createInvalidationTracker();
        c0.a(this, configuration);
        c0.c(this, configuration);
        CoroutineContext coroutineContext2 = configuration.queryCoroutineContext;
        CoroutineScope coroutineScope = null;
        if (coroutineContext2 != null) {
            CoroutineContext.Element element = coroutineContext2.get(ContinuationInterceptor.INSTANCE);
            p013kotlin.jvm.internal.s.i(element, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) element;
            Executor executorAsExecutor = ExecutorsKt.asExecutor(coroutineDispatcher);
            this.internalQueryExecutor = executorAsExecutor;
            if (executorAsExecutor == null) {
                p013kotlin.jvm.internal.s.B("internalQueryExecutor");
                executorAsExecutor = null;
            }
            this.internalTransactionExecutor = new q0(executorAsExecutor);
            this.coroutineScope = CoroutineScopeKt.CoroutineScope(configuration.queryCoroutineContext.plus(SupervisorKt.SupervisorJob((Job) configuration.queryCoroutineContext.get(Job.INSTANCE))));
            if (inCompatibilityMode$room_runtime_release()) {
                CoroutineScope coroutineScope2 = this.coroutineScope;
                if (coroutineScope2 == null) {
                    p013kotlin.jvm.internal.s.B("coroutineScope");
                    coroutineScope2 = null;
                }
                coroutineContext = coroutineScope2.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(1));
            } else {
                CoroutineScope coroutineScope3 = this.coroutineScope;
                if (coroutineScope3 == null) {
                    p013kotlin.jvm.internal.s.B("coroutineScope");
                    coroutineScope3 = null;
                }
                coroutineContext = coroutineScope3.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new q0(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                p013kotlin.jvm.internal.s.B("internalQueryExecutor");
                executor = null;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            this.coroutineScope = CoroutineScope;
            if (CoroutineScope == null) {
                p013kotlin.jvm.internal.s.B("coroutineScope");
                CoroutineScope = null;
            }
            CoroutineContext coroutineContext3 = CoroutineScope.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                p013kotlin.jvm.internal.s.B("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext3.plus(ExecutorsKt.from(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        x xVar = this.connectionManager;
        if (xVar == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar = null;
        }
        za.d dVarG = xVar.G();
        if (dVarG != null) {
            while (!(dVarG instanceof va.m)) {
                if (!(dVarG instanceof androidx.room.f)) {
                    dVarG = null;
                    break;
                }
                dVarG = ((androidx.room.f) dVarG).getDelegate();
            }
        } else {
            dVarG = null;
            break;
        }
        va.m mVar = (va.m) dVarG;
        if (mVar != null) {
            mVar.o(configuration);
        }
        x xVar2 = this.connectionManager;
        if (xVar2 == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar2 = null;
        }
        za.d dVarG2 = xVar2.G();
        if (dVarG2 != null) {
            while (!(dVarG2 instanceof va.g)) {
                if (!(dVarG2 instanceof androidx.room.f)) {
                    dVarG2 = null;
                    break;
                }
                dVarG2 = ((androidx.room.f) dVarG2).getDelegate();
            }
        } else {
            dVarG2 = null;
            break;
        }
        va.g gVar = (va.g) dVarG2;
        if (gVar != null) {
            this.autoCloser = gVar.getAutoCloser();
            va.b bVarC = gVar.getAutoCloser();
            CoroutineScope coroutineScope4 = this.coroutineScope;
            if (coroutineScope4 == null) {
                p013kotlin.jvm.internal.s.B("coroutineScope");
            } else {
                coroutineScope = coroutineScope4;
            }
            bVarC.k(coroutineScope);
            getInvalidationTracker().y(gVar.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            getInvalidationTracker().n(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    @jn0.e
    protected void internalInitInvalidationTracker(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        internalInitInvalidationTracker(new ta.a(db2));
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        va.b bVar = this.autoCloser;
        if (bVar != null) {
            return bVar.m();
        }
        x xVar = this.connectionManager;
        if (xVar == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar = null;
        }
        return xVar.J();
    }

    public final boolean isOpenInternal() {
        x xVar = this.connectionManager;
        if (xVar == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar = null;
        }
        return xVar.J();
    }

    protected final void performClear(boolean hasForeignKeys, String... tableNames) {
        p013kotlin.jvm.internal.s.k(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        sa.n.a(new h(hasForeignKeys, tableNames, null));
    }

    public final Cursor query(za.f query) {
        p013kotlin.jvm.internal.s.k(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        p013kotlin.jvm.internal.s.k(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @jn0.e
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().g2();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z11) {
        this.useTempTrackingTable = z11;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z11, wn0.p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        x xVar = this.connectionManager;
        if (xVar == null) {
            p013kotlin.jvm.internal.s.B("connectionManager");
            xVar = null;
        }
        return xVar.K(z11, pVar, continuation);
    }

    public final <T> T getTypeConverter(co0.d<T> klass) {
        p013kotlin.jvm.internal.s.k(klass, "klass");
        T t11 = (T) this.typeConverters.get(klass);
        p013kotlin.jvm.internal.s.i(t11, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t11;
    }

    protected final void internalInitInvalidationTracker(ya.b connection) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        getInvalidationTracker().o(connection);
    }

    public Cursor query(String query, Object[] args) {
        p013kotlin.jvm.internal.s.k(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().B0(new za.a(query, args));
    }

    public Cursor query(za.f query, CancellationSignal signal) {
        p013kotlin.jvm.internal.s.k(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().getWritableDatabase().b1(query, signal);
        }
        return getOpenHelper().getWritableDatabase().B0(query);
    }

    public <V> V runInTransaction(Callable<V> body) {
        p013kotlin.jvm.internal.s.k(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }
}
