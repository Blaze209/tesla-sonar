package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f39621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f39623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f39624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f39626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f39627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f39628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f39630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f39632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f39636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f39637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f39638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f39639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39640v;

    public m(int i11, int i12, float f11, float f12, int i13) {
        this.f39619a = i11;
        this.f39620b = i12;
        this.f39621c = f11;
        this.f39622d = f12;
        this.f39623e = i11 / i13;
        this.f39624f = i11 / 400;
        int i14 = i11 / 65;
        this.f39625g = i14;
        int i15 = i14 * 2;
        this.f39626h = i15;
        this.f39627i = new short[i15];
        this.f39628j = new short[i15 * i12];
        this.f39630l = new short[i15 * i12];
        this.f39632n = new short[i15 * i12];
    }

    private void a(float f11, int i11) {
        int i12;
        int i13;
        if (this.f39631m == i11) {
            return;
        }
        int i14 = this.f39619a;
        int i15 = (int) (i14 / f11);
        while (true) {
            if (i15 <= 16384 && i14 <= 16384) {
                break;
            }
            i15 /= 2;
            i14 /= 2;
        }
        o(i11);
        int i16 = 0;
        while (true) {
            int i17 = this.f39633o;
            if (i16 >= i17 - 1) {
                u(i17 - 1);
                return;
            }
            while (true) {
                i12 = this.f39634p;
                int i18 = (i12 + 1) * i15;
                i13 = this.f39635q;
                if (i18 <= i13 * i14) {
                    break;
                }
                this.f39630l = f(this.f39630l, this.f39631m, 1);
                int i19 = 0;
                while (true) {
                    int i21 = this.f39620b;
                    if (i19 < i21) {
                        this.f39630l[(this.f39631m * i21) + i19] = n(this.f39632n, (i21 * i16) + i19, i14, i15);
                        i19++;
                    }
                }
                this.f39635q++;
                this.f39631m++;
            }
            int i22 = i12 + 1;
            this.f39634p = i22;
            if (i22 == i14) {
                this.f39634p = 0;
                ts.a.g(i13 == i15);
                this.f39635q = 0;
            }
            i16++;
        }
    }

    private void b(float f11) {
        int iW;
        int i11 = this.f39629k;
        if (i11 < this.f39626h) {
            return;
        }
        int i12 = 0;
        do {
            if (this.f39636r > 0) {
                iW = c(i12);
            } else {
                int iG = g(this.f39628j, i12);
                iW = ((double) f11) > 1.0d ? iG + w(this.f39628j, i12, f11, iG) : m(this.f39628j, i12, f11, iG);
            }
            i12 += iW;
        } while (this.f39626h + i12 <= i11);
        v(i12);
    }

    private int c(int i11) {
        int iMin = Math.min(this.f39626h, this.f39636r);
        d(this.f39628j, i11, iMin);
        this.f39636r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i11, int i12) {
        short[] sArrF = f(this.f39630l, this.f39631m, i12);
        this.f39630l = sArrF;
        int i13 = this.f39620b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f39631m * i13, i13 * i12);
        this.f39631m += i12;
    }

    private void e(short[] sArr, int i11, int i12) {
        int i13 = this.f39626h / i12;
        int i14 = this.f39620b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f39627i[i17] = (short) (i18 / i15);
        }
    }

    private short[] f(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f39620b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    private int g(short[] sArr, int i11) {
        int iH;
        int i12 = this.f39619a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f39620b == 1 && i13 == 1) {
            iH = h(sArr, i11, this.f39624f, this.f39625g);
        } else {
            e(sArr, i11, i13);
            int iH2 = h(this.f39627i, 0, this.f39624f / i13, this.f39625g / i13);
            if (i13 != 1) {
                int i14 = iH2 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f39624f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f39625g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f39620b == 1) {
                    iH = h(sArr, i11, i16, i17);
                } else {
                    e(sArr, i11, 1);
                    iH = h(this.f39627i, 0, i16, i17);
                }
            } else {
                iH = iH2;
            }
        }
        int i21 = q(this.f39639u, this.f39640v) ? this.f39637s : iH;
        this.f39638t = this.f39639u;
        this.f39637s = iH;
        return i21;
    }

    private int h(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f39620b;
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
        this.f39639u = i16 / i17;
        this.f39640v = i18 / i15;
        return i17;
    }

    private int m(short[] sArr, int i11, float f11, int i12) {
        int i13;
        if (f11 < 0.5f) {
            i13 = (int) ((i12 * f11) / (1.0f - f11));
        } else {
            this.f39636r = (int) ((i12 * ((2.0f * f11) - 1.0f)) / (1.0f - f11));
            i13 = i12;
        }
        int i14 = i12 + i13;
        short[] sArrF = f(this.f39630l, this.f39631m, i14);
        this.f39630l = sArrF;
        int i15 = this.f39620b;
        System.arraycopy(sArr, i11 * i15, sArrF, this.f39631m * i15, i15 * i12);
        p(i13, this.f39620b, this.f39630l, this.f39631m + i12, sArr, i11 + i12, sArr, i11);
        this.f39631m += i14;
        return i13;
    }

    private short n(short[] sArr, int i11, int i12, int i13) {
        short s11 = sArr[i11];
        short s12 = sArr[i11 + this.f39620b];
        int i14 = this.f39635q * i12;
        int i15 = this.f39634p;
        int i16 = i15 * i13;
        int i17 = (i15 + 1) * i13;
        int i18 = i17 - i14;
        int i19 = i17 - i16;
        return (short) (((s11 * i18) + ((i19 - i18) * s12)) / i19);
    }

    private void o(int i11) {
        int i12 = this.f39631m - i11;
        short[] sArrF = f(this.f39632n, this.f39633o, i12);
        this.f39632n = sArrF;
        short[] sArr = this.f39630l;
        int i13 = this.f39620b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f39633o * i13, i13 * i12);
        this.f39631m = i11;
        this.f39633o += i12;
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
        return i11 != 0 && this.f39637s != 0 && i12 <= i11 * 3 && i11 * 2 > this.f39638t * 3;
    }

    private void r() {
        int i11 = this.f39631m;
        float f11 = this.f39621c;
        float f12 = this.f39622d;
        float f13 = f11 / f12;
        float f14 = this.f39623e * f12;
        double d11 = f13;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            b(f13);
        } else {
            d(this.f39628j, 0, this.f39629k);
            this.f39629k = 0;
        }
        if (f14 != 1.0f) {
            a(f14, i11);
        }
    }

    private void u(int i11) {
        if (i11 == 0) {
            return;
        }
        short[] sArr = this.f39632n;
        int i12 = this.f39620b;
        System.arraycopy(sArr, i11 * i12, sArr, 0, (this.f39633o - i11) * i12);
        this.f39633o -= i11;
    }

    private void v(int i11) {
        int i12 = this.f39629k - i11;
        short[] sArr = this.f39628j;
        int i13 = this.f39620b;
        System.arraycopy(sArr, i11 * i13, sArr, 0, i13 * i12);
        this.f39629k = i12;
    }

    private int w(short[] sArr, int i11, float f11, int i12) {
        int i13;
        if (f11 >= 2.0f) {
            i13 = (int) (i12 / (f11 - 1.0f));
        } else {
            this.f39636r = (int) ((i12 * (2.0f - f11)) / (f11 - 1.0f));
            i13 = i12;
        }
        short[] sArrF = f(this.f39630l, this.f39631m, i13);
        this.f39630l = sArrF;
        p(i13, this.f39620b, sArrF, this.f39631m, sArr, i11, sArr, i11 + i12);
        this.f39631m += i13;
        return i13;
    }

    public void i() {
        this.f39629k = 0;
        this.f39631m = 0;
        this.f39633o = 0;
        this.f39634p = 0;
        this.f39635q = 0;
        this.f39636r = 0;
        this.f39637s = 0;
        this.f39638t = 0;
        this.f39639u = 0;
        this.f39640v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f39620b, this.f39631m);
        shortBuffer.put(this.f39630l, 0, this.f39620b * iMin);
        int i11 = this.f39631m - iMin;
        this.f39631m = i11;
        short[] sArr = this.f39630l;
        int i12 = this.f39620b;
        System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
    }

    public int k() {
        return this.f39631m * this.f39620b * 2;
    }

    public int l() {
        return this.f39629k * this.f39620b * 2;
    }

    public void s() {
        int i11;
        int i12 = this.f39629k;
        float f11 = this.f39621c;
        float f12 = this.f39622d;
        int i13 = this.f39631m + ((int) ((((i12 / (f11 / f12)) + this.f39633o) / (this.f39623e * f12)) + 0.5f));
        this.f39628j = f(this.f39628j, i12, (this.f39626h * 2) + i12);
        int i14 = 0;
        while (true) {
            i11 = this.f39626h;
            int i15 = this.f39620b;
            if (i14 >= i11 * 2 * i15) {
                break;
            }
            this.f39628j[(i15 * i12) + i14] = 0;
            i14++;
        }
        this.f39629k += i11 * 2;
        r();
        if (this.f39631m > i13) {
            this.f39631m = i13;
        }
        this.f39629k = 0;
        this.f39636r = 0;
        this.f39633o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i11 = this.f39620b;
        int i12 = iRemaining / i11;
        short[] sArrF = f(this.f39628j, this.f39629k, i12);
        this.f39628j = sArrF;
        shortBuffer.get(sArrF, this.f39629k * this.f39620b, ((i11 * i12) * 2) / 2);
        this.f39629k += i12;
        r();
    }
}
