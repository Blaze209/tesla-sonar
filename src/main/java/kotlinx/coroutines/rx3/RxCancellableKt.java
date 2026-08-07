package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "cause", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "handleUndeliverableException", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxCancellableKt {
    public static final void handleUndeliverableException(Throwable th2, CoroutineContext coroutineContext) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            tm0.a.r(th2);
        } catch (Throwable th3) {
            jn0.g.a(th2, th3);
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, th2);
        }
    }
}
