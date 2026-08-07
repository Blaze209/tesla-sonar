package le;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lle/h;", "", "<init>", "()V", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "statusResponse", "", "a", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;)Z", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f89953a = new h();

    private h() {
    }

    public final boolean a(StatusResponse statusResponse) {
        s.k(statusResponse, "statusResponse");
        return !s.f("pending", statusResponse.getResultCode());
    }
}
