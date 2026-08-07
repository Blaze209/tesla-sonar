package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0015048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>¨\u0006@"}, d2 = {"Landroidx/room/q;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Landroidx/room/p;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/p;)V", "Ljn0/h0;", "j", "()V", "Landroid/content/Intent;", "serviceIntent", "k", "(Landroid/content/Intent;)V", "l", "", "resolvedTableNames", "Lkotlinx/coroutines/flow/Flow;", "", "h", "([Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/p;", IntegerTokenConverter.CONVERTER_KEY, "()Landroidx/room/p;", "kotlin.jvm.PlatformType", "c", "Landroid/content/Context;", "appContext", "Lkotlinx/coroutines/CoroutineScope;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "f", "I", "clientId", "Landroidx/room/k;", "g", "Landroidx/room/k;", "invalidationService", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "invalidatedTables", "androidx/room/q$c", "Landroidx/room/q$c;", "observer", "Landroidx/room/j;", "Landroidx/room/j;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p invalidationTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean stopped;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int clientId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private k invalidationService;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<Set<String>> invalidatedTables;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c observer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final j invalidationCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ServiceConnection serviceConnection;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Flow<Set<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f13780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f13781b;

        /* JADX INFO: renamed from: androidx.room.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class C0230a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f13782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String[] f13783b;

            /* JADX INFO: renamed from: androidx.room.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE}, m = "emit", n = {}, s = {})
            public static final class C0231a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f13784n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f13785o;

                public C0231a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f13784n = obj;
                    this.f13785o |= Integer.MIN_VALUE;
                    return C0230a.this.emit(null, this);
                }
            }

            public C0230a(FlowCollector flowCollector, String[] strArr) {
                this.f13782a = flowCollector;
                this.f13783b = strArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0231a c0231a;
                if (continuation instanceof C0231a) {
                    c0231a = (C0231a) continuation;
                    int i11 = c0231a.f13785o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0231a.f13785o = i11 - Integer.MIN_VALUE;
                    } else {
                        c0231a = new C0231a(continuation);
                    }
                } else {
                    c0231a = new C0231a(continuation);
                }
                Object obj2 = c0231a.f13784n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0231a.f13785o;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f13782a;
                    Set set = (Set) obj;
                    Set setB = d1.b();
                    for (String str : this.f13783b) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (p013kotlin.text.t.M(str, (String) it.next(), true)) {
                                setB.add(str);
                            }
                        }
                    }
                    Set setA = d1.a(setB);
                    if (setA.isEmpty()) {
                        setA = null;
                    }
                    if (setA != null) {
                        c0231a.f13785o = 1;
                        if (flowCollector.emit(setA, c0231a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        public a(Flow flow, String[] strArr) {
            this.f13780a = flow;
            this.f13781b = strArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Set<? extends String>> flowCollector, Continuation continuation) {
            Object objCollect = this.f13780a.collect(new C0230a(flowCollector, this.f13781b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/q$b", "Landroidx/room/j$a;", "", "", "tables", "Ljn0/h0;", Gender.MALE, "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends j.a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"invalidatedTablesSet"}, s = {"L$0"})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13788n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f13789o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String[] f13790p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ q f13791q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String[] strArr, q qVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f13790p = strArr;
                this.f13791q = qVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f13790p, this.f13791q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f13789o;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    String[] strArr = this.f13790p;
                    Set<String> setI = d1.i(Arrays.copyOf(strArr, strArr.length));
                    MutableSharedFlow mutableSharedFlow = this.f13791q.invalidatedTables;
                    this.f13788n = setI;
                    this.f13789o = 1;
                    if (mutableSharedFlow.emit(setI, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    set = setI;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.f13788n;
                    jn0.t.b(obj);
                }
                this.f13791q.getInvalidationTracker().q(set);
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        b() {
        }

        @Override // androidx.room.j
        public void M(String[] tables) {
            p013kotlin.jvm.internal.s.k(tables, "tables");
            BuildersKt__Builders_commonKt.launch$default(q.this.coroutineScope, null, null, new a(tables, q.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/q$c", "Landroidx/room/p$b;", "", "", "tables", "Ljn0/h0;", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends p.b {
        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.p.b
        public boolean b() {
            return true;
        }

        @Override // androidx.room.p.b
        public void c(Set<String> tables) {
            p013kotlin.jvm.internal.s.k(tables, "tables");
            if (q.this.stopped.get()) {
                return;
            }
            try {
                k kVar = q.this.invalidationService;
                if (kVar != null) {
                    kVar.Y1(q.this.clientId, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e11) {
                Log.w("ROOM", "Cannot broadcast invalidation", e11);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/q$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Ljn0/h0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            p013kotlin.jvm.internal.s.k(name, "name");
            p013kotlin.jvm.internal.s.k(service, "service");
            q.this.invalidationService = k.a.R2(service);
            q.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            q.this.invalidationService = null;
        }
    }

    public q(Context context, String name, p invalidationTracker) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().getCoroutineScope();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = SharedFlowKt.MutableSharedFlow(0, 0, BufferOverflow.SUSPEND);
        this.observer = new c(invalidationTracker.getTableNames());
        this.invalidationCallback = new b();
        this.serviceConnection = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        try {
            k kVar = this.invalidationService;
            if (kVar != null) {
                this.clientId = kVar.n2(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e11) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e11);
        }
    }

    public final Flow<Set<String>> h(String[] resolvedTableNames) {
        p013kotlin.jvm.internal.s.k(resolvedTableNames, "resolvedTableNames");
        return new a(this.invalidatedTables, resolvedTableNames);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final p getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final void k(Intent serviceIntent) {
        p013kotlin.jvm.internal.s.k(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.i(this.observer);
        }
    }

    public final void l() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.w(this.observer);
            try {
                k kVar = this.invalidationService;
                if (kVar != null) {
                    kVar.O2(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e11) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e11);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
