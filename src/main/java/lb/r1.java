package lb;

import androidx.work.impl.WorkerStoppedException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "Lcom/google/common/util/concurrent/s;", "Landroidx/work/y;", "worker", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/common/util/concurrent/s;Landroidx/work/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f89879a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.y f89880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.s<T> f89881b;

        a(androidx.work.y yVar, com.google.common.util.concurrent.s<T> sVar) {
            this.f89880a = yVar;
            this.f89881b = sVar;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof WorkerStoppedException) {
                this.f89880a.stop(((WorkerStoppedException) th2).getCom.fourthline.analytics.internal.AnalyticsAttribute.Reason java.lang.String());
            }
            this.f89881b.cancel(false);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    static {
        String strI = androidx.work.z.i("WorkerWrapper");
        p013kotlin.jvm.internal.s.j(strI, "tagWithPrefix(...)");
        f89879a = strI;
    }

    public static final <T> Object d(com.google.common.util.concurrent.s<T> sVar, androidx.work.y yVar, Continuation<? super T> continuation) throws Throwable {
        try {
            if (sVar.isDone()) {
                return e(sVar);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            sVar.b(new b0(sVar, cancellableContinuationImpl), androidx.work.j.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new a(yVar, sVar));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (ExecutionException e11) {
            throw f(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V e(Future<V> future) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        p013kotlin.jvm.internal.s.h(cause);
        return cause;
    }
}
