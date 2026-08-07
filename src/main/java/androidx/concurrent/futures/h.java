package androidx.concurrent.futures;

import com.google.common.util.concurrent.s;
import java.util.concurrent.ExecutionException;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/concurrent/futures/h;", "T", "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/s;", "futureToObserve", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/s;Lkotlinx/coroutines/CancellableContinuation;)V", "Ljn0/h0;", "run", "()V", "a", "Lcom/google/common/util/concurrent/s;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/s;", "b", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CancellableContinuation<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public h(s<T> sVar, CancellableContinuation<? super T> cancellableContinuation) {
        this.futureToObserve = sVar;
        this.continuation = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            CancellableContinuation.DefaultImpls.cancel$default(this.continuation, null, 1, null);
            return;
        }
        try {
            CancellableContinuation<T> cancellableContinuation = this.continuation;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuation.resumeWith(jn0.s.b(a.k(this.futureToObserve)));
        } catch (ExecutionException e11) {
            CancellableContinuation<T> cancellableContinuation2 = this.continuation;
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            cancellableContinuation2.resumeWith(jn0.s.b(t.a(e.b(e11))));
        }
    }
}
