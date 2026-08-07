package w40;

import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import j40.h;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import n40.b0;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import p022s40.k;
import q50.TopAppBarStateUpdate;
import s50.i;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lw40/d;", "Ls50/i;", "Lw40/c;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Ln40/b0;", "getOrFetchSync", "coordinator", "Lj40/f;", "eventTracker", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(Lw40/c;Ln40/p0;Ln40/b0;Ln40/p0;Lj40/f;Lo50/f;Lo30/d;)V", "Ljn0/h0;", "u", "()V", "state", "Lq50/c;", "x", "(Lw40/c;)Lq50/c;", "Lkotlinx/coroutines/Job;", "v", "()Lkotlinx/coroutines/Job;", "w", "Ln40/b0;", "Ln40/p0;", "Lj40/f;", "y", "Lo50/f;", "z", "Lo30/d;", "A", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends i<ExitState> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int B = 8;
    private static final FinancialConnectionsSessionManifest.Pane C = FinancialConnectionsSessionManifest.Pane.EXIT;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0 coordinator;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw40/c$a;", "<anonymous>", "()Lw40/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$1", f = "ExitViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements l<Continuation<? super ExitState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120786n;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            v50.g.StringId stringId;
            v50.g.StringId stringId2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120786n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    d dVar = d.this;
                    s.Companion companion = s.INSTANCE;
                    b0 b0Var = dVar.getOrFetchSync;
                    this.f120786n = 1;
                    obj = b0.b(b0Var, null, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                objB = s.b(((SynchronizeSessionResponse) obj).getManifest());
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            if (s.g(objB)) {
                objB = null;
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) objB;
            String strC = financialConnectionsSessionManifest != null ? k.c(financialConnectionsSessionManifest) : null;
            if ((financialConnectionsSessionManifest != null ? p013kotlin.jvm.internal.s.f(financialConnectionsSessionManifest.getIsNetworkingUserFlow(), Boxing.boxBoolean(true)) : false) && d.this.h().getValue().getReferrer() == FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE) {
                if (strC == null) {
                    stringId2 = new v50.g.StringId(i40.k.f75872l, null, 2, null);
                } else {
                    stringId = new v50.g.StringId(i40.k.f75870k, v.e(strC));
                    stringId2 = stringId;
                }
            } else if (strC == null) {
                stringId2 = new v50.g.StringId(i40.k.f75895z, null, 2, null);
            } else {
                stringId = new v50.g.StringId(i40.k.f75894y, v.e(strC));
                stringId2 = stringId;
            }
            return new ExitState.Payload(stringId2);
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super ExitState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw40/c;", "Ls50/a;", "Lw40/c$a;", "it", "a", "(Lw40/c;Ls50/a;)Lw40/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<ExitState, s50.a<? extends ExitState.Payload>, ExitState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f120788c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExitState invoke(ExitState execute, s50.a<ExitState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return ExitState.b(execute, null, it, false, 5, null);
        }
    }

    /* JADX INFO: renamed from: w40.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw40/d$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;Landroid/os/Bundle;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: w40.d$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lw40/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lw40/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f120789c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f120790d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar, Bundle bundle) {
                super(1);
                this.f120789c = pVar;
                this.f120790d = bundle;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
                return this.f120789c.e().a(new ExitState(this.f120790d));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent, Bundle arguments) {
            p013kotlin.jvm.internal.s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(d.class), new a(parentComponent, arguments));
            return bVar.b();
        }

        public final FinancialConnectionsSessionManifest.Pane b() {
            return d.C;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: w40.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw40/d$d;", "", "Lw40/c;", "initialState", "Lw40/d;", "a", "(Lw40/c;)Lw40/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC2577d {
        d a(ExitState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$logErrors$2", f = "ExitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120792n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f120793o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(continuation);
            fVar.f120793o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f120792n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            h.b(d.this.eventTracker, "Error loading payload", (Throwable) this.f120793o, d.this.logger, d.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((f) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$onCloseConfirm$1", f = "ExitViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120795n;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw40/c;", "a", "(Lw40/c;)Lw40/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<ExitState, ExitState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f120797c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExitState invoke(ExitState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return ExitState.b(setState, null, null, true, 3, null);
            }
        }

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120795n;
            if (i11 == 0) {
                t.b(obj);
                d.this.k(a.f120797c);
                MutableSharedFlow<p0.a> mutableSharedFlowA = d.this.coordinator.a();
                p0.a.Complete complete = new p0.a.Complete(null);
                this.f120795n = 1;
                if (mutableSharedFlowA.emit(complete, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ExitState initialState, p0 nativeAuthFlowCoordinator, b0 getOrFetchSync, p0 coordinator, j40.f eventTracker, o50.f navigationManager, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(coordinator, "coordinator");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.getOrFetchSync = getOrFetchSync;
        this.coordinator = coordinator;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.logger = logger;
        u();
        i.g(this, new a(null), null, b.f120788c, 1, null);
    }

    private final void u() {
        i.j(this, new f0() { // from class: w40.d.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ExitState) obj).d();
            }
        }, null, new f(null), 2, null);
    }

    public final Job v() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new g(null), 3, null);
    }

    public final void w() {
        this.navigationManager.c();
    }

    @Override // s50.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(ExitState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return null;
    }
}
