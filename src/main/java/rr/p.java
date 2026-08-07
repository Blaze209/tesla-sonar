package rr;

import android.util.SparseArray;
import com.google.android.exoplayer2.u0;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f108922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f108923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f108924c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f108928g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f108930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private hr.b0 f108931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f108932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f108933l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f108935n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f108929h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f108925d = new u(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f108926e = new u(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f108927f = new u(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f108934m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ts.d0 f108936o = new ts.d0();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hr.b0 f108937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f108938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f108939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<ts.z.c> f108940d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<ts.z.b> f108941e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ts.e0 f108942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f108943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f108944h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f108945i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f108946j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f108947k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f108948l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f108949m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f108950n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f108951o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f108952p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f108953q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f108954r;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f108955a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f108956b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ts.z.c f108957c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f108958d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f108959e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f108960f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f108961g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f108962h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f108963i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f108964j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f108965k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f108966l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f108967m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f108968n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f108969o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f108970p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i11;
                int i12;
                int i13;
                boolean z11;
                if (!this.f108955a) {
                    return false;
                }
                if (!aVar.f108955a) {
                    return true;
                }
                ts.z.c cVar = (ts.z.c) ts.a.i(this.f108957c);
                ts.z.c cVar2 = (ts.z.c) ts.a.i(aVar.f108957c);
                return (this.f108960f == aVar.f108960f && this.f108961g == aVar.f108961g && this.f108962h == aVar.f108962h && (!this.f108963i || !aVar.f108963i || this.f108964j == aVar.f108964j) && (((i11 = this.f108958d) == (i12 = aVar.f108958d) || (i11 != 0 && i12 != 0)) && (((i13 = cVar.f115120l) != 0 || cVar2.f115120l != 0 || (this.f108967m == aVar.f108967m && this.f108968n == aVar.f108968n)) && ((i13 != 1 || cVar2.f115120l != 1 || (this.f108969o == aVar.f108969o && this.f108970p == aVar.f108970p)) && (z11 = this.f108965k) == aVar.f108965k && (!z11 || this.f108966l == aVar.f108966l))))) ? false : true;
            }

            public void b() {
                this.f108956b = false;
                this.f108955a = false;
            }

            public boolean d() {
                if (!this.f108956b) {
                    return false;
                }
                int i11 = this.f108959e;
                return i11 == 7 || i11 == 2;
            }

            public void e(ts.z.c cVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19) {
                this.f108957c = cVar;
                this.f108958d = i11;
                this.f108959e = i12;
                this.f108960f = i13;
                this.f108961g = i14;
                this.f108962h = z11;
                this.f108963i = z12;
                this.f108964j = z13;
                this.f108965k = z14;
                this.f108966l = i15;
                this.f108967m = i16;
                this.f108968n = i17;
                this.f108969o = i18;
                this.f108970p = i19;
                this.f108955a = true;
                this.f108956b = true;
            }

            public void f(int i11) {
                this.f108959e = i11;
                this.f108956b = true;
            }
        }

        public b(hr.b0 b0Var, boolean z11, boolean z12) {
            this.f108937a = b0Var;
            this.f108938b = z11;
            this.f108939c = z12;
            this.f108949m = new a();
            this.f108950n = new a();
            byte[] bArr = new byte[128];
            this.f108943g = bArr;
            this.f108942f = new ts.e0(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void d(int i11) {
            long j11 = this.f108953q;
            if (j11 == -9223372036854775807L) {
                return;
            }
            boolean z11 = this.f108954r;
            this.f108937a.e(j11, z11 ? 1 : 0, (int) (this.f108946j - this.f108952p), i11, null);
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0109  */
        /* JADX WARN: Code duplicated, block: B:54:0x010c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0110  */
        /* JADX WARN: Code duplicated, block: B:59:0x011a  */
        /* JADX WARN: Code duplicated, block: B:60:0x0123  */
        /* JADX WARN: Code duplicated, block: B:63:0x0129  */
        /* JADX WARN: Code duplicated, block: B:66:0x0134  */
        /* JADX WARN: Code duplicated, block: B:76:0x0161  */
        public void a(byte[] bArr, int i11, int i12) {
            boolean z11;
            boolean z12;
            boolean zD;
            boolean z13;
            int iH;
            int i13;
            int i14;
            int iG;
            int i15;
            int iG2;
            int iE;
            if (this.f108947k) {
                int i16 = i12 - i11;
                byte[] bArr2 = this.f108943g;
                int length = bArr2.length;
                int i17 = this.f108944h;
                if (length < i17 + i16) {
                    this.f108943g = Arrays.copyOf(bArr2, (i17 + i16) * 2);
                }
                System.arraycopy(bArr, i11, this.f108943g, this.f108944h, i16);
                int i18 = this.f108944h + i16;
                this.f108944h = i18;
                this.f108942f.i(this.f108943g, 0, i18);
                if (this.f108942f.b(8)) {
                    this.f108942f.k();
                    int iE2 = this.f108942f.e(2);
                    this.f108942f.l(5);
                    if (this.f108942f.c()) {
                        this.f108942f.h();
                        if (this.f108942f.c()) {
                            int iH2 = this.f108942f.h();
                            if (!this.f108939c) {
                                this.f108947k = false;
                                this.f108950n.f(iH2);
                                return;
                            }
                            if (this.f108942f.c()) {
                                int iH3 = this.f108942f.h();
                                if (this.f108941e.indexOfKey(iH3) < 0) {
                                    this.f108947k = false;
                                    return;
                                }
                                ts.z.b bVar = this.f108941e.get(iH3);
                                ts.z.c cVar = this.f108940d.get(bVar.f115107b);
                                if (cVar.f115117i) {
                                    if (!this.f108942f.b(2)) {
                                        return;
                                    } else {
                                        this.f108942f.l(2);
                                    }
                                }
                                if (this.f108942f.b(cVar.f115119k)) {
                                    int iE3 = this.f108942f.e(cVar.f115119k);
                                    if (!cVar.f115118j) {
                                        if (this.f108942f.b(1)) {
                                            boolean zD2 = this.f108942f.d();
                                            if (!zD2) {
                                                z11 = zD2;
                                                z12 = false;
                                            } else {
                                                if (!this.f108942f.b(1)) {
                                                    return;
                                                }
                                                z11 = zD2;
                                                z12 = true;
                                                zD = this.f108942f.d();
                                            }
                                            if (this.f108945i == 5) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                iH = 0;
                                            } else if (!this.f108942f.c()) {
                                                return;
                                            } else {
                                                iH = this.f108942f.h();
                                            }
                                            i13 = cVar.f115120l;
                                            if (i13 != 0) {
                                                if (this.f108942f.b(cVar.f115121m)) {
                                                    iE = this.f108942f.e(cVar.f115121m);
                                                    if (bVar.f115108c || z11) {
                                                        i14 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f108942f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f108942f.g();
                                                        i14 = iE;
                                                        i15 = 0;
                                                    }
                                                    iG2 = i15;
                                                    this.f108950n.e(cVar, iE2, iH2, iE3, iH3, z11, z12, zD, z13, iH, i14, iG, i15, iG2);
                                                    this.f108947k = false;
                                                }
                                                return;
                                            }
                                            if (i13 == 1 || cVar.f115122n) {
                                                i14 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f108942f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f108942f.g();
                                                if (!bVar.f115108c || z11) {
                                                    i15 = iG3;
                                                    i14 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f108942f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f108942f.g();
                                                    i15 = iG3;
                                                    i14 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.f108950n.e(cVar, iE2, iH2, iE3, iH3, z11, z12, zD, z13, iH, i14, iG, i15, iG2);
                                            this.f108947k = false;
                                            i15 = iG;
                                            iG2 = i15;
                                            this.f108950n.e(cVar, iE2, iH2, iE3, iH3, z11, z12, zD, z13, iH, i14, iG, i15, iG2);
                                            this.f108947k = false;
                                        }
                                        return;
                                    }
                                    z11 = false;
                                    z12 = false;
                                    zD = z12;
                                    if (this.f108945i == 5) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        iH = 0;
                                    } else if (!this.f108942f.c()) {
                                        return;
                                    } else {
                                        iH = this.f108942f.h();
                                    }
                                    i13 = cVar.f115120l;
                                    if (i13 != 0) {
                                        if (i13 == 1) {
                                        }
                                        i14 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f108942f.b(cVar.f115121m)) {
                                            return;
                                        }
                                        iE = this.f108942f.e(cVar.f115121m);
                                        if (bVar.f115108c) {
                                        }
                                        i14 = iE;
                                        iG = 0;
                                    }
                                    i15 = iG;
                                    iG2 = i15;
                                    this.f108950n.e(cVar, iE2, iH2, iE3, iH3, z11, z12, zD, z13, iH, i14, iG, i15, iG2);
                                    this.f108947k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j11, int i11, boolean z11, boolean z12) {
            boolean z13 = false;
            if (this.f108945i == 9 || (this.f108939c && this.f108950n.c(this.f108949m))) {
                if (z11 && this.f108951o) {
                    d(i11 + ((int) (j11 - this.f108946j)));
                }
                this.f108952p = this.f108946j;
                this.f108953q = this.f108948l;
                this.f108954r = false;
                this.f108951o = true;
            }
            if (this.f108938b) {
                z12 = this.f108950n.d();
            }
            boolean z14 = this.f108954r;
            int i12 = this.f108945i;
            if (i12 == 5 || (z12 && i12 == 1)) {
                z13 = true;
            }
            boolean z15 = z14 | z13;
            this.f108954r = z15;
            return z15;
        }

        public boolean c() {
            return this.f108939c;
        }

        public void e(ts.z.b bVar) {
            this.f108941e.append(bVar.f115106a, bVar);
        }

        public void f(ts.z.c cVar) {
            this.f108940d.append(cVar.f115112d, cVar);
        }

        public void g() {
            this.f108947k = false;
            this.f108951o = false;
            this.f108950n.b();
        }

        public void h(long j11, int i11, long j12) {
            this.f108945i = i11;
            this.f108948l = j12;
            this.f108946j = j11;
            if (!this.f108938b || i11 != 1) {
                if (!this.f108939c) {
                    return;
                }
                if (i11 != 5 && i11 != 1 && i11 != 2) {
                    return;
                }
            }
            a aVar = this.f108949m;
            this.f108949m = this.f108950n;
            this.f108950n = aVar;
            aVar.b();
            this.f108944h = 0;
            this.f108947k = true;
        }
    }

    public p(d0 d0Var, boolean z11, boolean z12) {
        this.f108922a = d0Var;
        this.f108923b = z11;
        this.f108924c = z12;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void f() {
        ts.a.i(this.f108931j);
        p0.j(this.f108932k);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void g(long j11, int i11, int i12, long j12) {
        if (!this.f108933l || this.f108932k.c()) {
            this.f108925d.b(i12);
            this.f108926e.b(i12);
            if (this.f108933l) {
                if (this.f108925d.c()) {
                    u uVar = this.f108925d;
                    this.f108932k.f(ts.z.l(uVar.f109040d, 3, uVar.f109041e));
                    this.f108925d.d();
                } else if (this.f108926e.c()) {
                    u uVar2 = this.f108926e;
                    this.f108932k.e(ts.z.j(uVar2.f109040d, 3, uVar2.f109041e));
                    this.f108926e.d();
                }
            } else if (this.f108925d.c() && this.f108926e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar3 = this.f108925d;
                arrayList.add(Arrays.copyOf(uVar3.f109040d, uVar3.f109041e));
                u uVar4 = this.f108926e;
                arrayList.add(Arrays.copyOf(uVar4.f109040d, uVar4.f109041e));
                u uVar5 = this.f108925d;
                ts.z.c cVarL = ts.z.l(uVar5.f109040d, 3, uVar5.f109041e);
                u uVar6 = this.f108926e;
                ts.z.b bVarJ = ts.z.j(uVar6.f109040d, 3, uVar6.f109041e);
                this.f108931j.b(new u0.b().U(this.f108930i).g0("video/avc").K(ts.e.a(cVarL.f115109a, cVarL.f115110b, cVarL.f115111c)).n0(cVarL.f115114f).S(cVarL.f115115g).c0(cVarL.f115116h).V(arrayList).G());
                this.f108933l = true;
                this.f108932k.f(cVarL);
                this.f108932k.e(bVarJ);
                this.f108925d.d();
                this.f108926e.d();
            }
        }
        if (this.f108927f.b(i12)) {
            u uVar7 = this.f108927f;
            this.f108936o.S(this.f108927f.f109040d, ts.z.q(uVar7.f109040d, uVar7.f109041e));
            this.f108936o.U(4);
            this.f108922a.a(j12, this.f108936o);
        }
        if (this.f108932k.b(j11, i11, this.f108933l, this.f108935n)) {
            this.f108935n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void h(byte[] bArr, int i11, int i12) {
        if (!this.f108933l || this.f108932k.c()) {
            this.f108925d.a(bArr, i11, i12);
            this.f108926e.a(bArr, i11, i12);
        }
        this.f108927f.a(bArr, i11, i12);
        this.f108932k.a(bArr, i11, i12);
    }

    @RequiresNonNull({"sampleReader"})
    private void i(long j11, int i11, long j12) {
        if (!this.f108933l || this.f108932k.c()) {
            this.f108925d.e(i11);
            this.f108926e.e(i11);
        }
        this.f108927f.e(i11);
        this.f108932k.h(j11, i11, j12);
    }

    @Override // rr.m
    public void a() {
        this.f108928g = 0L;
        this.f108935n = false;
        this.f108934m = -9223372036854775807L;
        ts.z.a(this.f108929h);
        this.f108925d.d();
        this.f108926e.d();
        this.f108927f.d();
        b bVar = this.f108932k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        f();
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f108928g += (long) d0Var.a();
        this.f108931j.d(d0Var, d0Var.a());
        while (true) {
            int iC = ts.z.c(bArrE, iF, iG, this.f108929h);
            if (iC == iG) {
                h(bArrE, iF, iG);
                return;
            }
            int iF2 = ts.z.f(bArrE, iC);
            int i11 = iC - iF;
            if (i11 > 0) {
                h(bArrE, iF, iC);
            }
            int i12 = iG - iC;
            long j11 = this.f108928g - ((long) i12);
            g(j11, i12, i11 < 0 ? -i11 : 0, this.f108934m);
            i(j11, iF2, this.f108934m);
            iF = iC + 3;
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108934m = j11;
        }
        this.f108935n |= (i11 & 2) != 0;
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108930i = dVar.b();
        hr.b0 b0VarB = mVar.b(dVar.c(), 2);
        this.f108931j = b0VarB;
        this.f108932k = new b(b0VarB, this.f108923b, this.f108924c);
        this.f108922a.b(mVar, dVar);
    }

    @Override // rr.m
    public void e() {
    }
}
