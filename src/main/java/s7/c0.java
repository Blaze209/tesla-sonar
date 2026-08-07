package s7;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f110395d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f110396e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.collect.b0<Charset> f110397f = com.google.common.collect.b0.u(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f110398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f110399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f110400c;

    public c0() {
        this.f110398a = q0.f110459f;
    }

    private static int c(int i11, int i12, int i13, int i14) {
        byte b11 = (byte) i13;
        return ru.f.i((byte) 0, ru.i.a(((i11 & 7) << 2) | ((i12 & 48) >> 4)), ru.i.a(((((byte) i12) & 15) << 4) | ((b11 & 60) >> 2)), ru.i.a(((b11 & 3) << 6) | (((byte) i14) & 63)));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    private int e(Charset charset) {
        int i11;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i11 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i11 = 2;
        }
        int i12 = this.f110399b;
        while (true) {
            int i13 = this.f110400c;
            if (i12 >= i13 - (i11 - 1)) {
                return i13;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !q0.T0(this.f110398a[i12])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.f110398a;
                    if (bArr2[i12] != 0 || !q0.T0(bArr2[i12 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.f110398a;
                            if (bArr[i12 + 1] != 0 || !q0.T0(bArr[i12])) {
                            }
                        }
                        i12 += i11;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.f110398a;
                        if (bArr[i12 + 1] != 0) {
                            continue;
                        }
                    }
                    i12 += i11;
                }
            }
            return i12;
        }
    }

    private void e0(Charset charset) {
        if (r(charset, f110395d) == '\r') {
            r(charset, f110396e);
        }
    }

    private static int h(Charset charset) {
        a.b(f110397f.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean i(byte b11) {
        return (b11 & 192) == 128;
    }

    private char k(ByteOrder byteOrder, int i11) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f110398a;
            int i12 = this.f110399b;
            return ru.b.c(bArr[i12 + i11], bArr[i12 + i11 + 1]);
        }
        byte[] bArr2 = this.f110398a;
        int i13 = this.f110399b;
        return ru.b.c(bArr2[i13 + i11 + 1], bArr2[i13 + i11]);
    }

    private int m(Charset charset) {
        int codePoint;
        int iB;
        a.b(f110397f.contains(charset), "Unsupported charset: " + charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f110399b + ", limit=" + this.f110400c);
        }
        byte b11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b12 = this.f110398a[this.f110399b];
            if ((b12 & 128) != 0) {
                return 0;
            }
            codePoint = ru.i.b(b12);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bO = o();
            if (bO == 1) {
                iB = ru.i.b(this.f110398a[this.f110399b]);
            } else if (bO == 2) {
                byte[] bArr = this.f110398a;
                int i11 = this.f110399b;
                iB = c(0, 0, bArr[i11], bArr[i11 + 1]);
            } else if (bO == 3) {
                byte[] bArr2 = this.f110398a;
                int i12 = this.f110399b;
                iB = c(0, bArr2[i12] & 15, bArr2[i12 + 1], bArr2[i12 + 2]);
            } else {
                if (bO != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f110398a;
                int i13 = this.f110399b;
                iB = c(bArr3[i13], bArr3[i13 + 1], bArr3[i13 + 2], bArr3[i13 + 3]);
            }
            b11 = bO;
            codePoint = iB;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cK = k(byteOrder, 0);
            if (!Character.isHighSurrogate(cK) || a() < 4) {
                codePoint = cK;
                b11 = 2;
            } else {
                codePoint = Character.toCodePoint(cK, k(byteOrder, 2));
                b11 = 4;
            }
        }
        return (codePoint << 8) | b11;
    }

    private byte o() {
        byte b11 = this.f110398a[this.f110399b];
        if ((b11 & 128) == 0) {
            return (byte) 1;
        }
        if ((b11 & 224) == 192 && a() >= 2 && i(this.f110398a[this.f110399b + 1])) {
            return (byte) 2;
        }
        if ((this.f110398a[this.f110399b] & 240) == 224 && a() >= 3 && i(this.f110398a[this.f110399b + 1]) && i(this.f110398a[this.f110399b + 2])) {
            return (byte) 3;
        }
        return ((this.f110398a[this.f110399b] & 248) == 240 && a() >= 4 && i(this.f110398a[this.f110399b + 1]) && i(this.f110398a[this.f110399b + 2]) && i(this.f110398a[this.f110399b + 3])) ? (byte) 4 : (byte) 0;
    }

    private char r(Charset charset, char[] cArr) {
        int iM;
        if (a() < h(charset) || (iM = m(charset)) == 0) {
            return (char) 0;
        }
        int iA = ru.j.a(iM >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cA = ru.b.a(iA);
        if (!ru.b.b(cArr, cA)) {
            return (char) 0;
        }
        this.f110399b += ru.f.e(iM & 255);
        return cA;
    }

    public long A() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.f110399b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.f110399b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        int i15 = i11 + 4;
        this.f110399b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i11 + 5;
        this.f110399b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 32);
        int i17 = i11 + 6;
        this.f110399b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 40);
        int i18 = i11 + 7;
        this.f110399b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 48);
        this.f110399b = i11 + 8;
        return ((((long) bArr[i18]) & 255) << 56) | j17;
    }

    public short B() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = bArr[i11] & 255;
        this.f110399b = i11 + 2;
        return (short) (((bArr[i12] & 255) << 8) | i13);
    }

    public long C() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.f110399b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.f110399b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        this.f110399b = i11 + 4;
        return ((((long) bArr[i14]) & 255) << 24) | j13;
    }

    public int D() {
        int iZ = z();
        if (iZ >= 0) {
            return iZ;
        }
        throw new IllegalStateException("Top bit not zero: " + iZ);
    }

    public int E() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = bArr[i11] & 255;
        this.f110399b = i11 + 2;
        return ((bArr[i12] & 255) << 8) | i13;
    }

    public long F() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        long j11 = (((long) bArr[i11]) & 255) << 56;
        int i13 = i11 + 2;
        this.f110399b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 48);
        int i14 = i11 + 3;
        this.f110399b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i11 + 4;
        this.f110399b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i11 + 5;
        this.f110399b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i11 + 6;
        this.f110399b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i11 + 7;
        this.f110399b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 8);
        this.f110399b = i11 + 8;
        return (((long) bArr[i18]) & 255) | j17;
    }

    public String G() {
        return s((char) 0);
    }

    public String H(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.f110399b;
        int i13 = (i12 + i11) - 1;
        String strL = q0.L(this.f110398a, i12, (i13 >= this.f110400c || this.f110398a[i13] != 0) ? i11 : i11 - 1);
        this.f110399b += i11;
        return strL;
    }

    public short I() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f110399b = i11 + 2;
        return (short) ((bArr[i12] & 255) | i13);
    }

    public String J(int i11) {
        return K(i11, StandardCharsets.UTF_8);
    }

    public String K(int i11, Charset charset) {
        String str = new String(this.f110398a, this.f110399b, i11, charset);
        this.f110399b += i11;
        return str;
    }

    public int L() {
        return (M() << 21) | (M() << 14) | (M() << 7) | M();
    }

    public int M() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        this.f110399b = i11 + 1;
        return bArr[i11] & 255;
    }

    public int N() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f110399b = i11 + 2;
        int i14 = (bArr[i12] & 255) | i13;
        this.f110399b = i11 + 4;
        return i14;
    }

    public long O() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        long j11 = (((long) bArr[i11]) & 255) << 24;
        int i13 = i11 + 2;
        this.f110399b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i11 + 3;
        this.f110399b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 8);
        this.f110399b = i11 + 4;
        return (((long) bArr[i14]) & 255) | j13;
    }

    public int P() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = (bArr[i11] & 255) << 16;
        int i14 = i11 + 2;
        this.f110399b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f110399b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public int Q() {
        int iV = v();
        if (iV >= 0) {
            return iV;
        }
        throw new IllegalStateException("Top bit not zero: " + iV);
    }

    public int R() {
        return ru.f.e(S());
    }

    public long S() {
        long j11 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            if (this.f110399b == this.f110400c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM = M();
            j11 |= (127 & jM) << (i11 * 7);
            if ((jM & 128) == 0) {
                return j11;
            }
        }
        return j11;
    }

    public long T() {
        long jF = F();
        if (jF >= 0) {
            return jF;
        }
        throw new IllegalStateException("Top bit not zero: " + jF);
    }

    public int U() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f110399b = i11 + 2;
        return (bArr[i12] & 255) | i13;
    }

    public long V() {
        int i11;
        int i12;
        long j11 = this.f110398a[this.f110399b];
        int i13 = 7;
        while (true) {
            if (i13 >= 0) {
                int i14 = 1 << i13;
                if ((((long) i14) & j11) == 0) {
                    if (i13 < 6) {
                        j11 &= (long) (i14 - 1);
                        i12 = 7 - i13;
                        break;
                    }
                    if (i13 == 7) {
                        i12 = 1;
                        break;
                    }
                } else {
                    i13--;
                }
            }
            i12 = 0;
            break;
        }
        if (i12 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j11);
        }
        for (i11 = 1; i11 < i12; i11++) {
            byte b11 = this.f110398a[this.f110399b + i11];
            if ((b11 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j11);
            }
            j11 = (j11 << 6) | ((long) (b11 & 63));
        }
        this.f110399b += i12;
        return j11;
    }

    public Charset W() {
        if (a() >= 3) {
            byte[] bArr = this.f110398a;
            int i11 = this.f110399b;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f110399b = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f110398a;
        int i12 = this.f110399b;
        byte b11 = bArr2[i12];
        if (b11 == -2 && bArr2[i12 + 1] == -1) {
            this.f110399b = i12 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b11 != -1 || bArr2[i12 + 1] != -2) {
            return null;
        }
        this.f110399b = i12 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void X(int i11) {
        Z(b() < i11 ? new byte[i11] : this.f110398a, i11);
    }

    public void Y(byte[] bArr) {
        Z(bArr, bArr.length);
    }

    public void Z(byte[] bArr, int i11) {
        this.f110398a = bArr;
        this.f110400c = i11;
        this.f110399b = 0;
    }

    public int a() {
        return Math.max(this.f110400c - this.f110399b, 0);
    }

    public void a0(int i11) {
        a.a(i11 >= 0 && i11 <= this.f110398a.length);
        this.f110400c = i11;
    }

    public int b() {
        return this.f110398a.length;
    }

    public void b0(int i11) {
        a.a(i11 >= 0 && i11 <= this.f110400c);
        this.f110399b = i11;
    }

    public void c0(int i11) {
        b0(this.f110399b + i11);
    }

    public void d(int i11) {
        if (i11 > b()) {
            this.f110398a = Arrays.copyOf(this.f110398a, i11);
        }
    }

    public void d0() {
        while ((M() & 128) != 0) {
        }
    }

    public byte[] f() {
        return this.f110398a;
    }

    public int g() {
        return this.f110399b;
    }

    public int j() {
        return this.f110400c;
    }

    public int l(Charset charset) {
        int iM = m(charset);
        if (iM != 0) {
            return ru.f.e(iM >>> 8);
        }
        return 1114112;
    }

    public int n() {
        return this.f110398a[this.f110399b] & 255;
    }

    public void p(b0 b0Var, int i11) {
        q(b0Var.f110390a, 0, i11);
        b0Var.p(0);
    }

    public void q(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f110398a, this.f110399b, bArr, i11, i12);
        this.f110399b += i12;
    }

    public String s(char c11) {
        if (a() == 0) {
            return null;
        }
        int i11 = this.f110399b;
        while (i11 < this.f110400c && this.f110398a[i11] != c11) {
            i11++;
        }
        byte[] bArr = this.f110398a;
        int i12 = this.f110399b;
        String strL = q0.L(bArr, i12, i11 - i12);
        this.f110399b = i11;
        if (i11 < this.f110400c) {
            this.f110399b = i11 + 1;
        }
        return strL;
    }

    public double t() {
        return Double.longBitsToDouble(F());
    }

    public float u() {
        return Float.intBitsToFloat(v());
    }

    public int v() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.f110399b = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.f110399b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.f110399b = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    public int w() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = ((bArr[i11] & 255) << 24) >> 8;
        int i14 = i11 + 2;
        this.f110399b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f110399b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public String x() {
        return y(StandardCharsets.UTF_8);
    }

    public String y(Charset charset) {
        a.b(f110397f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            W();
        }
        String strK = K(e(charset) - this.f110399b, charset);
        if (this.f110399b == this.f110400c) {
            return strK;
        }
        e0(charset);
        return strK;
    }

    public int z() {
        byte[] bArr = this.f110398a;
        int i11 = this.f110399b;
        int i12 = i11 + 1;
        this.f110399b = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.f110399b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        int i16 = i11 + 3;
        this.f110399b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.f110399b = i11 + 4;
        return ((bArr[i16] & 255) << 24) | i17;
    }

    public c0(int i11) {
        this.f110398a = new byte[i11];
        this.f110400c = i11;
    }

    public c0(byte[] bArr) {
        this.f110398a = bArr;
        this.f110400c = bArr.length;
    }

    public c0(byte[] bArr, int i11) {
        this.f110398a = bArr;
        this.f110400c = i11;
    }
}
