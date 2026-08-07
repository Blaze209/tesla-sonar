package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: okio.w, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokio/w;", "Lokio/r0;", "Ljava/io/InputStream;", "input", "Lokio/s0;", "timeout", "<init>", "(Ljava/io/InputStream;Lokio/s0;)V", "Lokio/h;", "sink", "", "byteCount", "read", "(Lokio/h;J)J", "Ljn0/h0;", "close", "()V", "()Lokio/s0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/InputStream;", "b", "Lokio/s0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
class source implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputStream input;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0 timeout;

    public source(InputStream input, s0 timeout) {
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // okio.r0
    public long read(h sink, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.throwIfReached();
            m0 m0VarU0 = sink.u0(1);
            int i11 = this.input.read(m0VarU0.data, m0VarU0.limit, (int) Math.min(byteCount, 8192 - m0VarU0.limit));
            if (i11 != -1) {
                m0VarU0.limit += i11;
                long j11 = i11;
                sink.r0(sink.getSize() + j11);
                return j11;
            }
            if (m0VarU0.pos != m0VarU0.limit) {
                return -1L;
            }
            sink.head = m0VarU0.b();
            n0.b(m0VarU0);
            return -1L;
        } catch (AssertionError e11) {
            if (c0.e(e11)) {
                throw new IOException(e11);
            }
            throw e11;
        }
    }

    @Override // okio.r0
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public s0 getF97915a() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
