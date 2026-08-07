package f50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.t1;
import ezvcard.property.Gender;
import j40.FinancialConnectionsEvent;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import n40.b0;
import n40.d0;
import n40.e0;
import n40.j0;
import n40.n0;
import n40.p0;
import p010i90.IdentifierSpec;
import p010i90.OTPElement;
import p010i90.k0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import t50.CachedConsumerSession;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003JKLBs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b#\u0010$J!\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010GR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010HR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010I¨\u0006M"}, d2 = {"Lf50/d;", "Ls50/i;", "Lf50/c;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Ln40/b0;", "getOrFetchSync", "Ln40/l;", "confirmVerification", "Ln40/n0;", "markLinkVerified", "Lo50/f;", "navigationManager", "Lj40/f;", "analyticsTracker", "Ln40/j0;", "lookupConsumerAndStartVerification", "Lo30/d;", "logger", "Ln40/e0;", "isLinkWithStripe", "Ln40/c;", "attachConsumerToLinkAccountSession", "Lt50/f;", "consumerSessionProvider", "Ln40/d0;", "handleError", "<init>", "(Lf50/c;Ln40/p0;Ln40/b0;Ln40/l;Ln40/n0;Lo50/f;Lj40/f;Ln40/j0;Lo30/d;Ln40/e0;Ln40/c;Lt50/f;Ln40/d0;)V", "Lf50/d$d;", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initData", "Ljn0/h0;", "H", "(Lf50/d$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/t;", "consumerSession", "Lcom/stripe/android/financialconnections/model/q;", "initialInstitution", "Lf50/c$a;", "E", "(Lcom/stripe/android/model/t;Lcom/stripe/android/financialconnections/model/q;)Lf50/c$a;", Gender.FEMALE, "()V", "", "otp", "Lkotlinx/coroutines/Job;", "G", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "state", "Lq50/c;", "I", "(Lf50/c;)Lq50/c;", "v", "Ln40/b0;", "w", "Ln40/l;", "x", "Ln40/n0;", "y", "Lo50/f;", "z", "Lj40/f;", "A", "Ln40/j0;", "B", "Lo30/d;", "C", "Ln40/e0;", "Ln40/c;", "Lt50/f;", "Ln40/d0;", "b", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<NetworkingLinkVerificationState> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 8;
    private static final FinancialConnectionsSessionManifest.Pane I = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final j0 lookupConsumerAndStartVerification;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final e0 isLinkWithStripe;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final n40.c attachConsumerToLinkAccountSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final d0 handleError;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final n40.l confirmVerification;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final n0 markLinkVerified;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final j40.f analyticsTracker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$1", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {76, 78}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64453n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f64454o;

        /* JADX INFO: renamed from: f50.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf50/c;", "a", "(Lf50/c;)Lf50/c;"}, k = 3, mv = {1, 9, 0})
        static final class C1326a extends u implements wn0.l<NetworkingLinkVerificationState, NetworkingLinkVerificationState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1326a f64456c = new C1326a();

            C1326a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkingLinkVerificationState invoke(NetworkingLinkVerificationState setState) {
                s.k(setState, "$this$setState");
                return NetworkingLinkVerificationState.b(setState, new s50.a.Loading(null, 1, null), null, 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf50/c;", "a", "(Lf50/c;)Lf50/c;"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<NetworkingLinkVerificationState, NetworkingLinkVerificationState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f64457c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Throwable th2) {
                super(1);
                this.f64457c = th2;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkingLinkVerificationState invoke(NetworkingLinkVerificationState setState) {
                s.k(setState, "$this$setState");
                return NetworkingLinkVerificationState.b(setState, new s50.a.Fail(this.f64457c), null, 2, null);
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f64454o = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x006e  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object obj2;
            d dVar;
            Throwable thE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64453n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    d.this.k(C1326a.f64456c);
                    d dVar2 = d.this;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    this.f64453n = 1;
                    obj = dVar2.D(this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    t.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f64454o;
                    t.b(obj);
                }
                objB = obj2;
                dVar = d.this;
                thE = jn0.s.e(objB);
                if (thE != null) {
                    dVar.k(new b(thE));
                }
                return h0.f84049a;
                objB = jn0.s.b((InitData) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            d dVar3 = d.this;
            if (jn0.s.h(objB)) {
                this.f64454o = objB;
                this.f64453n = 2;
                if (dVar3.H((InitData) objB, this) != coroutine_suspended) {
                    obj2 = objB;
                    objB = obj2;
                }
                return coroutine_suspended;
            }
            dVar = d.this;
            thE = jn0.s.e(objB);
            if (thE != null) {
                dVar.k(new b(thE));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: f50.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf50/d$b;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: f50.d$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lf50/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lf50/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f64458c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f64458c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f64458c.s().a(new NetworkingLinkVerificationState(null, null, 3, null));
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

        public final FinancialConnectionsSessionManifest.Pane b() {
            return d.I;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf50/d$c;", "", "Lf50/c;", "initialState", "Lf50/d;", "a", "(Lf50/c;)Lf50/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        d a(NetworkingLinkVerificationState initialState);
    }

    /* JADX INFO: renamed from: f50.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf50/d$d;", "", "", "businessName", "emailAddress", "Lcom/stripe/android/financialconnections/model/q;", "initialInstitution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class InitData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String businessName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String emailAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsInstitution initialInstitution;

        public InitData(String str, String emailAddress, FinancialConnectionsInstitution financialConnectionsInstitution) {
            s.k(emailAddress, "emailAddress");
            this.businessName = str;
            this.emailAddress = emailAddress;
            this.initialInstitution = financialConnectionsInstitution;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBusinessName() {
            return this.businessName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmailAddress() {
            return this.emailAddress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final FinancialConnectionsInstitution getInitialInstitution() {
            return this.initialInstitution;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitData)) {
                return false;
            }
            InitData initData = (InitData) other;
            return s.f(this.businessName, initData.businessName) && s.f(this.emailAddress, initData.emailAddress) && s.f(this.initialInstitution, initData.initialInstitution);
        }

        public int hashCode() {
            String str = this.businessName;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.emailAddress.hashCode()) * 31;
            FinancialConnectionsInstitution financialConnectionsInstitution = this.initialInstitution;
            return iHashCode + (financialConnectionsInstitution != null ? financialConnectionsInstitution.hashCode() : 0);
        }

        public String toString() {
            return "InitData(businessName=" + this.businessName + ", emailAddress=" + this.emailAddress + ", initialInstitution=" + this.initialInstitution + ")";
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel", f = "NetworkingLinkVerificationViewModel.kt", i = {0}, l = {86}, m = "buildInitData", n = {"this"}, s = {"L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f64462n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64463o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f64465q;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64463o = obj;
            this.f64465q |= Integer.MIN_VALUE;
            return d.this.D(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf50/c$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lf50/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<NetworkingLinkVerificationState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64467n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64468o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2$1", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f64470n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ NetworkingLinkVerificationState.Payload f64471o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f64472p;

            /* JADX INFO: renamed from: f50.d$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class C1328a extends p013kotlin.jvm.internal.a implements p<String, Continuation<? super h0>, Object>, SuspendFunction {
                C1328a(Object obj) {
                    super(2, obj, d.class, "onOTPEntered", "onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 12);
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super h0> continuation) {
                    return a.b((d) this.receiver, str, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NetworkingLinkVerificationState.Payload payload, d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f64471o = payload;
                this.f64472p = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object b(d dVar, String str, Continuation continuation) {
                dVar.G(str);
                return h0.f84049a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f64471o, this.f64472p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f64470n;
                if (i11 == 0) {
                    t.b(obj);
                    Flow<String> flowG = this.f64471o.getOtpElement().g();
                    C1328a c1328a = new C1328a(this.f64472p);
                    this.f64470n = 1;
                    if (FlowKt.collectLatest(flowG, c1328a, this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkingLinkVerificationState.Payload payload, Continuation<? super h0> continuation) {
            return ((g) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = d.this.new g(continuation);
            gVar.f64468o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64467n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            BuildersKt__Builders_commonKt.launch$default(d1.a(d.this), null, null, new a((NetworkingLinkVerificationState.Payload) this.f64468o, d.this, null), 3, null);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$3", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64473n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64474o;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = d.this.new h(continuation);
            hVar.f64474o = obj;
            return hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64473n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.h.b(d.this.analyticsTracker, "Error starting verification", (Throwable) this.f64474o, d.this.logger, d.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((h) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$onOTPEntered$1", f = "NetworkingLinkVerificationViewModel.kt", i = {0, 1, 1, 1, 2, 2, 3, 3}, l = {178, 187, 188, 190}, m = "invokeSuspend", n = {StatusResponse.PAYLOAD, StatusResponse.PAYLOAD, "$this$invokeSuspend_u24lambda_u240", "isInstantDebits", StatusResponse.PAYLOAD, "isInstantDebits", StatusResponse.PAYLOAD, "isInstantDebits"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
    static final class i extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f64476n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f64477o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f64478p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f64479q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f64481s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Continuation<? super i> continuation) {
            super(1, continuation);
            this.f64481s = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new i(this.f64481s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:56:0x0109  */
        /* JADX WARN: Code duplicated, block: B:57:0x0133 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:58:0x0135  */
        /* JADX WARN: Code duplicated, block: B:59:0x0145  */
        /* JADX WARN: Code duplicated, block: B:61:0x015e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0163  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (r8.b(r9, r10, r16) == r0) goto L45;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v19, types: [f50.c$a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v39 */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r2v41 */
        /* JADX WARN: Type inference failed for: r2v42 */
        /* JADX WARN: Type inference failed for: r2v43 */
        /* JADX WARN: Type inference failed for: r2v44 */
        /* JADX WARN: Type inference failed for: r2v45 */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v3, types: [f50.c$a] */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v33 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v16, types: [f50.c$a] */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v22 */
        /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 409
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f50.d.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((i) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf50/c;", "Ls50/a;", "Ljn0/h0;", "it", "a", "(Lf50/c;Ls50/a;)Lf50/c;"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements p<NetworkingLinkVerificationState, s50.a<? extends h0>, NetworkingLinkVerificationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f64482c = new j();

        j() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkVerificationState invoke(NetworkingLinkVerificationState execute, s50.a<h0> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return NetworkingLinkVerificationState.b(execute, null, it, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$2", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64483n;

        k(Continuation<? super k> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new k(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64483n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.f fVar = d.this.analyticsTracker;
            Companion companion = d.INSTANCE;
            fVar.a(new FinancialConnectionsEvent.c0(companion.b(), FinancialConnectionsEvent.c0.a.ConsumerNotFoundError));
            o50.f.a.a(d.this.navigationManager, o50.b.k(o50.b.l.f96750i, companion.b(), null, 2, null), null, false, 6, null);
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((k) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$3", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64485n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64486o;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf50/c;", "a", "(Lf50/c;)Lf50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<NetworkingLinkVerificationState, NetworkingLinkVerificationState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f64488c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Throwable th2) {
                super(1);
                this.f64488c = th2;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkingLinkVerificationState invoke(NetworkingLinkVerificationState setState) {
                s.k(setState, "$this$setState");
                return NetworkingLinkVerificationState.b(setState, new s50.a.Fail(this.f64488c), null, 2, null);
            }
        }

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            l lVar = d.this.new l(continuation);
            lVar.f64486o = obj;
            return lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64485n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Throwable th2 = (Throwable) this.f64486o;
            d.this.analyticsTracker.a(new FinancialConnectionsEvent.c0(d.INSTANCE.b(), FinancialConnectionsEvent.c0.a.LookupConsumerSession));
            d.this.k(new a(th2));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((l) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$4", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64489n;

        m(Continuation<? super m> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new m(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64489n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((m) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/t;", "consumerSession", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/model/t;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$5", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements p<ConsumerSession, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64490n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64491o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InitData f64493q;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf50/c;", "a", "(Lf50/c;)Lf50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<NetworkingLinkVerificationState, NetworkingLinkVerificationState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ NetworkingLinkVerificationState.Payload f64494c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NetworkingLinkVerificationState.Payload payload) {
                super(1);
                this.f64494c = payload;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkingLinkVerificationState invoke(NetworkingLinkVerificationState setState) {
                s.k(setState, "$this$setState");
                return NetworkingLinkVerificationState.b(setState, new s50.a.Success(this.f64494c), null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(InitData initData, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f64493q = initData;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ConsumerSession consumerSession, Continuation<? super h0> continuation) {
            return ((n) create(consumerSession, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            n nVar = d.this.new n(this.f64493q, continuation);
            nVar.f64491o = obj;
            return nVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64490n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.k(new a(d.this.E((ConsumerSession) this.f64491o, this.f64493q.getInitialInstitution())));
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$6", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64495n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f64496o;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf50/c;", "a", "(Lf50/c;)Lf50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<NetworkingLinkVerificationState, NetworkingLinkVerificationState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f64498c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Throwable th2) {
                super(1);
                this.f64498c = th2;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkingLinkVerificationState invoke(NetworkingLinkVerificationState setState) {
                s.k(setState, "$this$setState");
                return NetworkingLinkVerificationState.b(setState, new s50.a.Fail(this.f64498c), null, 2, null);
            }
        }

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            o oVar = d.this.new o(continuation);
            oVar.f64496o = obj;
            return oVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64495n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Throwable th2 = (Throwable) this.f64496o;
            d.this.analyticsTracker.a(new FinancialConnectionsEvent.c0(d.INSTANCE.b(), FinancialConnectionsEvent.c0.a.StartVerificationSessionError));
            d.this.k(new a(th2));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((o) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NetworkingLinkVerificationState initialState, p0 nativeAuthFlowCoordinator, b0 getOrFetchSync, n40.l confirmVerification, n0 markLinkVerified, o50.f navigationManager, j40.f analyticsTracker, j0 lookupConsumerAndStartVerification, o30.d logger, e0 isLinkWithStripe, n40.c attachConsumerToLinkAccountSession, t50.f consumerSessionProvider, d0 handleError) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(confirmVerification, "confirmVerification");
        s.k(markLinkVerified, "markLinkVerified");
        s.k(navigationManager, "navigationManager");
        s.k(analyticsTracker, "analyticsTracker");
        s.k(lookupConsumerAndStartVerification, "lookupConsumerAndStartVerification");
        s.k(logger, "logger");
        s.k(isLinkWithStripe, "isLinkWithStripe");
        s.k(attachConsumerToLinkAccountSession, "attachConsumerToLinkAccountSession");
        s.k(consumerSessionProvider, "consumerSessionProvider");
        s.k(handleError, "handleError");
        this.getOrFetchSync = getOrFetchSync;
        this.confirmVerification = confirmVerification;
        this.markLinkVerified = markLinkVerified;
        this.navigationManager = navigationManager;
        this.analyticsTracker = analyticsTracker;
        this.lookupConsumerAndStartVerification = lookupConsumerAndStartVerification;
        this.logger = logger;
        this.isLinkWithStripe = isLinkWithStripe;
        this.attachConsumerToLinkAccountSession = attachConsumerToLinkAccountSession;
        this.consumerSessionProvider = consumerSessionProvider;
        this.handleError = handleError;
        F();
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(Continuation<? super InitData> continuation) {
        e eVar;
        d dVar;
        String accountholderCustomerEmailAddress;
        CachedConsumerSession cachedConsumerSessionA;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f64465q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f64465q = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objB = eVar.f64463o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f64465q;
        if (i12 == 0) {
            t.b(objB);
            b0 b0Var = this.getOrFetchSync;
            eVar.f64462n = this;
            eVar.f64465q = 1;
            objB = b0.b(b0Var, null, eVar, 1, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            dVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) eVar.f64462n;
            t.b(objB);
        }
        FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objB).getManifest();
        if (!dVar.isLinkWithStripe.invoke() || (cachedConsumerSessionA = dVar.consumerSessionProvider.a()) == null || (accountholderCustomerEmailAddress = cachedConsumerSessionA.getEmailAddress()) == null) {
            accountholderCustomerEmailAddress = manifest.getAccountholderCustomerEmailAddress();
        }
        String businessName = manifest.getBusinessName();
        if (accountholderCustomerEmailAddress != null) {
            return new InitData(businessName, accountholderCustomerEmailAddress, manifest.getInitialInstitution());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkingLinkVerificationState.Payload E(ConsumerSession consumerSession, FinancialConnectionsInstitution initialInstitution) {
        return new NetworkingLinkVerificationState.Payload(consumerSession.getEmailAddress(), defpackage.c.a(consumerSession), new OTPElement(IdentifierSpec.INSTANCE.a("otp"), new k0(0, 1, null)), consumerSession.getClientSecret(), initialInstitution);
    }

    private final void F() {
        i(new f0() { // from class: f50.d.f
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingLinkVerificationState) obj).d();
            }
        }, new g(null), new h(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job G(String otp) {
        return s50.i.g(this, new i(otp, null), null, j.f64482c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(InitData initData, Continuation<? super h0> continuation) {
        Object objA = this.lookupConsumerAndStartVerification.a(initData.getEmailAddress(), initData.getBusinessName(), t1.SMS, new k(null), new l(null), new m(null), new n(initData, null), new o(null), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : h0.f84049a;
    }

    @Override // s50.i
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(NetworkingLinkVerificationState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(I, true, z50.n.a(state.d()), null, false, 24, null);
    }
}
