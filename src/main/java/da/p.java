package da;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f60173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f60174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f60175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f60176d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f60180h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f60182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w8.o0 f60183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f60184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f60185m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f60187o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f60181i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f60177e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f60178f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f60179g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f60186n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s7.c0 f60188p = new s7.c0();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w8.o0 f60189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f60190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f60191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<t7.h.m> f60192d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<t7.h.l> f60193e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final t7.j f60194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f60195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f60196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f60197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f60198j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f60199k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f60200l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f60201m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f60202n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f60203o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f60204p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f60205q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f60206r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f60207s;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f60208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f60209b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private t7.h.m f60210c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f60211d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f60212e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f60213f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f60214g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f60215h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f60216i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f60217j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f60218k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f60219l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f60220m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f60221n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f60222o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f60223p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i11;
                int i12;
                int i13;
                boolean z11;
                if (!this.f60208a) {
                    return false;
                }
                if (!aVar.f60208a) {
                    return true;
                }
                t7.h.m mVar = (t7.h.m) s7.a.j(this.f60210c);
                t7.h.m mVar2 = (t7.h.m) s7.a.j(aVar.f60210c);
                return (this.f60213f == aVar.f60213f && this.f60214g == aVar.f60214g && this.f60215h == aVar.f60215h && (!this.f60216i || !aVar.f60216i || this.f60217j == aVar.f60217j) && (((i11 = this.f60211d) == (i12 = aVar.f60211d) || (i11 != 0 && i12 != 0)) && (((i13 = mVar.f112785n) != 0 || mVar2.f112785n != 0 || (this.f60220m == aVar.f60220m && this.f60221n == aVar.f60221n)) && ((i13 != 1 || mVar2.f112785n != 1 || (this.f60222o == aVar.f60222o && this.f60223p == aVar.f60223p)) && (z11 = this.f60218k) == aVar.f60218k && (!z11 || this.f60219l == aVar.f60219l))))) ? false : true;
            }

            public void b() {
                this.f60209b = false;
                this.f60208a = false;
            }

            public boolean d() {
                if (!this.f60209b) {
                    return false;
                }
                int i11 = this.f60212e;
                return i11 == 7 || i11 == 2;
            }

            public void e(t7.h.m mVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19) {
                this.f60210c = mVar;
                this.f60211d = i11;
                this.f60212e = i12;
                this.f60213f = i13;
                this.f60214g = i14;
                this.f60215h = z11;
                this.f60216i = z12;
                this.f60217j = z13;
                this.f60218k = z14;
                this.f60219l = i15;
                this.f60220m = i16;
                this.f60221n = i17;
                this.f60222o = i18;
                this.f60223p = i19;
                this.f60208a = true;
                this.f60209b = true;
            }

            public void f(int i11) {
                this.f60212e = i11;
                this.f60209b = true;
            }
        }

        public b(w8.o0 o0Var, boolean z11, boolean z12) {
            this.f60189a = o0Var;
            this.f60190b = z11;
            this.f60191c = z12;
            this.f60201m = new a();
            this.f60202n = new a();
            byte[] bArr = new byte[128];
            this.f60195g = bArr;
            this.f60194f = new t7.j(bArr, 0, 0);
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
            long j11 = this.f60205q;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f60198j;
                long j13 = this.f60204p;
                if (j12 == j13) {
                    return;
                }
                int i12 = (int) (j12 - j13);
                this.f60189a.b(j11, this.f60206r ? 1 : 0, i12, i11, null);
            }
        }

        private void h() {
            boolean zD = this.f60190b ? this.f60202n.d() : this.f60207s;
            boolean z11 = this.f60206r;
            int i11 = this.f60197i;
            boolean z12 = true;
            if (i11 != 5 && (!zD || i11 != 1)) {
                z12 = false;
            }
            this.f60206r = z11 | z12;
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
            boolean zE;
            boolean z13;
            int i13;
            int i14;
            int i15;
            int iH;
            int i16;
            int iH2;
            int iF;
            if (this.f60199k) {
                int i17 = i12 - i11;
                byte[] bArr2 = this.f60195g;
                int length = bArr2.length;
                int i18 = this.f60196h;
                if (length < i18 + i17) {
                    this.f60195g = Arrays.copyOf(bArr2, (i18 + i17) * 2);
                }
                System.arraycopy(bArr, i11, this.f60195g, this.f60196h, i17);
                int i19 = this.f60196h + i17;
                this.f60196h = i19;
                this.f60194f.j(this.f60195g, 0, i19);
                if (this.f60194f.c(8)) {
                    this.f60194f.l();
                    int iF2 = this.f60194f.f(2);
                    this.f60194f.m(5);
                    if (this.f60194f.d()) {
                        this.f60194f.i();
                        if (this.f60194f.d()) {
                            int i21 = this.f60194f.i();
                            if (!this.f60191c) {
                                this.f60199k = false;
                                this.f60202n.f(i21);
                                return;
                            }
                            if (this.f60194f.d()) {
                                int i22 = this.f60194f.i();
                                if (this.f60193e.indexOfKey(i22) < 0) {
                                    this.f60199k = false;
                                    return;
                                }
                                t7.h.l lVar = this.f60193e.get(i22);
                                t7.h.m mVar = this.f60192d.get(lVar.f112770b);
                                if (mVar.f112782k) {
                                    if (!this.f60194f.c(2)) {
                                        return;
                                    } else {
                                        this.f60194f.m(2);
                                    }
                                }
                                if (this.f60194f.c(mVar.f112784m)) {
                                    int iF3 = this.f60194f.f(mVar.f112784m);
                                    if (!mVar.f112783l) {
                                        if (this.f60194f.c(1)) {
                                            boolean zE2 = this.f60194f.e();
                                            if (!zE2) {
                                                z11 = zE2;
                                                z12 = false;
                                            } else {
                                                if (!this.f60194f.c(1)) {
                                                    return;
                                                }
                                                z11 = zE2;
                                                z12 = true;
                                                zE = this.f60194f.e();
                                            }
                                            if (this.f60197i == 5) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                i13 = 0;
                                            } else if (!this.f60194f.d()) {
                                                return;
                                            } else {
                                                i13 = this.f60194f.i();
                                            }
                                            i14 = mVar.f112785n;
                                            if (i14 != 0) {
                                                if (this.f60194f.c(mVar.f112786o)) {
                                                    iF = this.f60194f.f(mVar.f112786o);
                                                    if (lVar.f112771c || z11) {
                                                        i15 = iF;
                                                        iH = 0;
                                                    } else {
                                                        if (!this.f60194f.d()) {
                                                            return;
                                                        }
                                                        iH = this.f60194f.h();
                                                        i15 = iF;
                                                        i16 = 0;
                                                    }
                                                    iH2 = i16;
                                                    this.f60202n.e(mVar, iF2, i21, iF3, i22, z11, z12, zE, z13, i13, i15, iH, i16, iH2);
                                                    this.f60199k = false;
                                                }
                                                return;
                                            }
                                            if (i14 == 1 || mVar.f112787p) {
                                                i15 = 0;
                                                iH = 0;
                                            } else {
                                                if (!this.f60194f.d()) {
                                                    return;
                                                }
                                                int iH3 = this.f60194f.h();
                                                if (!lVar.f112771c || z11) {
                                                    i16 = iH3;
                                                    i15 = 0;
                                                    iH = 0;
                                                    iH2 = 0;
                                                } else {
                                                    if (!this.f60194f.d()) {
                                                        return;
                                                    }
                                                    iH2 = this.f60194f.h();
                                                    i16 = iH3;
                                                    i15 = 0;
                                                    iH = 0;
                                                }
                                            }
                                            this.f60202n.e(mVar, iF2, i21, iF3, i22, z11, z12, zE, z13, i13, i15, iH, i16, iH2);
                                            this.f60199k = false;
                                            i16 = iH;
                                            iH2 = i16;
                                            this.f60202n.e(mVar, iF2, i21, iF3, i22, z11, z12, zE, z13, i13, i15, iH, i16, iH2);
                                            this.f60199k = false;
                                        }
                                        return;
                                    }
                                    z11 = false;
                                    z12 = false;
                                    zE = z12;
                                    if (this.f60197i == 5) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i13 = 0;
                                    } else if (!this.f60194f.d()) {
                                        return;
                                    } else {
                                        i13 = this.f60194f.i();
                                    }
                                    i14 = mVar.f112785n;
                                    if (i14 != 0) {
                                        if (i14 == 1) {
                                        }
                                        i15 = 0;
                                        iH = 0;
                                    } else {
                                        if (this.f60194f.c(mVar.f112786o)) {
                                            return;
                                        }
                                        iF = this.f60194f.f(mVar.f112786o);
                                        if (lVar.f112771c) {
                                        }
                                        i15 = iF;
                                        iH = 0;
                                    }
                                    i16 = iH;
                                    iH2 = i16;
                                    this.f60202n.e(mVar, iF2, i21, iF3, i22, z11, z12, zE, z13, i13, i15, iH, i16, iH2);
                                    this.f60199k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j11, int i11, boolean z11) {
            if (this.f60197i == 9 || (this.f60191c && this.f60202n.c(this.f60201m))) {
                if (z11 && this.f60203o) {
                    d(i11 + ((int) (j11 - this.f60198j)));
                }
                this.f60204p = this.f60198j;
                this.f60205q = this.f60200l;
                this.f60206r = false;
                this.f60203o = true;
            }
            h();
            this.f60197i = 24;
            return this.f60206r;
        }

        public boolean c() {
            return this.f60191c;
        }

        public void e(t7.h.l lVar) {
            this.f60193e.append(lVar.f112769a, lVar);
        }

        public void f(t7.h.m mVar) {
            this.f60192d.append(mVar.f112775d, mVar);
        }

        public void g() {
            this.f60199k = false;
            this.f60203o = false;
            this.f60202n.b();
        }

        public void i(long j11, int i11, long j12, boolean z11) {
            this.f60197i = i11;
            this.f60200l = j12;
            this.f60198j = j11;
            this.f60207s = z11;
            if (!this.f60190b || i11 != 1) {
                if (!this.f60191c) {
                    return;
                }
                if (i11 != 5 && i11 != 1 && i11 != 2) {
                    return;
                }
            }
            a aVar = this.f60201m;
            this.f60201m = this.f60202n;
            this.f60202n = aVar;
            aVar.b();
            this.f60196h = 0;
            this.f60199k = true;
        }
    }

    public p(g0 g0Var, boolean z11, boolean z12, String str) {
        this.f60173a = g0Var;
        this.f60174b = z11;
        this.f60175c = z12;
        this.f60176d = str;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void f() {
        s7.a.j(this.f60183k);
        q0.l(this.f60184l);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void g(long j11, int i11, int i12, long j12) {
        if (!this.f60185m || this.f60184l.c()) {
            this.f60177e.b(i12);
            this.f60178f.b(i12);
            if (this.f60185m) {
                if (this.f60177e.c()) {
                    w wVar = this.f60177e;
                    t7.h.m mVarC = t7.h.C(wVar.f60328d, 3, wVar.f60329e);
                    this.f60173a.f(mVarC.f112791t);
                    this.f60184l.f(mVarC);
                    this.f60177e.d();
                } else if (this.f60178f.c()) {
                    w wVar2 = this.f60178f;
                    this.f60184l.e(t7.h.A(wVar2.f60328d, 3, wVar2.f60329e));
                    this.f60178f.d();
                }
            } else if (this.f60177e.c() && this.f60178f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f60177e;
                arrayList.add(Arrays.copyOf(wVar3.f60328d, wVar3.f60329e));
                w wVar4 = this.f60178f;
                arrayList.add(Arrays.copyOf(wVar4.f60328d, wVar4.f60329e));
                w wVar5 = this.f60177e;
                t7.h.m mVarC2 = t7.h.C(wVar5.f60328d, 3, wVar5.f60329e);
                w wVar6 = this.f60178f;
                t7.h.l lVarA = t7.h.A(wVar6.f60328d, 3, wVar6.f60329e);
                this.f60183k.g(new p7.u.b().j0(this.f60182j).W(this.f60176d).y0("video/avc").U(s7.k.f(mVarC2.f112772a, mVarC2.f112773b, mVarC2.f112774c)).F0(mVarC2.f112777f).h0(mVarC2.f112778g).V(new p7.i.b().d(mVarC2.f112788q).c(mVarC2.f112789r).e(mVarC2.f112790s).g(mVarC2.f112780i + 8).b(mVarC2.f112781j + 8).a()).u0(mVarC2.f112779h).k0(arrayList).p0(mVarC2.f112791t).P());
                this.f60185m = true;
                this.f60173a.f(mVarC2.f112791t);
                this.f60184l.f(mVarC2);
                this.f60184l.e(lVarA);
                this.f60177e.d();
                this.f60178f.d();
            }
        }
        if (this.f60179g.b(i12)) {
            w wVar7 = this.f60179g;
            this.f60188p.Z(this.f60179g.f60328d, t7.h.L(wVar7.f60328d, wVar7.f60329e));
            this.f60188p.b0(4);
            this.f60173a.c(j12, this.f60188p);
        }
        if (this.f60184l.b(j11, i11, this.f60185m)) {
            this.f60187o = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void h(byte[] bArr, int i11, int i12) {
        if (!this.f60185m || this.f60184l.c()) {
            this.f60177e.a(bArr, i11, i12);
            this.f60178f.a(bArr, i11, i12);
        }
        this.f60179g.a(bArr, i11, i12);
        this.f60184l.a(bArr, i11, i12);
    }

    @RequiresNonNull({"sampleReader"})
    private void i(long j11, int i11, long j12) {
        if (!this.f60185m || this.f60184l.c()) {
            this.f60177e.e(i11);
            this.f60178f.e(i11);
        }
        this.f60179g.e(i11);
        this.f60184l.i(j11, i11, j12, this.f60187o);
    }

    @Override // da.m
    public void a() {
        this.f60180h = 0L;
        this.f60187o = false;
        this.f60186n = -9223372036854775807L;
        t7.h.c(this.f60181i);
        this.f60177e.d();
        this.f60178f.d();
        this.f60179g.d();
        this.f60173a.b();
        b bVar = this.f60184l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        int i11;
        f();
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        this.f60180h += (long) c0Var.a();
        this.f60183k.f(c0Var, c0Var.a());
        while (true) {
            int iE = t7.h.e(bArrF, iG, iJ, this.f60181i);
            if (iE == iJ) {
                h(bArrF, iG, iJ);
                return;
            }
            int iJ2 = t7.h.j(bArrF, iE);
            if (iE <= 0 || bArrF[iE - 1] != 0) {
                i11 = 3;
            } else {
                iE--;
                i11 = 4;
            }
            int i12 = iE;
            int i13 = i11;
            int i14 = i12 - iG;
            if (i14 > 0) {
                h(bArrF, iG, i12);
            }
            int i15 = iJ - i12;
            long j11 = this.f60180h - ((long) i15);
            g(j11, i15, i14 < 0 ? -i14 : 0, this.f60186n);
            i(j11, iJ2, this.f60186n);
            iG = i12 + i13;
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60186n = j11;
        this.f60187o |= (i11 & 2) != 0;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60182j = dVar.b();
        w8.o0 o0VarB = rVar.b(dVar.c(), 2);
        this.f60183k = o0VarB;
        this.f60184l = new b(o0VarB, this.f60174b, this.f60175c);
        this.f60173a.d(rVar, dVar);
    }

    @Override // da.m
    public void e(boolean z11) {
        f();
        if (z11) {
            this.f60173a.e();
            g(this.f60180h, 0, 0, this.f60186n);
            i(this.f60180h, 9, this.f60186n);
            g(this.f60180h, 0, 0, this.f60186n);
        }
    }
}
