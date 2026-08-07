package ll0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@jn0.e
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b9\b'\u0018\u0000 \u0085\u00012\u00060\u0001j\u0002`\u0002:\u0001ZB+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J+\u0010\u001a\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J \u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0082\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\"\u0010*\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0082\u0010¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u0010$J\"\u00101\u001a\u0004\u0018\u00010\u00032\u0006\u00100\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\u0010¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0015J\u0017\u00104\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u0010$J-\u00109\u001a\u00020\u000e2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000eH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\"H$¢\u0006\u0004\b;\u0010<J\r\u0010>\u001a\u00020=¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\"¢\u0006\u0004\b@\u0010<J\u000f\u0010A\u001a\u00020\"H\u0016¢\u0006\u0004\bA\u0010<J\u0011\u0010B\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\bB\u0010-J\u0011\u0010C\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\bC\u0010-J\u0017\u0010\u001b\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001b\u0010$J\u0017\u0010E\u001a\u00020=2\u0006\u0010D\u001a\u00020\u0003H\u0000¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\bK\u0010LJ!\u0010N\u001a\u00020M2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u0004\u0018\u00010\u00032\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\u0003H\u0001¢\u0006\u0004\bT\u0010SJ\u0017\u0010U\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\bU\u0010$J\u0011\u0010V\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\bV\u0010-J\u000f\u0010W\u001a\u00020\"H\u0004¢\u0006\u0004\bW\u0010<J\u0019\u0010X\u001a\u0004\u0018\u00010\u00032\u0006\u00100\u001a\u00020\u000eH\u0001¢\u0006\u0004\bX\u0010QJ\u0017\u0010Y\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\bY\u0010SR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R$\u0010b\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b_\u0010`\"\u0004\ba\u0010$R1\u0010i\u001a\u0002058\u0000@\u0000X\u0081\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0004\b4\u0010c\u0012\u0004\bh\u0010<\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010o\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010\u001f\u0012\u0004\bn\u0010<\u001a\u0004\bk\u0010l\"\u0004\bm\u0010JR(\u0010t\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bp\u0010\u001f\u0012\u0004\bs\u0010<\u001a\u0004\bq\u0010l\"\u0004\br\u0010JR0\u0010|\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u00058\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0004\bv\u0010\u001d\u0012\u0004\b{\u0010<\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0013\u0010\u0081\u0001\u001a\u00020=8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010?R\u001c\u0010\u0004\u001a\u00020\u00038@X\u0081\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010<\u001a\u0005\b\u0082\u0001\u0010-R\u0012\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010x\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0086\u0001"}, d2 = {"Lll0/o;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lml0/a;", "head", "", "remaining", "Lnl0/f;", "pool", "<init>", "(Lml0/a;JLnl0/f;)V", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "", "min", "max", "d1", "(Ljava/lang/Appendable;II)I", "", "p", "(I)Ljava/lang/Void;", "O0", "(II)Ljava/lang/Void;", "copied", "T0", "k1", "n", "skipped", "J", "(JJ)J", "I", "(II)I", "current", "Ljn0/h0;", "t0", "(Lml0/a;)V", "size", "overrun", "u0", "(Lml0/a;II)V", "empty", "e0", "(Lml0/a;Lml0/a;)Lml0/a;", "b0", "()Lml0/a;", "chunk", "o", "minSize", "c1", "(ILml0/a;)Lml0/a;", "P0", "c", "Ljl0/c;", "destination", "offset", "length", "r0", "(Ljava/nio/ByteBuffer;II)I", "B", "()V", "", "t", "()Z", "release", "close", "B1", "w1", "chain", "H1", "(Lml0/a;)Z", "C", "(I)I", "T", "(I)V", "H", "(J)J", "", "e1", "(II)Ljava/lang/String;", "Y0", "(I)Lml0/a;", "k0", "(Lml0/a;)Lml0/a;", "c0", "s0", "n0", "K0", "U0", "r1", "a", "Lnl0/f;", "H0", "()Lnl0/f;", "newHead", "b", "Lml0/a;", "v1", "_head", "Ljava/nio/ByteBuffer;", "D0", "()Ljava/nio/ByteBuffer;", "setHeadMemory-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "getHeadMemory-SK3TCg8$annotations", "headMemory", DateTokenConverter.CONVERTER_KEY, "G0", "()I", "s1", "getHeadPosition$annotations", "headPosition", "e", "z0", "setHeadEndExclusive", "getHeadEndExclusive$annotations", "headEndExclusive", "newValue", "f", "getTailRemaining", "()J", "u1", "(J)V", "getTailRemaining$annotations", "tailRemaining", "g", "Z", "noMoreChunksAvailable", "w0", "endOfInput", "y0", "getHead$annotations", "J0", "h", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class o implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl0.f<ml0.a> pool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ml0.a _head;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer headMemory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int headPosition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int headEndExclusive;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long tailRemaining;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean noMoreChunksAvailable;

    public o() {
        this(null, 0L, null, 7, null);
    }

    private final int I(int n11, int skipped) {
        while (n11 != 0) {
            ml0.a aVarU0 = U0(1);
            if (aVarU0 == null) {
                break;
            }
            int iMin = Math.min(aVarU0.getWritePosition() - aVarU0.getReadPosition(), n11);
            aVarU0.c(iMin);
            this.headPosition += iMin;
            c(aVarU0);
            n11 -= iMin;
            skipped += iMin;
        }
        return skipped;
    }

    private final long J(long n11, long skipped) {
        ml0.a aVarU0;
        while (n11 != 0 && (aVarU0 = U0(1)) != null) {
            int iMin = (int) Math.min(aVarU0.getWritePosition() - aVarU0.getReadPosition(), n11);
            aVarU0.c(iMin);
            this.headPosition += iMin;
            c(aVarU0);
            long j11 = iMin;
            n11 -= j11;
            skipped += j11;
        }
        return skipped;
    }

    private final Void O0(int min, int max) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + min + ", max = " + max);
    }

    private final Void P0(int minSize) {
        throw new IllegalStateException("minSize of " + minSize + " is too big (should be less than 8)");
    }

    private final Void T0(int min, int copied) throws MalformedUTF8InputException {
        throw new MalformedUTF8InputException("Premature end of stream: expected at least " + min + " chars but had only " + copied);
    }

    private final ml0.a b0() {
        if (this.noMoreChunksAvailable) {
            return null;
        }
        ml0.a aVarN0 = n0();
        if (aVarN0 == null) {
            this.noMoreChunksAvailable = true;
            return null;
        }
        o(aVarN0);
        return aVarN0;
    }

    private final void c(ml0.a head) {
        if (head.getWritePosition() - head.getReadPosition() == 0) {
            r1(head);
        }
    }

    private final ml0.a c1(int minSize, ml0.a head) {
        while (true) {
            int headEndExclusive = getHeadEndExclusive() - getHeadPosition();
            if (headEndExclusive >= minSize) {
                return head;
            }
            ml0.a aVarB = head.B();
            if (aVarB == null && (aVarB = b0()) == null) {
                return null;
            }
            if (headEndExclusive == 0) {
                if (head != ml0.a.INSTANCE.a()) {
                    r1(head);
                }
                head = aVarB;
            } else {
                int iA = b.a(head, aVarB, minSize - headEndExclusive);
                this.headEndExclusive = head.getWritePosition();
                u1(this.tailRemaining - ((long) iA));
                if (aVarB.getWritePosition() > aVarB.getReadPosition()) {
                    aVarB.q(iA);
                } else {
                    head.G(null);
                    head.G(aVarB.z());
                    aVarB.E(this.pool);
                }
                if (head.getWritePosition() - head.getReadPosition() >= minSize) {
                    return head;
                }
                if (minSize > 8) {
                    P0(minSize);
                    throw new KotlinNothingValueException();
                }
            }
        }
    }

    private final int d1(Appendable out, int min, int max) throws Throwable {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (max == 0 && min == 0) {
            return 0;
        }
        if (w0()) {
            if (min == 0) {
                return 0;
            }
            p(min);
            throw new KotlinNothingValueException();
        }
        if (max < min) {
            O0(min, max);
            throw new KotlinNothingValueException();
        }
        ml0.a aVarB = ml0.f.b(this, 1);
        if (aVarB == null) {
            i11 = 0;
        } else {
            i11 = 0;
            boolean z15 = false;
            do {
                try {
                    ByteBuffer memory = aVarB.getMemory();
                    int readPosition = aVarB.getReadPosition();
                    int writePosition = aVarB.getWritePosition();
                    int i12 = readPosition;
                    while (true) {
                        if (i12 >= writePosition) {
                            aVarB.c(writePosition - readPosition);
                            z11 = true;
                            break;
                        }
                        byte b11 = memory.get(i12);
                        int i13 = b11 & 255;
                        if ((b11 & 128) != 128) {
                            char c11 = (char) i13;
                            if (i11 == max) {
                                z13 = false;
                            } else {
                                out.append(c11);
                                i11++;
                                z13 = true;
                            }
                            if (z13) {
                                i12++;
                            }
                        }
                        aVarB.c(i12 - readPosition);
                        z11 = false;
                        break;
                    }
                    if (z11) {
                        z12 = true;
                    } else if (i11 == max) {
                        z12 = false;
                    } else {
                        z12 = false;
                        z15 = true;
                    }
                    if (!z12) {
                        ml0.f.a(this, aVarB);
                        break;
                    }
                    try {
                        aVarB = ml0.f.c(this, aVarB);
                    } catch (Throwable th2) {
                        th = th2;
                        if (z14) {
                            ml0.f.a(this, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z14 = true;
                }
            } while (aVarB != null);
            z14 = z15;
        }
        if (z14) {
            return i11 + k1(out, min - i11, max - i11);
        }
        if (i11 >= min) {
            return i11;
        }
        T0(min, i11);
        throw new KotlinNothingValueException();
    }

    private final ml0.a e0(ml0.a current, ml0.a empty) {
        while (current != empty) {
            ml0.a aVarZ = current.z();
            current.E(this.pool);
            if (aVarZ == null) {
                v1(empty);
                u1(0L);
                current = empty;
            } else {
                if (aVarZ.getWritePosition() > aVarZ.getReadPosition()) {
                    v1(aVarZ);
                    u1(this.tailRemaining - ((long) (aVarZ.getWritePosition() - aVarZ.getReadPosition())));
                    return aVarZ;
                }
                current = aVarZ;
            }
        }
        return b0();
    }

    public static /* synthetic */ String h1(o oVar, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return oVar.e1(i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0166  */
    private final int k1(Appendable out, int min, int max) throws Throwable {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ml0.a aVarC;
        int i17;
        int i18 = 1;
        ml0.a aVarB = ml0.f.b(this, 1);
        if (aVarB == null) {
            i17 = 0;
        } else {
            int i19 = 1;
            int i21 = 0;
            do {
                try {
                    int writePosition = aVarB.getWritePosition() - aVarB.getReadPosition();
                    if (writePosition >= i19) {
                        try {
                            ByteBuffer memory = aVarB.getMemory();
                            int readPosition = aVarB.getReadPosition();
                            int writePosition2 = aVarB.getWritePosition();
                            int i22 = readPosition;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i22 >= writePosition2) {
                                    i11 = i18;
                                    aVarB.c(writePosition2 - readPosition);
                                    i12 = 0;
                                    break;
                                }
                                byte b11 = memory.get(i22);
                                i11 = i18;
                                int i26 = b11 & 255;
                                i12 = -1;
                                if ((b11 & 128) == 0) {
                                    if (i23 != 0) {
                                        ml0.e.i(i23);
                                        throw new KotlinNothingValueException();
                                    }
                                    char c11 = (char) i26;
                                    if (i21 == max) {
                                        i16 = 0;
                                    } else {
                                        out.append(c11);
                                        i21++;
                                        i16 = i11;
                                    }
                                    if (i16 == 0) {
                                        try {
                                            aVarB.c(i22 - readPosition);
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            aVarB.getWritePosition();
                                            aVarB.getReadPosition();
                                            throw th;
                                        }
                                    }
                                    i22++;
                                    i18 = i11;
                                } else if (i23 == 0) {
                                    int i27 = 128;
                                    i24 = i26;
                                    for (int i28 = i11; i28 < 7 && (i24 & i27) != 0; i28++) {
                                        i24 &= ~i27;
                                        i27 >>= 1;
                                        i23++;
                                    }
                                    int i29 = i23 - 1;
                                    if (i23 > writePosition2 - i22) {
                                        aVarB.c(i22 - readPosition);
                                        i12 = i23;
                                        break;
                                    }
                                    i25 = i23;
                                    i23 = i29;
                                    i22++;
                                    i18 = i11;
                                } else {
                                    i24 = (i24 << 6) | (b11 & 127);
                                    i23--;
                                    if (i23 != 0) {
                                        continue;
                                    } else {
                                        if (!ml0.e.f(i24)) {
                                            if (!ml0.e.g(i24)) {
                                                ml0.e.j(i24);
                                                throw new KotlinNothingValueException();
                                            }
                                            char cE = (char) ml0.e.e(i24);
                                            if (i21 == max) {
                                                i13 = 0;
                                            } else {
                                                out.append(cE);
                                                i21++;
                                                i13 = i11;
                                            }
                                            if (i13 != 0) {
                                                char cH = (char) ml0.e.h(i24);
                                                if (i21 == max) {
                                                    i14 = 0;
                                                } else {
                                                    out.append(cH);
                                                    i21++;
                                                    i14 = i11;
                                                }
                                                if (i14 == 0) {
                                                }
                                                i24 = 0;
                                            }
                                            aVarB.c(((i22 - readPosition) - i25) + 1);
                                            break;
                                        }
                                        char c12 = (char) i24;
                                        if (i21 == max) {
                                            i15 = 0;
                                        } else {
                                            out.append(c12);
                                            i21++;
                                            i15 = i11;
                                        }
                                        if (i15 == 0) {
                                            aVarB.c(((i22 - readPosition) - i25) + 1);
                                            break;
                                        }
                                        i24 = 0;
                                    }
                                    i22++;
                                    i18 = i11;
                                }
                            }
                            i19 = i12 == 0 ? i11 : i12 > 0 ? i12 : 0;
                            try {
                                writePosition = aVarB.getWritePosition() - aVarB.getReadPosition();
                            } catch (Throwable th3) {
                                th = th3;
                                i18 = i11;
                                if (i18 != 0) {
                                    ml0.f.a(this, aVarB);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i11 = i18;
                        }
                    } else {
                        i11 = i18;
                    }
                    if (writePosition == 0) {
                        try {
                            aVarC = ml0.f.c(this, aVarB);
                        } catch (Throwable th5) {
                            th = th5;
                            i18 = 0;
                            if (i18 != 0) {
                                ml0.f.a(this, aVarB);
                            }
                            throw th;
                        }
                    } else if (writePosition < i19 || aVarB.getCapacity() - aVarB.getLimit() < 8) {
                        ml0.f.a(this, aVarB);
                        aVarC = ml0.f.b(this, i19);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        i18 = 0;
                        break;
                    }
                    aVarB = aVarC;
                    i18 = i11;
                } catch (Throwable th6) {
                    th = th6;
                }
            } while (i19 > 0);
            if (i18 != 0) {
                ml0.f.a(this, aVarB);
            }
            i17 = i21;
        }
        if (i17 >= min) {
            return i17;
        }
        T0(min, i17);
        throw new KotlinNothingValueException();
    }

    private final void o(ml0.a chunk) {
        ml0.a aVarC = h.c(this._head);
        if (aVarC != ml0.a.INSTANCE.a()) {
            aVarC.G(chunk);
            u1(this.tailRemaining + h.e(chunk));
            return;
        }
        v1(chunk);
        if (this.tailRemaining != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        ml0.a aVarB = chunk.B();
        u1(aVarB != null ? h.e(aVarB) : 0L);
    }

    private final Void p(int min) throws EOFException {
        throw new EOFException("at least " + min + " characters required but no bytes available");
    }

    private final void t0(ml0.a current) {
        if (this.noMoreChunksAvailable && current.B() == null) {
            this.headPosition = current.getReadPosition();
            this.headEndExclusive = current.getWritePosition();
            u1(0L);
            return;
        }
        int writePosition = current.getWritePosition() - current.getReadPosition();
        int iMin = Math.min(writePosition, 8 - (current.getCapacity() - current.getLimit()));
        if (writePosition > iMin) {
            u0(current, writePosition, iMin);
        } else {
            ml0.a aVarS2 = this.pool.S2();
            aVarS2.p(8);
            aVarS2.G(current.z());
            b.a(aVarS2, current, writePosition);
            v1(aVarS2);
        }
        current.E(this.pool);
    }

    private final void u0(ml0.a current, int size, int overrun) {
        ml0.a aVarS2 = this.pool.S2();
        ml0.a aVarS3 = this.pool.S2();
        aVarS2.p(8);
        aVarS3.p(8);
        aVarS2.G(aVarS3);
        aVarS3.G(current.z());
        b.a(aVarS2, current, size - overrun);
        b.a(aVarS3, current, overrun);
        v1(aVarS2);
        u1(h.e(aVarS3));
    }

    private final void v1(ml0.a aVar) {
        this._head = aVar;
        this.headMemory = aVar.getMemory();
        this.headPosition = aVar.getReadPosition();
        this.headEndExclusive = aVar.getWritePosition();
    }

    protected abstract void B();

    public final ml0.a B1() {
        ml0.a aVarY0 = y0();
        ml0.a aVarA = ml0.a.INSTANCE.a();
        if (aVarY0 == aVarA) {
            return null;
        }
        v1(aVarA);
        u1(0L);
        return aVarY0;
    }

    public final int C(int n11) {
        if (n11 >= 0) {
            return I(n11, 0);
        }
        throw new IllegalArgumentException(("Negative discard is not allowed: " + n11).toString());
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final ByteBuffer getHeadMemory() {
        return this.headMemory;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final int getHeadPosition() {
        return this.headPosition;
    }

    public final long H(long n11) {
        if (n11 <= 0) {
            return 0L;
        }
        return J(n11, 0L);
    }

    public final nl0.f<ml0.a> H0() {
        return this.pool;
    }

    public final boolean H1(ml0.a chain) {
        p013kotlin.jvm.internal.s.k(chain, "chain");
        ml0.a aVarC = h.c(y0());
        int writePosition = chain.getWritePosition() - chain.getReadPosition();
        if (writePosition == 0 || aVarC.getLimit() - aVarC.getWritePosition() < writePosition) {
            return false;
        }
        b.a(aVarC, chain, writePosition);
        if (y0() == aVarC) {
            this.headEndExclusive = aVarC.getWritePosition();
            return true;
        }
        u1(this.tailRemaining + ((long) writePosition));
        return true;
    }

    public final long J0() {
        return ((long) (getHeadEndExclusive() - getHeadPosition())) + this.tailRemaining;
    }

    protected final void K0() {
        if (this.noMoreChunksAvailable) {
            return;
        }
        this.noMoreChunksAvailable = true;
    }

    public final void T(int n11) throws EOFException {
        if (C(n11) == n11) {
            return;
        }
        throw new EOFException("Unable to discard " + n11 + " bytes due to end of packet");
    }

    public final ml0.a U0(int minSize) {
        ml0.a aVarY0 = y0();
        return this.headEndExclusive - this.headPosition >= minSize ? aVarY0 : c1(minSize, aVarY0);
    }

    public final ml0.a Y0(int minSize) {
        return c1(minSize, y0());
    }

    public final ml0.a c0(ml0.a current) {
        p013kotlin.jvm.internal.s.k(current, "current");
        return e0(current, ml0.a.INSTANCE.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
        if (!this.noMoreChunksAvailable) {
            this.noMoreChunksAvailable = true;
        }
        B();
    }

    public final String e1(int min, int max) throws Throwable {
        if (min == 0 && (max == 0 || w0())) {
            return "";
        }
        long jJ0 = J0();
        if (jJ0 > 0 && max >= jJ0) {
            return w.g(this, (int) jJ0, null, 2, null);
        }
        StringBuilder sb2 = new StringBuilder(bo0.n.j(bo0.n.f(min, 16), max));
        d1(sb2, min, max);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final ml0.a k0(ml0.a current) {
        p013kotlin.jvm.internal.s.k(current, "current");
        return c0(current);
    }

    public final void n(ml0.a chain) {
        p013kotlin.jvm.internal.s.k(chain, "chain");
        ml0.a.Companion companion = ml0.a.INSTANCE;
        if (chain == companion.a()) {
            return;
        }
        long jE = h.e(chain);
        if (this._head == companion.a()) {
            v1(chain);
            u1(jE - ((long) (getHeadEndExclusive() - getHeadPosition())));
        } else {
            h.c(this._head).G(chain);
            u1(this.tailRemaining + jE);
        }
    }

    protected ml0.a n0() {
        ml0.a aVarS2 = this.pool.S2();
        try {
            aVarS2.p(8);
            int iR0 = r0(aVarS2.getMemory(), aVarS2.getWritePosition(), aVarS2.getLimit() - aVarS2.getWritePosition());
            if (iR0 == 0) {
                this.noMoreChunksAvailable = true;
                if (aVarS2.getWritePosition() <= aVarS2.getReadPosition()) {
                    aVarS2.E(this.pool);
                    return null;
                }
            }
            aVarS2.a(iR0);
            return aVarS2;
        } catch (Throwable th2) {
            aVarS2.E(this.pool);
            throw th2;
        }
    }

    protected abstract int r0(ByteBuffer destination, int offset, int length);

    public final ml0.a r1(ml0.a head) {
        p013kotlin.jvm.internal.s.k(head, "head");
        ml0.a aVarZ = head.z();
        if (aVarZ == null) {
            aVarZ = ml0.a.INSTANCE.a();
        }
        v1(aVarZ);
        u1(this.tailRemaining - ((long) (aVarZ.getWritePosition() - aVarZ.getReadPosition())));
        head.E(this.pool);
        return aVarZ;
    }

    public final void release() {
        ml0.a aVarY0 = y0();
        ml0.a aVarA = ml0.a.INSTANCE.a();
        if (aVarY0 != aVarA) {
            v1(aVarA);
            u1(0L);
            h.d(aVarY0, this.pool);
        }
    }

    public final void s0(ml0.a current) {
        p013kotlin.jvm.internal.s.k(current, "current");
        ml0.a aVarB = current.B();
        if (aVarB == null) {
            t0(current);
            return;
        }
        int writePosition = current.getWritePosition() - current.getReadPosition();
        int iMin = Math.min(writePosition, 8 - (current.getCapacity() - current.getLimit()));
        if (aVarB.getStartGap() < iMin) {
            t0(current);
            return;
        }
        d.f(aVarB, iMin);
        if (writePosition > iMin) {
            current.m();
            this.headEndExclusive = current.getWritePosition();
            u1(this.tailRemaining + ((long) iMin));
        } else {
            v1(aVarB);
            u1(this.tailRemaining - ((long) ((aVarB.getWritePosition() - aVarB.getReadPosition()) - iMin)));
            current.z();
            current.E(this.pool);
        }
    }

    public final void s1(int i11) {
        this.headPosition = i11;
    }

    public final boolean t() {
        return (this.headPosition == this.headEndExclusive && this.tailRemaining == 0) ? false : true;
    }

    public final void u1(long j11) {
        if (j11 >= 0) {
            this.tailRemaining = j11;
            return;
        }
        throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j11).toString());
    }

    public final boolean w0() {
        if (getHeadEndExclusive() - getHeadPosition() == 0 && this.tailRemaining == 0) {
            return this.noMoreChunksAvailable || b0() == null;
        }
        return false;
    }

    public final ml0.a w1() {
        ml0.a aVarY0 = y0();
        ml0.a aVarB = aVarY0.B();
        ml0.a aVarA = ml0.a.INSTANCE.a();
        if (aVarY0 == aVarA) {
            return null;
        }
        if (aVarB == null) {
            v1(aVarA);
            u1(0L);
        } else {
            v1(aVarB);
            u1(this.tailRemaining - ((long) (aVarB.getWritePosition() - aVarB.getReadPosition())));
        }
        aVarY0.G(null);
        return aVarY0;
    }

    public final ml0.a y0() {
        ml0.a aVar = this._head;
        aVar.d(this.headPosition);
        return aVar;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final int getHeadEndExclusive() {
        return this.headEndExclusive;
    }

    public o(ml0.a head, long j11, nl0.f<ml0.a> pool) {
        p013kotlin.jvm.internal.s.k(head, "head");
        p013kotlin.jvm.internal.s.k(pool, "pool");
        this.pool = pool;
        this._head = head;
        this.headMemory = head.getMemory();
        this.headPosition = head.getReadPosition();
        int writePosition = head.getWritePosition();
        this.headEndExclusive = writePosition;
        this.tailRemaining = j11 - ((long) (writePosition - this.headPosition));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o(ml0.a aVar, long j11, nl0.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        aVar = (i11 & 1) != 0 ? ml0.a.INSTANCE.a() : aVar;
        this(aVar, (i11 & 2) != 0 ? h.e(aVar) : j11, (i11 & 4) != 0 ? ml0.a.INSTANCE.c() : fVar);
    }
}
