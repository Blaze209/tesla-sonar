package okio;

import java.io.EOFException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lokio/g;", "Lokio/p0;", "<init>", "()V", "Lokio/h;", "source", "", "byteCount", "Ljn0/h0;", "write", "(Lokio/h;J)V", "flush", "Lokio/s0;", "timeout", "()Lokio/s0;", "close", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g implements p0 {
    @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.p0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.p0
    public s0 timeout() {
        return s0.NONE;
    }

    @Override // okio.p0
    public void write(h source, long byteCount) throws EOFException {
        p013kotlin.jvm.internal.s.k(source, "source");
        source.skip(byteCount);
    }
}
