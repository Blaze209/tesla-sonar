package ts;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f115086a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f115087b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f115088c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f115089d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f115090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f115091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f115092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f115093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f115094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f115095f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f115096g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f115097h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f115098i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f115099j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f115100k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f115101l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f115102m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f115103n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f115104o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f115105p;

        public a(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int i17, int i18, int i19, int i21, float f11, int i22, int i23, int i24) {
            this.f115090a = i11;
            this.f115091b = z11;
            this.f115092c = i12;
            this.f115093d = i13;
            this.f115094e = i14;
            this.f115095f = i15;
            this.f115096g = i16;
            this.f115097h = iArr;
            this.f115098i = i17;
            this.f115099j = i18;
            this.f115100k = i19;
            this.f115101l = i21;
            this.f115102m = f11;
            this.f115103n = i22;
            this.f115104o = i23;
            this.f115105p = i24;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f115106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f115107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f115108c;

        public b(int i11, int i12, boolean z11) {
            this.f115106a = i11;
            this.f115107b = i12;
            this.f115108c = z11;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f115109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f115110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f115111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f115112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f115113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f115114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f115115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f115116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f115117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f115118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f115119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f115120l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f115121m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f115122n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f115123o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f115124p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f115125q;

        public c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11, boolean z11, boolean z12, int i18, int i19, int i21, boolean z13, int i22, int i23, int i24) {
            this.f115109a = i11;
            this.f115110b = i12;
            this.f115111c = i13;
            this.f115112d = i14;
            this.f115113e = i15;
            this.f115114f = i16;
            this.f115115g = i17;
            this.f115116h = f11;
            this.f115117i = z11;
            this.f115118j = z12;
            this.f115119k = i18;
            this.f115120l = i19;
            this.f115121m = i21;
            this.f115122n = z13;
            this.f115123o = i22;
            this.f115124p = i23;
            this.f115125q = i24;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            if (i13 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i14 = byteBuffer.get(i11) & 255;
            if (i12 == 3) {
                if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i11 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i14 == 0) {
                i12++;
            }
            if (i14 != 0) {
                i12 = 0;
            }
            i11 = i13;
        }
    }

    public static int c(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        ts.a.g(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            a(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            a(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            a(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b11 = bArr[i15];
            if ((b11 & 254) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b11 == 1) {
                    a(zArr);
                    return i16;
                }
                i15 -= 2;
            }
            i15 += 3;
        }
        zArr[0] = i13 <= 2 ? !(i13 != 2 ? !(zArr[1] && bArr[i14] == 1) : !(zArr[2] && bArr[i12 + (-2)] == 0 && bArr[i14] == 1)) : bArr[i12 + (-3)] == 0 && bArr[i12 + (-2)] == 0 && bArr[i14] == 1;
        zArr[1] = i13 <= 1 ? zArr[2] && bArr[i14] == 0 : bArr[i12 + (-2)] == 0 && bArr[i14] == 0;
        zArr[2] = bArr[i14] == 0;
        return i12;
    }

    private static int d(byte[] bArr, int i11, int i12) {
        while (i11 < i12 - 2) {
            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int e(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i11) {
        return bArr[i11 + 3] & 31;
    }

    public static boolean g(String str, byte b11) {
        return ("video/avc".equals(str) && (b11 & 31) == 6) || ("video/hevc".equals(str) && ((b11 & 126) >> 1) == 39);
    }

    public static a h(byte[] bArr, int i11, int i12) {
        return i(bArr, i11 + 2, i12);
    }

    public static a i(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        e0 e0Var = new e0(bArr, i11, i12);
        e0Var.l(4);
        int iE = e0Var.e(3);
        e0Var.k();
        int iE2 = e0Var.e(2);
        boolean zD = e0Var.d();
        int iE3 = e0Var.e(5);
        int i21 = 0;
        for (int i22 = 0; i22 < 32; i22++) {
            if (e0Var.d()) {
                i21 |= 1 << i22;
            }
        }
        int[] iArr = new int[6];
        for (int i23 = 0; i23 < 6; i23++) {
            iArr[i23] = e0Var.e(8);
        }
        int iE4 = e0Var.e(8);
        int i24 = 0;
        for (int i25 = 0; i25 < iE; i25++) {
            if (e0Var.d()) {
                i24 += 89;
            }
            if (e0Var.d()) {
                i24 += 8;
            }
        }
        e0Var.l(i24);
        if (iE > 0) {
            e0Var.l((8 - iE) * 2);
        }
        int iH = e0Var.h();
        int iH2 = e0Var.h();
        if (iH2 == 3) {
            e0Var.k();
        }
        int iH3 = e0Var.h();
        int iH4 = e0Var.h();
        if (e0Var.d()) {
            int iH5 = e0Var.h();
            int iH6 = e0Var.h();
            int iH7 = e0Var.h();
            int iH8 = e0Var.h();
            iH3 -= ((iH2 == 1 || iH2 == 2) ? 2 : 1) * (iH5 + iH6);
            iH4 -= (iH2 == 1 ? 2 : 1) * (iH7 + iH8);
        }
        int iH9 = e0Var.h();
        int iH10 = e0Var.h();
        int iH11 = e0Var.h();
        for (int i26 = e0Var.d() ? 0 : iE; i26 <= iE; i26++) {
            e0Var.h();
            e0Var.h();
            e0Var.h();
        }
        e0Var.h();
        e0Var.h();
        e0Var.h();
        e0Var.h();
        e0Var.h();
        e0Var.h();
        if (e0Var.d() && e0Var.d()) {
            n(e0Var);
        }
        e0Var.l(2);
        if (e0Var.d()) {
            e0Var.l(8);
            e0Var.h();
            e0Var.h();
            e0Var.k();
        }
        p(e0Var);
        if (e0Var.d()) {
            int iH12 = e0Var.h();
            for (int i27 = 0; i27 < iH12; i27++) {
                e0Var.l(iH11 + 5);
            }
        }
        e0Var.l(2);
        float f11 = 1.0f;
        if (e0Var.d()) {
            if (e0Var.d()) {
                int iE5 = e0Var.e(8);
                if (iE5 == 255) {
                    int iE6 = e0Var.e(16);
                    int iE7 = e0Var.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f11 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = f115087b;
                    if (iE5 < fArr.length) {
                        f11 = fArr[iE5];
                    } else {
                        u.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE5);
                    }
                }
            }
            if (e0Var.d()) {
                e0Var.k();
            }
            if (e0Var.d()) {
                e0Var.l(3);
                i19 = e0Var.d() ? 1 : 2;
                if (e0Var.d()) {
                    int iE8 = e0Var.e(8);
                    int iE9 = e0Var.e(8);
                    e0Var.l(8);
                    int iH13 = us.c.h(iE8);
                    int i28 = us.c.i(iE9);
                    i18 = iH13;
                    i17 = i28;
                } else {
                    i17 = -1;
                    i18 = -1;
                }
            } else {
                i17 = -1;
                i18 = -1;
                i19 = -1;
            }
            if (e0Var.d()) {
                e0Var.h();
                e0Var.h();
            }
            e0Var.k();
            if (e0Var.d()) {
                iH4 *= 2;
            }
            i16 = i17;
            i14 = i18;
            i15 = i19;
            i13 = iH4;
        } else {
            i13 = iH4;
            i14 = -1;
            i15 = -1;
            i16 = -1;
        }
        return new a(iE2, zD, iE3, i21, iH2, iH9, iH10, iArr, iE4, iH, iH3, i13, f11, i14, i15, i16);
    }

    public static b j(byte[] bArr, int i11, int i12) {
        return k(bArr, i11 + 1, i12);
    }

    public static b k(byte[] bArr, int i11, int i12) {
        e0 e0Var = new e0(bArr, i11, i12);
        int iH = e0Var.h();
        int iH2 = e0Var.h();
        e0Var.k();
        return new b(iH, iH2, e0Var.d());
    }

    public static c l(byte[] bArr, int i11, int i12) {
        return m(bArr, i11 + 1, i12);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01b5 A[PHI: r16
      0x01b5: PHI (r16v5 float) = (r16v4 float), (r16v9 float) binds: [B:72:0x0139, B:89:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    public static c m(byte[] bArr, int i11, int i12) {
        int iH;
        boolean zD;
        int i13;
        boolean z11;
        int iH2;
        int iH3;
        int i14;
        int i15;
        int i16;
        e0 e0Var = new e0(bArr, i11, i12);
        int iE = e0Var.e(8);
        int iE2 = e0Var.e(8);
        int iE3 = e0Var.e(8);
        int iH4 = e0Var.h();
        int i17 = 1;
        if (iE == 100 || iE == 110 || iE == 122 || iE == 244 || iE == 44 || iE == 83 || iE == 86 || iE == 118 || iE == 128 || iE == 138) {
            iH = e0Var.h();
            zD = iH == 3 ? e0Var.d() : false;
            e0Var.h();
            e0Var.h();
            e0Var.k();
            if (e0Var.d()) {
                int i18 = iH != 3 ? 8 : 12;
                int i19 = 0;
                while (i19 < i18) {
                    if (e0Var.d()) {
                        o(e0Var, i19 < 6 ? 16 : 64);
                    }
                    i19++;
                }
            }
        } else {
            iH = 1;
            zD = false;
        }
        int iH5 = e0Var.h() + 4;
        int iH6 = e0Var.h();
        if (iH6 == 0) {
            i17 = 1;
            zD = zD;
            iH2 = e0Var.h() + 4;
            i13 = 16;
            z11 = false;
        } else {
            if (iH6 == 1) {
                boolean zD2 = e0Var.d();
                e0Var.g();
                e0Var.g();
                long jH = e0Var.h();
                i13 = 16;
                for (int i21 = 0; i21 < jH; i21++) {
                    e0Var.h();
                }
                z11 = zD2;
            } else {
                i13 = 16;
                z11 = false;
            }
            iH2 = 0;
        }
        int iH7 = e0Var.h();
        e0Var.k();
        int iH8 = e0Var.h() + 1;
        int iH9 = e0Var.h() + 1;
        boolean zD3 = e0Var.d();
        int i22 = (2 - (zD3 ? 1 : 0)) * iH9;
        if (!zD3) {
            e0Var.k();
        }
        e0Var.k();
        int i23 = iH8 * 16;
        int i24 = i22 * 16;
        if (e0Var.d()) {
            int iH10 = e0Var.h();
            int iH11 = e0Var.h();
            int iH12 = e0Var.h();
            int iH13 = e0Var.h();
            if (iH == 0) {
                i16 = 2 - (zD3 ? 1 : 0);
            } else {
                if (iH != 3) {
                    i17 = 2;
                }
                i16 = (iH == i17 ? 2 : i17) * (2 - (zD3 ? 1 : 0));
            }
            i23 -= (iH10 + iH11) * i17;
            i24 -= (iH12 + iH13) * i16;
        }
        float f11 = 1.0f;
        if (e0Var.d()) {
            if (e0Var.d()) {
                int iE4 = e0Var.e(8);
                if (iE4 == 255) {
                    int i25 = i13;
                    int iE5 = e0Var.e(i25);
                    int iE6 = e0Var.e(i25);
                    if (iE5 != 0 && iE6 != 0) {
                        f11 = iE5 / iE6;
                    }
                } else {
                    float[] fArr = f115087b;
                    if (iE4 < fArr.length) {
                        f11 = fArr[iE4];
                    } else {
                        u.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE4);
                    }
                }
            }
            if (e0Var.d()) {
                e0Var.k();
            }
            if (e0Var.d()) {
                e0Var.l(3);
                i14 = e0Var.d() ? 1 : 2;
                if (e0Var.d()) {
                    int iE7 = e0Var.e(8);
                    int iE8 = e0Var.e(8);
                    e0Var.l(8);
                    iH3 = us.c.h(iE7);
                    i15 = us.c.i(iE8);
                } else {
                    iH3 = -1;
                }
            } else {
                iH3 = -1;
                i14 = -1;
            }
            i15 = -1;
        } else {
            iH3 = -1;
            i14 = -1;
            i15 = -1;
        }
        return new c(iE, iE2, iE3, iH4, iH7, i23, i24, f11, zD, zD3, iH5, iH6, iH2, z11, iH3, i14, i15);
    }

    private static void n(e0 e0Var) {
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 0;
            while (i12 < 6) {
                int i13 = 1;
                if (e0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i11 << 1) + 4));
                    if (i11 > 1) {
                        e0Var.g();
                    }
                    for (int i14 = 0; i14 < iMin; i14++) {
                        e0Var.g();
                    }
                } else {
                    e0Var.h();
                }
                if (i11 == 3) {
                    i13 = 3;
                }
                i12 += i13;
            }
        }
    }

    private static void o(e0 e0Var, int i11) {
        int iG = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i11; i13++) {
            if (iG != 0) {
                iG = ((e0Var.g() + i12) + 256) % 256;
            }
            if (iG != 0) {
                i12 = iG;
            }
        }
    }

    private static void p(e0 e0Var) {
        int iH = e0Var.h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < iH; i13++) {
            if (i13 == 0 || !e0Var.d()) {
                int iH2 = e0Var.h();
                int iH3 = e0Var.h();
                int[] iArr2 = new int[iH2];
                int i14 = 0;
                while (i14 < iH2) {
                    iArr2[i14] = (i14 > 0 ? iArr2[i14 - 1] : 0) - (e0Var.h() + 1);
                    e0Var.k();
                    i14++;
                }
                int[] iArr3 = new int[iH3];
                int i15 = 0;
                while (i15 < iH3) {
                    iArr3[i15] = (i15 > 0 ? iArr3[i15 - 1] : 0) + e0Var.h() + 1;
                    e0Var.k();
                    i15++;
                }
                i11 = iH2;
                iArr = iArr2;
                i12 = iH3;
                iArrCopyOf = iArr3;
            } else {
                int i16 = i11 + i12;
                int iH4 = (1 - ((e0Var.d() ? 1 : 0) * 2)) * (e0Var.h() + 1);
                int i17 = i16 + 1;
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 <= i16; i18++) {
                    if (e0Var.d()) {
                        zArr[i18] = true;
                    } else {
                        zArr[i18] = e0Var.d();
                    }
                }
                int[] iArr4 = new int[i17];
                int[] iArr5 = new int[i17];
                int i19 = 0;
                for (int i21 = i12 - 1; i21 >= 0; i21--) {
                    int i22 = iArrCopyOf[i21] + iH4;
                    if (i22 < 0 && zArr[i11 + i21]) {
                        iArr4[i19] = i22;
                        i19++;
                    }
                }
                if (iH4 < 0 && zArr[i16]) {
                    iArr4[i19] = iH4;
                    i19++;
                }
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = iArr[i23] + iH4;
                    if (i24 < 0 && zArr[i23]) {
                        iArr4[i19] = i24;
                        i19++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i19);
                int i25 = 0;
                for (int i26 = i11 - 1; i26 >= 0; i26--) {
                    int i27 = iArr[i26] + iH4;
                    if (i27 > 0 && zArr[i26]) {
                        iArr5[i25] = i27;
                        i25++;
                    }
                }
                if (iH4 > 0 && zArr[i16]) {
                    iArr5[i25] = iH4;
                    i25++;
                }
                for (int i28 = 0; i28 < i12; i28++) {
                    int i29 = iArrCopyOf[i28] + iH4;
                    if (i29 > 0 && zArr[i11 + i28]) {
                        iArr5[i25] = i29;
                        i25++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i25);
                iArr = iArrCopyOf2;
                i11 = i19;
                i12 = i25;
            }
        }
    }

    public static int q(byte[] bArr, int i11) {
        int i12;
        synchronized (f115088c) {
            int iD = 0;
            int i13 = 0;
            while (iD < i11) {
                try {
                    iD = d(bArr, iD, i11);
                    if (iD < i11) {
                        int[] iArr = f115089d;
                        if (iArr.length <= i13) {
                            f115089d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f115089d[i13] = iD;
                        iD += 3;
                        i13++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i12 = i11 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f115089d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i12 - i14);
        }
        return i12;
    }
}
