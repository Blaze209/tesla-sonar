package r30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import w30.j0;
import w30.l0;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lr30/a;", "Lr30/g;", "Lr30/l;", "localStore", "Lr30/j;", "fraudDetectionDataRequestFactory", "Lw30/j0;", "stripeNetworkClient", "Lr30/n;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lr30/m;", "fraudDetectionEnabledProvider", "<init>", "(Lr30/l;Lr30/j;Lw30/j0;Lr30/n;Lkotlin/coroutines/CoroutineContext;Lr30/m;)V", "Ljn0/h0;", "b", "()V", "Lr30/d;", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "()Lr30/d;", "fraudDetectionData", "j", "(Lr30/d;)V", "Lr30/l;", "Lr30/j;", "c", "Lw30/j0;", DateTokenConverter.CONVERTER_KEY, "Lr30/n;", "e", "Lkotlin/coroutines/CoroutineContext;", "f", "Lr30/m;", "g", "Lr30/d;", "cachedFraudDetectionData", "", "h", "()Z", "fraudDetectionEnabled", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l localStore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j fraudDetectionDataRequestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j0 stripeNetworkClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n errorReporter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m fraudDetectionEnabledProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private FraudDetectionData cachedFraudDetectionData;

    /* JADX INFO: renamed from: r30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lr30/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lr30/d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$getLatest$2", f = "FraudDetectionDataRepository.kt", i = {0}, l = {71, 77}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
    static final class C2268a extends SuspendLambda implements p<CoroutineScope, Continuation<? super FraudDetectionData>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106925n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106926o;

        C2268a(Continuation<? super C2268a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2268a c2268a = a.this.new C2268a(continuation);
            c2268a.f106926o = obj;
            return c2268a;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0091  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FraudDetectionData fraudDetectionData;
            a aVar;
            Object objB;
            Throwable thE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f106925n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f106926o;
                l lVar = a.this.localStore;
                this.f106926o = coroutineScope;
                this.f106925n = 1;
                obj = lVar.a(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.f106926o;
                try {
                    t.b(obj);
                    objB = s.b(h.c((l0) obj));
                } catch (Throwable th2) {
                    th = th2;
                    s.Companion companion = s.INSTANCE;
                    objB = s.b(t.a(th));
                }
                thE = s.e(objB);
                if (thE != null) {
                    aVar.errorReporter.b(StripeException.INSTANCE.b(thE));
                }
                if (s.g(objB)) {
                    objB = null;
                }
                fraudDetectionData = (FraudDetectionData) objB;
                if (!p013kotlin.jvm.internal.s.f(a.this.cachedFraudDetectionData, fraudDetectionData) && fraudDetectionData != null) {
                    a.this.j(fraudDetectionData);
                }
                return fraudDetectionData;
            }
            t.b(obj);
            a aVar2 = a.this;
            fraudDetectionData = (FraudDetectionData) obj;
            if (fraudDetectionData == null || fraudDetectionData.e(((Number) h.f106947a.invoke()).longValue())) {
                try {
                    s.Companion companion2 = s.INSTANCE;
                    j0 j0Var = aVar2.stripeNetworkClient;
                    i iVarA = aVar2.fraudDetectionDataRequestFactory.a(fraudDetectionData);
                    this.f106926o = aVar2;
                    this.f106925n = 2;
                    obj = j0Var.a(iVarA, this);
                    if (obj != coroutine_suspended) {
                        aVar = aVar2;
                        objB = s.b(h.c((l0) obj));
                        thE = s.e(objB);
                        if (thE != null) {
                            aVar.errorReporter.b(StripeException.INSTANCE.b(thE));
                        }
                        if (s.g(objB)) {
                            objB = null;
                        }
                        fraudDetectionData = (FraudDetectionData) objB;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    aVar = aVar2;
                    s.Companion companion3 = s.INSTANCE;
                    objB = s.b(t.a(th));
                }
            }
            if (!p013kotlin.jvm.internal.s.f(a.this.cachedFraudDetectionData, fraudDetectionData)) {
                a.this.j(fraudDetectionData);
            }
            return fraudDetectionData;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FraudDetectionData> continuation) {
            return ((C2268a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$refresh$1", f = "FraudDetectionDataRepository.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106928n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f106928n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = a.this;
                this.f106928n = 1;
                if (aVar.i(this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(l localStore, j fraudDetectionDataRequestFactory, j0 stripeNetworkClient, n errorReporter, CoroutineContext workContext, m fraudDetectionEnabledProvider) {
        p013kotlin.jvm.internal.s.k(localStore, "localStore");
        p013kotlin.jvm.internal.s.k(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        p013kotlin.jvm.internal.s.k(stripeNetworkClient, "stripeNetworkClient");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(fraudDetectionEnabledProvider, "fraudDetectionEnabledProvider");
        this.localStore = localStore;
        this.fraudDetectionDataRequestFactory = fraudDetectionDataRequestFactory;
        this.stripeNetworkClient = stripeNetworkClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.fraudDetectionEnabledProvider = fraudDetectionEnabledProvider;
    }

    private final boolean h() {
        return this.fraudDetectionEnabledProvider.a();
    }

    @Override // r30.g
    public FraudDetectionData a() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (h()) {
            return fraudDetectionData;
        }
        return null;
    }

    @Override // r30.g
    public void b() {
        if (h()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new b(null), 3, null);
        }
    }

    public Object i(Continuation<? super FraudDetectionData> continuation) {
        return BuildersKt.withContext(this.workContext, new C2268a(null), continuation);
    }

    public void j(FraudDetectionData fraudDetectionData) {
        p013kotlin.jvm.internal.s.k(fraudDetectionData, "fraudDetectionData");
        this.cachedFraudDetectionData = fraudDetectionData;
        this.localStore.b(fraudDetectionData);
    }
}
