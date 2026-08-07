package t7;

import com.google.common.collect.x;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p7.g0;
import p7.u;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f112710a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f112711b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f112712c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f112713d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112715b;

        public a(int i11, int i12) {
            this.f112714a = i11;
            this.f112715b = i12;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112718c;

        public b(int i11, int i12, int i13) {
            this.f112716a = i11;
            this.f112717b = i12;
            this.f112718c = i13;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f112720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f112722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f112723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f112724f;

        public c(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
            this.f112719a = i11;
            this.f112720b = z11;
            this.f112721c = i12;
            this.f112722d = i13;
            this.f112723e = iArr;
            this.f112724f = i14;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x<c> f112725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f112726b;

        public d(List<c> list, int[] iArr) {
            this.f112725a = x.n(list);
            this.f112726b = iArr;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f112730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f112731e;

        public e(int i11, int i12, int i13, int i14, int i15) {
            this.f112727a = i11;
            this.f112728b = i12;
            this.f112729c = i13;
            this.f112730d = i14;
            this.f112731e = i15;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x<e> f112732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f112733b;

        public f(List<e> list, int[] iArr) {
            this.f112732a = x.n(list);
            this.f112733b = iArr;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f112737d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f112738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f112739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f112740g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f112741h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f112742i;

        public g(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f112734a = i11;
            this.f112735b = i12;
            this.f112736c = i13;
            this.f112737d = i14;
            this.f112738e = i15;
            this.f112739f = i16;
            this.f112740g = i17;
            this.f112741h = i18;
            this.f112742i = i19;
        }
    }

    /* JADX INFO: renamed from: t7.h$h, reason: collision with other inner class name */
    public static final class C2408h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f112743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f112745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f112746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f112747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f112748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f112749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f112750h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f112751i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f112752j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f112753k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f112754l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f112755m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f112756n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f112757o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f112758p;

        public C2408h(b bVar, int i11, c cVar, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f11, int i21, int i22, int i23, int i24) {
            this.f112743a = bVar;
            this.f112744b = i11;
            this.f112745c = cVar;
            this.f112746d = i12;
            this.f112747e = i13;
            this.f112748f = i14;
            this.f112749g = i15;
            this.f112750h = i16;
            this.f112751i = i17;
            this.f112754l = f11;
            this.f112755m = i21;
            this.f112756n = i22;
            this.f112757o = i23;
            this.f112758p = i24;
            this.f112752j = i18;
            this.f112753k = i19;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112761c;

        public i(int i11, int i12, int i13) {
            this.f112759a = i11;
            this.f112760b = i12;
            this.f112761c = i13;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x<i> f112762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f112763b;

        public j(List<i> list, int[] iArr) {
            this.f112762a = x.n(list);
            this.f112763b = iArr;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f112764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x<a> f112765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f112766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f112767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f112768e;

        public k(b bVar, List<a> list, d dVar, f fVar, j jVar) {
            this.f112764a = bVar;
            this.f112765b = list != null ? x.n(list) : x.r();
            this.f112766c = dVar;
            this.f112767d = fVar;
            this.f112768e = jVar;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f112771c;

        public l(int i11, int i12, boolean z11) {
            this.f112769a = i11;
            this.f112770b = i12;
            this.f112771c = z11;
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f112775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f112776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f112777f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f112778g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f112779h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f112780i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f112781j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f112782k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f112783l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f112784m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f112785n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f112786o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f112787p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f112788q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f112789r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f112790s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f112791t;

        public m(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11, int i18, int i19, boolean z11, boolean z12, int i21, int i22, int i23, boolean z13, int i24, int i25, int i26, int i27) {
            this.f112772a = i11;
            this.f112773b = i12;
            this.f112774c = i13;
            this.f112775d = i14;
            this.f112776e = i15;
            this.f112777f = i16;
            this.f112778g = i17;
            this.f112779h = f11;
            this.f112780i = i18;
            this.f112781j = i19;
            this.f112782k = z11;
            this.f112783l = z12;
            this.f112784m = i21;
            this.f112785n = i22;
            this.f112786o = i23;
            this.f112787p = z13;
            this.f112788q = i24;
            this.f112789r = i25;
            this.f112790s = i26;
            this.f112791t = i27;
        }
    }

    public static l A(byte[] bArr, int i11, int i12) {
        return B(bArr, i11 + 1, i12);
    }

    public static l B(byte[] bArr, int i11, int i12) {
        t7.j jVar = new t7.j(bArr, i11, i12);
        int i13 = jVar.i();
        int i14 = jVar.i();
        jVar.l();
        return new l(i13, i14, jVar.e());
    }

    public static m C(byte[] bArr, int i11, int i12) {
        return D(bArr, i11 + 1, i12);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0213  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    public static m D(byte[] bArr, int i11, int i12) {
        int i13;
        boolean zE;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        float f11;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean zE2;
        boolean zE3;
        int i26;
        int i27;
        t7.j jVar = new t7.j(bArr, i11, i12);
        int iF = jVar.f(8);
        int iF2 = jVar.f(8);
        int iF3 = jVar.f(8);
        int i28 = jVar.i();
        if (iF == 100 || iF == 110 || iF == 122 || iF == 244 || iF == 44 || iF == 83 || iF == 86 || iF == 118 || iF == 128 || iF == 138) {
            i13 = jVar.i();
            zE = i13 == 3 ? jVar.e() : false;
            i14 = jVar.i();
            int i29 = jVar.i();
            jVar.l();
            if (jVar.e()) {
                int i31 = i13 != 3 ? 8 : 12;
                i15 = 16;
                int i32 = 0;
                while (i32 < i31) {
                    if (jVar.e()) {
                        J(jVar, i32 < 6 ? 16 : 64);
                    }
                    i32++;
                }
            } else {
                i15 = 16;
            }
            i16 = i29;
        } else {
            i13 = 1;
            i15 = 16;
            i16 = 0;
            zE = false;
            i14 = 0;
        }
        int i33 = jVar.i() + 4;
        int i34 = jVar.i();
        if (i34 == 0) {
            i17 = jVar.i() + 4;
            iF = iF;
            i34 = i34;
            z11 = false;
        } else {
            if (i34 == 1) {
                boolean zE4 = jVar.e();
                jVar.h();
                jVar.h();
                long jI = jVar.i();
                for (int i35 = 0; i35 < jI; i35++) {
                    jVar.i();
                }
                z11 = zE4;
            } else {
                z11 = false;
            }
            i17 = 0;
        }
        int i36 = jVar.i();
        jVar.l();
        int i37 = jVar.i() + 1;
        int i38 = jVar.i() + 1;
        boolean zE5 = jVar.e();
        int i39 = (2 - (zE5 ? 1 : 0)) * i38;
        if (!zE5) {
            jVar.l();
        }
        jVar.l();
        int i41 = i37 * 16;
        int i42 = i39 * 16;
        if (jVar.e()) {
            int i43 = jVar.i();
            int i44 = jVar.i();
            int i45 = jVar.i();
            int i46 = jVar.i();
            if (i13 == 0) {
                i27 = 2 - (zE5 ? 1 : 0);
                i26 = 1;
            } else {
                i26 = i13 == 3 ? 1 : 2;
                i27 = (i13 == 1 ? 2 : 1) * (2 - (zE5 ? 1 : 0));
            }
            i41 -= (i43 + i44) * i26;
            i42 -= (i45 + i46) * i27;
        }
        int i47 = i41;
        int i48 = iF;
        int i49 = ((i48 == 44 || i48 == 86 || i48 == 100 || i48 == 110 || i48 == 122 || i48 == 244) && (iF2 & 16) != 0) ? 0 : i15;
        float f12 = 1.0f;
        if (jVar.e()) {
            if (jVar.e()) {
                int iF4 = jVar.f(8);
                if (iF4 == 255) {
                    int i51 = i15;
                    int iF5 = jVar.f(i51);
                    int iF6 = jVar.f(i51);
                    if (iF5 != 0 && iF6 != 0) {
                        f12 = iF5 / iF6;
                    }
                } else {
                    float[] fArr = f112711b;
                    if (iF4 < fArr.length) {
                        f12 = fArr[iF4];
                    } else {
                        t.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iF4);
                    }
                }
            }
            if (jVar.e()) {
                jVar.l();
            }
            if (jVar.e()) {
                jVar.m(3);
                i24 = jVar.e() ? 1 : 2;
                if (jVar.e()) {
                    int iF7 = jVar.f(8);
                    int iF8 = jVar.f(8);
                    jVar.m(8);
                    int iK = p7.i.k(iF7);
                    int iL = p7.i.l(iF8);
                    i25 = iK;
                    i23 = iL;
                } else {
                    i23 = -1;
                }
                if (jVar.e()) {
                    jVar.i();
                    jVar.i();
                }
                if (jVar.e()) {
                    jVar.m(65);
                }
                zE2 = jVar.e();
                if (zE2) {
                    I(jVar);
                }
                zE3 = jVar.e();
                if (zE3) {
                    I(jVar);
                }
                if (zE2 || zE3) {
                    jVar.l();
                }
                jVar.l();
                if (jVar.e()) {
                    jVar.l();
                    jVar.i();
                    jVar.i();
                    jVar.i();
                    jVar.i();
                    i49 = jVar.i();
                    jVar.i();
                }
                i22 = i23;
                i21 = i24;
                i18 = i49;
                f11 = f12;
                i19 = i25;
            } else {
                i23 = -1;
                i24 = -1;
            }
            i25 = -1;
            if (jVar.e()) {
                jVar.i();
                jVar.i();
            }
            if (jVar.e()) {
                jVar.m(65);
            }
            zE2 = jVar.e();
            if (zE2) {
                I(jVar);
            }
            zE3 = jVar.e();
            if (zE3) {
                I(jVar);
            }
            if (zE2) {
                jVar.l();
            } else {
                jVar.l();
            }
            jVar.l();
            if (jVar.e()) {
                jVar.l();
                jVar.i();
                jVar.i();
                jVar.i();
                jVar.i();
                i49 = jVar.i();
                jVar.i();
            }
            i22 = i23;
            i21 = i24;
            i18 = i49;
            f11 = f12;
            i19 = i25;
        } else {
            i18 = i49;
            f11 = 1.0f;
            i19 = -1;
            i21 = -1;
            i22 = -1;
        }
        return new m(i48, iF2, iF3, i28, i36, i47, i42, f11, i14, i16, zE, zE5, i33, i34, i17, z11, i19, i21, i22, i18);
    }

    private static void E(t7.j jVar, int i11, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i12 = 1; i12 < i11; i12++) {
            boolean zE = jVar.e();
            int i13 = 0;
            while (i13 < iArr[i12]) {
                if ((i13 <= 0 || !zE) ? i13 == 0 : jVar.e()) {
                    for (int i14 = 0; i14 < iArr2[i12]; i14++) {
                        if (zArr[i12][i14]) {
                            jVar.i();
                        }
                    }
                    jVar.i();
                    jVar.i();
                }
                i13++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void F(t7.j jVar, boolean z11, int i11) {
        ?? r11;
        ?? r12;
        boolean zE;
        boolean zE2;
        if (z11) {
            boolean zE3 = jVar.e();
            boolean zE4 = jVar.e();
            if (zE3 || zE4) {
                zE = jVar.e();
                if (zE) {
                    jVar.m(19);
                }
                jVar.m(8);
                if (zE) {
                    jVar.m(4);
                }
                jVar.m(15);
                r12 = zE4;
                r11 = zE3;
            } else {
                zE = false;
                r12 = zE4;
                r11 = zE3;
            }
        } else {
            r11 = 0;
            r12 = 0;
            zE = false;
        }
        for (int i12 = 0; i12 <= i11; i12++) {
            boolean zE5 = jVar.e();
            if (!zE5) {
                zE5 = jVar.e();
            }
            if (zE5) {
                jVar.i();
                zE2 = false;
            } else {
                zE2 = jVar.e();
            }
            int i13 = !zE2 ? jVar.i() : 0;
            int i14 = r11 + r12;
            for (int i15 = 0; i15 < i14; i15++) {
                for (int i16 = 0; i16 <= i13; i16++) {
                    jVar.i();
                    jVar.i();
                    if (zE) {
                        jVar.i();
                        jVar.i();
                    }
                    jVar.l();
                }
            }
        }
    }

    private static void G(t7.j jVar) {
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 0;
            while (i12 < 6) {
                int i13 = 1;
                if (jVar.e()) {
                    int iMin = Math.min(64, 1 << ((i11 << 1) + 4));
                    if (i11 > 1) {
                        jVar.h();
                    }
                    for (int i14 = 0; i14 < iMin; i14++) {
                        jVar.h();
                    }
                } else {
                    jVar.i();
                }
                if (i11 == 3) {
                    i13 = 3;
                }
                i12 += i13;
            }
        }
    }

    private static void H(t7.j jVar) {
        int i11 = jVar.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            if (i14 == 0 || !jVar.e()) {
                int i15 = jVar.i();
                int i16 = jVar.i();
                int[] iArr2 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr2[i17] = (i17 > 0 ? iArr2[i17 - 1] : 0) - (jVar.i() + 1);
                    jVar.l();
                    i17++;
                }
                int[] iArr3 = new int[i16];
                int i18 = 0;
                while (i18 < i16) {
                    iArr3[i18] = (i18 > 0 ? iArr3[i18 - 1] : 0) + jVar.i() + 1;
                    jVar.l();
                    i18++;
                }
                i12 = i15;
                iArr = iArr2;
                i13 = i16;
                iArrCopyOf = iArr3;
            } else {
                int i19 = i12 + i13;
                int i21 = (1 - ((jVar.e() ? 1 : 0) * 2)) * (jVar.i() + 1);
                int i22 = i19 + 1;
                boolean[] zArr = new boolean[i22];
                for (int i23 = 0; i23 <= i19; i23++) {
                    if (jVar.e()) {
                        zArr[i23] = true;
                    } else {
                        zArr[i23] = jVar.e();
                    }
                }
                int[] iArr4 = new int[i22];
                int[] iArr5 = new int[i22];
                int i24 = 0;
                for (int i25 = i13 - 1; i25 >= 0; i25--) {
                    int i26 = iArrCopyOf[i25] + i21;
                    if (i26 < 0 && zArr[i12 + i25]) {
                        iArr4[i24] = i26;
                        i24++;
                    }
                }
                if (i21 < 0 && zArr[i19]) {
                    iArr4[i24] = i21;
                    i24++;
                }
                for (int i27 = 0; i27 < i12; i27++) {
                    int i28 = iArr[i27] + i21;
                    if (i28 < 0 && zArr[i27]) {
                        iArr4[i24] = i28;
                        i24++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i24);
                int i29 = 0;
                for (int i31 = i12 - 1; i31 >= 0; i31--) {
                    int i32 = iArr[i31] + i21;
                    if (i32 > 0 && zArr[i31]) {
                        iArr5[i29] = i32;
                        i29++;
                    }
                }
                if (i21 > 0 && zArr[i19]) {
                    iArr5[i29] = i21;
                    i29++;
                }
                for (int i33 = 0; i33 < i13; i33++) {
                    int i34 = iArrCopyOf[i33] + i21;
                    if (i34 > 0 && zArr[i12 + i33]) {
                        iArr5[i29] = i34;
                        i29++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i29);
                iArr = iArrCopyOf2;
                i12 = i24;
                i13 = i29;
            }
        }
    }

    private static void I(t7.j jVar) {
        int i11 = jVar.i() + 1;
        jVar.m(8);
        for (int i12 = 0; i12 < i11; i12++) {
            jVar.i();
            jVar.i();
            jVar.l();
        }
        jVar.m(20);
    }

    private static void J(t7.j jVar, int i11) {
        int iH = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i11; i13++) {
            if (iH != 0) {
                iH = ((jVar.h() + i12) + 256) % 256;
            }
            if (iH != 0) {
                i12 = iH;
            }
        }
    }

    private static void K(t7.j jVar, int i11, boolean[][] zArr) {
        int i12 = jVar.i() + 2;
        if (jVar.e()) {
            jVar.m(i12);
        } else {
            for (int i13 = 1; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (zArr[i13][i14]) {
                        jVar.m(i12);
                    }
                }
            }
        }
        int i15 = jVar.i();
        for (int i16 = 1; i16 <= i15; i16++) {
            jVar.m(8);
        }
    }

    public static int L(byte[] bArr, int i11) {
        int i12;
        synchronized (f112712c) {
            int iG = 0;
            int i13 = 0;
            while (iG < i11) {
                try {
                    iG = g(bArr, iG, i11);
                    if (iG < i11) {
                        int[] iArr = f112713d;
                        if (iArr.length <= i13) {
                            f112713d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f112713d[i13] = iG;
                        iG += 3;
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
                int i17 = f112713d[i16] - i15;
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

    private static int a(int i11, int i12, int i13, int i14) {
        return i11 - ((i12 == 1 ? 2 : 1) * (i13 + i14));
    }

    private static int b(int i11, int i12, int i13, int i14) {
        int i15 = 2;
        if (i12 != 1 && i12 != 2) {
            i15 = 1;
        }
        return i11 - (i15 * (i13 + i14));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(t7.j jVar) {
        jVar.m(4);
        int iF = jVar.f(3);
        jVar.l();
        c cVarQ = q(jVar, true, iF, null);
        return s7.k.h(cVarQ.f112719a, cVarQ.f112720b, cVarQ.f112721c, cVarQ.f112722d, cVarQ.f112723e, cVarQ.f112724f);
    }

    public static int e(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        s7.a.h(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            c(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            c(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            c(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b11 = bArr[i15];
            if ((b11 & 254) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b11 == 1) {
                    c(zArr);
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

    private static x<Integer> f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        x.a aVarK = x.k();
        int i11 = 0;
        while (i11 < bArr.length) {
            int iE = e(bArr, i11, bArr.length, zArr);
            if (iE != bArr.length) {
                aVarK.a(Integer.valueOf(iE));
            }
            i11 = iE + 3;
        }
        return aVarK.k();
    }

    private static int g(byte[] bArr, int i11, int i12) {
        while (i11 < i12 - 2) {
            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static String h(List<byte[]> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            byte[] bArr = list.get(i11);
            int length = bArr.length;
            if (length > 3) {
                x<Integer> xVarF = f(bArr);
                for (int i12 = 0; i12 < xVarF.size(); i12++) {
                    if (xVarF.get(i12).intValue() + 3 < length) {
                        t7.j jVar = new t7.j(bArr, xVarF.get(i12).intValue() + 3, length);
                        b bVarP = p(jVar);
                        if (bVarP.f112716a == 33 && bVarP.f112717b == 0) {
                            return d(jVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i11) {
        return bArr[i11 + 3] & 31;
    }

    public static boolean k(byte[] bArr, int i11, int i12, u uVar) {
        if (Objects.equals(uVar.f101544o, "video/avc")) {
            return l(bArr[i11]);
        }
        if (Objects.equals(uVar.f101544o, "video/hevc")) {
            return m(bArr, i11, i12, uVar);
        }
        return true;
    }

    public static boolean l(byte b11) {
        if (((b11 & 96) >> 5) != 0) {
            return true;
        }
        int i11 = b11 & 31;
        return (i11 == 1 || i11 == 9 || i11 == 14) ? false : true;
    }

    private static boolean m(byte[] bArr, int i11, int i12, u uVar) {
        b bVarP = p(new t7.j(bArr, i11, i12 + i11));
        int i13 = bVarP.f112716a;
        if (i13 == 35) {
            return false;
        }
        return (i13 <= 14 && i13 % 2 == 0 && bVarP.f112718c == uVar.F - 1) ? false : true;
    }

    public static boolean n(u uVar, byte b11) {
        return ((Objects.equals(uVar.f101544o, "video/avc") || g0.b(uVar.f101540k, "video/avc")) && (b11 & 31) == 6) || ((Objects.equals(uVar.f101544o, "video/hevc") || g0.b(uVar.f101540k, "video/hevc")) && ((b11 & 126) >> 1) == 39);
    }

    public static int o(u uVar) {
        if (Objects.equals(uVar.f101544o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(uVar.f101544o, "video/hevc") || g0.b(uVar.f101540k, "video/hevc")) ? 2 : 0;
    }

    private static b p(t7.j jVar) {
        jVar.l();
        return new b(jVar.f(6), jVar.f(6), jVar.f(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    private static c q(t7.j jVar, boolean z11, int i11, c cVar) {
        int[] iArr;
        int i12;
        boolean z12;
        int i13;
        int i14;
        boolean zE;
        int iF;
        int i15;
        int i16;
        int[] iArr2 = new int[6];
        if (!z11) {
            if (cVar != null) {
                int i17 = cVar.f112719a;
                zE = cVar.f112720b;
                iF = cVar.f112721c;
                i15 = cVar.f112722d;
                iArr2 = cVar.f112723e;
                i12 = i17;
            } else {
                iArr = iArr2;
                i12 = 0;
                z12 = false;
                i13 = 0;
                i14 = 0;
            }
            int iF2 = jVar.f(8);
            i16 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                if (jVar.e()) {
                    i16 += 88;
                }
                if (jVar.e()) {
                    i16 += 8;
                }
            }
            jVar.m(i16);
            if (i11 > 0) {
                jVar.m((8 - i11) * 2);
            }
            return new c(i12, z12, i13, i14, iArr, iF2);
        }
        int iF3 = jVar.f(2);
        zE = jVar.e();
        iF = jVar.f(5);
        i15 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (jVar.e()) {
                i15 |= 1 << i19;
            }
        }
        for (int i21 = 0; i21 < 6; i21++) {
            iArr2[i21] = jVar.f(8);
        }
        i12 = iF3;
        iArr = iArr2;
        z12 = zE;
        i13 = iF;
        i14 = i15;
        int iF4 = jVar.f(8);
        i16 = 0;
        while (i18 < i11) {
            if (jVar.e()) {
                i16 += 88;
            }
            if (jVar.e()) {
                i16 += 8;
            }
        }
        jVar.m(i16);
        if (i11 > 0) {
            jVar.m((8 - i11) * 2);
        }
        return new c(i12, z12, i13, i14, iArr, iF4);
    }

    private static e r(t7.j jVar) {
        int i11;
        int i12;
        int iF;
        int iF2 = jVar.f(16);
        int iF3 = jVar.f(16);
        if (jVar.e()) {
            int iF4 = jVar.f(2);
            if (iF4 == 3) {
                jVar.l();
            }
            int iF5 = jVar.f(4);
            iF = jVar.f(4);
            i12 = iF5;
            i11 = iF4;
        } else {
            i11 = 0;
            i12 = 0;
            iF = 0;
        }
        if (jVar.e()) {
            int i13 = jVar.i();
            int i14 = jVar.i();
            int i15 = jVar.i();
            int i16 = jVar.i();
            iF2 = b(iF2, i11, i13, i14);
            iF3 = a(iF3, i11, i15, i16);
        }
        return new e(i11, i12, iF, iF2, iF3);
    }

    private static f s(t7.j jVar, int i11) {
        int i12 = jVar.i();
        int i13 = i12 + 1;
        x.a aVarL = x.l(i13);
        int[] iArr = new int[i11];
        for (int i14 = 0; i14 < i13; i14++) {
            aVarL.a(r(jVar));
        }
        int i15 = 1;
        if (i13 <= 1 || !jVar.e()) {
            while (i15 < i11) {
                iArr[i15] = Math.min(i15, i12);
                i15++;
            }
        } else {
            int iD = qu.b.d(i13, RoundingMode.CEILING);
            while (i15 < i11) {
                iArr[i15] = jVar.f(iD);
                i15++;
            }
        }
        return new f(aVarL.k(), iArr);
    }

    public static g t(byte[] bArr, int i11, int i12) {
        byte b11;
        int i13 = i11 + 2;
        int i14 = i12 - 1;
        while (true) {
            b11 = bArr[i14];
            if (b11 != 0 || i14 <= i13) {
                break;
            }
            i14--;
        }
        if (b11 != 0 && i14 > i13) {
            t7.j jVar = new t7.j(bArr, i13, i14 + 1);
            while (jVar.c(16)) {
                int iF = jVar.f(8);
                int i15 = 0;
                while (iF == 255) {
                    i15 += 255;
                    iF = jVar.f(8);
                }
                int i16 = i15 + iF;
                int iF2 = jVar.f(8);
                int i17 = 0;
                while (iF2 == 255) {
                    i17 += 255;
                    iF2 = jVar.f(8);
                }
                int i18 = i17 + iF2;
                if (i18 == 0 || !jVar.c(i18)) {
                    break;
                }
                if (i16 == 176) {
                    int i19 = jVar.i();
                    boolean zE = jVar.e();
                    int i21 = zE ? jVar.i() : 0;
                    int i22 = jVar.i();
                    int i23 = -1;
                    int i24 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int i25 = -1;
                    int iF5 = -1;
                    for (int i26 = 0; i26 <= i22; i26++) {
                        i23 = jVar.i();
                        i24 = jVar.i();
                        iF3 = jVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = jVar.f(iF3 == 0 ? Math.max(0, i19 - 30) : Math.max(0, (iF3 + i19) - 31));
                        if (zE) {
                            int iF6 = jVar.f(6);
                            if (iF6 == 63) {
                                return null;
                            }
                            i25 = iF6;
                            iF5 = jVar.f(iF6 == 0 ? Math.max(0, i21 - 30) : Math.max(0, (iF6 + i21) - 31));
                        }
                        if (jVar.e()) {
                            jVar.m(10);
                        }
                    }
                    return new g(i19, i21, i22 + 1, i23, i24, iF3, iF4, i25, iF5);
                }
                jVar.m(i18 * 8);
            }
        }
        return null;
    }

    public static C2408h u(byte[] bArr, int i11, int i12, k kVar) {
        return v(bArr, i11 + 2, i12, p(new t7.j(bArr, i11, i12)), kVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    public static C2408h v(byte[] bArr, int i11, int i12, b bVar, k kVar) {
        int i13;
        int iA;
        int iB;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iMax;
        float f11;
        int i21;
        int i22;
        int i23;
        int i24;
        j jVar;
        int i25;
        int iK;
        int iL;
        f fVar;
        t7.j jVar2 = new t7.j(bArr, i11, i12);
        jVar2.m(4);
        int iF = jVar2.f(3);
        boolean z11 = bVar.f112717b != 0 && iF == 7;
        int i26 = (kVar == null || kVar.f112765b.isEmpty()) ? 0 : kVar.f112765b.get(Math.min(bVar.f112717b, kVar.f112765b.size() - 1)).f112714a;
        c cVarQ = null;
        if (!z11) {
            jVar2.l();
            cVarQ = q(jVar2, true, iF, null);
        } else if (kVar != null) {
            d dVar = kVar.f112766c;
            int i27 = dVar.f112726b[i26];
            if (dVar.f112725a.size() > i27) {
                cVarQ = kVar.f112766c.f112725a.get(i27);
            }
        }
        int i28 = jVar2.i();
        if (z11) {
            int iF2 = jVar2.e() ? jVar2.f(8) : -1;
            if (kVar == null || (fVar = kVar.f112767d) == null) {
                i16 = 0;
                i15 = 0;
                i18 = 0;
                i19 = 0;
                i14 = 0;
                i13 = 0;
                i17 = 0;
            } else {
                if (iF2 == -1) {
                    iF2 = fVar.f112733b[i26];
                }
                if (iF2 == -1 || fVar.f112732a.size() <= iF2) {
                    i16 = 0;
                    i15 = 0;
                    i18 = 0;
                    i19 = 0;
                    i14 = 0;
                    i13 = 0;
                    i17 = 0;
                } else {
                    e eVar = kVar.f112767d.f112732a.get(iF2);
                    i13 = eVar.f112727a;
                    i17 = eVar.f112730d;
                    i15 = eVar.f112731e;
                    i18 = eVar.f112728b;
                    i14 = eVar.f112729c;
                    i16 = i15;
                    i19 = i17;
                }
            }
        } else {
            i13 = jVar2.i();
            if (i13 == 3) {
                jVar2.l();
            }
            int i29 = jVar2.i();
            int i31 = jVar2.i();
            if (jVar2.e()) {
                int i32 = jVar2.i();
                int i33 = jVar2.i();
                int i34 = jVar2.i();
                int i35 = jVar2.i();
                iB = b(i29, i13, i32, i33);
                iA = a(i31, i13, i34, i35);
            } else {
                iA = i31;
                iB = i29;
            }
            int i36 = jVar2.i();
            i14 = jVar2.i();
            i15 = iA;
            i16 = i31;
            i17 = iB;
            i18 = i36;
            i19 = i29;
        }
        int i37 = jVar2.i();
        if (z11) {
            iMax = -1;
        } else {
            int i38 = jVar2.e() ? 0 : iF;
            iMax = -1;
            while (i38 <= iF) {
                jVar2.i();
                iMax = Math.max(jVar2.i(), iMax);
                jVar2.i();
                i38++;
                i16 = i16;
            }
        }
        int i39 = i16;
        jVar2.i();
        jVar2.i();
        jVar2.i();
        jVar2.i();
        jVar2.i();
        jVar2.i();
        if (jVar2.e()) {
            if (z11 ? jVar2.e() : false) {
                jVar2.m(6);
            } else if (jVar2.e()) {
                G(jVar2);
            }
        }
        int i41 = 2;
        jVar2.m(2);
        if (jVar2.e()) {
            jVar2.m(8);
            jVar2.i();
            jVar2.i();
            jVar2.l();
        }
        H(jVar2);
        if (jVar2.e()) {
            int i42 = jVar2.i();
            int i43 = 0;
            while (i43 < i42) {
                jVar2.m(i37 + 5);
                i43++;
                i41 = 2;
            }
        }
        jVar2.m(i41);
        if (jVar2.e()) {
            if (jVar2.e()) {
                int iF3 = jVar2.f(8);
                if (iF3 == 255) {
                    int iF4 = jVar2.f(16);
                    int iF5 = jVar2.f(16);
                    if (iF4 == 0 || iF5 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = iF4 / iF5;
                    }
                } else {
                    float[] fArr = f112711b;
                    if (iF3 < fArr.length) {
                        f11 = fArr[iF3];
                    } else {
                        t.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iF3);
                        f11 = 1.0f;
                    }
                }
            } else {
                f11 = 1.0f;
            }
            if (jVar2.e()) {
                jVar2.l();
            }
            if (jVar2.e()) {
                jVar2.m(3);
                i24 = jVar2.e() ? 1 : 2;
                if (jVar2.e()) {
                    int iF6 = jVar2.f(8);
                    int iF7 = jVar2.f(8);
                    jVar2.m(8);
                    iK = p7.i.k(iF6);
                    iL = p7.i.l(iF7);
                } else {
                    iK = -1;
                    iL = -1;
                }
            } else if (kVar == null || (jVar = kVar.f112768e) == null || jVar.f112762a.size() <= (i25 = jVar.f112763b[i26])) {
                i24 = -1;
                iK = -1;
                iL = -1;
            } else {
                i iVar = kVar.f112768e.f112762a.get(i25);
                iK = iVar.f112759a;
                int i44 = iVar.f112760b;
                iL = iVar.f112761c;
                i24 = i44;
            }
            if (jVar2.e()) {
                jVar2.i();
                jVar2.i();
            }
            jVar2.l();
            if (jVar2.e()) {
                i15 *= 2;
            }
            i23 = iL;
            i22 = i24;
            i21 = iK;
        } else {
            f11 = 1.0f;
            i21 = -1;
            i22 = -1;
            i23 = -1;
        }
        return new C2408h(bVar, iF, cVarQ, i13, i18, i14, i28, i17, i15, i19, i39, f11, iMax, i21, i22, i23);
    }

    private static i w(t7.j jVar) {
        jVar.m(3);
        int i11 = jVar.e() ? 1 : 2;
        int iK = p7.i.k(jVar.f(8));
        int iL = p7.i.l(jVar.f(8));
        jVar.m(8);
        return new i(iK, i11, iL);
    }

    private static j x(t7.j jVar, int i11, int i12, int[] iArr) {
        if (!jVar.e() ? jVar.e() : true) {
            jVar.l();
        }
        boolean zE = jVar.e();
        boolean zE2 = jVar.e();
        if (zE || zE2) {
            for (int i13 = 0; i13 < i12; i13++) {
                for (int i14 = 0; i14 < iArr[i13]; i14++) {
                    boolean zE3 = zE ? jVar.e() : false;
                    boolean zE4 = zE2 ? jVar.e() : false;
                    if (zE3) {
                        jVar.m(32);
                    }
                    if (zE4) {
                        jVar.m(18);
                    }
                }
            }
        }
        boolean zE5 = jVar.e();
        int iF = zE5 ? jVar.f(4) + 1 : i11;
        x.a aVarL = x.l(iF);
        int[] iArr2 = new int[i11];
        for (int i15 = 0; i15 < iF; i15++) {
            aVarL.a(w(jVar));
        }
        if (zE5 && iF > 1) {
            for (int i16 = 0; i16 < i11; i16++) {
                iArr2[i16] = jVar.f(4);
            }
        }
        return new j(aVarL.k(), iArr2);
    }

    public static k y(byte[] bArr, int i11, int i12) {
        t7.j jVar = new t7.j(bArr, i11, i12);
        return z(jVar, p(jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k z(t7.j jVar, b bVar) {
        int[] iArr;
        int i11;
        int i12;
        j jVarX;
        int i13;
        int i14;
        int i15;
        int[] iArr2;
        x xVar;
        int i16;
        boolean[][] zArr;
        int[] iArr3;
        int i17;
        jVar.m(4);
        boolean zE = jVar.e();
        boolean zE2 = jVar.e();
        int iF = jVar.f(6);
        int i18 = iF + 1;
        int iF2 = jVar.f(3);
        jVar.m(17);
        c cVarQ = q(jVar, true, iF2, null);
        boolean z11 = false;
        for (int i19 = jVar.e() ? 0 : iF2; i19 <= iF2; i19++) {
            jVar.i();
            jVar.i();
            jVar.i();
        }
        int iF3 = jVar.f(6);
        int i21 = jVar.i() + 1;
        d dVar = new d(x.s(cVarQ), new int[1]);
        Object[] objArr = i18 >= 2 && i21 >= 2;
        Object[] objArr2 = zE && zE2;
        int i22 = iF3 + 1;
        Object[] objArr3 = i22 >= i18;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, i21, i22);
        int i23 = 1;
        int[] iArr5 = new int[i21];
        int[] iArr6 = new int[i21];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i24 = 1; i24 < i21; i24++) {
            int i25 = 0;
            for (int i26 = 0; i26 <= iF3; i26++) {
                if (jVar.e()) {
                    iArr4[i24][i25] = i26;
                    iArr6[i24] = i26;
                    i25++;
                }
                iArr5[i24] = i25;
            }
        }
        if (jVar.e()) {
            jVar.m(64);
            if (jVar.e()) {
                jVar.i();
            }
            int i27 = jVar.i();
            int i28 = 0;
            while (i28 < i27) {
                jVar.i();
                if (i28 == 0 || jVar.e()) {
                    z11 = true;
                }
                F(jVar, z11, iF2);
                i28++;
                z11 = false;
            }
        }
        if (!jVar.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        jVar.b();
        c cVarQ2 = q(jVar, false, iF2, cVarQ);
        boolean zE3 = jVar.e();
        int i29 = 6;
        boolean[] zArr2 = new boolean[16];
        int i31 = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            boolean zE4 = jVar.e();
            zArr2[i32] = zE4;
            if (zE4) {
                i31++;
            }
        }
        if (i31 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr7 = new int[i31];
        for (int i33 = 0; i33 < i31 - (zE3 ? 1 : 0); i33++) {
            iArr7[i33] = jVar.f(3);
        }
        int[] iArr8 = new int[i31 + 1];
        if (zE3) {
            int i34 = 1;
            while (i34 < i31) {
                int[] iArr9 = iArr8;
                for (int i35 = 0; i35 < i34; i35++) {
                    iArr9[i34] = iArr9[i34] + iArr7[i35] + 1;
                }
                i34++;
                iArr8 = iArr9;
            }
            iArr = iArr8;
            iArr[i31] = 6;
        } else {
            iArr = iArr8;
        }
        int[][] iArr10 = (int[][]) Array.newInstance((Class<?>) cls, i18, i31);
        int[] iArr11 = new int[i18];
        iArr11[0] = 0;
        boolean zE5 = jVar.e();
        int i36 = 1;
        while (i36 < i18) {
            if (zE5) {
                i17 = i36;
                iArr11[i17] = jVar.f(i29);
            } else {
                i17 = i36;
                iArr11[i17] = i17;
            }
            if (zE3) {
                int i37 = 0;
                while (i37 < i31) {
                    int i38 = i37 + 1;
                    iArr10[i17][i37] = (iArr11[i17] & ((1 << iArr[i38]) - 1)) >> iArr[i37];
                    i37 = i38;
                }
            } else {
                int i39 = 0;
                while (i39 < i31) {
                    int i41 = i39;
                    iArr10[i17][i41] = jVar.f(iArr7[i39] + 1);
                    i39 = i41 + 1;
                }
            }
            i36 = i17 + 1;
            i29 = 6;
        }
        int[] iArr12 = new int[i22];
        int i42 = 1;
        int i43 = 0;
        while (i43 < i18) {
            iArr12[iArr11[i43]] = -1;
            int[] iArr13 = iArr12;
            int i44 = 0;
            int i45 = 0;
            while (i44 < 16) {
                if (zArr2[i44]) {
                    if (i44 == i23) {
                        iArr13[iArr11[i43]] = iArr10[i43][i45];
                    }
                    i45++;
                }
                i44++;
                i23 = 1;
            }
            if (i43 > 0) {
                int i46 = 0;
                while (true) {
                    if (i46 >= i43) {
                        i42++;
                        break;
                    }
                    int i47 = i46;
                    if (iArr13[iArr11[i43]] == iArr13[iArr11[i46]]) {
                        break;
                    }
                    i46 = i47 + 1;
                }
            }
            i43++;
            iArr12 = iArr13;
            i23 = 1;
        }
        int[] iArr14 = iArr12;
        int iF4 = jVar.f(4);
        if (i42 < 2 || iF4 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr15 = new int[i42];
        for (int i48 = 0; i48 < i42; i48++) {
            iArr15[i48] = jVar.f(iF4);
        }
        int[] iArr16 = new int[i22];
        int i49 = 0;
        while (i49 < i18) {
            int[] iArr17 = iArr16;
            iArr17[Math.min(iArr11[i49], iF3)] = i49;
            i49++;
            iArr16 = iArr17;
        }
        int[] iArr18 = iArr16;
        x.a aVarK = x.k();
        int i51 = 0;
        while (i51 <= iF3) {
            int i52 = i42;
            int[] iArr19 = iArr6;
            int iMin = Math.min(iArr14[i51], i52 - 1);
            aVarK.a(new a(iArr18[i51], iMin >= 0 ? iArr15[iMin] : -1));
            i51++;
            i42 = i52;
            iArr6 = iArr19;
            iArr15 = iArr15;
        }
        int[] iArr20 = iArr6;
        x xVarK = aVarK.k();
        if (((a) xVarK.get(0)).f112715b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i53 = 1;
        while (true) {
            if (i53 > iF3) {
                i11 = -1;
                i12 = -1;
                break;
            }
            i11 = -1;
            if (((a) xVarK.get(i53)).f112715b != -1) {
                i12 = i53;
                break;
            }
            i53++;
        }
        if (i12 == i11) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i54 = 1;
        while (i54 < i18) {
            boolean[][] zArr5 = zArr4;
            for (int i55 = 0; i55 < i54; i55++) {
                boolean[] zArr6 = zArr3[i54];
                boolean[] zArr7 = zArr5[i54];
                boolean zE6 = jVar.e();
                zArr7[i55] = zE6;
                zArr6[i55] = zE6;
            }
            i54++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i56 = 1; i56 < i18; i56++) {
            int i57 = 0;
            while (i57 < iF) {
                int[] iArr21 = iArr11;
                for (int i58 = 0; i58 < i56; i58++) {
                    boolean[] zArr9 = zArr8[i56];
                    if (zArr9[i58] && zArr8[i58][i57]) {
                        zArr9[i57] = true;
                        break;
                    }
                }
                i57++;
                iArr11 = iArr21;
            }
        }
        int[] iArr22 = iArr11;
        int[] iArr23 = new int[i22];
        for (int i59 = 0; i59 < i18; i59++) {
            int i61 = 0;
            for (int i62 = 0; i62 < i59; i62++) {
                i61 += zArr3[i59][i62] ? 1 : 0;
            }
            iArr23[iArr22[i59]] = i61;
        }
        int i63 = 0;
        for (int i64 = 0; i64 < i18; i64++) {
            if (iArr23[iArr22[i64]] == 0) {
                i63++;
            }
        }
        if (i63 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr24 = new int[i18];
        int[] iArr25 = new int[i21];
        if (jVar.e()) {
            int i65 = 0;
            while (i65 < i18) {
                int i66 = i65;
                iArr24[i66] = jVar.f(3);
                i65 = i66 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i18, iF2);
        }
        int i67 = 0;
        while (i67 < i21) {
            int i68 = i67;
            boolean[][] zArr10 = zArr3;
            int[] iArr26 = iArr24;
            int iMax = 0;
            for (int i69 = 0; i69 < iArr5[i68]; i69++) {
                iMax = Math.max(iMax, iArr26[((a) xVarK.get(iArr4[i68][i69])).f112714a]);
            }
            iArr25[i68] = iMax + 1;
            i67 = i68 + 1;
            iArr24 = iArr26;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (jVar.e()) {
            int i71 = 0;
            while (i71 < iF) {
                int i72 = i71 + 1;
                int i73 = i72;
                while (i73 < i18) {
                    if (zArr11[i73][i71]) {
                        jVar.m(3);
                    }
                    i73++;
                    i71 = i71;
                }
                i71 = i72;
            }
        }
        jVar.l();
        int i74 = jVar.i() + 1;
        x.a aVarK2 = x.k();
        aVarK2.a(cVarQ);
        if (i74 > 1) {
            aVarK2.a(cVarQ2);
            for (int i75 = 2; i75 < i74; i75++) {
                cVarQ2 = q(jVar, jVar.e(), iF2, cVarQ2);
                aVarK2.a(cVarQ2);
            }
        }
        x xVarK2 = aVarK2.k();
        int i76 = jVar.i() + i21;
        if (i76 > i21) {
            return new k(bVar, null, dVar, null, null);
        }
        int iF5 = jVar.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i76, i22);
        int[] iArr27 = new int[i76];
        int i77 = 0;
        int[] iArr28 = new int[i76];
        int i78 = 0;
        while (i78 < i21) {
            iArr27[i78] = i77;
            iArr28[i78] = iArr20[i78];
            if (iF5 == 0) {
                i16 = i78;
                zArr = zArr12;
                xVar = xVarK2;
                iArr3 = iArr27;
                Arrays.fill(zArr12[i16], i77, iArr5[i16], true);
                iArr3[i16] = iArr5[i16];
            } else {
                xVar = xVarK2;
                i16 = i78;
                zArr = zArr12;
                iArr3 = iArr27;
                if (iF5 == 1) {
                    int i79 = iArr20[i16];
                    for (int i81 = 0; i81 < iArr5[i16]; i81++) {
                        zArr[i16][i81] = iArr4[i16][i81] == i79;
                    }
                    iArr3[i16] = 1;
                } else {
                    i77 = 0;
                    zArr[0][0] = true;
                    iArr3[0] = 1;
                }
                i78 = i16 + 1;
                zArr12 = zArr;
                iArr27 = iArr3;
                xVarK2 = xVar;
            }
            i77 = 0;
            i78 = i16 + 1;
            zArr12 = zArr;
            iArr27 = iArr3;
            xVarK2 = xVar;
        }
        x xVar2 = xVarK2;
        boolean[][] zArr13 = zArr12;
        int[] iArr29 = iArr27;
        int[] iArr30 = new int[i22];
        int i82 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i22;
        iArr31[i77] = i76;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i83 = 1;
        int i84 = 0;
        while (i83 < i76) {
            if (iF5 == i82) {
                for (int i85 = 0; i85 < iArr5[i83]; i85++) {
                    zArr13[i83][i85] = jVar.e();
                    int i86 = iArr29[i83];
                    boolean z12 = zArr13[i83][i85];
                    iArr29[i83] = i86 + (z12 ? 1 : 0);
                    if (z12) {
                        iArr28[i83] = iArr4[i83][i85];
                    }
                }
            }
            if (i84 == 0) {
                i13 = 0;
                if (iArr4[i83][0] == 0 && zArr13[i83][0]) {
                    for (int i87 = 1; i87 < iArr5[i83]; i87++) {
                        if (iArr4[i83][i87] == i12 && zArr13[i83][i12]) {
                            i84 = i83;
                        }
                    }
                }
            } else {
                i13 = 0;
            }
            int i88 = i13;
            while (i88 < iArr5[i83]) {
                if (i74 > 1) {
                    zArr14[i83][i88] = zArr13[i83][i88];
                    i15 = i12;
                    iArr2 = iArr30;
                    i14 = i74;
                    int iD = qu.b.d(i74, RoundingMode.CEILING);
                    if (!zArr14[i83][i88]) {
                        int i89 = ((a) xVarK.get(iArr4[i83][i88])).f112714a;
                        int i91 = i13;
                        while (i91 < i88) {
                            int i92 = i89;
                            if (zArr8[i92][((a) xVarK.get(iArr4[i83][i91])).f112714a]) {
                                zArr14[i83][i88] = true;
                                break;
                            }
                            i91++;
                            i89 = i92;
                        }
                    }
                    if (zArr14[i83][i88]) {
                        if (i84 <= 0 || i83 != i84) {
                            jVar.m(iD);
                        } else {
                            iArr2[i88] = jVar.f(iD);
                        }
                    }
                } else {
                    i14 = i74;
                    i15 = i12;
                    iArr2 = iArr30;
                }
                i88++;
                i12 = i15;
                iArr30 = iArr2;
                i74 = i14;
            }
            int i93 = i74;
            int i94 = i12;
            int[] iArr32 = iArr30;
            if (iArr29[i83] == 1 && iArr23[iArr28[i83]] > 0) {
                jVar.l();
            }
            i83++;
            i12 = i94;
            iArr30 = iArr32;
            i74 = i93;
            i82 = 2;
        }
        int[] iArr33 = iArr30;
        if (i84 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        f fVarS = s(jVar, i18);
        jVar.m(2);
        for (int i95 = 1; i95 < i18; i95++) {
            if (iArr23[iArr22[i95]] == 0) {
                jVar.l();
            }
        }
        E(jVar, i76, iArr25, iArr5, zArr14);
        K(jVar, i18, zArr11);
        if (jVar.e()) {
            jVar.b();
            jVarX = x(jVar, i18, i21, iArr25);
        } else {
            jVarX = null;
        }
        return new k(bVar, xVarK, new d(xVar2, iArr33), fVarS, jVarX);
    }
}
