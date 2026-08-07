package ip0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import okio.g0;
import okio.m0;
import okio.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0019*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010!\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006%"}, d2 = {"Lokio/m0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "e", "(Lokio/m0;I[BII)Z", "Lokio/h;", "", "newline", "", "f", "(Lokio/h;J)Ljava/lang/String;", "Lokio/g0;", "options", "selectTruncated", "g", "(Lokio/h;Lokio/g0;Z)I", "v", "c", "(J)I", "Lokio/h$a;", "unsafeCursor", "b", "(Lokio/h;Lokio/h$a;)Lokio/h$a;", "a", "[B", DateTokenConverter.CONVERTER_KEY, "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f81701a = v0.a("0123456789abcdef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long[] f81702b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final okio.h.a b(okio.h hVar, okio.h.a unsafeCursor) {
        s.k(hVar, "<this>");
        s.k(unsafeCursor, "unsafeCursor");
        okio.h.a aVarG = okio.e.g(unsafeCursor);
        if (aVarG.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.buffer = hVar;
        aVarG.readWrite = true;
        return aVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(long j11) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j11)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j11 > f81702b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] d() {
        return f81701a;
    }

    public static final boolean e(m0 segment, int i11, byte[] bytes, int i12, int i13) {
        s.k(segment, "segment");
        s.k(bytes, "bytes");
        int i14 = segment.limit;
        byte[] bArr = segment.data;
        while (i12 < i13) {
            if (i11 == i14) {
                segment = segment.next;
                s.h(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i11 = segment.pos;
                i14 = segment.limit;
            }
            if (bArr[i11] != bytes[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final String f(okio.h hVar, long j11) throws EOFException {
        s.k(hVar, "<this>");
        if (j11 > 0) {
            long j12 = j11 - 1;
            if (hVar.H(j12) == 13) {
                String strM0 = hVar.M0(j12);
                hVar.skip(2L);
                return strM0;
            }
        }
        String strM1 = hVar.M0(j11);
        hVar.skip(1L);
        return strM1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int g(okio.h hVar, g0 options, boolean z11) {
        int i11;
        int i12;
        m0 m0Var;
        int i13;
        int i14;
        s.k(hVar, "<this>");
        s.k(options, "options");
        m0 m0Var2 = hVar.head;
        if (m0Var2 == null) {
            return z11 ? -2 : -1;
        }
        byte[] bArr = m0Var2.data;
        int i15 = m0Var2.pos;
        int i16 = m0Var2.limit;
        int[] iArrK = options.getTrie();
        m0 m0Var3 = m0Var2;
        int i17 = -1;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i18 + 1;
            int i21 = iArrK[i18];
            int i22 = i18 + 2;
            int i23 = iArrK[i19];
            if (i23 != -1) {
                i17 = i23;
            }
            if (m0Var3 == null) {
                break;
            }
            if (i21 >= 0) {
                i11 = i15 + 1;
                int i24 = bArr[i15] & 255;
                int i25 = i22 + i21;
                while (i22 != i25) {
                    if (i24 == iArrK[i22]) {
                        i12 = iArrK[i22 + i21];
                        if (i11 == i16) {
                            m0Var3 = m0Var3.next;
                            s.h(m0Var3);
                            i11 = m0Var3.pos;
                            bArr = m0Var3.data;
                            i16 = m0Var3.limit;
                            if (m0Var3 == m0Var2) {
                                m0Var3 = null;
                            }
                        }
                        if (i12 >= 0) {
                            return i12;
                        }
                        i18 = -i12;
                        i15 = i11;
                    } else {
                        i22++;
                    }
                }
                return i17;
            }
            int i26 = i22 + (i21 * (-1));
            while (true) {
                int i27 = i15 + 1;
                int i28 = i22 + 1;
                if ((bArr[i15] & 255) == iArrK[i22]) {
                    boolean z12 = i28 == i26;
                    if (i27 == i16) {
                        s.h(m0Var3);
                        m0 m0Var4 = m0Var3.next;
                        s.h(m0Var4);
                        i14 = m0Var4.pos;
                        byte[] bArr2 = m0Var4.data;
                        i13 = m0Var4.limit;
                        if (m0Var4 != m0Var2) {
                            m0Var = m0Var4;
                            bArr = bArr2;
                        } else {
                            if (!z12) {
                                break loop0;
                            }
                            bArr = bArr2;
                            m0Var = null;
                        }
                    } else {
                        m0Var = m0Var3;
                        i13 = i16;
                        i14 = i27;
                    }
                    if (z12) {
                        i12 = iArrK[i28];
                        i11 = i14;
                        i16 = i13;
                        m0Var3 = m0Var;
                        break;
                    }
                    i15 = i14;
                    i16 = i13;
                    m0Var3 = m0Var;
                    i22 = i28;
                }
                return i17;
            }
            if (i12 >= 0) {
                return i12;
            }
            i18 = -i12;
            i15 = i11;
        }
        if (z11) {
            return -2;
        }
        return i17;
    }

    public static /* synthetic */ int h(okio.h hVar, g0 g0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return g(hVar, g0Var, z11);
    }
}
