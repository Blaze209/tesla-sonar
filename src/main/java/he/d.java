package he;

import com.adyen.checkout.components.core.internal.data.model.StatusRequest;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lhe/d;", "", "Lne/a;", "httpClient", "<init>", "(Lne/a;)V", "", "clientKey", "Lcom/adyen/checkout/components/core/internal/data/model/StatusRequest;", "statusRequest", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "a", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/internal/data/model/StatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lne/a;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ne.a httpClient;

    public d(ne.a httpClient) {
        s.k(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    public final Object a(String str, StatusRequest statusRequest, Continuation<? super StatusResponse> continuation) {
        return ne.b.b(this.httpClient, "services/PaymentInitiation/v1/status", statusRequest, StatusRequest.SERIALIZER, StatusResponse.SERIALIZER, v0.f(x.a("token", str)), continuation);
    }
}
