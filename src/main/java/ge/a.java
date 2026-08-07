package ge;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lge/a;", "", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "request", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "Ljn0/h0;", "c", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "()I", "infoSize", "a", "logSize", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    int a();

    int b();

    Object c(AnalyticsTrackRequest analyticsTrackRequest, String str, Continuation<? super h0> continuation);

    Object d(AnalyticsSetupRequest analyticsSetupRequest, Continuation<? super AnalyticsSetupResponse> continuation);
}
