package he;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import jn0.s;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhe/c;", "", "", "paymentData", "", "maxPollingDuration", "Lkotlinx/coroutines/flow/Flow;", "Ljn0/s;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "b", "(Ljava/lang/String;J)Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {
    void a(String paymentData);

    Flow<s<StatusResponse>> b(String paymentData, long maxPollingDuration);
}
