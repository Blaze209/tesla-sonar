package k50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import i40.j;
import i40.k;
import j40.FinancialConnectionsEvent;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import n40.b0;
import n40.p0;
import n40.y;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import s50.i;
import t50.z;
import wn0.l;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lk50/d;", "Ls50/i;", "Lk50/c;", "initialState", "Ln40/y;", "getCachedAccounts", "Ln40/b0;", "getOrFetchSync", "Lt50/z;", "successContentRepository", "Lj40/f;", "eventTracker", "Lo30/d;", "logger", "Ln40/p0;", "nativeAuthFlowCoordinator", "<init>", "(Lk50/c;Ln40/y;Ln40/b0;Lt50/z;Lj40/f;Lo30/d;Ln40/p0;)V", "Ljn0/h0;", "v", "()V", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "Lq50/c;", "x", "(Lk50/c;)Lq50/c;", "Lkotlinx/coroutines/Job;", "w", "()Lkotlinx/coroutines/Job;", "Lt50/z;", "Lj40/f;", "Lo30/d;", "y", "Ln40/p0;", "z", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends i<SuccessState> {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final z successContentRepository;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p0 nativeAuthFlowCoordinator;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int A = 8;
    private static final FinancialConnectionsSessionManifest.Pane B = FinancialConnectionsSessionManifest.Pane.SUCCESS;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk50/c$a;", "<anonymous>", "()Lk50/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$1", f = "SuccessViewModel.kt", i = {1}, l = {46, 47}, m = "invokeSuspend", n = {"manifest"}, s = {"L$0"})
    static final class a extends SuspendLambda implements l<Continuation<? super SuccessState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f85035n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f85036o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b0 f85037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y f85038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ d f85039r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, y yVar, d dVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f85037p = b0Var;
            this.f85038q = yVar;
            this.f85039r = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new a(this.f85037p, this.f85038q, this.f85039r, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005c  */
        /* JADX WARN: Code duplicated, block: B:25:0x006b  */
        /* JADX WARN: Code duplicated, block: B:28:0x0080  */
        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            List list;
            z.State stateB;
            v50.g stringId;
            v50.g pluralId;
            Boolean skipSuccessPane;
            boolean zBooleanValue;
            String businessName;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85036o;
            String str = null;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = this.f85037p;
                this.f85036o = 1;
                obj = b0.b(b0Var, null, this, 1, null);
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
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f85035n;
                t.b(obj);
            }
            list = (List) obj;
            stateB = this.f85039r.successContentRepository.b();
            if (stateB != null || (stringId = stateB.getHeading()) == null) {
                stringId = new v50.g.StringId(k.f75867i0, null, 2, null);
            }
            if (stateB != null || (pluralId = stateB.getMessage()) == null) {
                pluralId = new v50.g.PluralId(j.f75847c, list.size(), null, 4, null);
            }
            skipSuccessPane = financialConnectionsSessionManifest.getSkipSuccessPane();
            if (skipSuccessPane != null) {
                zBooleanValue = skipSuccessPane.booleanValue();
            } else {
                zBooleanValue = false;
            }
            businessName = financialConnectionsSessionManifest.getBusinessName();
            if (businessName != null && p022s40.k.h(financialConnectionsSessionManifest)) {
                str = businessName;
            }
            return new SuccessState.Payload(str, stringId, pluralId, zBooleanValue);
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            y yVar = this.f85038q;
            this.f85035n = manifest;
            this.f85036o = 2;
            Object objA = yVar.a(this);
            if (objA != coroutine_suspended) {
                financialConnectionsSessionManifest = manifest;
                obj = objA;
                list = (List) obj;
                stateB = this.f85039r.successContentRepository.b();
                if (stateB != null) {
                    stringId = new v50.g.StringId(k.f75867i0, null, 2, null);
                } else {
                    stringId = new v50.g.StringId(k.f75867i0, null, 2, null);
                }
                if (stateB != null) {
                    pluralId = new v50.g.PluralId(j.f75847c, list.size(), null, 4, null);
                } else {
                    pluralId = new v50.g.PluralId(j.f75847c, list.size(), null, 4, null);
                }
                skipSuccessPane = financialConnectionsSessionManifest.getSkipSuccessPane();
                if (skipSuccessPane != null) {
                    zBooleanValue = skipSuccessPane.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                businessName = financialConnectionsSessionManifest.getBusinessName();
                if (businessName != null) {
                    str = businessName;
                }
                return new SuccessState.Payload(str, stringId, pluralId, zBooleanValue);
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super SuccessState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk50/c;", "Ls50/a;", "Lk50/c$a;", "it", "a", "(Lk50/c;Ls50/a;)Lk50/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<SuccessState, s50.a<? extends SuccessState.Payload>, SuccessState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f85040c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SuccessState invoke(SuccessState execute, s50.a<SuccessState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return SuccessState.b(execute, it, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: k50.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk50/d$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: k50.d$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lk50/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lk50/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f85041c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f85041c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f85041c.l().a(new SuccessState(null, null, 3, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(d.class), new a(parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: k50.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk50/d$d;", "", "Lk50/c;", "initialState", "Lk50/d;", "a", "(Lk50/c;)Lk50/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC1799d {
        d a(SuccessState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk50/c$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lk50/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$2", f = "SuccessViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<SuccessState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85043n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f85044o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SuccessState.Payload payload, Continuation<? super h0> continuation) {
            return ((f) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(continuation);
            fVar.f85044o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85043n;
            if (i11 == 0) {
                t.b(obj);
                if (((SuccessState.Payload) this.f85044o).getSkipSuccessPane()) {
                    d dVar = d.this;
                    this.f85043n = 1;
                    if (dVar.u(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.B));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$3", f = "SuccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85046n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f85047o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = d.this.new g(continuation);
            gVar.f85047o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f85046n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.logger.error("Error retrieving payload", (Throwable) this.f85047o);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((g) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$onDoneClick$1", f = "SuccessViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85049n;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk50/c;", "a", "(Lk50/c;)Lk50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<SuccessState, SuccessState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f85051c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SuccessState invoke(SuccessState setState) {
                s.k(setState, "$this$setState");
                return SuccessState.b(setState, null, new s50.a.Loading(null, 1, null), 1, null);
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85049n;
            if (i11 == 0) {
                t.b(obj);
                d.this.eventTracker.a(new FinancialConnectionsEvent.i(d.B));
                d.this.k(a.f85051c);
                d dVar = d.this;
                this.f85049n = 1;
                if (dVar.u(this) == coroutine_suspended) {
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
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SuccessState initialState, y getCachedAccounts, b0 getOrFetchSync, z successContentRepository, j40.f eventTracker, o30.d logger, p0 nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(getCachedAccounts, "getCachedAccounts");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(successContentRepository, "successContentRepository");
        s.k(eventTracker, "eventTracker");
        s.k(logger, "logger");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.successContentRepository = successContentRepository;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        v();
        i.g(this, new a(getOrFetchSync, getCachedAccounts, this, null), null, b.f85040c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(Continuation<? super h0> continuation) {
        Object objEmit = this.nativeAuthFlowCoordinator.a().emit(new p0.a.Complete(null, 1, null), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
    }

    private final void v() {
        i(new f0() { // from class: k50.d.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((SuccessState) obj).d();
            }
        }, new f(null), new g(null));
    }

    public final Job w() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new h(null), 3, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(SuccessState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(B, false, n.a(state.d()), null, false, 24, null);
    }
}
