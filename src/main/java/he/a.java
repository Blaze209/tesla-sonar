package he;

import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.internal.data.model.EmptyResponse;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhe/a;", "", "Lne/a;", "httpClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lne/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "request", "", "clientKey", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", "c", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "Lcom/adyen/checkout/core/internal/data/model/EmptyResponse;", "b", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lne/a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ne.a httpClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher coroutineDispatcher;

    /* JADX INFO: renamed from: he.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/core/internal/data/model/EmptyResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.AnalyticsService$sendEvents$2", f = "AnalyticsService.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class C1525a extends SuspendLambda implements p<CoroutineScope, Continuation<? super EmptyResponse>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72567n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f72569p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f72570q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AnalyticsTrackRequest f72571r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1525a(String str, String str2, AnalyticsTrackRequest analyticsTrackRequest, Continuation<? super C1525a> continuation) {
            super(2, continuation);
            this.f72569p = str;
            this.f72570q = str2;
            this.f72571r = analyticsTrackRequest;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1525a(this.f72569p, this.f72570q, this.f72571r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f72567n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            ne.a aVar = a.this.httpClient;
            String str = "v3/analytics/" + this.f72569p;
            Map mapF = v0.f(x.a("clientKey", this.f72570q));
            com.adyen.checkout.core.internal.data.model.b.a<AnalyticsTrackRequest> aVar2 = AnalyticsTrackRequest.SERIALIZER;
            com.adyen.checkout.core.internal.data.model.b.a<EmptyResponse> aVar3 = EmptyResponse.SERIALIZER;
            AnalyticsTrackRequest analyticsTrackRequest = this.f72571r;
            this.f72567n = 1;
            Object objB = ne.b.b(aVar, str, analyticsTrackRequest, aVar2, aVar3, mapF, this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EmptyResponse> continuation) {
            return ((C1525a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.AnalyticsService$setupAnalytics$2", f = "AnalyticsService.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super AnalyticsSetupResponse>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72572n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f72574p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AnalyticsSetupRequest f72575q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, AnalyticsSetupRequest analyticsSetupRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f72574p = str;
            this.f72575q = analyticsSetupRequest;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f72574p, this.f72575q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f72572n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            ne.a aVar = a.this.httpClient;
            Map mapF = v0.f(x.a("clientKey", this.f72574p));
            com.adyen.checkout.core.internal.data.model.b.a<AnalyticsSetupRequest> aVar2 = AnalyticsSetupRequest.SERIALIZER;
            com.adyen.checkout.core.internal.data.model.b.a<AnalyticsSetupResponse> aVar3 = AnalyticsSetupResponse.SERIALIZER;
            AnalyticsSetupRequest analyticsSetupRequest = this.f72575q;
            this.f72572n = 1;
            Object objB = ne.b.b(aVar, "v3/analytics", analyticsSetupRequest, aVar2, aVar3, mapF, this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsSetupResponse> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(ne.a httpClient, CoroutineDispatcher coroutineDispatcher) {
        s.k(httpClient, "httpClient");
        s.k(coroutineDispatcher, "coroutineDispatcher");
        this.httpClient = httpClient;
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final Object b(AnalyticsTrackRequest analyticsTrackRequest, String str, String str2, Continuation<? super EmptyResponse> continuation) {
        return BuildersKt.withContext(this.coroutineDispatcher, new C1525a(str, str2, analyticsTrackRequest, null), continuation);
    }

    public final Object c(AnalyticsSetupRequest analyticsSetupRequest, String str, Continuation<? super AnalyticsSetupResponse> continuation) {
        return BuildersKt.withContext(this.coroutineDispatcher, new b(str, analyticsSetupRequest, null), continuation);
    }

    public /* synthetic */ a(ne.a aVar, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
