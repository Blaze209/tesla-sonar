package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198G¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lokio/t;", "Lokio/p0;", "sink", "<init>", "(Lokio/p0;)V", "Ljn0/h0;", "n", "()V", "Lokio/h;", "buffer", "", "byteCount", "c", "(Lokio/h;J)V", "source", "write", "flush", "Lokio/s0;", "timeout", "()Lokio/s0;", "close", "Lokio/k0;", "a", "Lokio/k0;", "Ljava/util/zip/Deflater;", "Lokio/Deflater;", "b", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "Lokio/l;", "Lokio/l;", "deflaterSink", "", DateTokenConverter.CONVERTER_KEY, "Z", "closed", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final buffer sink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DeflaterSink deflaterSink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public t(p0 sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        buffer bufferVar = new buffer(sink);
        this.sink = bufferVar;
        Deflater deflater = new Deflater(ip0.r.b(), true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((i) bufferVar, deflater);
        this.crc = new CRC32();
        h hVar = bufferVar.bufferField;
        hVar.writeShort(8075);
        hVar.writeByte(8);
        hVar.writeByte(0);
        hVar.writeInt(0);
        hVar.writeByte(0);
        hVar.writeByte(0);
    }

    private final void c(h buffer, long byteCount) {
        m0 m0Var = buffer.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        while (byteCount > 0) {
            int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            this.crc.update(m0Var.data, m0Var.pos, iMin);
            byteCount -= (long) iMin;
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
        }
    }

    private final void n() {
        this.sink.X0((int) this.crc.getValue());
        this.sink.X0((int) this.deflater.getBytesRead());
    }

    @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.deflaterSink.n();
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
        this.deflaterSink.flush();
    }

    @Override // okio.p0
    /* JADX INFO: renamed from: timeout */
    public s0 getF97913a() {
        return this.sink.getF97913a();
    }

    @Override // okio.p0
    public void write(h source, long byteCount) throws IOException {
        p013kotlin.jvm.internal.s.k(source, "source");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return;
        }
        c(source, byteCount);
        this.deflaterSink.write(source, byteCount);
    }
}
