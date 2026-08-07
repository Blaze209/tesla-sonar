package da;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f60224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w8.o0 f60227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f60228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60229f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f60236m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f60230g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f60231h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f60232i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f60233j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f60234k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f60235l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f60237n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final s7.c0 f60238o = new s7.c0();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w8.o0 f60239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f60240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f60241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f60242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f60243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f60244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f60245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f60246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f60247i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f60248j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f60249k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f60250l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f60251m;

        public a(w8.o0 o0Var) {
            this.f60239a = o0Var;
        }

        private static boolean b(int i11) {
            return (32 <= i11 && i11 <= 35) || i11 == 39;
        }

        private static boolean c(int i11) {
            return i11 < 32 || i11 == 40;
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
            long j11 = this.f60250l;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f60240b;
                long j13 = this.f60249k;
                if (j12 == j13) {
                    return;
                }
                int i12 = (int) (j12 - j13);
                this.f60239a.b(j11, this.f60251m ? 1 : 0, i12, i11, null);
            }
        }

        public void a(long j11, int i11, boolean z11) {
            if (this.f60248j && this.f60245g) {
                this.f60251m = this.f60241c;
                this.f60248j = false;
            } else if (this.f60246h || this.f60245g) {
                if (z11 && this.f60247i) {
                    d(i11 + ((int) (j11 - this.f60240b)));
                }
                this.f60249k = this.f60240b;
                this.f60250l = this.f60243e;
                this.f60251m = this.f60241c;
                this.f60247i = true;
            }
        }

        public void e(byte[] bArr, int i11, int i12) {
            if (this.f60244f) {
                int i13 = this.f60242d;
                int i14 = (i11 + 2) - i13;
                if (i14 >= i12) {
                    this.f60242d = i13 + (i12 - i11);
                } else {
                    this.f60245g = (bArr[i14] & 128) != 0;
                    this.f60244f = false;
                }
            }
        }

        public void f() {
            this.f60244f = false;
            this.f60245g = false;
            this.f60246h = false;
            this.f60247i = false;
            this.f60248j = false;
        }

        public void g(long j11, int i11, int i12, long j12, boolean z11) {
            this.f60245g = false;
            this.f60246h = false;
            this.f60243e = j12;
            this.f60242d = 0;
            this.f60240b = j11;
            if (!c(i12)) {
                if (this.f60247i && !this.f60248j) {
                    if (z11) {
                        d(i11);
                    }
                    this.f60247i = false;
                }
                if (b(i12)) {
                    this.f60246h = !this.f60248j;
                    this.f60248j = true;
                }
            }
            boolean z12 = i12 >= 16 && i12 <= 21;
            this.f60241c = z12;
            this.f60244f = z12 || i12 <= 9;
        }
    }

    public q(g0 g0Var, String str) {
        this.f60224a = g0Var;
        this.f60225b = str;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void f() {
        s7.a.j(this.f60227d);
        q0.l(this.f60228e);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void g(long j11, int i11, int i12, long j12) {
        this.f60228e.a(j11, i11, this.f60229f);
        if (!this.f60229f) {
            this.f60231h.b(i12);
            this.f60232i.b(i12);
            this.f60233j.b(i12);
            if (this.f60231h.c() && this.f60232i.c() && this.f60233j.c()) {
                p7.u uVarI = i(this.f60226c, this.f60231h, this.f60232i, this.f60233j, this.f60225b);
                this.f60227d.g(uVarI);
                ou.p.r(uVarI.f101546q != -1);
                this.f60224a.f(uVarI.f101546q);
                this.f60229f = true;
            }
        }
        if (this.f60234k.b(i12)) {
            w wVar = this.f60234k;
            this.f60238o.Z(this.f60234k.f60328d, t7.h.L(wVar.f60328d, wVar.f60329e));
            this.f60238o.c0(5);
            this.f60224a.c(j12, this.f60238o);
        }
        if (this.f60235l.b(i12)) {
            w wVar2 = this.f60235l;
            this.f60238o.Z(this.f60235l.f60328d, t7.h.L(wVar2.f60328d, wVar2.f60329e));
            this.f60238o.c0(5);
            this.f60224a.c(j12, this.f60238o);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void h(byte[] bArr, int i11, int i12) {
        this.f60228e.e(bArr, i11, i12);
        if (!this.f60229f) {
            this.f60231h.a(bArr, i11, i12);
            this.f60232i.a(bArr, i11, i12);
            this.f60233j.a(bArr, i11, i12);
        }
        this.f60234k.a(bArr, i11, i12);
        this.f60235l.a(bArr, i11, i12);
    }

    private static p7.u i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i11 = wVar.f60329e;
        byte[] bArr = new byte[wVar2.f60329e + i11 + wVar3.f60329e];
        System.arraycopy(wVar.f60328d, 0, bArr, 0, i11);
        System.arraycopy(wVar2.f60328d, 0, bArr, wVar.f60329e, wVar2.f60329e);
        System.arraycopy(wVar3.f60328d, 0, bArr, wVar.f60329e + wVar2.f60329e, wVar3.f60329e);
        t7.h.C2408h c2408hU = t7.h.u(wVar2.f60328d, 3, wVar2.f60329e, null);
        t7.h.c cVar = c2408hU.f112745c;
        return new p7.u.b().j0(str).W(str2).y0("video/hevc").U(cVar != null ? s7.k.h(cVar.f112719a, cVar.f112720b, cVar.f112721c, cVar.f112722d, cVar.f112723e, cVar.f112724f) : null).F0(c2408hU.f112750h).h0(c2408hU.f112751i).b0(c2408hU.f112752j).a0(c2408hU.f112753k).V(new p7.i.b().d(c2408hU.f112756n).c(c2408hU.f112757o).e(c2408hU.f112758p).g(c2408hU.f112747e + 8).b(c2408hU.f112748f + 8).a()).u0(c2408hU.f112754l).p0(c2408hU.f112755m).q0(c2408hU.f112744b + 1).k0(Collections.singletonList(bArr)).P();
    }

    @RequiresNonNull({"sampleReader"})
    private void j(long j11, int i11, int i12, long j12) {
        this.f60228e.g(j11, i11, i12, j12, this.f60229f);
        if (!this.f60229f) {
            this.f60231h.e(i12);
            this.f60232i.e(i12);
            this.f60233j.e(i12);
        }
        this.f60234k.e(i12);
        this.f60235l.e(i12);
    }

    @Override // da.m
    public void a() {
        this.f60236m = 0L;
        this.f60237n = -9223372036854775807L;
        t7.h.c(this.f60230g);
        this.f60231h.d();
        this.f60232i.d();
        this.f60233j.d();
        this.f60234k.d();
        this.f60235l.d();
        this.f60224a.b();
        a aVar = this.f60228e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        int i11;
        f();
        while (c0Var.a() > 0) {
            int iG = c0Var.g();
            int iJ = c0Var.j();
            byte[] bArrF = c0Var.f();
            this.f60236m += (long) c0Var.a();
            this.f60227d.f(c0Var, c0Var.a());
            while (iG < iJ) {
                int iE = t7.h.e(bArrF, iG, iJ, this.f60230g);
                if (iE == iJ) {
                    h(bArrF, iG, iJ);
                    return;
                }
                int i12 = t7.h.i(bArrF, iE);
                if (iE <= 0 || bArrF[iE - 1] != 0) {
                    i11 = 3;
                } else {
                    iE--;
                    i11 = 4;
                }
                int i13 = iE;
                int i14 = i11;
                int i15 = i13 - iG;
                if (i15 > 0) {
                    h(bArrF, iG, i13);
                }
                int i16 = iJ - i13;
                long j11 = this.f60236m - ((long) i16);
                g(j11, i16, i15 < 0 ? -i15 : 0, this.f60237n);
                j(j11, i16, i12, this.f60237n);
                iG = i13 + i14;
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60237n = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60226c = dVar.b();
        w8.o0 o0VarB = rVar.b(dVar.c(), 2);
        this.f60227d = o0VarB;
        this.f60228e = new a(o0VarB);
        this.f60224a.d(rVar, dVar);
    }

    @Override // da.m
    public void e(boolean z11) {
        f();
        if (z11) {
            this.f60224a.e();
            g(this.f60236m, 0, 0, this.f60237n);
            j(this.f60236m, 0, 48, this.f60237n);
        }
    }
}
