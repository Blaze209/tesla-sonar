package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: okio.h0, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokio/h0;", "Lokio/p0;", "Ljava/io/OutputStream;", "out", "Lokio/s0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lokio/s0;)V", "Lokio/h;", "source", "", "byteCount", "Ljn0/h0;", "write", "(Lokio/h;J)V", "flush", "()V", "close", "()Lokio/s0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "Lokio/s0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class sink implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0 timeout;

    public sink(OutputStream out, s0 timeout) {
        p013kotlin.jvm.internal.s.k(out, "out");
        p013kotlin.jvm.internal.s.k(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // okio.p0, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // okio.p0
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public s0 getF97913a() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.p0
    public void write(h source, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(source, "source");
        e.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.throwIfReached();
            m0 m0Var = source.head;
            p013kotlin.jvm.internal.s.h(m0Var);
            int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            this.out.write(m0Var.data, m0Var.pos, iMin);
            m0Var.pos += iMin;
            long j11 = iMin;
            byteCount -= j11;
            source.r0(source.getSize() - j11);
            if (m0Var.pos == m0Var.limit) {
                source.head = m0Var.b();
                n0.b(m0Var);
            }
        }
    }
}
