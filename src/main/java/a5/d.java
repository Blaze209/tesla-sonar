package a5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f293s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f294t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f295u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f296v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f297w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f299y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f304e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final c f314o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f317r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f300a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f301b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f302c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, i> f303d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f305f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f306g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f308i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f309j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f310k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f311l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f312m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f313n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i[] f315p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f316q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    a5.b[] f307h = new a5.b[32];

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    static class b extends a5.b {
        b(c cVar) {
            this.f287e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f314o = cVar;
        this.f304e = new h(cVar);
        if (f297w) {
            this.f317r = new b(cVar);
        } else {
            this.f317r = new a5.b(cVar);
        }
    }

    private int C(a aVar, boolean z11) {
        for (int i11 = 0; i11 < this.f311l; i11++) {
            this.f310k[i11] = false;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            i12++;
            if (i12 < this.f311l * 2) {
                if (aVar.getKey() != null) {
                    this.f310k[aVar.getKey().f333c] = true;
                }
                i iVarA = aVar.a(this, this.f310k);
                if (iVarA != null) {
                    boolean[] zArr = this.f310k;
                    int i13 = iVarA.f333c;
                    if (!zArr[i13]) {
                        zArr[i13] = true;
                    }
                }
                if (iVarA != null) {
                    float f11 = Float.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < this.f312m; i15++) {
                        a5.b bVar = this.f307h[i15];
                        if (bVar.f283a.f340j != i.a.UNRESTRICTED && !bVar.f288f && bVar.t(iVarA)) {
                            float fH = bVar.f287e.h(iVarA);
                            if (fH < BitmapDescriptorFactory.HUE_RED) {
                                float f12 = (-bVar.f284b) / fH;
                                if (f12 < f11) {
                                    i14 = i15;
                                    f11 = f12;
                                }
                            }
                        }
                    }
                    if (i14 > -1) {
                        a5.b bVar2 = this.f307h[i14];
                        bVar2.f283a.f334d = -1;
                        bVar2.x(iVarA);
                        i iVar = bVar2.f283a;
                        iVar.f334d = i14;
                        iVar.h(this, bVar2);
                    }
                } else {
                    z12 = true;
                }
            }
            return i12;
        }
        return i12;
    }

    private void D() {
        int i11 = 0;
        if (f297w) {
            while (i11 < this.f312m) {
                a5.b bVar = this.f307h[i11];
                if (bVar != null) {
                    this.f314o.f289a.a(bVar);
                }
                this.f307h[i11] = null;
                i11++;
            }
            return;
        }
        while (i11 < this.f312m) {
            a5.b bVar2 = this.f307h[i11];
            if (bVar2 != null) {
                this.f314o.f290b.a(bVar2);
            }
            this.f307h[i11] = null;
            i11++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f314o.f291c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.g(aVar, str);
        } else {
            iVarB.e();
            iVarB.g(aVar, str);
        }
        int i11 = this.f316q;
        int i12 = this.f300a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f300a = i13;
            this.f315p = (i[]) Arrays.copyOf(this.f315p, i13);
        }
        i[] iVarArr = this.f315p;
        int i14 = this.f316q;
        this.f316q = i14 + 1;
        iVarArr[i14] = iVarB;
        return iVarB;
    }

    private void l(a5.b bVar) {
        int i11;
        if (f295u && bVar.f288f) {
            bVar.f283a.f(this, bVar.f284b);
        } else {
            a5.b[] bVarArr = this.f307h;
            int i12 = this.f312m;
            bVarArr[i12] = bVar;
            i iVar = bVar.f283a;
            iVar.f334d = i12;
            this.f312m = i12 + 1;
            iVar.h(this, bVar);
        }
        if (f295u && this.f301b) {
            int i13 = 0;
            while (i13 < this.f312m) {
                if (this.f307h[i13] == null) {
                    System.out.println("WTF");
                }
                a5.b bVar2 = this.f307h[i13];
                if (bVar2 != null && bVar2.f288f) {
                    bVar2.f283a.f(this, bVar2.f284b);
                    if (f297w) {
                        this.f314o.f289a.a(bVar2);
                    } else {
                        this.f314o.f290b.a(bVar2);
                    }
                    this.f307h[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f312m;
                        if (i14 >= i11) {
                            break;
                        }
                        a5.b[] bVarArr2 = this.f307h;
                        int i16 = i14 - 1;
                        a5.b bVar3 = bVarArr2[i14];
                        bVarArr2[i16] = bVar3;
                        i iVar2 = bVar3.f283a;
                        if (iVar2.f334d == i14) {
                            iVar2.f334d = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f307h[i15] = null;
                    }
                    this.f312m = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f301b = false;
        }
    }

    private void n() {
        for (int i11 = 0; i11 < this.f312m; i11++) {
            a5.b bVar = this.f307h[i11];
            bVar.f283a.f336f = bVar.f284b;
        }
    }

    public static a5.b s(d dVar, i iVar, i iVar2, float f11) {
        return dVar.r().j(iVar, iVar2, f11);
    }

    private int u(a aVar) {
        float f11;
        for (int i11 = 0; i11 < this.f312m; i11++) {
            a5.b bVar = this.f307h[i11];
            if (bVar.f283a.f340j != i.a.UNRESTRICTED) {
                float f12 = bVar.f284b;
                float f13 = BitmapDescriptorFactory.HUE_RED;
                if (f12 < BitmapDescriptorFactory.HUE_RED) {
                    boolean z11 = false;
                    int i12 = 0;
                    while (!z11) {
                        i12++;
                        float f14 = Float.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i13 >= this.f312m) {
                                break;
                            }
                            a5.b bVar2 = this.f307h[i13];
                            if (bVar2.f283a.f340j == i.a.UNRESTRICTED || bVar2.f288f || bVar2.f284b >= f13) {
                                f11 = f13;
                            } else if (f296v) {
                                int i17 = bVar2.f287e.i();
                                int i18 = 0;
                                while (i18 < i17) {
                                    i iVarA = bVar2.f287e.a(i18);
                                    float fH = bVar2.f287e.h(iVarA);
                                    if (fH > f13) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = iVarA.f338h[i19] / fH;
                                            if ((f15 < f14 && i19 == i16) || i19 > i16) {
                                                i16 = i19;
                                                i15 = iVarA.f333c;
                                                i14 = i13;
                                                f14 = f15;
                                            }
                                        }
                                    }
                                    i18++;
                                    f13 = f13;
                                }
                                f11 = f13;
                            } else {
                                f11 = f13;
                                for (int i21 = 1; i21 < this.f311l; i21++) {
                                    i iVar = this.f314o.f292d[i21];
                                    float fH2 = bVar2.f287e.h(iVar);
                                    if (fH2 > f11) {
                                        for (int i22 = 0; i22 < 9; i22++) {
                                            float f16 = iVar.f338h[i22] / fH2;
                                            if ((f16 < f14 && i22 == i16) || i22 > i16) {
                                                i16 = i22;
                                                i14 = i13;
                                                i15 = i21;
                                                f14 = f16;
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                            f13 = f11;
                        }
                        float f17 = f13;
                        if (i14 != -1) {
                            a5.b bVar3 = this.f307h[i14];
                            bVar3.f283a.f334d = -1;
                            bVar3.x(this.f314o.f292d[i15]);
                            i iVar2 = bVar3.f283a;
                            iVar2.f334d = i14;
                            iVar2.h(this, bVar3);
                        } else {
                            z11 = true;
                        }
                        if (i12 > this.f311l / 2) {
                            z11 = true;
                        }
                        f13 = f17;
                    }
                    return i12;
                }
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i11 = this.f305f * 2;
        this.f305f = i11;
        this.f307h = (a5.b[]) Arrays.copyOf(this.f307h, i11);
        c cVar = this.f314o;
        cVar.f292d = (i[]) Arrays.copyOf(cVar.f292d, this.f305f);
        int i12 = this.f305f;
        this.f310k = new boolean[i12];
        this.f306g = i12;
        this.f313n = i12;
    }

    public void A() {
        if (this.f304e.isEmpty()) {
            n();
            return;
        }
        if (!this.f308i && !this.f309j) {
            B(this.f304e);
            return;
        }
        for (int i11 = 0; i11 < this.f312m; i11++) {
            if (!this.f307h[i11].f288f) {
                B(this.f304e);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i11 = 0;
        while (true) {
            cVar = this.f314o;
            i[] iVarArr = cVar.f292d;
            if (i11 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i11];
            if (iVar != null) {
                iVar.e();
            }
            i11++;
        }
        cVar.f291c.c(this.f315p, this.f316q);
        this.f316q = 0;
        Arrays.fill(this.f314o.f292d, (Object) null);
        HashMap<String, i> map = this.f303d;
        if (map != null) {
            map.clear();
        }
        this.f302c = 0;
        this.f304e.clear();
        this.f311l = 1;
        for (int i12 = 0; i12 < this.f312m; i12++) {
            a5.b bVar = this.f307h[i12];
            if (bVar != null) {
                bVar.f285c = false;
            }
        }
        D();
        this.f312m = 0;
        if (f297w) {
            this.f317r = new b(this.f314o);
        } else {
            this.f317r = new a5.b(this.f314o);
        }
    }

    public void b(d5.e eVar, d5.e eVar2, float f11, int i11) {
        d5.d.a aVar = d5.d.a.LEFT;
        i iVarQ = q(eVar.q(aVar));
        d5.d.a aVar2 = d5.d.a.TOP;
        i iVarQ2 = q(eVar.q(aVar2));
        d5.d.a aVar3 = d5.d.a.RIGHT;
        i iVarQ3 = q(eVar.q(aVar3));
        d5.d.a aVar4 = d5.d.a.BOTTOM;
        i iVarQ4 = q(eVar.q(aVar4));
        i iVarQ5 = q(eVar2.q(aVar));
        i iVarQ6 = q(eVar2.q(aVar2));
        i iVarQ7 = q(eVar2.q(aVar3));
        i iVarQ8 = q(eVar2.q(aVar4));
        a5.b bVarR = r();
        double d11 = f11;
        double d12 = i11;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d11) * d12));
        d(bVarR);
        a5.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d11) * d12));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i11, float f11, i iVar3, i iVar4, int i12, int i13) {
        a5.b bVarR = r();
        bVarR.h(iVar, iVar2, i11, f11, iVar3, iVar4, i12);
        if (i13 != 8) {
            bVarR.d(this, i13);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public void d(a5.b bVar) {
        i iVarV;
        if (bVar == null) {
            return;
        }
        boolean z11 = true;
        if (this.f312m + 1 >= this.f313n || this.f311l + 1 >= this.f306g) {
            z();
        }
        boolean z12 = false;
        if (!bVar.f288f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f283a = iVarP;
                int i11 = this.f312m;
                l(bVar);
                if (this.f312m == i11 + 1) {
                    this.f317r.b(bVar);
                    C(this.f317r, true);
                    if (iVarP.f334d == -1) {
                        if (bVar.f283a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f288f) {
                            bVar.f283a.h(this, bVar);
                        }
                        if (f297w) {
                            this.f314o.f289a.a(bVar);
                        } else {
                            this.f314o.f290b.a(bVar);
                        }
                        this.f312m--;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z12 = z11;
            }
        }
        if (z12) {
            return;
        }
        l(bVar);
    }

    public a5.b e(i iVar, i iVar2, int i11, int i12) {
        if (f294t && i12 == 8 && iVar2.f337g && iVar.f334d == -1) {
            iVar.f(this, iVar2.f336f + i11);
            return null;
        }
        a5.b bVarR = r();
        bVarR.n(iVar, iVar2, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i11) {
        if (f294t && iVar.f334d == -1) {
            float f11 = i11;
            iVar.f(this, f11);
            for (int i12 = 0; i12 < this.f302c + 1; i12++) {
                i iVar2 = this.f314o.f292d[i12];
                if (iVar2 != null && iVar2.f344n && iVar2.f345o == iVar.f333c) {
                    iVar2.f(this, iVar2.f346p + f11);
                }
            }
            return;
        }
        int i13 = iVar.f334d;
        if (i13 == -1) {
            a5.b bVarR = r();
            bVarR.i(iVar, i11);
            d(bVarR);
            return;
        }
        a5.b bVar = this.f307h[i13];
        if (bVar.f288f) {
            bVar.f284b = i11;
            return;
        }
        if (bVar.f287e.i() == 0) {
            bVar.f288f = true;
            bVar.f284b = i11;
        } else {
            a5.b bVarR2 = r();
            bVarR2.m(iVar, i11);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i11, boolean z11) {
        a5.b bVarR = r();
        i iVarT = t();
        iVarT.f335e = 0;
        bVarR.o(iVar, iVar2, iVarT, i11);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i11, int i12) {
        a5.b bVarR = r();
        i iVarT = t();
        iVarT.f335e = 0;
        bVarR.o(iVar, iVar2, iVarT, i11);
        if (i12 != 8) {
            m(bVarR, (int) (bVarR.f287e.h(iVarT) * (-1.0f)), i12);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i11, boolean z11) {
        a5.b bVarR = r();
        i iVarT = t();
        iVarT.f335e = 0;
        bVarR.p(iVar, iVar2, iVarT, i11);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i11, int i12) {
        a5.b bVarR = r();
        i iVarT = t();
        iVarT.f335e = 0;
        bVarR.p(iVar, iVar2, iVarT, i11);
        if (i12 != 8) {
            m(bVarR, (int) (bVarR.f287e.h(iVarT) * (-1.0f)), i12);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f11, int i11) {
        a5.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f11);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
    }

    void m(a5.b bVar, int i11, int i12) {
        bVar.e(o(i12, null), i11);
    }

    public i o(int i11, String str) {
        if (this.f311l + 1 >= this.f306g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i12 = this.f302c + 1;
        this.f302c = i12;
        this.f311l++;
        iVarA.f333c = i12;
        iVarA.f335e = i11;
        this.f314o.f292d[i12] = iVarA;
        this.f304e.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f311l + 1 >= this.f306g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i11 = this.f302c + 1;
        this.f302c = i11;
        this.f311l++;
        iVarA.f333c = i11;
        this.f314o.f292d[i11] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f311l + 1 >= this.f306g) {
            z();
        }
        if (obj instanceof d5.d) {
            d5.d dVar = (d5.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f314o);
                iVarI = dVar.i();
            }
            int i11 = iVarI.f333c;
            if (i11 != -1 && i11 <= this.f302c && this.f314o.f292d[i11] != null) {
                return iVarI;
            }
            if (i11 != -1) {
                iVarI.e();
            }
            int i12 = this.f302c + 1;
            this.f302c = i12;
            this.f311l++;
            iVarI.f333c = i12;
            iVarI.f340j = i.a.UNRESTRICTED;
            this.f314o.f292d[i12] = iVarI;
        }
        return iVarI;
    }

    public a5.b r() {
        a5.b bVarB;
        if (f297w) {
            bVarB = this.f314o.f289a.b();
            if (bVarB == null) {
                bVarB = new b(this.f314o);
                f299y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f314o.f290b.b();
            if (bVarB == null) {
                bVarB = new a5.b(this.f314o);
                f298x++;
            } else {
                bVarB.y();
            }
        }
        i.c();
        return bVarB;
    }

    public i t() {
        if (this.f311l + 1 >= this.f306g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i11 = this.f302c + 1;
        this.f302c = i11;
        this.f311l++;
        iVarA.f333c = i11;
        this.f314o.f292d[i11] = iVarA;
        return iVarA;
    }

    public c w() {
        return this.f314o;
    }

    public int y(Object obj) {
        i iVarI = ((d5.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f336f + 0.5f);
        }
        return 0;
    }

    public void v(e eVar) {
    }
}
