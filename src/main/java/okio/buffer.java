package okio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: okio.l0, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010\f\u001a\u00020 2\u0006\u0010\t\u001a\u00020*H\u0016¢\u0006\u0004\b\f\u0010+J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002012\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000201H\u0016¢\u0006\u0004\b:\u00103J\u0017\u0010<\u001a\u0002012\u0006\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u00105J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020 H\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010EJ\u000f\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010EJ\u0017\u0010I\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010\u0013J\u0017\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u0016H\u0016¢\u0006\u0004\bK\u0010LJ'\u0010O\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0019H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\bW\u0010SJ\u001f\u0010X\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010UJ\u001f\u0010Z\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010[J/\u0010]\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0001H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000eH\u0016¢\u0006\u0004\bd\u0010\u0010J\u000f\u0010e\u001a\u00020\u0011H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u000201H\u0016¢\u0006\u0004\bj\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010mR\u0016\u0010o\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010RR\u001b\u0010r\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bq\u0010f\u001a\u0004\bp\u0010\b¨\u0006s"}, d2 = {"Lokio/l0;", "Lokio/j;", "Lokio/r0;", "source", "<init>", "(Lokio/r0;)V", "Lokio/h;", "P1", "()Lokio/h;", "sink", "", "byteCount", "read", "(Lokio/h;J)J", "", "T2", "()Z", "Ljn0/h0;", "D2", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lokio/k;", "m1", "()Lokio/k;", "Q0", "(J)Lokio/k;", "Lokio/g0;", "options", "", "M3", "(Lokio/g0;)I", "", "V0", "()[B", "y2", "(J)[B", "readFully", "([B)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Z1", "(Lokio/h;J)V", "Lokio/p0;", "D1", "(Lokio/p0;)J", "", "t1", "()Ljava/lang/String;", "M0", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "j1", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "w2", "limit", "e2", "", "readShort", "()S", "A0", "readInt", "()I", "w3", "readLong", "()J", "E0", "X2", "J1", "skip", "b", "c", "(B)J", "fromIndex", "toIndex", "a2", "(BJJ)J", "bytes", "Z", "(Lokio/k;)J", "n", "(Lokio/k;J)J", "targetBytes", "d0", "o", "offset", "l0", "(JLokio/k;)Z", "bytesOffset", "p", "(JLokio/k;II)Z", "peek", "()Lokio/j;", "Ljava/io/InputStream;", "K3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lokio/s0;", "timeout", "()Lokio/s0;", "toString", "a", "Lokio/r0;", "Lokio/h;", "bufferField", "closed", "l", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class buffer implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final r0 source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final h bufferField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public buffer(r0 source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        this.source = source;
        this.bufferField = new h();
    }

    @Override // okio.j
    public short A0() throws EOFException {
        D2(2L);
        return this.bufferField.A0();
    }

    @Override // okio.j
    public long D1(p0 sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        long j11 = 0;
        while (this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
            long jO = this.bufferField.o();
            if (jO > 0) {
                j11 += jO;
                sink.write(this.bufferField, jO);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j11;
        }
        long size = j11 + this.bufferField.getSize();
        h hVar = this.bufferField;
        sink.write(hVar, hVar.getSize());
        return size;
    }

    @Override // okio.j
    public void D2(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    @Override // okio.j
    public long E0() throws EOFException {
        D2(8L);
        return this.bufferField.E0();
    }

    @Override // okio.j
    public long J1() throws EOFException {
        D2(1L);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (!request(i12)) {
                break;
            }
            byte bH = this.bufferField.H(i11);
            if ((bH < 48 || bH > 57) && ((bH < 97 || bH > 102) && (bH < 65 || bH > 70))) {
                if (i11 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bH, p013kotlin.text.a.a(16));
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i11 = i12;
        }
        return this.bufferField.J1();
    }

    @Override // okio.j
    public InputStream K3() {
        return new a();
    }

    @Override // okio.j
    public String M0(long byteCount) throws EOFException {
        D2(byteCount);
        return this.bufferField.M0(byteCount);
    }

    @Override // okio.j
    public int M3(g0 options) throws EOFException {
        p013kotlin.jvm.internal.s.k(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iG = ip0.a.g(this.bufferField, options, true);
            if (iG != -2) {
                if (iG == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[iG].D());
                return iG;
            }
        } while (this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) != -1);
        return -1;
    }

    @Override // okio.j
    /* JADX INFO: renamed from: P1, reason: from getter */
    public h getBufferField() {
        return this.bufferField;
    }

    @Override // okio.j
    public k Q0(long byteCount) throws EOFException {
        D2(byteCount);
        return this.bufferField.Q0(byteCount);
    }

    @Override // okio.j
    public boolean T2() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.T2() && this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1;
    }

    @Override // okio.j
    public byte[] V0() {
        this.bufferField.q2(this.source);
        return this.bufferField.V0();
    }

    @Override // okio.j
    public long X2() throws EOFException {
        D2(1L);
        long j11 = 0;
        while (true) {
            long j12 = j11 + 1;
            if (!request(j12)) {
                break;
            }
            byte bH = this.bufferField.H(j11);
            if ((bH < 48 || bH > 57) && !(j11 == 0 && bH == 45)) {
                if (j11 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bH, p013kotlin.text.a.a(16));
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j11 = j12;
        }
        return this.bufferField.X2();
    }

    @Override // okio.j
    public long Z(k bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        return n(bytes, 0L);
    }

    @Override // okio.j
    public void Z1(h sink, long byteCount) throws EOFException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        try {
            D2(byteCount);
            this.bufferField.Z1(sink, byteCount);
        } catch (EOFException e11) {
            sink.q2(this.bufferField);
            throw e11;
        }
    }

    @Override // okio.j
    public long a2(byte b11, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b12 = b11;
            long j11 = toIndex;
            long jA2 = this.bufferField.a2(b12, jMax, j11);
            if (jA2 != -1) {
                return jA2;
            }
            long size = this.bufferField.getSize();
            if (size >= j11 || this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b11 = b12;
            toIndex = j11;
        }
        return -1L;
    }

    public long c(byte b11) {
        return a2(b11, 0L, Long.MAX_VALUE);
    }

    @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.c();
    }

    @Override // okio.j
    public long d0(k targetBytes) {
        p013kotlin.jvm.internal.s.k(targetBytes, "targetBytes");
        return o(targetBytes, 0L);
    }

    @Override // okio.j
    public String e2(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j11 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jA2 = a2((byte) 10, 0L, j11);
        if (jA2 != -1) {
            return ip0.a.f(this.bufferField, jA2);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && this.bufferField.H(j11 - 1) == 13 && request(j11 + 1) && this.bufferField.H(j11) == 10) {
            return ip0.a.f(this.bufferField, j11);
        }
        h hVar = new h();
        h hVar2 = this.bufferField;
        hVar2.t(hVar, 0L, Math.min(32, hVar2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + hVar.m1().m() + (char) 8230);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.j
    public String j1(Charset charset) {
        p013kotlin.jvm.internal.s.k(charset, "charset");
        this.bufferField.q2(this.source);
        return this.bufferField.j1(charset);
    }

    @Override // okio.j, okio.i
    /* JADX INFO: renamed from: l */
    public h getBufferField() {
        return this.bufferField;
    }

    @Override // okio.j
    public boolean l0(long offset, k bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        return p(offset, bytes, 0, bytes.D());
    }

    @Override // okio.j
    public k m1() {
        this.bufferField.q2(this.source);
        return this.bufferField.m1();
    }

    public long n(k bytes, long fromIndex) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jI = this.bufferField.I(bytes, fromIndex);
            if (jI != -1) {
                return jI;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - ((long) bytes.D())) + 1);
        }
    }

    public long o(k targetBytes, long fromIndex) {
        p013kotlin.jvm.internal.s.k(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long J = this.bufferField.J(targetBytes, fromIndex);
            if (J != -1) {
                return J;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    public boolean p(long offset, k bytes, int bytesOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.D() - bytesOffset < byteCount) {
            return false;
        }
        for (int i11 = 0; i11 < byteCount; i11++) {
            long j11 = ((long) i11) + offset;
            if (!request(1 + j11) || this.bufferField.H(j11) != bytes.h(bytesOffset + i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.j
    public j peek() {
        return c0.d(new j0(this));
    }

    @Override // okio.r0
    public long read(h sink, long byteCount) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.getSize() == 0) {
            if (byteCount == 0) {
                return 0L;
            }
            if (this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    @Override // okio.j
    public byte readByte() throws EOFException {
        D2(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.j
    public void readFully(byte[] sink) throws EOFException {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        try {
            D2(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e11) {
            int i11 = 0;
            while (this.bufferField.getSize() > 0) {
                h hVar = this.bufferField;
                int i12 = hVar.read(sink, i11, (int) hVar.getSize());
                if (i12 == -1) {
                    throw new AssertionError();
                }
                i11 += i12;
            }
            throw e11;
        }
    }

    @Override // okio.j
    public int readInt() throws EOFException {
        D2(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.j
    public long readLong() throws EOFException {
        D2(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.j
    public short readShort() throws EOFException {
        D2(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.j
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.j
    public void skip(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // okio.j
    public String t1() {
        this.bufferField.q2(this.source);
        return this.bufferField.t1();
    }

    @Override // okio.r0
    /* JADX INFO: renamed from: timeout */
    public s0 getF97915a() {
        return this.source.getF97915a();
    }

    public String toString() {
        return "buffer(" + this.source + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.j
    public String w2() {
        return e2(Long.MAX_VALUE);
    }

    @Override // okio.j
    public int w3() throws EOFException {
        D2(4L);
        return this.bufferField.w3();
    }

    @Override // okio.j
    public byte[] y2(long byteCount) throws EOFException {
        D2(byteCount);
        return this.bufferField.y2(byteCount);
    }

    /* JADX INFO: renamed from: okio.l0$a */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"okio/l0$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "Ljn0/h0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", "", "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(bufferVar.bufferField.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            buffer.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            if (bufferVar.bufferField.getSize() == 0) {
                buffer bufferVar2 = buffer.this;
                if (bufferVar2.source.read(bufferVar2.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1;
                }
            }
            return buffer.this.bufferField.readByte() & 255;
        }

        public String toString() {
            return buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream out) throws IOException {
            p013kotlin.jvm.internal.s.k(out, "out");
            if (buffer.this.closed) {
                throw new IOException("closed");
            }
            long size = 0;
            while (true) {
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return size;
                    }
                }
                size += buffer.this.bufferField.getSize();
                h.e1(buffer.this.bufferField, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            p013kotlin.jvm.internal.s.k(data, "data");
            if (!buffer.this.closed) {
                e.b(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
