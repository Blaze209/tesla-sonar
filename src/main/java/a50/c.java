package a50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.ConsumerSession;
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
import n40.l0;
import n40.p0;
import n40.t1;
import n40.v1;
import n40.y;
import p010i90.IdentifierSpec;
import p010i90.OTPElement;
import p010i90.k0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002BCBk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020!2\u0006\u00100\u001a\u00020$¢\u0006\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010=R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010A¨\u0006D"}, d2 = {"La50/c;", "Ls50/i;", "La50/b;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lj40/f;", "eventTracker", "Ln40/b0;", "getOrFetchSync", "Ln40/v1;", "startVerification", "Lt50/f;", "consumerSessionProvider", "Ln40/l;", "confirmVerification", "Ln40/t1;", "selectNetworkedAccounts", "Ln40/y;", "getCachedAccounts", "Ln40/l0;", "markLinkStepUpVerified", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(La50/b;Ln40/p0;Lj40/f;Ln40/b0;Ln40/v1;Lt50/f;Ln40/l;Ln40/t1;Ln40/y;Ln40/l0;Lo50/f;Lo30/d;)V", "Lcom/stripe/android/model/t;", "consumerSession", "La50/b$a;", "A", "(Lcom/stripe/android/model/t;)La50/b$a;", "Ljn0/h0;", "B", "()V", "", "otp", "Lkotlinx/coroutines/Job;", "D", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "E", Gender.FEMALE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "Lq50/c;", "G", "(La50/b;)Lq50/c;", "text", "C", "(Ljava/lang/String;)V", "v", "Lj40/f;", "w", "Ln40/b0;", "x", "Ln40/v1;", "y", "Lt50/f;", "z", "Ln40/l;", "Ln40/t1;", "Ln40/y;", "Ln40/l0;", "Lo50/f;", "Lo30/d;", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends s50.i<LinkStepUpVerificationState> {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int G = 8;
    private static final FinancialConnectionsSessionManifest.Pane H = FinancialConnectionsSessionManifest.Pane.LINK_STEP_UP_VERIFICATION;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final t1 selectNetworkedAccounts;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final y getCachedAccounts;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final l0 markLinkStepUpVerified;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final v1 startVerification;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n40.l confirmVerification;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La50/b$a;", "<anonymous>", "()La50/b$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super LinkStepUpVerificationState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f420n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f421o;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f421o;
            if (i11 == 0) {
                t.b(obj);
                c cVar2 = c.this;
                this.f420n = cVar2;
                this.f421o = 1;
                Object objF = cVar2.F(this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = objF;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) this.f420n;
                t.b(obj);
            }
            return cVar.A((ConsumerSession) obj);
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super LinkStepUpVerificationState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La50/b;", "Ls50/a;", "La50/b$a;", "it", "a", "(La50/b;Ls50/a;)La50/b;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.p<LinkStepUpVerificationState, s50.a<? extends LinkStepUpVerificationState.Payload>, LinkStepUpVerificationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f423c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkStepUpVerificationState invoke(LinkStepUpVerificationState execute, s50.a<LinkStepUpVerificationState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return LinkStepUpVerificationState.b(execute, it, null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: a50.c$c, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La50/c$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "CLICKABLE_TEXT_RESEND_CODE", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a50.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "La50/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)La50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f424c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f424c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f424c.t().a(new LinkStepUpVerificationState(null, null, null, 7, null));
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
            return c.H;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/c$d;", "", "La50/b;", "initialState", "La50/c;", "a", "(La50/b;)La50/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        c a(LinkStepUpVerificationState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La50/b$a;", "it", "Ljn0/h0;", "<anonymous>", "(La50/b$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<LinkStepUpVerificationState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f426n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f427o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f429n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ LinkStepUpVerificationState.Payload f430o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c f431p;

            /* JADX INFO: renamed from: a50.c$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2$1$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C0020a extends SuspendLambda implements wn0.p<String, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f432n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f433o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ c f434p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0020a(c cVar, Continuation<? super C0020a> continuation) {
                    super(2, continuation);
                    this.f434p = cVar;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super h0> continuation) {
                    return ((C0020a) create(str, continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    C0020a c0020a = new C0020a(this.f434p, continuation);
                    c0020a.f433o = obj;
                    return c0020a;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f432n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f434p.D((String) this.f433o);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LinkStepUpVerificationState.Payload payload, c cVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f430o = payload;
                this.f431p = cVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f430o, this.f431p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f429n;
                if (i11 == 0) {
                    t.b(obj);
                    Flow<String> flowG = this.f430o.getOtpElement().g();
                    C0020a c0020a = new C0020a(this.f431p, null);
                    this.f429n = 1;
                    if (FlowKt.collectLatest(flowG, c0020a, this) == coroutine_suspended) {
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
        public final Object invoke(LinkStepUpVerificationState.Payload payload, Continuation<? super h0> continuation) {
            return ((f) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = c.this.new f(continuation);
            fVar.f427o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f426n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            BuildersKt__Builders_commonKt.launch$default(d1.a(c.this), null, null, new a((LinkStepUpVerificationState.Payload) this.f427o, c.this, null), 3, null);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$3", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f435n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f436o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = c.this.new g(continuation);
            gVar.f436o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Throwable th2 = (Throwable) this.f436o;
            j40.f fVar = c.this.eventTracker;
            Companion companion = c.INSTANCE;
            fVar.a(new FinancialConnectionsEvent.d0(companion.b(), FinancialConnectionsEvent.d0.a.StartVerificationError));
            j40.h.b(c.this.eventTracker, "Error fetching payload", th2, c.this.logger, companion.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((g) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$5", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f439n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f440o;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = c.this.new i(continuation);
            iVar.f440o = obj;
            return iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f439n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Throwable th2 = (Throwable) this.f440o;
            j40.f fVar = c.this.eventTracker;
            Companion companion = c.INSTANCE;
            fVar.a(new FinancialConnectionsEvent.d0(companion.b(), FinancialConnectionsEvent.d0.a.StartVerificationError));
            j40.h.b(c.this.eventTracker, "Error resending OTP", th2, c.this.logger, companion.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((i) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$7", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f443n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f444o;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = c.this.new k(continuation);
            kVar.f444o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f443n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.h.b(c.this.eventTracker, "Error confirming verification", (Throwable) this.f444o, c.this.logger, c.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((k) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onClickableTextClick$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f446n;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new l(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f446n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            c.this.E();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onOTPEntered$1", f = "LinkStepUpVerificationViewModel.kt", i = {0, 1, 2, 2}, l = {132, 138, 141, 154}, m = "invokeSuspend", n = {StatusResponse.PAYLOAD, StatusResponse.PAYLOAD, StatusResponse.PAYLOAD, "selectedAccounts"}, s = {"L$0", "L$0", "L$0", "L$1"})
    static final class m extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f448n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f449o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f450p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f452r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(1, continuation);
            this.f452r = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new m(this.f452r, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00de  */
        /* JADX WARN: Code duplicated, block: B:46:0x0117 A[LOOP:0: B:44:0x0111->B:46:0x0117, LOOP_END] */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0133, code lost:
        
            if (r14 == r1) goto L49;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a50.c.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((m) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La50/b;", "Ls50/a;", "Ljn0/h0;", "it", "a", "(La50/b;Ls50/a;)La50/b;"}, k = 3, mv = {1, 9, 0})
    static final class n extends u implements wn0.p<LinkStepUpVerificationState, s50.a<? extends h0>, LinkStepUpVerificationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f453c = new n();

        n() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkStepUpVerificationState invoke(LinkStepUpVerificationState execute, s50.a<h0> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return LinkStepUpVerificationState.b(execute, null, it, null, 5, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onResendOtp$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f454n;

        o(Continuation<? super o> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new o(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f454n;
            if (i11 == 0) {
                t.b(obj);
                c cVar = c.this;
                this.f454n = 1;
                if (cVar.F(this) == coroutine_suspended) {
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

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((o) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La50/b;", "Ls50/a;", "Ljn0/h0;", "it", "a", "(La50/b;Ls50/a;)La50/b;"}, k = 3, mv = {1, 9, 0})
    static final class p extends u implements wn0.p<LinkStepUpVerificationState, s50.a<? extends h0>, LinkStepUpVerificationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f456c = new p();

        p() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkStepUpVerificationState invoke(LinkStepUpVerificationState execute, s50.a<h0> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return LinkStepUpVerificationState.b(execute, null, null, it, 3, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel", f = "LinkStepUpVerificationViewModel.kt", i = {0}, l = {181, 185}, m = "startVerification", n = {"this"}, s = {"L$0"})
    static final class q extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f457n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f458o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f460q;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f458o = obj;
            this.f460q |= Integer.MIN_VALUE;
            return c.this.F(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkStepUpVerificationState initialState, p0 nativeAuthFlowCoordinator, j40.f eventTracker, b0 getOrFetchSync, v1 startVerification, t50.f consumerSessionProvider, n40.l confirmVerification, t1 selectNetworkedAccounts, y getCachedAccounts, l0 markLinkStepUpVerified, o50.f navigationManager, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(eventTracker, "eventTracker");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(startVerification, "startVerification");
        s.k(consumerSessionProvider, "consumerSessionProvider");
        s.k(confirmVerification, "confirmVerification");
        s.k(selectNetworkedAccounts, "selectNetworkedAccounts");
        s.k(getCachedAccounts, "getCachedAccounts");
        s.k(markLinkStepUpVerified, "markLinkStepUpVerified");
        s.k(navigationManager, "navigationManager");
        s.k(logger, "logger");
        this.eventTracker = eventTracker;
        this.getOrFetchSync = getOrFetchSync;
        this.startVerification = startVerification;
        this.consumerSessionProvider = consumerSessionProvider;
        this.confirmVerification = confirmVerification;
        this.selectNetworkedAccounts = selectNetworkedAccounts;
        this.getCachedAccounts = getCachedAccounts;
        this.markLinkStepUpVerified = markLinkStepUpVerified;
        this.navigationManager = navigationManager;
        this.logger = logger;
        B();
        s50.i.g(this, new a(null), null, b.f423c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkStepUpVerificationState.Payload A(ConsumerSession consumerSession) {
        return new LinkStepUpVerificationState.Payload(consumerSession.getEmailAddress(), defpackage.c.a(consumerSession), new OTPElement(IdentifierSpec.INSTANCE.a("otp"), new k0(0, 1, null)), consumerSession.getClientSecret());
    }

    private final void B() {
        i(new f0() { // from class: a50.c.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((LinkStepUpVerificationState) obj).d();
            }
        }, new f(null), new g(null));
        s50.i.j(this, new f0() { // from class: a50.c.h
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((LinkStepUpVerificationState) obj).e();
            }
        }, null, new i(null), 2, null);
        s50.i.j(this, new f0() { // from class: a50.c.j
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((LinkStepUpVerificationState) obj).c();
            }
        }, null, new k(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job D(String otp) {
        return s50.i.g(this, new m(otp, null), null, n.f453c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        s50.i.g(this, new o(null), null, p.f456c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(p013kotlin.coroutines.Continuation<? super com.stripe.android.model.ConsumerSession> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a50.c.q
            if (r0 == 0) goto L13
            r0 = r7
            a50.c$q r0 = (a50.c.q) r0
            int r1 = r0.f460q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f460q = r1
            goto L18
        L13:
            a50.c$q r0 = new a50.c$q
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f458o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f460q
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            jn0.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f457n
            a50.c r2 = (a50.c) r2
            jn0.t.b(r7)
            goto L4e
        L3d:
            jn0.t.b(r7)
            n40.b0 r7 = r6.getOrFetchSync
            r0.f457n = r6
            r0.f460q = r5
            java.lang.Object r7 = n40.b0.b(r7, r4, r0, r5, r4)
            if (r7 != r1) goto L4d
            goto L70
        L4d:
            r2 = r6
        L4e:
            com.stripe.android.financialconnections.model.k0 r7 = (com.stripe.android.financialconnections.model.SynchronizeSessionResponse) r7
            com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest r7 = r7.getManifest()
            t50.f r5 = r2.consumerSessionProvider
            t50.e r5 = r5.a()
            if (r5 == 0) goto L74
            java.lang.String r5 = r5.getClientSecret()
            n40.v1 r2 = r2.startVerification
            java.lang.String r7 = r7.getBusinessName()
            r0.f457n = r4
            r0.f460q = r3
            java.lang.Object r7 = r2.a(r5, r7, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            com.stripe.android.model.t r7 = (com.stripe.android.model.ConsumerSession) r7
            return r7
        L74:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a50.c.F(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void C(String text) {
        s.k(text, "text");
        if (s.f(text, "resend_code")) {
            BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new l(null), 3, null);
            return;
        }
        o30.d.b.a(this.logger, "Unknown clicked text " + text, null, 2, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(LinkStepUpVerificationState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(H, false, z50.n.a(state.d()), null, false, 24, null);
    }
}
