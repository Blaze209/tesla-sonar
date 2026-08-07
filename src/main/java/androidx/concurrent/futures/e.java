package androidx.concurrent.futures;

import com.google.common.util.concurrent.s;
import java.util.concurrent.ExecutionException;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/common/util/concurrent/s;", "a", "(Lcom/google/common/util/concurrent/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "b", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s<T> f6457c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar) {
            super(1);
            this.f6457c = sVar;
        }

        public final void a(Throwable th2) {
            this.f6457c.cancel(false);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    public static final <T> Object a(s<T> sVar, Continuation<? super T> continuation) {
        try {
            if (sVar.isDone()) {
                return androidx.concurrent.futures.a.k(sVar);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            sVar.b(new h(sVar, cancellableContinuationImpl), d.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new a(sVar));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (ExecutionException e11) {
            throw b(e11);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        p013kotlin.jvm.internal.s.h(cause);
        return cause;
    }
}
