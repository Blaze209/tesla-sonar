package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.zip.Deflater;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: okio.l, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"Lokio/l;", "Lokio/p0;", "Lokio/i;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/i;Ljava/util/zip/Deflater;)V", "(Lokio/p0;Ljava/util/zip/Deflater;)V", "", "syncFlush", "Ljn0/h0;", "c", "(Z)V", "Lokio/h;", "source", "", "byteCount", "write", "(Lokio/h;J)V", "flush", "()V", "n", "close", "Lokio/s0;", "timeout", "()Lokio/s0;", "", "toString", "()Ljava/lang/String;", "a", "Lokio/i;", "b", "Ljava/util/zip/Deflater;", "Z", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeflaterSink implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i sink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public DeflaterSink(i sink, Deflater deflater) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        p013kotlin.jvm.internal.s.k(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    private final void c(boolean syncFlush) throws IOException {
        m0 m0VarU0;
        int iDeflate;
        h bufferField = this.sink.getBufferField();
        while (true) {
            m0VarU0 = bufferField.u0(1);
            if (syncFlush) {
                try {
                    Deflater deflater = this.deflater;
                    byte[] bArr = m0VarU0.data;
                    int i11 = m0VarU0.limit;
                    iDeflate = deflater.deflate(bArr, i11, 8192 - i11, 2);
                } catch (NullPointerException e11) {
                    throw new IOException("Deflater already closed", e11);
                }
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = m0VarU0.data;
                int i12 = m0VarU0.limit;
                iDeflate = deflater2.deflate(bArr2, i12, 8192 - i12);
            }
            if (iDeflate > 0) {
                m0VarU0.limit += iDeflate;
                bufferField.r0(bufferField.getSize() + ((long) iDeflate));
                this.sink.b2();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (m0VarU0.pos == m0VarU0.limit) {
            bufferField.head = m0VarU0.b();
            n0.b(m0VarU0);
        }
    }

    @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        n();
        th = null;
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.p0, java.io.Flushable
    public void flush() throws IOException {
        c(true);
        this.sink.flush();
    }

    public final void n() throws IOException {
        this.deflater.finish();
        c(false);
    }

    @Override // okio.p0
    /* JADX INFO: renamed from: timeout */
    public s0 getF97913a() {
        return this.sink.getF97913a();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.p0
    public void write(h source, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(source, "source");
        e.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            m0 m0Var = source.head;
            p013kotlin.jvm.internal.s.h(m0Var);
            int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            this.deflater.setInput(m0Var.data, m0Var.pos, iMin);
            c(false);
            long j11 = iMin;
            source.r0(source.getSize() - j11);
            int i11 = m0Var.pos + iMin;
            m0Var.pos = i11;
            if (i11 == m0Var.limit) {
                source.head = m0Var.b();
                n0.b(m0Var);
            }
            byteCount -= j11;
        }
        this.deflater.setInput(ip0.r.c(), 0, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(p0 sink, Deflater deflater) {
        this(c0.c(sink), deflater);
        p013kotlin.jvm.internal.s.k(sink, "sink");
        p013kotlin.jvm.internal.s.k(deflater, "deflater");
    }
}
