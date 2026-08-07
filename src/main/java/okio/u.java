package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.bouncycastle.crypto.hpke.HPKE;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0007R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lokio/u;", "Lokio/r0;", "source", "<init>", "(Lokio/r0;)V", "Ljn0/h0;", "n", "()V", "o", "Lokio/h;", "buffer", "", "offset", "byteCount", "p", "(Lokio/h;JJ)V", "", "name", "", "expected", "actual", "c", "(Ljava/lang/String;II)V", "sink", "read", "(Lokio/h;J)J", "Lokio/s0;", "timeout", "()Lokio/s0;", "close", "", "a", "B", "section", "Lokio/l0;", "b", "Lokio/l0;", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "Lokio/v;", DateTokenConverter.CONVERTER_KEY, "Lokio/v;", "inflaterSource", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private byte section;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final buffer source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v inflaterSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public u(r0 source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        buffer bufferVar = new buffer(source);
        this.source = bufferVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new v((j) bufferVar, inflater);
        this.crc = new CRC32();
    }

    private final void c(String name, int expected, int actual) throws IOException {
        if (actual == expected) {
            return;
        }
        throw new IOException(name + ": actual 0x" + p013kotlin.text.t.K0(e.l(actual), 8, '0') + " != expected 0x" + p013kotlin.text.t.K0(e.l(expected), 8, '0'));
    }

    private final void n() throws IOException {
        this.source.D2(10L);
        byte bH = this.source.bufferField.H(3L);
        boolean z11 = ((bH >> 1) & 1) == 1;
        if (z11) {
            p(this.source.bufferField, 0L, 10L);
        }
        c("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((bH >> 2) & 1) == 1) {
            this.source.D2(2L);
            if (z11) {
                p(this.source.bufferField, 0L, 2L);
            }
            long jA0 = this.source.bufferField.A0() & HPKE.aead_EXPORT_ONLY;
            this.source.D2(jA0);
            if (z11) {
                p(this.source.bufferField, 0L, jA0);
            }
            this.source.skip(jA0);
        }
        if (((bH >> 3) & 1) == 1) {
            long jC = this.source.c((byte) 0);
            if (jC == -1) {
                throw new EOFException();
            }
            if (z11) {
                p(this.source.bufferField, 0L, jC + 1);
            }
            this.source.skip(jC + 1);
        }
        if (((bH >> 4) & 1) == 1) {
            long jC2 = this.source.c((byte) 0);
            if (jC2 == -1) {
                throw new EOFException();
            }
            if (z11) {
                p(this.source.bufferField, 0L, jC2 + 1);
            }
            this.source.skip(jC2 + 1);
        }
        if (z11) {
            c("FHCRC", this.source.A0(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void o() throws IOException {
        c("CRC", this.source.w3(), (int) this.crc.getValue());
        c("ISIZE", this.source.w3(), (int) this.inflater.getBytesWritten());
    }

    private final void p(h buffer, long offset, long byteCount) {
        m0 m0Var = buffer.head;
        p013kotlin.jvm.internal.s.h(m0Var);
        while (true) {
            int i11 = m0Var.limit;
            int i12 = m0Var.pos;
            if (offset < i11 - i12) {
                break;
            }
            offset -= (long) (i11 - i12);
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
        }
        while (byteCount > 0) {
            int i13 = (int) (((long) m0Var.pos) + offset);
            int iMin = (int) Math.min(m0Var.limit - i13, byteCount);
            this.crc.update(m0Var.data, i13, iMin);
            byteCount -= (long) iMin;
            m0Var = m0Var.next;
            p013kotlin.jvm.internal.s.h(m0Var);
            offset = 0;
        }
    }

    @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    @Override // okio.r0
    public long read(h sink, long byteCount) throws IOException {
        u uVar;
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            n();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.getSize();
            long j11 = this.inflaterSource.read(sink, byteCount);
            if (j11 != -1) {
                p(sink, size, j11);
                return j11;
            }
            uVar = this;
            uVar.section = (byte) 2;
        } else {
            uVar = this;
        }
        if (uVar.section == 2) {
            o();
            uVar.section = (byte) 3;
            if (!uVar.source.T2()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.r0
    /* JADX INFO: renamed from: timeout */
    public s0 getF97915a() {
        return this.source.getF97915a();
    }
}
