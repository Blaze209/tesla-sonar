package ez;

import com.google.common.util.concurrent.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import jn0.t;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"V", "Lcom/google/common/util/concurrent/s;", "Ljava/util/concurrent/Executor;", "executor", "a", "(Lcom/google/common/util/concurrent/s;Ljava/util/concurrent/Executor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s<V> f63479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Continuation<V> f63480b;

        /* JADX WARN: Multi-variable type inference failed */
        a(s<V> sVar, Continuation<? super V> continuation) {
            this.f63479a = sVar;
            this.f63480b = continuation;
        }

        @Override // java.lang.Runnable
        public final void run() throws ExecutionException {
            if (this.f63479a.isCancelled() || !JobKt.isActive(this.f63480b.getContext())) {
                throw new CancellationException("ListenableFuture<V> has been canceled!");
            }
            try {
                Continuation<V> continuation = this.f63480b;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(this.f63479a.get()));
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    throw e11;
                }
                Continuation<V> continuation2 = this.f63480b;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                continuation2.resumeWith(jn0.s.b(t.a(cause)));
            }
        }
    }

    public static final <V> Object a(s<V> sVar, Executor executor, Continuation<? super V> continuation) throws Throwable {
        if (sVar.isCancelled()) {
            throw new CancellationException("ListenableFuture<V> has been canceled!");
        }
        if (sVar.isDone()) {
            return sVar.get();
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        a aVar = new a(sVar, safeContinuation);
        if (executor == null) {
            executor = ExecutorsKt.asExecutor(Dispatchers.getMain());
        }
        sVar.b(aVar, executor);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
