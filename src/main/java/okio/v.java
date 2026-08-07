package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lokio/v;", "Lokio/r0;", "Lokio/j;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/j;Ljava/util/zip/Inflater;)V", "(Lokio/r0;Ljava/util/zip/Inflater;)V", "Ljn0/h0;", "o", "()V", "Lokio/h;", "sink", "", "byteCount", "read", "(Lokio/h;J)J", "c", "", "n", "()Z", "Lokio/s0;", "timeout", "()Lokio/s0;", "close", "a", "Lokio/j;", "b", "Ljava/util/zip/Inflater;", "", "I", "bufferBytesHeldByInflater", DateTokenConverter.CONVERTER_KEY, "Z", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bufferBytesHeldByInflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public v(j source, Inflater inflater) {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    private final void o() {
        int i11 = this.bufferBytesHeldByInflater;
        if (i11 == 0) {
            return;
        }
        int remaining = i11 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    public final long c(h sink, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            m0 m0VarU0 = sink.u0(1);
            int iMin = (int) Math.min(byteCount, 8192 - m0VarU0.limit);
            n();
            int iInflate = this.inflater.inflate(m0VarU0.data, m0VarU0.limit, iMin);
            o();
            if (iInflate > 0) {
                m0VarU0.limit += iInflate;
                long j11 = iInflate;
                sink.r0(sink.getSize() + j11);
                return j11;
            }
            if (m0VarU0.pos == m0VarU0.limit) {
                sink.head = m0VarU0.b();
                n0.b(m0VarU0);
            }
            return 0L;
        } catch (DataFormatException e11) {
            throw new IOException(e11);
        }
    }

    @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    public final boolean n() {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.T2()) {
            return true;
        }
        m0 m0Var = this.source.l().head;
        p013kotlin.jvm.internal.s.h(m0Var);
        int i11 = m0Var.limit;
        int i12 = m0Var.pos;
        int i13 = i11 - i12;
        this.bufferBytesHeldByInflater = i13;
        this.inflater.setInput(m0Var.data, i12, i13);
        return false;
    }

    @Override // okio.r0
    public long read(h sink, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        do {
            long jC = c(sink, byteCount);
            if (jC > 0) {
                return jC;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.T2());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.r0
    public s0 timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(r0 source, Inflater inflater) {
        this(c0.d(source), inflater);
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
    }
}
