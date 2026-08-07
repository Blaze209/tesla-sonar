package ge;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lge/d;", "Lge/a;", "Lhe/a;", "analyticsService", "", "clientKey", "", "infoSize", "logSize", "<init>", "(Lhe/a;Ljava/lang/String;II)V", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "request", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "Ljn0/h0;", "c", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lhe/a;", "b", "Ljava/lang/String;", "I", "()I", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final he.a analyticsService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int infoSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int logSize;

    public d(he.a analyticsService, String clientKey, int i11, int i12) {
        s.k(analyticsService, "analyticsService");
        s.k(clientKey, "clientKey");
        this.analyticsService = analyticsService;
        this.clientKey = clientKey;
        this.infoSize = i11;
        this.logSize = i12;
    }

    @Override // ge.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getLogSize() {
        return this.logSize;
    }

    @Override // ge.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getInfoSize() {
        return this.infoSize;
    }

    @Override // ge.a
    public Object c(AnalyticsTrackRequest analyticsTrackRequest, String str, Continuation<? super h0> continuation) {
        Object objB = this.analyticsService.b(analyticsTrackRequest, str, this.clientKey, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }

    @Override // ge.a
    public Object d(AnalyticsSetupRequest analyticsSetupRequest, Continuation<? super AnalyticsSetupResponse> continuation) {
        return this.analyticsService.c(analyticsSetupRequest, this.clientKey, continuation);
    }
}
