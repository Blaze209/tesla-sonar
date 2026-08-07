package g50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.model.ConsumerSession;
import ezvcard.property.Gender;
import j40.FinancialConnectionsEvent;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import n40.b0;
import n40.n0;
import n40.n1;
import n40.p0;
import n40.v1;
import n40.y;
import p010i90.IdentifierSpec;
import p010i90.OTPElement;
import p010i90.k0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import t50.CachedConsumerSession;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002>?Bs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u001e¢\u0006\u0004\b*\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00109R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lg50/d;", "Ls50/i;", "Lg50/c;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lj40/f;", "eventTracker", "Lt50/f;", "consumerSessionProvider", "Ln40/v1;", "startVerification", "Ln40/b0;", "getOrFetchSync", "Ln40/l;", "confirmVerification", "Lt50/c;", "attachedPaymentAccountRepository", "Ln40/n0;", "markLinkVerified", "Ln40/y;", "getCachedAccounts", "Ln40/n1;", "saveAccountToLink", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(Lg50/c;Ln40/p0;Lj40/f;Lt50/f;Ln40/v1;Ln40/b0;Ln40/l;Lt50/c;Ln40/n0;Ln40/y;Ln40/n1;Lo50/f;Lo30/d;)V", "Ljn0/h0;", "B", "()V", "", "otp", "Lkotlinx/coroutines/Job;", "C", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "state", "Lq50/c;", "E", "(Lg50/c;)Lq50/c;", "D", "v", "Lj40/f;", "w", "Lt50/f;", "x", "Ln40/v1;", "y", "Ln40/b0;", "z", "Ln40/l;", "A", "Lt50/c;", "Ln40/n0;", "Ln40/y;", "Ln40/n1;", "Lo50/f;", Gender.FEMALE, "Lo30/d;", "G", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<NetworkingSaveToLinkVerificationState> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 8;
    private static final FinancialConnectionsSessionManifest.Pane I = FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final t50.c attachedPaymentAccountRepository;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final n0 markLinkVerified;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final y getCachedAccounts;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final n1 saveAccountToLink;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final v1 startVerification;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n40.l confirmVerification;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg50/c$a;", "<anonymous>", "()Lg50/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {0, 1, 1}, l = {66, 68}, m = "invokeSuspend", n = {"consumerSession", "consumerSession", "showNotNowButton"}, s = {"L$0", "L$0", "I$0"})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super NetworkingSaveToLinkVerificationState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67399n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f67400o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f67401p;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x009c  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CachedConsumerSession cachedConsumerSession;
            int i11;
            d dVar;
            CachedConsumerSession cachedConsumerSession2;
            int i12;
            Object objB;
            d dVar2;
            boolean z11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i13 = this.f67401p;
            int i14 = 0;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i15 = 1;
            try {
                if (i13 == 0) {
                    t.b(obj);
                    CachedConsumerSession cachedConsumerSessionA = d.this.consumerSessionProvider.a();
                    if (cachedConsumerSessionA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    b0 b0Var = d.this.getOrFetchSync;
                    this.f67399n = cachedConsumerSessionA;
                    this.f67401p = 1;
                    Object objB2 = b0.b(b0Var, null, this, 1, null);
                    if (objB2 != coroutine_suspended) {
                        cachedConsumerSession = cachedConsumerSessionA;
                        obj = objB2;
                    }
                    return coroutine_suspended;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.f67400o;
                    cachedConsumerSession2 = (CachedConsumerSession) this.f67399n;
                    try {
                        t.b(obj);
                        objB = s.b((ConsumerSession) obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        s.Companion companion = s.INSTANCE;
                        objB = s.b(t.a(th3));
                    }
                    dVar2 = d.this;
                    if (s.e(objB) != null) {
                        dVar2.eventTracker.a(new FinancialConnectionsEvent.c0(d.INSTANCE.b(), FinancialConnectionsEvent.c0.a.StartVerificationSessionError));
                    }
                    t.b(objB);
                    d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.INSTANCE.b()));
                    String emailAddress = cachedConsumerSession2.getEmailAddress();
                    String phoneNumber = cachedConsumerSession2.getPhoneNumber();
                    String clientSecret = cachedConsumerSession2.getClientSecret();
                    OTPElement oTPElement = new OTPElement(IdentifierSpec.INSTANCE.a("otp"), new k0(i14, i15, defaultConstructorMarker));
                    if (i12 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return new NetworkingSaveToLinkVerificationState.Payload(z11, emailAddress, phoneNumber, oTPElement, clientSecret);
                }
                cachedConsumerSession = (CachedConsumerSession) this.f67399n;
                t.b(obj);
                s.Companion companion2 = s.INSTANCE;
                v1 v1Var = dVar.startVerification;
                String clientSecret2 = cachedConsumerSession.getClientSecret();
                this.f67399n = cachedConsumerSession;
                this.f67400o = i11;
                this.f67401p = 2;
                Object objB3 = v1Var.b(clientSecret2, this);
                if (objB3 != coroutine_suspended) {
                    CachedConsumerSession cachedConsumerSession3 = cachedConsumerSession;
                    i12 = i11;
                    obj = objB3;
                    cachedConsumerSession2 = cachedConsumerSession3;
                    objB = s.b((ConsumerSession) obj);
                    dVar2 = d.this;
                    if (s.e(objB) != null) {
                        dVar2.eventTracker.a(new FinancialConnectionsEvent.c0(d.INSTANCE.b(), FinancialConnectionsEvent.c0.a.StartVerificationSessionError));
                    }
                    t.b(objB);
                    d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.INSTANCE.b()));
                    String emailAddress2 = cachedConsumerSession2.getEmailAddress();
                    String phoneNumber2 = cachedConsumerSession2.getPhoneNumber();
                    String clientSecret3 = cachedConsumerSession2.getClientSecret();
                    OTPElement oTPElement2 = new OTPElement(IdentifierSpec.INSTANCE.a("otp"), new k0(i14, i15, defaultConstructorMarker));
                    if (i12 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return new NetworkingSaveToLinkVerificationState.Payload(z11, emailAddress2, phoneNumber2, oTPElement2, clientSecret3);
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                cachedConsumerSession2 = cachedConsumerSession;
                i12 = i11;
                Throwable th5 = th;
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th5));
            }
            i11 = ((SynchronizeSessionResponse) obj).getManifest().getAccountholderCustomerEmailAddress() != null ? 1 : 0;
            dVar = d.this;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super NetworkingSaveToLinkVerificationState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg50/c;", "Ls50/a;", "Lg50/c$a;", "it", "a", "(Lg50/c;Ls50/a;)Lg50/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<NetworkingSaveToLinkVerificationState, s50.a<? extends NetworkingSaveToLinkVerificationState.Payload>, NetworkingSaveToLinkVerificationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f67403c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingSaveToLinkVerificationState invoke(NetworkingSaveToLinkVerificationState execute, s50.a<NetworkingSaveToLinkVerificationState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return NetworkingSaveToLinkVerificationState.b(execute, it, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: g50.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg50/d$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: g50.d$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lg50/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lg50/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f67404c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f67404c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
                return this.f67404c.u().a(new NetworkingSaveToLinkVerificationState(null, null, 3, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            p013kotlin.jvm.internal.s.k(parentComponent, "parentComponent");
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

    /* JADX INFO: renamed from: g50.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg50/d$d;", "", "Lg50/c;", "initialState", "Lg50/d;", "a", "(Lg50/c;)Lg50/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC1383d {
        d a(NetworkingSaveToLinkVerificationState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg50/c$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lg50/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<NetworkingSaveToLinkVerificationState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67406n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f67407o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67409n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ NetworkingSaveToLinkVerificationState.Payload f67410o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f67411p;

            /* JADX INFO: renamed from: g50.d$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2$1$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1384a extends SuspendLambda implements p<String, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f67412n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f67413o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ d f67414p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1384a(d dVar, Continuation<? super C1384a> continuation) {
                    super(2, continuation);
                    this.f67414p = dVar;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super h0> continuation) {
                    return ((C1384a) create(str, continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    C1384a c1384a = new C1384a(this.f67414p, continuation);
                    c1384a.f67413o = obj;
                    return c1384a;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f67412n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f67414p.C((String) this.f67413o);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NetworkingSaveToLinkVerificationState.Payload payload, d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f67410o = payload;
                this.f67411p = dVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f67410o, this.f67411p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f67409n;
                if (i11 == 0) {
                    t.b(obj);
                    Flow<String> flowG = this.f67410o.getOtpElement().g();
                    C1384a c1384a = new C1384a(this.f67411p, null);
                    this.f67409n = 1;
                    if (FlowKt.collectLatest(flowG, c1384a, this) == coroutine_suspended) {
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

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkingSaveToLinkVerificationState.Payload payload, Continuation<? super h0> continuation) {
            return ((f) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(continuation);
            fVar.f67407o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67406n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            BuildersKt__Builders_commonKt.launch$default(d1.a(d.this), null, null, new a((NetworkingSaveToLinkVerificationState.Payload) this.f67407o, d.this, null), 3, null);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$3", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67415n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f67416o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = d.this.new g(continuation);
            gVar.f67416o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67415n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.h.b(d.this.eventTracker, "Error fetching payload", (Throwable) this.f67416o, d.this.logger, d.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((g) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/h0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$5", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<h0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67419n;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67419n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            o50.f.a.a(d.this.navigationManager, o50.b.k(o50.b.y.f96764i, d.INSTANCE.b(), null, 2, null), null, false, 6, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(h0 h0Var, Continuation<? super h0> continuation) {
            return ((i) create(h0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$6", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67421n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f67422o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = d.this.new j(continuation);
            jVar.f67422o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67421n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Throwable th2 = (Throwable) this.f67422o;
            j40.f fVar = d.this.eventTracker;
            o30.d dVar = d.this.logger;
            Companion companion = d.INSTANCE;
            j40.h.b(fVar, "Error confirming verification", th2, dVar, companion.b());
            if (!(th2 instanceof n40.l.a)) {
                o50.f.a.a(d.this.navigationManager, o50.b.k(o50.b.y.f96764i, companion.b(), null, 2, null), null, false, 6, null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((j) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {134, 139, 147, 149, 161}, m = "invokeSuspend", n = {StatusResponse.PAYLOAD, "$this$invokeSuspend_u24lambda_u241", StatusResponse.PAYLOAD, "$this$invokeSuspend_u24lambda_u241", StatusResponse.PAYLOAD, "$this$invokeSuspend_u24lambda_u241", "accounts"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class k extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67424n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f67425o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f67426p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f67427q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f67429s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Continuation<? super k> continuation) {
            super(1, continuation);
            this.f67429s = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new k(this.f67429s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:15:0x0028, B:56:0x0104, B:20:0x003c, B:53:0x00e3, B:23:0x0049, B:38:0x00a4, B:40:0x00ac, B:42:0x00b8, B:44:0x00be, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:26:0x0055, B:34:0x0091, B:31:0x0079), top: B:76:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:15:0x0028, B:56:0x0104, B:20:0x003c, B:53:0x00e3, B:23:0x0049, B:38:0x00a4, B:40:0x00ac, B:42:0x00b8, B:44:0x00be, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:26:0x0055, B:34:0x0091, B:31:0x0079), top: B:76:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c3 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:15:0x0028, B:56:0x0104, B:20:0x003c, B:53:0x00e3, B:23:0x0049, B:38:0x00a4, B:40:0x00ac, B:42:0x00b8, B:44:0x00be, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:26:0x0055, B:34:0x0091, B:31:0x0079), top: B:76:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:52:0x00df  */
        /* JADX WARN: Code duplicated, block: B:55:0x0103  */
        /* JADX WARN: Code duplicated, block: B:56:0x0104 A[Catch: all -> 0x002d, PHI: r13
          0x0104: PHI (r13v33 java.lang.Object) = (r13v32 java.lang.Object), (r13v0 java.lang.Object) binds: [B:54:0x0101, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:15:0x0028, B:56:0x0104, B:20:0x003c, B:53:0x00e3, B:23:0x0049, B:38:0x00a4, B:40:0x00ac, B:42:0x00b8, B:44:0x00be, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:26:0x0055, B:34:0x0091, B:31:0x0079), top: B:76:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:61:0x011d  */
        /* JADX WARN: Code duplicated, block: B:64:0x013a  */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0163, code lost:
        
            if (r13 == r0) goto L68;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: g50.d.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((k) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg50/c;", "Ls50/a;", "Ljn0/h0;", "it", "a", "(Lg50/c;Ls50/a;)Lg50/c;"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements p<NetworkingSaveToLinkVerificationState, s50.a<? extends h0>, NetworkingSaveToLinkVerificationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f67430c = new l();

        l() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingSaveToLinkVerificationState invoke(NetworkingSaveToLinkVerificationState execute, s50.a<h0> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return NetworkingSaveToLinkVerificationState.b(execute, null, it, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NetworkingSaveToLinkVerificationState initialState, p0 nativeAuthFlowCoordinator, j40.f eventTracker, t50.f consumerSessionProvider, v1 startVerification, b0 getOrFetchSync, n40.l confirmVerification, t50.c attachedPaymentAccountRepository, n0 markLinkVerified, y getCachedAccounts, n1 saveAccountToLink, o50.f navigationManager, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(consumerSessionProvider, "consumerSessionProvider");
        p013kotlin.jvm.internal.s.k(startVerification, "startVerification");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(confirmVerification, "confirmVerification");
        p013kotlin.jvm.internal.s.k(attachedPaymentAccountRepository, "attachedPaymentAccountRepository");
        p013kotlin.jvm.internal.s.k(markLinkVerified, "markLinkVerified");
        p013kotlin.jvm.internal.s.k(getCachedAccounts, "getCachedAccounts");
        p013kotlin.jvm.internal.s.k(saveAccountToLink, "saveAccountToLink");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.eventTracker = eventTracker;
        this.consumerSessionProvider = consumerSessionProvider;
        this.startVerification = startVerification;
        this.getOrFetchSync = getOrFetchSync;
        this.confirmVerification = confirmVerification;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.markLinkVerified = markLinkVerified;
        this.getCachedAccounts = getCachedAccounts;
        this.saveAccountToLink = saveAccountToLink;
        this.navigationManager = navigationManager;
        this.logger = logger;
        B();
        s50.i.g(this, new a(null), null, b.f67403c, 1, null);
    }

    private final void B() {
        i(new f0() { // from class: g50.d.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingSaveToLinkVerificationState) obj).d();
            }
        }, new f(null), new g(null));
        i(new f0() { // from class: g50.d.h
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingSaveToLinkVerificationState) obj).c();
            }
        }, new i(null), new j(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job C(String otp) {
        return s50.i.g(this, new k(otp, null), null, l.f67430c, 1, null);
    }

    public final void D() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.y.f96764i, I, null, 2, null), null, false, 6, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(NetworkingSaveToLinkVerificationState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return new TopAppBarStateUpdate(I, true, n.a(state.d()), null, false, 24, null);
    }
}
