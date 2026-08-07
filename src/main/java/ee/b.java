package ee;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import ge.c;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lee/b;", "Lee/a;", "Lfe/a;", "Lde/a$a;", "localInfoDataStore", "Lde/a$b;", "localLogDataStore", "Lge/a;", "remoteDataStore", "Lge/b;", "analyticsSetupProvider", "Lge/c;", "analyticsTrackRequestProvider", "<init>", "(Lfe/a;Lfe/a;Lge/a;Lge/b;Lge/c;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lde/a;", "event", "Ljn0/h0;", "c", "(Lde/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfe/a;", "Lge/a;", DateTokenConverter.CONVERTER_KEY, "Lge/b;", "e", "Lge/c;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements ee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fe.a<de.a.Info> localInfoDataStore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fe.a<de.a.Log> localLogDataStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ge.a remoteDataStore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ge.b analyticsSetupProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c analyticsTrackRequestProvider;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository", f = "DefaultAnalyticsRepository.kt", i = {}, l = {29}, m = "fetchCheckoutAttemptId", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62837n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62839p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f62837n = obj;
            this.f62839p |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* JADX INFO: renamed from: ee.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository", f = "DefaultAnalyticsRepository.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4}, l = {42, 43, 51, 53, 54}, m = "sendEvents", n = {"this", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "this", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "infoEvents", "this", "infoEvents", "logEvents", "this", "logEvents", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    static final class C1286b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62840n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f62841o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62842p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f62843q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62845s;

        C1286b(Continuation<? super C1286b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f62843q = obj;
            this.f62845s |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    public b(fe.a<de.a.Info> localInfoDataStore, fe.a<de.a.Log> localLogDataStore, ge.a remoteDataStore, ge.b analyticsSetupProvider, c analyticsTrackRequestProvider) {
        s.k(localInfoDataStore, "localInfoDataStore");
        s.k(localLogDataStore, "localLogDataStore");
        s.k(remoteDataStore, "remoteDataStore");
        s.k(analyticsSetupProvider, "analyticsSetupProvider");
        s.k(analyticsTrackRequestProvider, "analyticsTrackRequestProvider");
        this.localInfoDataStore = localInfoDataStore;
        this.localLogDataStore = localLogDataStore;
        this.remoteDataStore = remoteDataStore;
        this.analyticsSetupProvider = analyticsSetupProvider;
        this.analyticsTrackRequestProvider = analyticsTrackRequestProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ee.a
    public Object a(Continuation<? super String> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f62839p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f62839p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objD = aVar.f62837n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f62839p;
        if (i12 == 0) {
            t.b(objD);
            AnalyticsSetupRequest analyticsSetupRequestA = this.analyticsSetupProvider.a();
            ge.a aVar2 = this.remoteDataStore;
            aVar.f62839p = 1;
            objD = aVar2.d(analyticsSetupRequestA, aVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objD);
        }
        return ((AnalyticsSetupResponse) objD).getCheckoutAttemptId();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        if (r2.c(r14, r0) == r1) goto L46;
     */
    @Override // ee.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r13, p013kotlin.coroutines.Continuation<? super jn0.h0> r14) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.b.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ee.a
    public Object c(de.a aVar, Continuation<? super h0> continuation) {
        if (aVar instanceof de.a.Info) {
            Object objB = this.localInfoDataStore.b(aVar, continuation);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
        }
        if (!(aVar instanceof de.a.Log)) {
            return h0.f84049a;
        }
        Object objB2 = this.localLogDataStore.b(aVar, continuation);
        return objB2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB2 : h0.f84049a;
    }
}
