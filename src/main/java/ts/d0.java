package ts;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f114980d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f114981e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.collect.b0<Charset> f114982f = com.google.common.collect.b0.u(ou.e.f99998a, ou.e.f100000c, ou.e.f100003f, ou.e.f100001d, ou.e.f100002e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f114983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f114984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f114985c;

    public d0() {
        this.f114983a = p0.f115045f;
    }

    private void W(Charset charset) {
        if (m(charset, f114980d) == '\r') {
            m(charset, f114981e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    private int d(Charset charset) {
        int i11;
        byte[] bArr;
        if (charset.equals(ou.e.f100000c) || charset.equals(ou.e.f99998a)) {
            i11 = 1;
        } else {
            if (!charset.equals(ou.e.f100003f) && !charset.equals(ou.e.f100002e) && !charset.equals(ou.e.f100001d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i11 = 2;
        }
        int i12 = this.f114984b;
        while (true) {
            int i13 = this.f114985c;
            if (i12 >= i13 - (i11 - 1)) {
                return i13;
            }
            if ((!charset.equals(ou.e.f100000c) && !charset.equals(ou.e.f99998a)) || !p0.x0(this.f114983a[i12])) {
                if (charset.equals(ou.e.f100003f) || charset.equals(ou.e.f100001d)) {
                    byte[] bArr2 = this.f114983a;
                    if (bArr2[i12] != 0 || !p0.x0(bArr2[i12 + 1])) {
                        if (charset.equals(ou.e.f100002e)) {
                            bArr = this.f114983a;
                            if (bArr[i12 + 1] != 0 || !p0.x0(bArr[i12])) {
                            }
                        }
                        i12 += i11;
                    }
                } else {
                    if (charset.equals(ou.e.f100002e)) {
                        bArr = this.f114983a;
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

    private int i(Charset charset) {
        byte bA;
        char c11;
        int i11 = 1;
        if ((charset.equals(ou.e.f100000c) || charset.equals(ou.e.f99998a)) && a() >= 1) {
            bA = (byte) ru.b.a(ru.i.b(this.f114983a[this.f114984b]));
        } else {
            if ((charset.equals(ou.e.f100003f) || charset.equals(ou.e.f100001d)) && a() >= 2) {
                byte[] bArr = this.f114983a;
                int i12 = this.f114984b;
                c11 = ru.b.c(bArr[i12], bArr[i12 + 1]);
            } else {
                if (!charset.equals(ou.e.f100002e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f114983a;
                int i13 = this.f114984b;
                c11 = ru.b.c(bArr2[i13 + 1], bArr2[i13]);
            }
            bA = (byte) c11;
            i11 = 2;
        }
        return (ru.b.a(bA) << 16) + i11;
    }

    private char m(Charset charset, char[] cArr) {
        int i11 = i(charset);
        if (i11 == 0) {
            return (char) 0;
        }
        char c11 = (char) (i11 >> 16);
        if (!ru.b.b(cArr, c11)) {
            return (char) 0;
        }
        this.f114984b += i11 & 65535;
        return c11;
    }

    public long A() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        long j11 = (((long) bArr[i11]) & 255) << 56;
        int i13 = i11 + 2;
        this.f114984b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 48);
        int i14 = i11 + 3;
        this.f114984b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i11 + 4;
        this.f114984b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i11 + 5;
        this.f114984b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i11 + 6;
        this.f114984b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i11 + 7;
        this.f114984b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 8);
        this.f114984b = i11 + 8;
        return (((long) bArr[i18]) & 255) | j17;
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.f114984b;
        int i13 = (i12 + i11) - 1;
        String strD = p0.D(this.f114983a, i12, (i13 >= this.f114985c || this.f114983a[i13] != 0) ? i11 : i11 - 1);
        this.f114984b += i11;
        return strD;
    }

    public short D() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f114984b = i11 + 2;
        return (short) ((bArr[i12] & 255) | i13);
    }

    public String E(int i11) {
        return F(i11, ou.e.f100000c);
    }

    public String F(int i11, Charset charset) {
        String str = new String(this.f114983a, this.f114984b, i11, charset);
        this.f114984b += i11;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        this.f114984b = i11 + 1;
        return bArr[i11] & 255;
    }

    public int I() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f114984b = i11 + 2;
        int i14 = (bArr[i12] & 255) | i13;
        this.f114984b = i11 + 4;
        return i14;
    }

    public long J() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        long j11 = (((long) bArr[i11]) & 255) << 24;
        int i13 = i11 + 2;
        this.f114984b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i11 + 3;
        this.f114984b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 8);
        this.f114984b = i11 + 4;
        return (((long) bArr[i14]) & 255) | j13;
    }

    public int K() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = (bArr[i11] & 255) << 16;
        int i14 = i11 + 2;
        this.f114984b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f114984b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public long M() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException("Top bit not zero: " + jA);
    }

    public int N() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f114984b = i11 + 2;
        return (bArr[i12] & 255) | i13;
    }

    public long O() {
        int i11;
        int i12;
        long j11 = this.f114983a[this.f114984b];
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
            byte b11 = this.f114983a[this.f114984b + i11];
            if ((b11 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j11);
            }
            j11 = (j11 << 6) | ((long) (b11 & 63));
        }
        this.f114984b += i12;
        return j11;
    }

    public Charset P() {
        if (a() >= 3) {
            byte[] bArr = this.f114983a;
            int i11 = this.f114984b;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f114984b = i11 + 3;
                return ou.e.f100000c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f114983a;
        int i12 = this.f114984b;
        byte b11 = bArr2[i12];
        if (b11 == -2 && bArr2[i12 + 1] == -1) {
            this.f114984b = i12 + 2;
            return ou.e.f100001d;
        }
        if (b11 != -1 || bArr2[i12 + 1] != -2) {
            return null;
        }
        this.f114984b = i12 + 2;
        return ou.e.f100002e;
    }

    public void Q(int i11) {
        S(b() < i11 ? new byte[i11] : this.f114983a, i11);
    }

    public void R(byte[] bArr) {
        S(bArr, bArr.length);
    }

    public void S(byte[] bArr, int i11) {
        this.f114983a = bArr;
        this.f114985c = i11;
        this.f114984b = 0;
    }

    public void T(int i11) {
        a.a(i11 >= 0 && i11 <= this.f114983a.length);
        this.f114985c = i11;
    }

    public void U(int i11) {
        a.a(i11 >= 0 && i11 <= this.f114985c);
        this.f114984b = i11;
    }

    public void V(int i11) {
        U(this.f114984b + i11);
    }

    public int a() {
        return this.f114985c - this.f114984b;
    }

    public int b() {
        return this.f114983a.length;
    }

    public void c(int i11) {
        if (i11 > b()) {
            this.f114983a = Arrays.copyOf(this.f114983a, i11);
        }
    }

    public byte[] e() {
        return this.f114983a;
    }

    public int f() {
        return this.f114984b;
    }

    public int g() {
        return this.f114985c;
    }

    public char h(Charset charset) {
        a.b(f114982f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f114983a[this.f114984b] & 255;
    }

    public void k(c0 c0Var, int i11) {
        l(c0Var.f114975a, 0, i11);
        c0Var.p(0);
    }

    public void l(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f114983a, this.f114984b, bArr, i11, i12);
        this.f114984b += i12;
    }

    public String n(char c11) {
        if (a() == 0) {
            return null;
        }
        int i11 = this.f114984b;
        while (i11 < this.f114985c && this.f114983a[i11] != c11) {
            i11++;
        }
        byte[] bArr = this.f114983a;
        int i12 = this.f114984b;
        String strD = p0.D(bArr, i12, i11 - i12);
        this.f114984b = i11;
        if (i11 < this.f114985c) {
            this.f114984b = i11 + 1;
        }
        return strD;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.f114984b = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.f114984b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.f114984b = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    public int r() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = ((bArr[i11] & 255) << 24) >> 8;
        int i14 = i11 + 2;
        this.f114984b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f114984b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public String s() {
        return t(ou.e.f100000c);
    }

    public String t(Charset charset) {
        a.b(f114982f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(ou.e.f99998a)) {
            P();
        }
        String strF = F(d(charset) - this.f114984b, charset);
        if (this.f114984b == this.f114985c) {
            return strF;
        }
        W(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.f114984b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        int i16 = i11 + 3;
        this.f114984b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.f114984b = i11 + 4;
        return ((bArr[i16] & 255) << 24) | i17;
    }

    public long v() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.f114984b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.f114984b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        int i15 = i11 + 4;
        this.f114984b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i11 + 5;
        this.f114984b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 32);
        int i17 = i11 + 6;
        this.f114984b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 40);
        int i18 = i11 + 7;
        this.f114984b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 48);
        this.f114984b = i11 + 8;
        return ((((long) bArr[i18]) & 255) << 56) | j17;
    }

    public short w() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = bArr[i11] & 255;
        this.f114984b = i11 + 2;
        return (short) (((bArr[i12] & 255) << 8) | i13);
    }

    public long x() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.f114984b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.f114984b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        this.f114984b = i11 + 4;
        return ((((long) bArr[i14]) & 255) << 24) | j13;
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int z() {
        byte[] bArr = this.f114983a;
        int i11 = this.f114984b;
        int i12 = i11 + 1;
        this.f114984b = i12;
        int i13 = bArr[i11] & 255;
        this.f114984b = i11 + 2;
        return ((bArr[i12] & 255) << 8) | i13;
    }

    public d0(int i11) {
        this.f114983a = new byte[i11];
        this.f114985c = i11;
    }

    public d0(byte[] bArr) {
        this.f114983a = bArr;
        this.f114985c = bArr.length;
    }

    public d0(byte[] bArr, int i11) {
        this.f114983a = bArr;
        this.f114985c = i11;
    }
}
