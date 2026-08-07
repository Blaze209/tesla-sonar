package w30;

import com.stripe.android.core.exception.InvalidRequestException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "b", "(Ljava/lang/Throwable;)Z", "shouldRetry", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Throwable th2) {
        return !(th2 instanceof InvalidRequestException);
    }
}
