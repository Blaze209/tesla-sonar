package ll0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.plaid.internal.EnumC4419g;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@jn0.e
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b'\b'\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH$¢\u0006\u0004\b%\u0010\nJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\nJ\u0011\u0010'\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\nJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J)\u00105\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010*J\u001d\u0010?\u001a\u00020\u000b2\u0006\u00101\u001a\u0002072\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u000b¢\u0006\u0004\bA\u0010\nJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0011H\u0001¢\u0006\u0004\bB\u0010CJ\u000f\u0010>\u001a\u00020\u000bH\u0001¢\u0006\u0004\b>\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\nR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010IR+\u0010R\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010X\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010\r\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010\r\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR\u0016\u0010^\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\rR\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\rR\u0014\u0010b\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\ba\u0010UR\u0014\u0010\u000f\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u000e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006d"}, d2 = {"Lll0/r;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lnl0/f;", "Lml0/a;", "pool", "<init>", "(Lnl0/f;)V", "()V", "Ljn0/h0;", "c0", "I", "()Lml0/a;", "head", "newTail", "", "chainedSizeDelta", "C", "(Lml0/a;Lml0/a;I)V", "", "c", "H", "(C)V", "tail", "foreignStolen", "H0", "(Lml0/a;Lml0/a;Lnl0/f;)V", "J0", "(Lml0/a;Lml0/a;)V", "Ljl0/c;", "source", "offset", "length", "b0", "(Ljava/nio/ByteBuffer;II)V", "T", "flush", "y0", "buffer", "J", "(Lml0/a;)V", "B", "close", "value", "o", "(C)Lll0/r;", "", "p", "(Ljava/lang/CharSequence;)Lll0/r;", "startIndex", "endIndex", "t", "(Ljava/lang/CharSequence;II)Lll0/r;", "Lll0/k;", "packet", "D0", "(Lll0/k;)V", "chunkBuffer", "z0", "", "n", "G0", "(Lll0/k;J)V", "release", "u0", "(I)Lml0/a;", "a", "Lnl0/f;", "k0", "()Lnl0/f;", "b", "Lml0/a;", "_head", "_tail", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/ByteBuffer;", "r0", "()Ljava/nio/ByteBuffer;", "setTailMemory-3GNKZMM$ktor_io", "(Ljava/nio/ByteBuffer;)V", "tailMemory", "e", "s0", "()I", "w0", "(I)V", "tailPosition", "f", "n0", "setTailEndExclusive$ktor_io", "tailEndExclusive", "g", "tailInitialPosition", "h", "chainedSize", "t0", "_size", "e0", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r implements Appendable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl0.f<ml0.a> pool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ml0.a _head;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ml0.a _tail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer tailMemory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int tailPosition;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int tailEndExclusive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int tailInitialPosition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int chainedSize;

    public r(nl0.f<ml0.a> pool) {
        p013kotlin.jvm.internal.s.k(pool, "pool");
        this.pool = pool;
        this.tailMemory = jl0.c.INSTANCE.a();
    }

    private final void C(ml0.a head, ml0.a newTail, int chainedSizeDelta) {
        ml0.a aVar = this._tail;
        if (aVar == null) {
            this._head = head;
            this.chainedSize = 0;
        } else {
            aVar.G(head);
            int i11 = this.tailPosition;
            aVar.b(i11);
            this.chainedSize += i11 - this.tailInitialPosition;
        }
        this._tail = newTail;
        this.chainedSize += chainedSizeDelta;
        this.tailMemory = newTail.getMemory();
        this.tailPosition = newTail.getWritePosition();
        this.tailInitialPosition = newTail.getReadPosition();
        this.tailEndExclusive = newTail.getLimit();
    }

    private final void H(char c11) {
        int i11 = 3;
        ml0.a aVarU0 = u0(3);
        try {
            ByteBuffer memory = aVarU0.getMemory();
            int writePosition = aVarU0.getWritePosition();
            if (c11 >= 0 && c11 < 128) {
                memory.put(writePosition, (byte) c11);
                i11 = 1;
            } else if (128 <= c11 && c11 < 2048) {
                memory.put(writePosition, (byte) (((c11 >> 6) & 31) | 192));
                memory.put(writePosition + 1, (byte) ((c11 & '?') | 128));
                i11 = 2;
            } else if (2048 <= c11 && c11 < 0) {
                memory.put(writePosition, (byte) (((c11 >> '\f') & 15) | 224));
                memory.put(writePosition + 1, (byte) (((c11 >> 6) & 63) | 128));
                memory.put(writePosition + 2, (byte) ((c11 & '?') | 128));
            } else {
                if (0 > c11 || c11 >= 0) {
                    ml0.e.j(c11);
                    throw new KotlinNothingValueException();
                }
                memory.put(writePosition, (byte) (((c11 >> 18) & 7) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                memory.put(writePosition + 1, (byte) (((c11 >> '\f') & 63) | 128));
                memory.put(writePosition + 2, (byte) (((c11 >> 6) & 63) | 128));
                memory.put(writePosition + 3, (byte) ((c11 & '?') | 128));
                i11 = 4;
            }
            aVarU0.a(i11);
            n();
        } catch (Throwable th2) {
            n();
            throw th2;
        }
    }

    private final void H0(ml0.a tail, ml0.a foreignStolen, nl0.f<ml0.a> pool) {
        tail.b(this.tailPosition);
        int writePosition = tail.getWritePosition() - tail.getReadPosition();
        int writePosition2 = foreignStolen.getWritePosition() - foreignStolen.getReadPosition();
        int iA = u.a();
        if (writePosition2 >= iA || writePosition2 > (tail.getCapacity() - tail.getLimit()) + (tail.getLimit() - tail.getWritePosition())) {
            writePosition2 = -1;
        }
        if (writePosition >= iA || writePosition > foreignStolen.getStartGap() || !ml0.b.a(foreignStolen)) {
            writePosition = -1;
        }
        if (writePosition2 == -1 && writePosition == -1) {
            B(foreignStolen);
            return;
        }
        if (writePosition == -1 || writePosition2 <= writePosition) {
            b.a(tail, foreignStolen, (tail.getLimit() - tail.getWritePosition()) + (tail.getCapacity() - tail.getLimit()));
            n();
            ml0.a aVarZ = foreignStolen.z();
            if (aVarZ != null) {
                B(aVarZ);
            }
            foreignStolen.E(pool);
            return;
        }
        if (writePosition2 == -1 || writePosition < writePosition2) {
            J0(foreignStolen, tail);
            return;
        }
        throw new IllegalStateException("prep = " + writePosition + ", app = " + writePosition2);
    }

    private final ml0.a I() {
        ml0.a aVarS2 = this.pool.S2();
        aVarS2.p(8);
        J(aVarS2);
        return aVarS2;
    }

    private final void J0(ml0.a foreignStolen, ml0.a tail) {
        b.c(foreignStolen, tail);
        ml0.a aVar = this._head;
        if (aVar == null) {
            throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
        }
        if (aVar == tail) {
            this._head = foreignStolen;
        } else {
            while (true) {
                ml0.a aVarB = aVar.B();
                p013kotlin.jvm.internal.s.h(aVarB);
                if (aVarB == tail) {
                    break;
                } else {
                    aVar = aVarB;
                }
            }
            aVar.G(foreignStolen);
        }
        tail.E(this.pool);
        this._tail = h.c(foreignStolen);
    }

    private final void c0() {
        ml0.a aVarY0 = y0();
        if (aVarY0 == null) {
            return;
        }
        ml0.a aVarB = aVarY0;
        do {
            try {
                b0(aVarB.getMemory(), aVarB.getReadPosition(), aVarB.getWritePosition() - aVarB.getReadPosition());
                aVarB = aVarB.B();
            } finally {
                h.d(aVarY0, this.pool);
            }
        } while (aVarB != null);
    }

    public final void B(ml0.a head) {
        p013kotlin.jvm.internal.s.k(head, "head");
        ml0.a aVarC = h.c(head);
        long jE = h.e(head) - ((long) (aVarC.getWritePosition() - aVarC.getReadPosition()));
        if (jE < 2147483647L) {
            C(head, aVarC, (int) jE);
        } else {
            ml0.d.a(jE, "total size increase");
            throw new KotlinNothingValueException();
        }
    }

    public final void D0(k packet) {
        p013kotlin.jvm.internal.s.k(packet, "packet");
        ml0.a aVarB1 = packet.B1();
        if (aVarB1 == null) {
            packet.release();
            return;
        }
        ml0.a aVar = this._tail;
        if (aVar == null) {
            B(aVarB1);
        } else {
            H0(aVar, aVarB1, packet.H0());
        }
    }

    public final void G0(k p11, long n11) throws EOFException {
        p013kotlin.jvm.internal.s.k(p11, "p");
        while (n11 > 0) {
            long jZ0 = p11.getHeadEndExclusive() - p11.getHeadPosition();
            if (jZ0 > n11) {
                ml0.a aVarU0 = p11.U0(1);
                if (aVarU0 == null) {
                    w.a(1);
                    throw new KotlinNothingValueException();
                }
                int readPosition = aVarU0.getReadPosition();
                try {
                    s.a(this, aVarU0, (int) n11);
                    int readPosition2 = aVarU0.getReadPosition();
                    if (readPosition2 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition2 == aVarU0.getWritePosition()) {
                        p11.c0(aVarU0);
                        return;
                    } else {
                        p11.s1(readPosition2);
                        return;
                    }
                } catch (Throwable th2) {
                    int readPosition3 = aVarU0.getReadPosition();
                    if (readPosition3 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition3 == aVarU0.getWritePosition()) {
                        p11.c0(aVarU0);
                    } else {
                        p11.s1(readPosition3);
                    }
                    throw th2;
                }
            }
            n11 -= jZ0;
            ml0.a aVarW1 = p11.w1();
            if (aVarW1 == null) {
                throw new EOFException("Unexpected end of packet");
            }
            J(aVarW1);
        }
    }

    public final void J(ml0.a buffer) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        if (buffer.B() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        C(buffer, buffer, 0);
    }

    protected abstract void T();

    protected abstract void b0(ByteBuffer source, int offset, int length);

    public final void c() {
        ml0.a aVarE0 = e0();
        if (aVarE0 != ml0.a.INSTANCE.a()) {
            if (aVarE0.B() != null) {
                throw new IllegalStateException("Check failed.");
            }
            aVarE0.t();
            aVarE0.p(8);
            int writePosition = aVarE0.getWritePosition();
            this.tailPosition = writePosition;
            this.tailInitialPosition = writePosition;
            this.tailEndExclusive = aVarE0.getLimit();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            T();
        }
    }

    public final ml0.a e0() {
        ml0.a aVar = this._head;
        return aVar == null ? ml0.a.INSTANCE.a() : aVar;
    }

    public final void flush() {
        c0();
    }

    protected final nl0.f<ml0.a> k0() {
        return this.pool;
    }

    public final void n() {
        ml0.a aVar = this._tail;
        if (aVar != null) {
            this.tailPosition = aVar.getWritePosition();
        }
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final int getTailEndExclusive() {
        return this.tailEndExclusive;
    }

    @Override // java.lang.Appendable
    public r o(char value) {
        int i11 = this.tailPosition;
        int i12 = 3;
        if (this.tailEndExclusive - i11 < 3) {
            H(value);
            return this;
        }
        ByteBuffer byteBuffer = this.tailMemory;
        if (value >= 0 && value < 128) {
            byteBuffer.put(i11, (byte) value);
            i12 = 1;
        } else if (128 <= value && value < 2048) {
            byteBuffer.put(i11, (byte) (((value >> 6) & 31) | 192));
            byteBuffer.put(i11 + 1, (byte) ((value & '?') | 128));
            i12 = 2;
        } else if (2048 <= value && value < 0) {
            byteBuffer.put(i11, (byte) (((value >> '\f') & 15) | 224));
            byteBuffer.put(i11 + 1, (byte) (((value >> 6) & 63) | 128));
            byteBuffer.put(i11 + 2, (byte) ((value & '?') | 128));
        } else {
            if (0 > value || value >= 0) {
                ml0.e.j(value);
                throw new KotlinNothingValueException();
            }
            byteBuffer.put(i11, (byte) (((value >> 18) & 7) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
            byteBuffer.put(i11 + 1, (byte) (((value >> '\f') & 63) | 128));
            byteBuffer.put(i11 + 2, (byte) (((value >> 6) & 63) | 128));
            byteBuffer.put(i11 + 3, (byte) ((value & '?') | 128));
            i12 = 4;
        }
        this.tailPosition = i11 + i12;
        return this;
    }

    @Override // java.lang.Appendable
    public r p(CharSequence value) {
        if (value == null) {
            t(Address.ADDRESS_NULL_PLACEHOLDER, 0, 4);
            return this;
        }
        t(value, 0, value.length());
        return this;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final ByteBuffer getTailMemory() {
        return this.tailMemory;
    }

    public final void release() {
        close();
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final int getTailPosition() {
        return this.tailPosition;
    }

    @Override // java.lang.Appendable
    public r t(CharSequence value, int startIndex, int endIndex) {
        if (value == null) {
            return t(Address.ADDRESS_NULL_PLACEHOLDER, startIndex, endIndex);
        }
        w.h(this, value, startIndex, endIndex, p013kotlin.text.d.UTF_8);
        return this;
    }

    protected final int t0() {
        return this.chainedSize + (this.tailPosition - this.tailInitialPosition);
    }

    public final ml0.a u0(int n11) {
        ml0.a aVar;
        if (getTailEndExclusive() - getTailPosition() < n11 || (aVar = this._tail) == null) {
            return I();
        }
        aVar.b(this.tailPosition);
        return aVar;
    }

    public final void w0(int i11) {
        this.tailPosition = i11;
    }

    public final ml0.a y0() {
        ml0.a aVar = this._head;
        if (aVar == null) {
            return null;
        }
        ml0.a aVar2 = this._tail;
        if (aVar2 != null) {
            aVar2.b(this.tailPosition);
        }
        this._head = null;
        this._tail = null;
        this.tailPosition = 0;
        this.tailEndExclusive = 0;
        this.tailInitialPosition = 0;
        this.chainedSize = 0;
        this.tailMemory = jl0.c.INSTANCE.a();
        return aVar;
    }

    public final void z0(ml0.a chunkBuffer) {
        p013kotlin.jvm.internal.s.k(chunkBuffer, "chunkBuffer");
        ml0.a aVar = this._tail;
        if (aVar == null) {
            B(chunkBuffer);
        } else {
            H0(aVar, chunkBuffer, this.pool);
        }
    }

    public r() {
        this(ml0.a.INSTANCE.c());
    }
}
