package j50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import j40.FinancialConnectionsEvent;
import j40.h;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.MutableSharedFlow;
import n40.f0;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import s50.i;
import wn0.l;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lj50/c;", "Ls50/i;", "Lj50/b;", "initialState", "Ln40/f0;", "linkMoreAccounts", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lj40/f;", "eventTracker", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(Lj50/b;Ln40/f0;Ln40/p0;Lj40/f;Lo50/f;Lo30/d;)V", "Ljn0/h0;", "u", "()V", "state", "Lq50/c;", "v", "(Lj50/b;)Lq50/c;", "Ln40/f0;", "w", "Ln40/p0;", "x", "Lj40/f;", "y", "Lo50/f;", "z", "Lo30/d;", "A", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends i<ResetState> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int B = 8;
    private static final FinancialConnectionsSessionManifest.Pane C = FinancialConnectionsSessionManifest.Pane.RESET;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final f0 linkMoreAccounts;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0 nativeAuthFlowCoordinator;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.reset.ResetViewModel$1", f = "ResetViewModel.kt", i = {1}, l = {39, 40}, m = "invokeSuspend", n = {"updatedManifest"}, s = {"L$0"})
    static final class a extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f82695n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f82696o;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f82696o;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = c.this.linkMoreAccounts;
                this.f82696o = 1;
                obj = f0Var.a(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f82695n;
                t.b(obj);
            }
            j40.f fVar = c.this.eventTracker;
            Companion companion = c.INSTANCE;
            fVar.a(new FinancialConnectionsEvent.w(companion.b()));
            o50.f.a.a(c.this.navigationManager, o50.b.k(o50.d.a(financialConnectionsSessionManifest.getNextPane()), companion.b(), null, 2, null), new o50.i.Current(true), false, 4, null);
            return h0.f84049a;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
            MutableSharedFlow<p0.a> mutableSharedFlowA = c.this.nativeAuthFlowCoordinator.a();
            p0.a.C1987a c1987a = p0.a.C1987a.f93230a;
            this.f82695n = financialConnectionsSessionManifest2;
            this.f82696o = 2;
            if (mutableSharedFlowA.emit(c1987a, this) != coroutine_suspended) {
                financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                j40.f fVar2 = c.this.eventTracker;
                Companion companion2 = c.INSTANCE;
                fVar2.a(new FinancialConnectionsEvent.w(companion2.b()));
                o50.f.a.a(c.this.navigationManager, o50.b.k(o50.d.a(financialConnectionsSessionManifest.getNextPane()), companion2.b(), null, 2, null), new o50.i.Current(true), false, 4, null);
                return h0.f84049a;
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj50/b;", "Ls50/a;", "Ljn0/h0;", "it", "a", "(Lj50/b;Ls50/a;)Lj50/b;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<ResetState, s50.a<? extends h0>, ResetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f82698c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ResetState invoke(ResetState execute, s50.a<h0> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return execute.a(it);
        }
    }

    /* JADX INFO: renamed from: j50.c$c, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj50/c$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j50.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lj50/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lj50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f82699c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f82699c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f82699c.i().a(new ResetState(null, 1, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(c.class), new a(parentComponent));
            return bVar.b();
        }

        public final FinancialConnectionsSessionManifest.Pane b() {
            return c.C;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj50/c$d;", "", "Lj50/b;", "initialState", "Lj50/c;", "a", "(Lj50/b;)Lj50/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        c a(ResetState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.reset.ResetViewModel$logErrors$2", f = "ResetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82701n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f82702o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = c.this.new f(continuation);
            fVar.f82702o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f82701n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            h.b(c.this.eventTracker, "Error linking more accounts", (Throwable) this.f82702o, c.this.logger, c.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((f) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ResetState initialState, f0 linkMoreAccounts, p0 nativeAuthFlowCoordinator, j40.f eventTracker, o50.f navigationManager, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(linkMoreAccounts, "linkMoreAccounts");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(eventTracker, "eventTracker");
        s.k(navigationManager, "navigationManager");
        s.k(logger, "logger");
        this.linkMoreAccounts = linkMoreAccounts;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.logger = logger;
        u();
        i.g(this, new a(null), null, b.f82698c, 1, null);
    }

    private final void u() {
        i.j(this, new p013kotlin.jvm.internal.f0() { // from class: j50.c.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ResetState) obj).b();
            }
        }, null, new f(null), 2, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(ResetState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(C, false, n.a(state.b()), null, false, 24, null);
    }
}
