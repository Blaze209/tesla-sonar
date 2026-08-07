package jd;

import com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintRequest;
import com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResponse;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljd/b;", "", "Lne/a;", "httpClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lne/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintRequest;", "request", "", "clientKey", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "b", "(Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lne/a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ne.a httpClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher coroutineDispatcher;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.adyen3ds2.internal.data.api.SubmitFingerprintService$submitFingerprint$2", f = "SubmitFingerprintService.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super SubmitFingerprintResponse>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83604n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f83606p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ SubmitFingerprintRequest f83607q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, SubmitFingerprintRequest submitFingerprintRequest, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f83606p = str;
            this.f83607q = submitFingerprintRequest;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f83606p, this.f83607q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f83604n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            ne.a aVar = b.this.httpClient;
            Map mapF = v0.f(x.a("token", this.f83606p));
            com.adyen.checkout.core.internal.data.model.b.a<SubmitFingerprintRequest> aVar2 = SubmitFingerprintRequest.SERIALIZER;
            com.adyen.checkout.core.internal.data.model.b.a<SubmitFingerprintResponse> aVar3 = SubmitFingerprintResponse.SERIALIZER;
            SubmitFingerprintRequest submitFingerprintRequest = this.f83607q;
            this.f83604n = 1;
            Object objB = ne.b.b(aVar, "v1/submitThreeDS2Fingerprint", submitFingerprintRequest, aVar2, aVar3, mapF, this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SubmitFingerprintResponse> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(ne.a httpClient, CoroutineDispatcher coroutineDispatcher) {
        s.k(httpClient, "httpClient");
        s.k(coroutineDispatcher, "coroutineDispatcher");
        this.httpClient = httpClient;
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final Object b(SubmitFingerprintRequest submitFingerprintRequest, String str, Continuation<? super SubmitFingerprintResponse> continuation) {
        return BuildersKt.withContext(this.coroutineDispatcher, new a(str, submitFingerprintRequest, null), continuation);
    }

    public /* synthetic */ b(ne.a aVar, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
