package org.bouncycastle.pqc.legacy.math.linearalgebra;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes10.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, FileAppender.DEFAULT_BUFFER_SIZE, Http2Stream.EMIT_BUFFER_SIZE, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, FileSize.GB_COEFFICIENT, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, LockFreeTaskQueueCore.FROZEN_MASK, LockFreeTaskQueueCore.CLOSED_MASK, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, WebSocketProtocol.PAYLOAD_SHORT_MAX, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, LockFreeTaskQueueCore.HEAD_MASK, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i11 = 0;
        while (true) {
            int i12 = oNBLength - 1;
            if (i11 >= i12) {
                jArr[i12] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i11] = -1;
            i11++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i11 = 0;
        while (true) {
            int i12 = this.mDegree;
            if (i11 >= i12) {
                return jArr;
            }
            if (testBit((i12 - i11) - 1)) {
                int i13 = i11 >>> 6;
                jArr[i13] = jArr[i13] | mBitmask[i11 & 63];
            }
            i11++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i11 = 0; i11 < this.mLength; i11++) {
            long[] jArr = this.mPol;
            jArr[i11] = jArr[i11] ^ gF2nONBElement.mPol[i11];
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    void assignOne() {
        int i11 = 0;
        while (true) {
            int i12 = this.mLength;
            if (i11 >= i12 - 1) {
                this.mPol[i12 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                this.mPol[i11] = -1;
                i11++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i11 = 0; i11 < this.mLength; i11++) {
            if (this.mPol[i11] != gF2nONBElement.mPol[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.mPol);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement invert() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i11 = 31;
        boolean z11 = false;
        while (!z11 && i11 >= 0) {
            if ((((long) (this.mDegree - 1)) & mBitmask[i11]) != 0) {
                z11 = true;
            }
            i11--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i12 = 1;
        while (i11 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i13 = 1; i13 <= i12; i13++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i12 <<= 1;
            if ((((long) (this.mDegree - 1)) & mBitmask[i11]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i12++;
            }
            i11--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isOne() {
        int i11;
        boolean z11 = true;
        int i12 = 0;
        while (true) {
            i11 = this.mLength;
            if (i12 >= i11 - 1 || !z11) {
                break;
            }
            z11 = z11 && this.mPol[i12] == -1;
            i12++;
        }
        if (!z11) {
            return z11;
        }
        if (z11) {
            long j11 = this.mPol[i11 - 1];
            long[] jArr = mMaxmask;
            int i13 = this.mBit;
            if ((j11 & jArr[i13 - 1]) == jArr[i13 - 1]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z11 = true;
        for (int i11 = 0; i11 < this.mLength && z11; i11++) {
            z11 = z11 && this.mPol[i11] == 0;
        }
        return z11;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) {
        char c11;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i11 = this.mLength;
        long[] jArr3 = new long[i11];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i12 = i11 - 1;
        char c12 = 1;
        int i13 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j11 = jArr4[63];
        long j12 = jArr4[i13];
        int i14 = 0;
        while (i14 < this.mDegree) {
            int i15 = 0;
            boolean z11 = false;
            while (i15 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i16 = iArr2[i15];
                int[] iArr3 = iArr[i15];
                int i17 = iArr3[0];
                int i18 = iArr2[i17];
                int i19 = i17 & 63;
                long j13 = jArr[i16];
                long[] jArr5 = mBitmask;
                if ((j13 & jArr5[i15 & 63]) != 0) {
                    if ((jArr2[i18] & jArr5[i19]) != 0) {
                        z11 = !z11;
                    }
                    int i21 = iArr3[c12];
                    if (i21 != -1 && (jArr2[iArr2[i21]] & jArr5[i21 & 63]) != 0) {
                        z11 = !z11;
                    }
                }
                i15++;
                c12 = 1;
            }
            int i22 = mIBY64[i14];
            int i23 = i14 & 63;
            if (z11) {
                jArr3[i22] = jArr3[i22] ^ mBitmask[i23];
            }
            if (this.mLength > 1) {
                boolean z12 = (jArr[i12] & 1) == 1;
                int i24 = i11 - 2;
                int i25 = i24;
                while (i25 >= 0) {
                    long j14 = jArr[i25];
                    boolean z13 = (j14 & 1) != 0;
                    long j15 = j14 >>> 1;
                    jArr[i25] = j15;
                    if (z12) {
                        jArr[i25] = j15 ^ j11;
                    }
                    i25--;
                    z12 = z13;
                }
                long j16 = jArr[i12] >>> 1;
                jArr[i12] = j16;
                if (z12) {
                    jArr[i12] = j16 ^ j12;
                }
                boolean z14 = (jArr2[i12] & 1) == 1;
                while (i24 >= 0) {
                    long j17 = jArr2[i24];
                    boolean z15 = (j17 & 1) != 0;
                    long j18 = j17 >>> 1;
                    jArr2[i24] = j18;
                    if (z14) {
                        jArr2[i24] = j18 ^ j11;
                    }
                    i24--;
                    z14 = z15;
                }
                long j19 = jArr2[i12] >>> 1;
                jArr2[i12] = j19;
                if (z14) {
                    jArr2[i12] = j19 ^ j12;
                }
                c11 = 1;
            } else {
                long j21 = jArr[0];
                boolean z16 = (j21 & 1) == 1;
                long j22 = j21 >>> 1;
                jArr[0] = j22;
                if (z16) {
                    jArr[0] = j22 ^ j12;
                }
                long j23 = jArr2[0];
                boolean z17 = (j23 & 1) == 1;
                c11 = 1;
                long j24 = j23 >>> 1;
                jArr2[0] = j24;
                if (z17) {
                    jArr2[0] = j24 ^ j12;
                }
            }
            i14++;
            c12 = c11;
        }
        assign(jArr3);
    }

    void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() {
        int i11;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long j11 = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i12 = 0;
        long j12 = 0;
        while (true) {
            i11 = this.mLength;
            if (i12 >= i11 - 1) {
                break;
            }
            for (int i13 = 1; i13 < 64; i13++) {
                long[] jArr2 = mBitmask;
                long j13 = jArr2[i13];
                long j14 = this.mPol[i12];
                if (((j13 & j14) == 0 || (j12 & jArr2[i13 - 1]) == 0) && ((j14 & j13) != 0 || (jArr2[i13 - 1] & j12) != 0)) {
                    j12 ^= j13;
                }
            }
            jArr[i12] = j12;
            long j15 = j12 & j11;
            j12 = ((j15 == 0 || (1 & this.mPol[i12 + 1]) != 1) && !(j15 == 0 && (this.mPol[i12 + 1] & 1) == 0)) ? 1L : 0L;
            i12++;
        }
        int i14 = 63 & this.mDegree;
        long j16 = this.mPol[i11 - 1];
        for (int i15 = 1; i15 < i14; i15++) {
            long[] jArr3 = mBitmask;
            long j17 = jArr3[i15];
            if (((j17 & j16) == 0 || (jArr3[i15 - 1] & j12) == 0) && ((j17 & j16) != 0 || (jArr3[i15 - 1] & j12) != 0)) {
                j12 ^= j17;
            }
        }
        jArr[this.mLength - 1] = j12;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i11 = this.mLength - 1;
        int i12 = this.mBit - 1;
        long j11 = mBitmask[63];
        boolean z11 = (element[0] & 1) != 0;
        int i13 = i11;
        while (i13 >= 0) {
            long j12 = element[i13];
            boolean z12 = (j12 & 1) != 0;
            long j13 = j12 >>> 1;
            element[i13] = j13;
            if (z11) {
                if (i13 == i11) {
                    element[i13] = j13 ^ mBitmask[i12];
                } else {
                    element[i13] = j13 ^ j11;
                }
            }
            i13--;
            z11 = z12;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i11 = this.mLength - 1;
        int i12 = this.mBit;
        int i13 = i12 - 1;
        long[] jArr = mBitmask;
        long j11 = jArr[63];
        boolean z11 = (element[i11] & jArr[i13]) != 0;
        int i14 = 0;
        while (i14 < i11) {
            long j12 = element[i14];
            boolean z12 = (j12 & j11) != 0;
            long j13 = j12 << 1;
            element[i14] = j13;
            if (z11) {
                element[i14] = 1 ^ j13;
            }
            i14++;
            z11 = z12;
        }
        long j14 = element[i11];
        long[] jArr2 = mBitmask;
        boolean z13 = (jArr2[i13] & j14) != 0;
        long j15 = j14 << 1;
        element[i11] = j15;
        if (z11) {
            element[i11] = j15 ^ 1;
        }
        if (z13) {
            element[i11] = jArr2[i12] ^ element[i11];
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    boolean testBit(int i11) {
        return i11 >= 0 && i11 <= this.mDegree && (this.mPol[i11 >>> 6] & mBitmask[i11 & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i11 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (i12 & 7) << 3;
            bArr[(i11 - i12) - 1] = (byte) ((this.mPol[i12 >>> 3] & (255 << i13)) >>> i13);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public int trace() {
        int i11 = this.mLength - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((this.mPol[i13] & mBitmask[i14]) != 0) {
                    i12 ^= 1;
                }
            }
        }
        int i15 = this.mBit;
        for (int i16 = 0; i16 < i15; i16++) {
            if ((this.mPol[i11] & mBitmask[i16]) != 0) {
                i12 ^= 1;
            }
        }
        return i12;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            long[] jArr = this.mPol;
            int i12 = i11 >>> 3;
            jArr[i12] = jArr[i12] | ((((long) bArr[(bArr.length - 1) - i11]) & 255) << ((i11 & 7) << 3));
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString(int i11) {
        StringBuilder sb2;
        long[] element = getElement();
        int i12 = this.mBit;
        String string = "";
        if (i11 == 2) {
            while (true) {
                i12--;
                if (i12 < 0) {
                    break;
                }
                string = (element[element.length - 1] & (1 << i12)) == 0 ? string + WebrtcBuildVersion.maint_version : string + "1";
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i13 = 63; i13 >= 0; i13--) {
                    if ((element[length] & mBitmask[i13]) == 0) {
                        sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append(WebrtcBuildVersion.maint_version);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append("1");
                    }
                    string = sb2.toString();
                }
            }
            return string;
        }
        if (i11 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                string = ((((((((((((((((string + cArr[((int) (element[length2] >>> 60)) & 15]) + cArr[((int) (element[length2] >>> 56)) & 15]) + cArr[((int) (element[length2] >>> 52)) & 15]) + cArr[((int) (element[length2] >>> 48)) & 15]) + cArr[((int) (element[length2] >>> 44)) & 15]) + cArr[((int) (element[length2] >>> 40)) & 15]) + cArr[((int) (element[length2] >>> 36)) & 15]) + cArr[((int) (element[length2] >>> 32)) & 15]) + cArr[((int) (element[length2] >>> 28)) & 15]) + cArr[((int) (element[length2] >>> 24)) & 15]) + cArr[((int) (element[length2] >>> 20)) & 15]) + cArr[((int) (element[length2] >>> 16)) & 15]) + cArr[((int) (element[length2] >>> 12)) & 15]) + cArr[((int) (element[length2] >>> 8)) & 15]) + cArr[((int) (element[length2] >>> 4)) & 15]) + cArr[((int) element[length2]) & 15]) + " ";
            }
        }
        return string;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i11 = this.mLength;
        long[] jArr = new long[i11];
        this.mPol = jArr;
        if (i11 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i12 = 0; i12 < this.mLength - 1; i12++) {
                this.mPol[i12] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }
}
