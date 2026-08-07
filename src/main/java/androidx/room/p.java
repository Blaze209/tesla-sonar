package androidx.room;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 #2\u00020\u0001:\u0002?;BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rH\u0080@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0001¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ9\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070+2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u001d\u00102\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b2\u0010\u001cJ'\u00108\u001a\u00020\r2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\rH\u0000¢\u0006\u0004\b:\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010@R\u0018\u0010R\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010^R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010`¨\u0006b"}, d2 = {"Landroidx/room/p;", "", "Landroidx/room/b0;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/b0;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "Ljn0/h0;", "r", "()V", "Landroidx/room/p$b;", "observer", "", "h", "(Landroidx/room/p$b;)Z", "x", "", "k", "()Ljava/util/List;", "", "tableIds", "p", "(Ljava/util/Set;)V", "Lva/b;", "autoCloser", "y", "(Lva/b;)V", "Lya/b;", "connection", "o", "(Lya/b;)V", "A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "u", "tables", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "j", "([Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/room/p$b;)V", "w", "v", "q", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "name", "Landroid/content/Intent;", "serviceIntent", "n", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "z", "a", "Landroidx/room/b0;", "l", "()Landroidx/room/b0;", "b", "Ljava/util/Map;", "c", DateTokenConverter.CONVERTER_KEY, "[Ljava/lang/String;", "m", "()[Ljava/lang/String;", "Landroidx/room/x0;", "e", "Landroidx/room/x0;", "implementation", "", "Landroidx/room/t;", "f", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "observerMapLock", "Lva/b;", "Lkotlin/Function0;", "Lwn0/a;", "onRefreshScheduled", "onRefreshCompleted", "Landroidx/room/l;", "Landroidx/room/l;", "invalidationLiveDataContainer", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "Landroidx/room/q;", "Landroidx/room/q;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "trackerLock", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x0 implementation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<b, t> observerMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock observerMapLock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private va.b autoCloser;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onRefreshScheduled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onRefreshCompleted;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l invalidationLiveDataContainer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Intent multiInstanceInvalidationIntent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private q multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object trackerLock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/p$b;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "Ljn0/h0;", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String[] tables;

        public b(String[] tables) {
            p013kotlin.jvm.internal.s.k(tables, "tables");
            this.tables = tables;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> tables);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l<Set<? extends Integer>, jn0.h0> {
        c(Object obj) {
            super(1, obj, p.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        public final void a(Set<Integer> p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((p) this.receiver).p(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Set<? extends Integer> set) {
            a(set);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", i = {}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13763n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return p.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f13763n;
            if (i11 == 0) {
                jn0.t.b(obj);
                x0 x0Var = p.this.implementation;
                this.f13763n = 1;
                if (x0Var.x(this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.a<jn0.h0> {
        e(Object obj) {
            super(0, obj, p.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            o();
            return jn0.h0.f84049a;
        }

        public final void o() {
            ((p) this.receiver).r();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.InvalidationTracker$syncBlocking$1", f = "InvalidationTracker.android.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13765n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return p.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f13765n;
            if (i11 == 0) {
                jn0.t.b(obj);
                p pVar = p.this;
                this.f13765n = 1;
                if (pVar.A(this) == coroutine_suspended) {
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
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public p(b0 database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        p013kotlin.jvm.internal.s.k(database, "database");
        p013kotlin.jvm.internal.s.k(shadowTablesMap, "shadowTablesMap");
        p013kotlin.jvm.internal.s.k(viewTables, "viewTables");
        p013kotlin.jvm.internal.s.k(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        x0 x0Var = new x0(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable(), new c(this));
        this.implementation = x0Var;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new wn0.a() { // from class: androidx.room.m
            @Override // wn0.a
            public final Object invoke() {
                return p.t(this.f13741a);
            }
        };
        this.onRefreshCompleted = new wn0.a() { // from class: androidx.room.n
            @Override // wn0.a
            public final Object invoke() {
                return p.s(this.f13743a);
            }
        };
        this.invalidationLiveDataContainer = new l(database);
        this.trackerLock = new Object();
        x0Var.u(new wn0.a() { // from class: androidx.room.o
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(p.d(this.f13744a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(p pVar) {
        return !pVar.database.inCompatibilityMode$room_runtime_release() || pVar.database.isOpenInternal();
    }

    private final boolean h(b observer) {
        Pair<String[], int[]> pairY = this.implementation.y(observer.getTables());
        String[] strArrA = pairY.a();
        int[] iArrB = pairY.b();
        t tVar = new t(observer, iArrB, strArrA);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            t tVarPut = this.observerMap.containsKey(observer) ? (t) p013kotlin.collections.v0.j(this.observerMap, observer) : this.observerMap.put(observer, tVar);
            reentrantLock.unlock();
            return tVarPut == null && this.implementation.p(iArrB);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final List<b> k() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return p013kotlin.collections.v.m1(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Set<Integer> tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listM1 = p013kotlin.collections.v.m1(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listM1.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(tableIds);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        synchronized (this.trackerLock) {
            try {
                q qVar = this.multiInstanceInvalidationClient;
                if (qVar != null) {
                    List<b> listK = k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        if (!((b) obj).b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        qVar.l();
                    }
                }
                this.implementation.s();
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s(p pVar) {
        va.b bVar = pVar.autoCloser;
        if (bVar != null) {
            bVar.g();
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t(p pVar) {
        va.b bVar = pVar.autoCloser;
        if (bVar != null) {
            bVar.j();
        }
        return jn0.h0.f84049a;
    }

    private final boolean x(b observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            t tVarRemove = this.observerMap.remove(observer);
            reentrantLock.unlock();
            return tVarRemove != null && this.implementation.q(tVarRemove.getTableIds());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Object A(Continuation<? super jn0.h0> continuation) throws Throwable {
        if (this.database.inCompatibilityMode$room_runtime_release() && !this.database.isOpenInternal()) {
            return jn0.h0.f84049a;
        }
        Object objX = this.implementation.x(continuation);
        return objX == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX : jn0.h0.f84049a;
    }

    public final void B() {
        sa.n.a(new f(null));
    }

    public final void i(b observer) {
        p013kotlin.jvm.internal.s.k(observer, "observer");
        if (!observer.b()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        h(observer);
    }

    public final Flow<Set<String>> j(String[] tables, boolean emitInitialState) {
        p013kotlin.jvm.internal.s.k(tables, "tables");
        Pair<String[], int[]> pairY = this.implementation.y(tables);
        String[] strArrA = pairY.a();
        Flow<Set<String>> flowM = this.implementation.m(strArrA, pairY.b(), emitInitialState);
        q qVar = this.multiInstanceInvalidationClient;
        Flow<Set<String>> flowH = qVar != null ? qVar.h(strArrA) : null;
        return flowH != null ? FlowKt.merge(flowM, flowH) : flowM;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b0 getDatabase() {
        return this.database;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    public final void n(Context context, String name, Intent serviceIntent) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new q(context, name, this);
    }

    public final void o(ya.b connection) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        this.implementation.l(connection);
        synchronized (this.trackerLock) {
            try {
                q qVar = this.multiInstanceInvalidationClient;
                if (qVar != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    qVar.k(intent);
                    jn0.h0 h0Var = jn0.h0.f84049a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(Set<String> tables) {
        p013kotlin.jvm.internal.s.k(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<t> listM1 = p013kotlin.collections.v.m1(this.observerMap.values());
            reentrantLock.unlock();
            for (t tVar : listM1) {
                if (!tVar.getObserver().b()) {
                    tVar.d(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void u() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void v() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void w(b observer) {
        p013kotlin.jvm.internal.s.k(observer, "observer");
        if (x(observer)) {
            sa.n.a(new d(null));
        }
    }

    public final void y(va.b autoCloser) {
        p013kotlin.jvm.internal.s.k(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.n(new e(this));
    }

    public final void z() {
        q qVar = this.multiInstanceInvalidationClient;
        if (qVar != null) {
            qVar.l();
        }
    }
}
