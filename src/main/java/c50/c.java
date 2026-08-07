package c50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import i40.j;
import i40.k;
import j40.FinancialConnectionsEvent;
import j40.f;
import jn0.h0;
import jn0.t;
import k50.SuccessState;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import n40.b0;
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
import t50.z;
import v50.g;
import wn0.l;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lc50/c;", "Ls50/i;", "Lc50/b;", "initialState", "Ln40/b0;", "getOrFetchSync", "Lt50/z;", "successContentRepository", "Lj40/f;", "eventTracker", "Ln40/p0;", "nativeAuthFlowCoordinator", "<init>", "(Lc50/b;Ln40/b0;Lt50/z;Lj40/f;Ln40/p0;)V", "state", "Lq50/c;", "u", "(Lc50/b;)Lq50/c;", "Ljn0/h0;", "t", "()V", "v", "Ln40/b0;", "w", "Lt50/z;", "x", "Lj40/f;", "y", "Ln40/p0;", "z", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends i<ManualEntrySuccessState> {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final z successContentRepository;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final f eventTracker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p0 nativeAuthFlowCoordinator;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int A = 8;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk50/c$a;", "<anonymous>", "()Lk50/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel$1", f = "ManualEntrySuccessViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements l<Continuation<? super SuccessState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18767n;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g stringId;
            g pluralId;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18767n;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = c.this.getOrFetchSync;
                this.f18767n = 1;
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
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            z.State stateB = c.this.successContentRepository.b();
            if (stateB == null || (stringId = stateB.getHeading()) == null) {
                stringId = new g.StringId(k.f75867i0, null, 2, null);
            }
            if (stateB == null || (pluralId = stateB.getMessage()) == null) {
                pluralId = new g.PluralId(j.f75847c, 1, null, 4, null);
            }
            SuccessState.Payload payload = new SuccessState.Payload(manifest.getBusinessName(), stringId, pluralId, false);
            c.this.eventTracker.a(new FinancialConnectionsEvent.w(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS));
            return payload;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super SuccessState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc50/b;", "Ls50/a;", "Lk50/c$a;", "it", "a", "(Lc50/b;Ls50/a;)Lc50/b;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<ManualEntrySuccessState, s50.a<? extends SuccessState.Payload>, ManualEntrySuccessState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f18769c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ManualEntrySuccessState invoke(ManualEntrySuccessState execute, s50.a<SuccessState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return ManualEntrySuccessState.b(execute, it, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: c50.c$c, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc50/c$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: c50.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lc50/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lc50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f18770c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f18770c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f18770c.h().a(new ManualEntrySuccessState(null, null, 3, null));
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

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc50/c$d;", "", "Lc50/b;", "initialState", "Lc50/c;", "a", "(Lc50/b;)Lc50/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        c a(ManualEntrySuccessState initialState);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel$onSubmit$1", f = "ManualEntrySuccessViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18771n;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc50/b;", "a", "(Lc50/b;)Lc50/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<ManualEntrySuccessState, ManualEntrySuccessState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f18773c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ManualEntrySuccessState invoke(ManualEntrySuccessState setState) {
                s.k(setState, "$this$setState");
                return ManualEntrySuccessState.b(setState, null, new s50.a.Loading(null, 1, null), 1, null);
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18771n;
            if (i11 == 0) {
                t.b(obj);
                c.this.k(a.f18773c);
                c.this.eventTracker.a(new FinancialConnectionsEvent.i(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS));
                MutableSharedFlow<p0.a> mutableSharedFlowA = c.this.nativeAuthFlowCoordinator.a();
                p0.a.Complete complete = new p0.a.Complete(null, 1, null);
                this.f18771n = 1;
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
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ManualEntrySuccessState initialState, b0 getOrFetchSync, z successContentRepository, f eventTracker, p0 nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(successContentRepository, "successContentRepository");
        s.k(eventTracker, "eventTracker");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.getOrFetchSync = getOrFetchSync;
        this.successContentRepository = successContentRepository;
        this.eventTracker = eventTracker;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        i.g(this, new a(null), null, b.f18769c, 1, null);
    }

    public final void t() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new e(null), 3, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(ManualEntrySuccessState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, false, n.a(state.d()), null, false, 24, null);
    }
}
