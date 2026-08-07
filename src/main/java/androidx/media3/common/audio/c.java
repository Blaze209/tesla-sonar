package androidx.media3.common.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f9046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f9047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f9048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f9052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f9053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f9055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f9057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f9061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f9062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f9064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f9066w;

    public c(int i11, int i12, float f11, float f12, int i13) {
        this.f9044a = i11;
        this.f9045b = i12;
        this.f9046c = f11;
        this.f9047d = f12;
        this.f9048e = i11 / i13;
        this.f9049f = i11 / 400;
        int i14 = i11 / 65;
        this.f9050g = i14;
        int i15 = i14 * 2;
        this.f9051h = i15;
        this.f9052i = new short[i15];
        this.f9053j = new short[i15 * i12];
        this.f9055l = new short[i15 * i12];
        this.f9057n = new short[i15 * i12];
    }

    private void a(float f11, int i11) {
        int i12;
        int i13;
        if (this.f9056m == i11) {
            return;
        }
        int i14 = this.f9044a;
        long j11 = (long) (i14 / f11);
        long j12 = i14;
        while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
            j11 /= 2;
            j12 /= 2;
        }
        o(i11);
        int i15 = 0;
        while (true) {
            int i16 = this.f9058o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i12 = this.f9059p;
                long j13 = ((long) (i12 + 1)) * j11;
                i13 = this.f9060q;
                if (j13 <= ((long) i13) * j12) {
                    break;
                }
                this.f9055l = f(this.f9055l, this.f9056m, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f9045b;
                    if (i17 < i18) {
                        this.f9055l[(this.f9056m * i18) + i17] = n(this.f9057n, (i18 * i15) + i17, j12, j11);
                        i17++;
                    }
                }
                this.f9060q++;
                this.f9056m++;
            }
            int i19 = i12 + 1;
            this.f9059p = i19;
            if (i19 == j12) {
                this.f9059p = 0;
                s7.a.h(((long) i13) == j11);
                this.f9060q = 0;
            }
            i15++;
        }
    }

    private void b(double d11) {
        c cVar;
        double d12;
        int i11 = this.f9054k;
        if (i11 < this.f9051h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f9061r > 0) {
                iM += c(iM);
                cVar = this;
                d12 = d11;
            } else {
                int iG = g(this.f9053j, iM);
                if (d11 > 1.0d) {
                    cVar = this;
                    d12 = d11;
                    iM += iG + cVar.w(this.f9053j, iM, d12, iG);
                } else {
                    cVar = this;
                    d12 = d11;
                    iM += cVar.m(cVar.f9053j, iM, d12, iG);
                }
            }
            if (cVar.f9051h + iM > i11) {
                v(iM);
                return;
            }
            d11 = d12;
        }
    }

    private int c(int i11) {
        int iMin = Math.min(this.f9051h, this.f9061r);
        d(this.f9053j, i11, iMin);
        this.f9061r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i11, int i12) {
        short[] sArrF = f(this.f9055l, this.f9056m, i12);
        this.f9055l = sArrF;
        int i13 = this.f9045b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f9056m * i13, i13 * i12);
        this.f9056m += i12;
    }

    private void e(short[] sArr, int i11, int i12) {
        int i13 = this.f9051h / i12;
        int i14 = this.f9045b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f9052i[i17] = (short) (i18 / i15);
        }
    }

    private short[] f(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f9045b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    private int g(short[] sArr, int i11) {
        int iH;
        int i12 = this.f9044a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f9045b == 1 && i13 == 1) {
            iH = h(sArr, i11, this.f9049f, this.f9050g);
        } else {
            e(sArr, i11, i13);
            int iH2 = h(this.f9052i, 0, this.f9049f / i13, this.f9050g / i13);
            if (i13 != 1) {
                int i14 = iH2 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f9049f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f9050g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f9045b == 1) {
                    iH = h(sArr, i11, i16, i17);
                } else {
                    e(sArr, i11, 1);
                    iH = h(this.f9052i, 0, i16, i17);
                }
            } else {
                iH = iH2;
            }
        }
        int i21 = q(this.f9064u, this.f9065v) ? this.f9062s : iH;
        this.f9063t = this.f9064u;
        this.f9062s = iH;
        return i21;
    }

    private int h(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f9045b;
        int i15 = 255;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (i12 <= i13) {
            int iAbs = 0;
            for (int i19 = 0; i19 < i12; i19++) {
                iAbs += Math.abs(sArr[i14 + i19] - sArr[(i14 + i12) + i19]);
            }
            if (iAbs * i17 < i16 * i12) {
                i17 = i12;
                i16 = iAbs;
            }
            if (iAbs * i15 > i18 * i12) {
                i15 = i12;
                i18 = iAbs;
            }
            i12++;
        }
        this.f9064u = i16 / i17;
        this.f9065v = i18 / i15;
        return i17;
    }

    private int m(short[] sArr, int i11, double d11, int i12) {
        int i13;
        if (d11 < 0.5d) {
            double d12 = ((((double) i12) * d11) / (1.0d - d11)) + this.f9066w;
            int iRound = (int) Math.round(d12);
            this.f9066w = d12 - ((double) iRound);
            i13 = iRound;
        } else {
            double d13 = ((((double) i12) * ((2.0d * d11) - 1.0d)) / (1.0d - d11)) + this.f9066w;
            int iRound2 = (int) Math.round(d13);
            this.f9061r = iRound2;
            this.f9066w = d13 - ((double) iRound2);
            i13 = i12;
        }
        int i14 = i12 + i13;
        short[] sArrF = f(this.f9055l, this.f9056m, i14);
        this.f9055l = sArrF;
        int i15 = this.f9045b;
        System.arraycopy(sArr, i11 * i15, sArrF, this.f9056m * i15, i15 * i12);
        p(i13, this.f9045b, this.f9055l, this.f9056m + i12, sArr, i11 + i12, sArr, i11);
        this.f9056m += i14;
        return i13;
    }

    private short n(short[] sArr, int i11, long j11, long j12) {
        short s11 = sArr[i11];
        short s12 = sArr[i11 + this.f9045b];
        long j13 = ((long) this.f9060q) * j11;
        int i12 = this.f9059p;
        long j14 = ((long) i12) * j12;
        long j15 = ((long) (i12 + 1)) * j12;
        long j16 = j15 - j13;
        long j17 = j15 - j14;
        return (short) (((((long) s11) * j16) + ((j17 - j16) * ((long) s12))) / j17);
    }

    private void o(int i11) {
        int i12 = this.f9056m - i11;
        short[] sArrF = f(this.f9057n, this.f9058o, i12);
        this.f9057n = sArrF;
        short[] sArr = this.f9055l;
        int i13 = this.f9045b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f9058o * i13, i13 * i12);
        this.f9056m = i11;
        this.f9058o += i12;
    }

    private static void p(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i13 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i14 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i17] = (short) (((sArr2[i19] * (i11 - i21)) + (sArr3[i18] * i21)) / i11);
                i17 += i12;
                i19 += i12;
                i18 += i12;
            }
        }
    }

    private boolean q(int i11, int i12) {
        return i11 != 0 && this.f9062s != 0 && i12 <= i11 * 3 && i11 * 2 > this.f9063t * 3;
    }

    private void r() {
        int i11 = this.f9056m;
        float f11 = this.f9046c;
        float f12 = this.f9047d;
        double d11 = f11 / f12;
        float f13 = this.f9048e * f12;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            b(d11);
        } else {
            d(this.f9053j, 0, this.f9054k);
            this.f9054k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i11);
        }
    }

    private void u(int i11) {
        if (i11 == 0) {
            return;
        }
        short[] sArr = this.f9057n;
        int i12 = this.f9045b;
        System.arraycopy(sArr, i11 * i12, sArr, 0, (this.f9058o - i11) * i12);
        this.f9058o -= i11;
    }

    private void v(int i11) {
        int i12 = this.f9054k - i11;
        short[] sArr = this.f9053j;
        int i13 = this.f9045b;
        System.arraycopy(sArr, i11 * i13, sArr, 0, i13 * i12);
        this.f9054k = i12;
    }

    private int w(short[] sArr, int i11, double d11, int i12) {
        int i13;
        if (d11 >= 2.0d) {
            double d12 = (((double) i12) / (d11 - 1.0d)) + this.f9066w;
            int iRound = (int) Math.round(d12);
            this.f9066w = d12 - ((double) iRound);
            i13 = iRound;
        } else {
            double d13 = ((((double) i12) * (2.0d - d11)) / (d11 - 1.0d)) + this.f9066w;
            int iRound2 = (int) Math.round(d13);
            this.f9061r = iRound2;
            this.f9066w = d13 - ((double) iRound2);
            i13 = i12;
        }
        short[] sArrF = f(this.f9055l, this.f9056m, i13);
        this.f9055l = sArrF;
        p(i13, this.f9045b, sArrF, this.f9056m, sArr, i11, sArr, i11 + i12);
        this.f9056m += i13;
        return i13;
    }

    public void i() {
        this.f9054k = 0;
        this.f9056m = 0;
        this.f9058o = 0;
        this.f9059p = 0;
        this.f9060q = 0;
        this.f9061r = 0;
        this.f9062s = 0;
        this.f9063t = 0;
        this.f9064u = 0;
        this.f9065v = 0;
        this.f9066w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        s7.a.h(this.f9056m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f9045b, this.f9056m);
        shortBuffer.put(this.f9055l, 0, this.f9045b * iMin);
        int i11 = this.f9056m - iMin;
        this.f9056m = i11;
        short[] sArr = this.f9055l;
        int i12 = this.f9045b;
        System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
    }

    public int k() {
        s7.a.h(this.f9056m >= 0);
        return this.f9056m * this.f9045b * 2;
    }

    public int l() {
        return this.f9054k * this.f9045b * 2;
    }

    public void s() {
        int i11;
        int i12 = this.f9054k;
        float f11 = this.f9046c;
        float f12 = this.f9047d;
        double d11 = f11 / f12;
        double d12 = this.f9048e * f12;
        int i13 = this.f9061r;
        int i14 = this.f9056m + ((int) ((((((((double) (i12 - i13)) / d11) + ((double) i13)) + this.f9066w) + ((double) this.f9058o)) / d12) + 0.5d));
        this.f9066w = 0.0d;
        this.f9053j = f(this.f9053j, i12, (this.f9051h * 2) + i12);
        int i15 = 0;
        while (true) {
            i11 = this.f9051h;
            int i16 = this.f9045b;
            if (i15 >= i11 * 2 * i16) {
                break;
            }
            this.f9053j[(i16 * i12) + i15] = 0;
            i15++;
        }
        this.f9054k += i11 * 2;
        r();
        if (this.f9056m > i14) {
            this.f9056m = Math.max(i14, 0);
        }
        this.f9054k = 0;
        this.f9061r = 0;
        this.f9058o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i11 = this.f9045b;
        int i12 = iRemaining / i11;
        short[] sArrF = f(this.f9053j, this.f9054k, i12);
        this.f9053j = sArrF;
        shortBuffer.get(sArrF, this.f9054k * this.f9045b, ((i11 * i12) * 2) / 2);
        this.f9054k += i12;
        r();
    }
}
