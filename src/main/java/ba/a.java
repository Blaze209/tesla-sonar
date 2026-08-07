package ba;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import s7.b0;
import s7.c0;
import s7.n;
import s7.q0;
import s7.t;
import t9.d;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f16926a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f16927b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f16928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f16929d;

    private static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int[] f16933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f16935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Rect f16936g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f16930a = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f16937h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f16938i = -1;

        /* JADX INFO: renamed from: ba.a$b$a, reason: collision with other inner class name */
        private static final class C0338a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16940b;

            private C0338a() {
            }
        }

        private static int b(int[] iArr, int i11) {
            return (i11 < 0 || i11 >= iArr.length) ? iArr[0] : iArr[i11];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void d(int[] iArr, c0 c0Var, int i11) {
            while (c0Var.g() < i11 && c0Var.a() > 0) {
                switch (c0Var.M()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!g(iArr, c0Var)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!e(c0Var)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!f(c0Var)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!h(c0Var)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private boolean e(c0 c0Var) {
            if (c0Var.a() < 2 || !this.f16932c) {
                return false;
            }
            int iM = c0Var.M();
            int iM2 = c0Var.M();
            int[] iArr = this.f16930a;
            iArr[3] = n(iArr[3], iM >> 4);
            int[] iArr2 = this.f16930a;
            iArr2[2] = n(iArr2[2], iM & 15);
            int[] iArr3 = this.f16930a;
            iArr3[1] = n(iArr3[1], iM2 >> 4);
            int[] iArr4 = this.f16930a;
            iArr4[0] = n(iArr4[0], iM2 & 15);
            return true;
        }

        private boolean f(c0 c0Var) {
            if (c0Var.a() < 6) {
                return false;
            }
            int iM = c0Var.M();
            int iM2 = c0Var.M();
            int i11 = (iM << 4) | (iM2 >> 4);
            int iM3 = ((iM2 & 15) << 8) | c0Var.M();
            int iM4 = c0Var.M();
            int iM5 = c0Var.M();
            this.f16936g = new Rect(i11, (iM4 << 4) | (iM5 >> 4), iM3 + 1, (c0Var.M() | ((iM5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, c0 c0Var) {
            if (c0Var.a() < 2) {
                return false;
            }
            int iM = c0Var.M();
            int iM2 = c0Var.M();
            this.f16930a[3] = b(iArr, iM >> 4);
            this.f16930a[2] = b(iArr, iM & 15);
            this.f16930a[1] = b(iArr, iM2 >> 4);
            this.f16930a[0] = b(iArr, iM2 & 15);
            this.f16932c = true;
            return true;
        }

        private boolean h(c0 c0Var) {
            if (c0Var.a() < 4) {
                return false;
            }
            this.f16937h = c0Var.U();
            this.f16938i = c0Var.U();
            return true;
        }

        private void j(b0 b0Var, boolean z11, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i11 = !z11 ? 1 : 0;
            int i12 = i11 * iWidth;
            C0338a c0338a = new C0338a();
            while (true) {
                int i13 = 0;
                do {
                    k(b0Var, iWidth, c0338a);
                    int iMin = Math.min(c0338a.f16940b, iWidth - i13);
                    if (iMin > 0) {
                        int i14 = i12 + iMin;
                        Arrays.fill(iArr, i12, i14, this.f16930a[c0338a.f16939a]);
                        i13 += iMin;
                        i12 = i14;
                    }
                } while (i13 < iWidth);
                i11 += 2;
                if (i11 >= iHeight) {
                    return;
                }
                i12 = i11 * iWidth;
                b0Var.c();
            }
        }

        private static void k(b0 b0Var, int i11, C0338a c0338a) {
            int iH = 0;
            for (int i12 = 1; iH < i12 && i12 <= 64; i12 <<= 2) {
                if (b0Var.b() < 4) {
                    c0338a.f16939a = -1;
                    c0338a.f16940b = 0;
                    return;
                }
                iH = (iH << 4) | b0Var.h(4);
            }
            c0338a.f16939a = iH & 3;
            if (iH >= 4) {
                i11 = iH >> 2;
            }
            c0338a.f16940b = i11;
        }

        private static int n(int i11, int i12) {
            return (i11 & 16777215) | ((i12 * 17) << 24);
        }

        public r7.a a(c0 c0Var) {
            Rect rect;
            if (this.f16933d == null || !this.f16931b || !this.f16932c || (rect = this.f16936g) == null || this.f16937h == -1 || this.f16938i == -1 || rect.width() < 2 || this.f16936g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f16936g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            b0 b0Var = new b0();
            c0Var.b0(this.f16937h);
            b0Var.m(c0Var);
            j(b0Var, true, rect2, iArr);
            c0Var.b0(this.f16938i);
            b0Var.m(c0Var);
            j(b0Var, false, rect2, iArr);
            return new r7.a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f16934e).l(0).h(rect2.top / this.f16935f, 0).i(0).n(rect2.width() / this.f16934e).g(rect2.height() / this.f16935f).a();
        }

        public void i(String str) {
            for (String str2 : q0.E1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrE1 = q0.E1(str2.substring(9), ",");
                    this.f16933d = new int[strArrE1.length];
                    for (int i11 = 0; i11 < strArrE1.length; i11++) {
                        this.f16933d[i11] = c(strArrE1[i11].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrE2 = q0.E1(str2.substring(6).trim(), "x");
                    if (strArrE2.length == 2) {
                        try {
                            this.f16934e = Integer.parseInt(strArrE2[0]);
                            this.f16935f = Integer.parseInt(strArrE2[1]);
                            this.f16931b = true;
                        } catch (RuntimeException e11) {
                            t.j("VobsubParser", "Parsing IDX failed", e11);
                        }
                    }
                }
            }
        }

        public void l(c0 c0Var) {
            int[] iArr = this.f16933d;
            if (iArr == null || !this.f16931b) {
                return;
            }
            c0Var.c0(c0Var.U() - 2);
            d(iArr, c0Var, c0Var.U());
        }

        public void m() {
            this.f16932c = false;
            this.f16936g = null;
            this.f16937h = -1;
            this.f16938i = -1;
        }
    }

    public a(List<byte[]> list) {
        b bVar = new b();
        this.f16928c = bVar;
        bVar.i(new String(list.get(0), StandardCharsets.UTF_8));
    }

    private r7.a d() {
        if (this.f16929d == null) {
            this.f16929d = new Inflater();
        }
        if (q0.Y0(this.f16926a, this.f16927b, this.f16929d)) {
            this.f16926a.Z(this.f16927b.f(), this.f16927b.j());
        }
        this.f16928c.m();
        int iA = this.f16926a.a();
        if (iA < 2 || this.f16926a.U() != iA) {
            return null;
        }
        this.f16928c.l(this.f16926a);
        return this.f16928c.a(this.f16926a);
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<d> nVar) {
        this.f16926a.Z(bArr, i12 + i11);
        this.f16926a.b0(i11);
        r7.a aVarD = d();
        nVar.accept(new d(aVarD != null ? x.s(aVarD) : x.r(), -9223372036854775807L, 5000000L));
    }

    @Override // t9.q
    public int b() {
        return 2;
    }
}
