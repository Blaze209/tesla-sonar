package xz;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.shaded.ow2asm.ClassTooLargeException;

/* JADX INFO: loaded from: classes6.dex */
public class g extends f {
    private int A;
    private d B;
    private int C;
    private d D;
    private y E;
    private y F;
    private c G;
    private int H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f124139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f124140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f124141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f124143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f124144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f124145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n f124146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t f124147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t f124148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f124149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f124150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f124151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f124152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f124153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f124154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d f124155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f124156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f124157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f124158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b f124159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private v f124160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f124161z;

    public g(int i11) {
        this(null, i11);
    }

    private c[] p() {
        c.a aVar = new c.a();
        aVar.b(this.G);
        for (n nVar = this.f124145j; nVar != null; nVar = (n) nVar.f124189b) {
            nVar.e(aVar);
        }
        for (t tVar = this.f124147l; tVar != null; tVar = (t) tVar.f124236b) {
            tVar.H(aVar);
        }
        for (y yVar = this.E; yVar != null; yVar = (y) yVar.f124291b) {
            yVar.e(aVar);
        }
        return aVar.d();
    }

    private byte[] s(byte[] bArr, boolean z11) {
        c[] cVarArrP = p();
        this.f124145j = null;
        this.f124146k = null;
        this.f124147l = null;
        this.f124148m = null;
        this.f124156u = null;
        this.f124157v = null;
        this.f124158w = null;
        this.f124159x = null;
        this.f124160y = null;
        this.f124161z = 0;
        this.A = 0;
        this.B = null;
        this.C = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = z11 ? 3 : 0;
        new e(bArr, 0, false).a(this, cVarArrP, (z11 ? 8 : 0) | 256);
        return t();
    }

