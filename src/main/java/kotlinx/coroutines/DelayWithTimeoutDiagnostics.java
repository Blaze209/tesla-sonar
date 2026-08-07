package kotlinx.coroutines;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes9.dex */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "Lkotlinx/coroutines/Delay;", "Lio0/b;", "timeout", "", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "timeoutMessage", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DelayWithTimeoutDiagnostics extends Delay {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @jn0.e
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j11, Continuation<? super h0> continuation) {
            Object objDelay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j11, continuation);
            return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : h0.f84049a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j11, Runnable runnable, CoroutineContext coroutineContext) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j11, runnable, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String m508timeoutMessageLRDsOJo(long timeout);
}
