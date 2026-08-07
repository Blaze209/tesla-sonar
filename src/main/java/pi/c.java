package pi;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpi/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Ljn0/h0;", "close", "", "a", "Z", "closed", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "b", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "_dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "()Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ExecutorCoroutineDispatcher _dispatcher;

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        s.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this._dispatcher = ExecutorsKt.from(executorServiceNewSingleThreadExecutor);
    }

    public final CoroutineDispatcher c() {
        return this._dispatcher;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this._dispatcher.close();
        this.closed = true;
    }
}