    @Override // xz.f
    public final void a(int i11, int i12, String str, String str2, String str3, String[] strArr) {
        this.f124138c = i11;
        this.f124140e = i12;
        int i13 = i11 & 65535;
        this.f124141f = this.f124139d.f0(i13, str);
        if (str2 != null) {
            this.f124153r = this.f124139d.D(str2);
        }
        this.f124142g = str3 == null ? 0 : this.f124139d.e(str3).f124301a;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f124143h = length;
            this.f124144i = new int[length];
            for (int i14 = 0; i14 < this.f124143h; i14++) {
                this.f124144i[i14] = this.f124139d.e(strArr[i14]).f124301a;
            }
        }
        if (this.H != 1 || i13 < 51) {
            return;
        }
        this.H = 2;
    }

    @Override // xz.f
    public final a b(String str, boolean z11) {
        if (z11) {
            b bVarJ = b.j(this.f124139d, str, this.f124156u);
            this.f124156u = bVarJ;
            return bVarJ;
        }
        b bVarJ2 = b.j(this.f124139d, str, this.f124157v);
        this.f124157v = bVarJ2;
        return bVarJ2;
    }

    @Override // xz.f
    public final void c(c cVar) {
        cVar.f124121c = this.G;
        this.G = cVar;
    }

    @Override // xz.f
    public final m e(int i11, String str, String str2, String str3, Object obj) {
        n nVar = new n(this.f124139d, i11, str, str2, str3, obj);
        if (this.f124145j == null) {
            this.f124145j = nVar;
        } else {
            this.f124146k.f124189b = nVar;
        }
        this.f124146k = nVar;
        return nVar;
    }

    @Override // xz.f
    public final void f(String str, String str2, String str3, int i11) {
        if (this.f124150o == null) {
            this.f124150o = new d();
        }
        z zVarE = this.f124139d.e(str);
        if (zVarE.f124307g == 0) {
            this.f124149n++;
            this.f124150o.k(zVarE.f124301a);
            this.f124150o.k(str2 == null ? 0 : this.f124139d.e(str2).f124301a);
            this.f124150o.k(str3 != null ? this.f124139d.D(str3) : 0);
            this.f124150o.k(i11);
            zVarE.f124307g = this.f124149n;
        }
    }

    @Override // xz.f
    public final s g(int i11, String str, String str2, String str3, String[] strArr) {
        t tVar = new t(this.f124139d, i11, str, str2, str3, strArr, this.H);
        if (this.f124147l == null) {
            this.f124147l = tVar;
        } else {
            this.f124148m.f124236b = tVar;
        }
        this.f124148m = tVar;
        return tVar;
    }

    @Override // xz.f
    public final u h(String str, int i11, String str2) {
        a0 a0Var = this.f124139d;
        v vVar = new v(a0Var, a0Var.y(str).f124301a, i11, str2 == null ? 0 : this.f124139d.D(str2));
        this.f124160y = vVar;
        return vVar;
    }

    @Override // xz.f
    public final void i(String str) {
        this.f124161z = this.f124139d.e(str).f124301a;
    }

    @Override // xz.f
    public final void j(String str) {
        if (this.B == null) {
            this.B = new d();
        }
        this.A++;
        this.B.k(this.f124139d.e(str).f124301a);
    }

    @Override // xz.f
    public final void k(String str, String str2, String str3) {
        this.f124151p = this.f124139d.e(str).f124301a;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f124152q = this.f124139d.z(str2, str3);
    }

    @Override // xz.f
    public final void l(String str) {
        if (this.D == null) {
            this.D = new d();
        }
        this.C++;
        this.D.k(this.f124139d.e(str).f124301a);
    }

    @Override // xz.f
    public final x m(String str, String str2, String str3) {
        y yVar = new y(this.f124139d, str, str2, str3);
        if (this.E == null) {
            this.E = yVar;
        } else {
            this.F.f124291b = yVar;
        }
        this.F = yVar;
        return yVar;
    }

    @Override // xz.f
    public final void n(String str, String str2) {
        if (str != null) {
            this.f124154s = this.f124139d.D(str);
        }
        if (str2 != null) {
            this.f124155t = new d().a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // xz.f
    public final a o(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b bVarI = b.i(this.f124139d, i11, c0Var, str, this.f124158w);
            this.f124158w = bVarI;
            return bVarI;
        }
        b bVarI2 = b.i(this.f124139d, i11, c0Var, str, this.f124159x);
        this.f124159x = bVarI2;
        return bVarI2;
    }

    protected ClassLoader q() {
        return getClass().getClassLoader();
    }

    protected String r(String str, String str2) {
        ClassLoader classLoaderQ = q();
        try {
            Class<?> cls = Class.forName(str.replace('/', CoreConstants.DOT), false, classLoaderQ);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', CoreConstants.DOT), false, classLoaderQ);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace(CoreConstants.DOT, '/');
            } catch (ClassNotFoundException e11) {
                throw new TypeNotPresentException(str2, e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new TypeNotPresentException(str, e12);
        }
    }

    public byte[] t() {
        int iJ;
        int iF;
        int i11;
        int i12;
        int i13;
        int iD;
        int iA;
        int i14;
        int i15;
        int i16 = (this.f124143h * 2) + 24;
        int i17 = 0;
        for (n nVar = this.f124145j; nVar != null; nVar = (n) nVar.f124189b) {
            i17++;
            i16 += nVar.f();
        }
        int i18 = 0;
        for (t tVar = this.f124147l; tVar != null; tVar = (t) tVar.f124236b) {
            i18++;
            i16 += tVar.K();
        }
        d dVar = this.f124150o;
        if (dVar != null) {
            i16 += dVar.f124127b + 8;
            this.f124139d.D("InnerClasses");
            iJ = 1;
        } else {
            iJ = 0;
        }
        if (this.f124151p != 0) {
            iJ++;
            i16 += 10;
            this.f124139d.D("EnclosingMethod");
        }
        if ((this.f124140e & 4096) != 0 && (this.f124138c & 65535) < 49) {
            iJ++;
            i16 += 6;
            this.f124139d.D("Synthetic");
        }
        if (this.f124153r != 0) {
            iJ++;
            i16 += 8;
            this.f124139d.D("Signature");
        }
        if (this.f124154s != 0) {
            iJ++;
            i16 += 8;
            this.f124139d.D("SourceFile");
        }
        d dVar2 = this.f124155t;
        if (dVar2 != null) {
            iJ++;
            i16 += dVar2.f124127b + 6;
            this.f124139d.D("SourceDebugExtension");
        }
        if ((this.f124140e & 131072) != 0) {
            iJ++;
            i16 += 6;
            this.f124139d.D("Deprecated");
        }
        b bVar = this.f124156u;
        if (bVar != null) {
            iJ++;
            i16 += bVar.f("RuntimeVisibleAnnotations");
        }
        b bVar2 = this.f124157v;
        if (bVar2 != null) {
            iJ++;
            i16 += bVar2.f("RuntimeInvisibleAnnotations");
        }
        b bVar3 = this.f124158w;
        if (bVar3 != null) {
            iJ++;
            i16 += bVar3.f("RuntimeVisibleTypeAnnotations");
        }
        b bVar4 = this.f124159x;
        if (bVar4 != null) {
            iJ++;
            i16 += bVar4.f("RuntimeInvisibleTypeAnnotations");
        }
        if (this.f124139d.L() > 0) {
            iJ++;
            i16 += this.f124139d.L();
        }
        v vVar = this.f124160y;
        if (vVar != null) {
            iJ += vVar.j();
            i16 += this.f124160y.i();
        }
        if (this.f124161z != 0) {
            iJ++;
            i16 += 8;
            this.f124139d.D("NestHost");
        }
        d dVar3 = this.B;
        if (dVar3 != null) {
            iJ++;
            i16 += dVar3.f124127b + 8;
            this.f124139d.D("NestMembers");
        }
        d dVar4 = this.D;
        if (dVar4 != null) {
            iJ++;
            i16 += dVar4.f124127b + 8;
            this.f124139d.D("PermittedSubclasses");
        }
        int i19 = i16;
        if ((this.f124140e & 65536) == 0 && this.E == null) {
            i13 = i19;
            iF = 0;
            i11 = iJ;
            i12 = 0;
        } else {
            iF = 0;
            int i21 = 0;
            for (y yVar = this.E; yVar != null; yVar = (y) yVar.f124291b) {
                i21++;
                iF += yVar.f();
            }
            int i22 = i19 + iF + 8;
            i11 = iJ + 1;
            this.f124139d.D("Record");
            i12 = i21;
            i13 = i22;
        }
        c cVar = this.G;
        if (cVar != null) {
            iD = i11 + cVar.d();
            iA = i13 + this.G.a(this.f124139d);
        } else {
            iD = i11;
            iA = i13;
        }
        int iQ = iA + this.f124139d.Q();
        int iP = this.f124139d.P();
        if (iP > 65535) {
            throw new ClassTooLargeException(this.f124139d.O(), iP);
        }
        d dVar5 = new d(iQ);
        dVar5.i(-889275714).i(this.f124138c);
        this.f124139d.e0(dVar5);
        dVar5.k((~((this.f124138c & 65535) < 49 ? 4096 : 0)) & this.f124140e).k(this.f124141f).k(this.f124142g);
        dVar5.k(this.f124143h);
        for (int i23 = 0; i23 < this.f124143h; i23++) {
            dVar5.k(this.f124144i[i23]);
        }
        dVar5.k(i17);
        for (n nVar2 = this.f124145j; nVar2 != null; nVar2 = (n) nVar2.f124189b) {
            nVar2.g(dVar5);
        }
        dVar5.k(i18);
        boolean zN = false;
        boolean zM = false;
        for (t tVar2 = this.f124147l; tVar2 != null; tVar2 = (t) tVar2.f124236b) {
            zN |= tVar2.N();
            zM |= tVar2.M();
            tVar2.R(dVar5);
        }
        dVar5.k(iD);
        if (this.f124150o != null) {
            d dVarK = dVar5.k(this.f124139d.D("InnerClasses")).i(this.f124150o.f124127b + 2).k(this.f124149n);
            d dVar6 = this.f124150o;
            dVarK.h(dVar6.f124126a, 0, dVar6.f124127b);
        }
        if (this.f124151p != 0) {
            dVar5.k(this.f124139d.D("EnclosingMethod")).i(4).k(this.f124151p).k(this.f124152q);
        }
        if ((this.f124140e & 4096) != 0 && (this.f124138c & 65535) < 49) {
            dVar5.k(this.f124139d.D("Synthetic")).i(0);
        }
        if (this.f124153r != 0) {
            i14 = 2;
            dVar5.k(this.f124139d.D("Signature")).i(2).k(this.f124153r);
        } else {
            i14 = 2;
        }
        if (this.f124154s != 0) {
            dVar5.k(this.f124139d.D("SourceFile")).i(i14).k(this.f124154s);
        }
        d dVar7 = this.f124155t;
        if (dVar7 != null) {
            int i24 = dVar7.f124127b;
            i15 = 0;
            dVar5.k(this.f124139d.D("SourceDebugExtension")).i(i24).h(this.f124155t.f124126a, 0, i24);
        } else {
            i15 = 0;
        }
        if ((this.f124140e & 131072) != 0) {
            dVar5.k(this.f124139d.D("Deprecated")).i(i15);
        }
        b.l(this.f124139d, this.f124156u, this.f124157v, this.f124158w, this.f124159x, dVar5);
        this.f124139d.d0(dVar5);
        v vVar2 = this.f124160y;
        if (vVar2 != null) {
            vVar2.k(dVar5);
        }
        if (this.f124161z != 0) {
            dVar5.k(this.f124139d.D("NestHost")).i(2).k(this.f124161z);
        }
        if (this.B != null) {
            d dVarK2 = dVar5.k(this.f124139d.D("NestMembers")).i(this.B.f124127b + 2).k(this.A);
            d dVar8 = this.B;
            dVarK2.h(dVar8.f124126a, 0, dVar8.f124127b);
        }
        if (this.D != null) {
            d dVarK3 = dVar5.k(this.f124139d.D("PermittedSubclasses")).i(this.D.f124127b + 2).k(this.C);
            d dVar9 = this.D;
            dVarK3.h(dVar9.f124126a, 0, dVar9.f124127b);
        }
        if ((this.f124140e & 65536) != 0 || this.E != null) {
            dVar5.k(this.f124139d.D("Record")).i(iF + 2).k(i12);
            for (y yVar2 = this.E; yVar2 != null; yVar2 = (y) yVar2.f124291b) {
                yVar2.g(dVar5);
            }
        }
        c cVar2 = this.G;
        if (cVar2 != null) {
            cVar2.g(this.f124139d, dVar5);
        }
        return zM ? s(dVar5.f124126a, zN) : dVar5.f124126a;
    }

    public g(e eVar, int i11) {
        super(589824);
        this.f124139d = eVar == null ? new a0(this) : new a0(this, eVar);
        if ((i11 & 2) != 0) {
            this.H = 4;
        } else if ((i11 & 1) != 0) {
            this.H = 1;
        } else {
            this.H = 0;
        }
    }

    @Override // xz.f
    public final void d() {
    }
}
