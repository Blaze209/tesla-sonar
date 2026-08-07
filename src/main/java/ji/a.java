package ji;

import okio.p0;
import okio.s0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lji/a;", "Lokio/p0;", "delegate", "<init>", "(Lokio/p0;)V", "Ljn0/h0;", "close", "()V", "flush", "Lokio/s0;", "timeout", "()Lokio/s0;", "Lokio/h;", "source", "", "byteCount", "write", "(Lokio/h;J)V", "a", "Lokio/p0;", "<set-?>", "b", "J", "c", "()J", "bytesWritten", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class a implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long bytesWritten;

    public a(p0 delegate) {
        s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBytesWritten() {
        return this.bytesWritten;
    }

    @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.p0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.p0
    public s0 timeout() {
        return this.delegate.timeout();
    }

    @Override // okio.p0
    public void write(okio.h source, long byteCount) {
        s.k(source, "source");
        this.delegate.write(source, byteCount);
        this.bytesWritten += byteCount;
    }
}
