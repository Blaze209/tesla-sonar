package rr;

import com.google.android.exoplayer2.u0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f108971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f108972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hr.b0 f108973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f108974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f108975e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f108982l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f108976f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f108977g = new u(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f108978h = new u(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f108979i = new u(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f108980j = new u(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f108981k = new u(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f108983m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ts.d0 f108984n = new ts.d0();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hr.b0 f108985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f108986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f108987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f108988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f108989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f108990f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f108991g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f108992h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f108993i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f108994j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f108995k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f108996l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f108997m;

        public a(hr.b0 b0Var) {
            this.f108985a = b0Var;
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
            long j11 = this.f108996l;
            if (j11 == -9223372036854775807L) {
                return;
            }
            boolean z11 = this.f108997m;
            this.f108985a.e(j11, z11 ? 1 : 0, (int) (this.f108986b - this.f108995k), i11, null);
        }

        public void a(long j11, int i11, boolean z11) {
            if (this.f108994j && this.f108991g) {
                this.f108997m = this.f108987c;
                this.f108994j = false;
            } else if (this.f108992h || this.f108991g) {
                if (z11 && this.f108993i) {
                    d(i11 + ((int) (j11 - this.f108986b)));
                }
                this.f108995k = this.f108986b;
                this.f108996l = this.f108989e;
                this.f108997m = this.f108987c;
                this.f108993i = true;
            }
        }

        public void e(byte[] bArr, int i11, int i12) {
            if (this.f108990f) {
                int i13 = this.f108988d;
                int i14 = (i11 + 2) - i13;
                if (i14 >= i12) {
                    this.f108988d = i13 + (i12 - i11);
                } else {
                    this.f108991g = (bArr[i14] & 128) != 0;
                    this.f108990f = false;
                }
            }
        }

        public void f() {
            this.f108990f = false;
            this.f108991g = false;
            this.f108992h = false;
            this.f108993i = false;
            this.f108994j = false;
        }

        public void g(long j11, int i11, int i12, long j12, boolean z11) {
            this.f108991g = false;
            this.f108992h = false;
            this.f108989e = j12;
            this.f108988d = 0;
            this.f108986b = j11;
            if (!c(i12)) {
                if (this.f108993i && !this.f108994j) {
                    if (z11) {
                        d(i11);
                    }
                    this.f108993i = false;
                }
                if (b(i12)) {
                    this.f108992h = !this.f108994j;
                    this.f108994j = true;
                }
            }
            boolean z12 = i12 >= 16 && i12 <= 21;
            this.f108987c = z12;
            this.f108990f = z12 || i12 <= 9;
        }
    }

    public q(d0 d0Var) {
        this.f108971a = d0Var;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void f() {
        ts.a.i(this.f108973c);
        p0.j(this.f108974d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void g(long j11, int i11, int i12, long j12) {
        this.f108974d.a(j11, i11, this.f108975e);
        if (!this.f108975e) {
            this.f108977g.b(i12);
            this.f108978h.b(i12);
            this.f108979i.b(i12);
            if (this.f108977g.c() && this.f108978h.c() && this.f108979i.c()) {
                this.f108973c.b(i(this.f108972b, this.f108977g, this.f108978h, this.f108979i));
                this.f108975e = true;
            }
        }
        if (this.f108980j.b(i12)) {
            u uVar = this.f108980j;
            this.f108984n.S(this.f108980j.f109040d, ts.z.q(uVar.f109040d, uVar.f109041e));
            this.f108984n.V(5);
            this.f108971a.a(j12, this.f108984n);
        }
        if (this.f108981k.b(i12)) {
            u uVar2 = this.f108981k;
            this.f108984n.S(this.f108981k.f109040d, ts.z.q(uVar2.f109040d, uVar2.f109041e));
            this.f108984n.V(5);
            this.f108971a.a(j12, this.f108984n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void h(byte[] bArr, int i11, int i12) {
        this.f108974d.e(bArr, i11, i12);
        if (!this.f108975e) {
            this.f108977g.a(bArr, i11, i12);
            this.f108978h.a(bArr, i11, i12);
            this.f108979i.a(bArr, i11, i12);
        }
        this.f108980j.a(bArr, i11, i12);
        this.f108981k.a(bArr, i11, i12);
    }

    private static u0 i(String str, u uVar, u uVar2, u uVar3) {
        int i11 = uVar.f109041e;
        byte[] bArr = new byte[uVar2.f109041e + i11 + uVar3.f109041e];
        System.arraycopy(uVar.f109040d, 0, bArr, 0, i11);
        System.arraycopy(uVar2.f109040d, 0, bArr, uVar.f109041e, uVar2.f109041e);
        System.arraycopy(uVar3.f109040d, 0, bArr, uVar.f109041e + uVar2.f109041e, uVar3.f109041e);
        ts.z.a aVarH = ts.z.h(uVar2.f109040d, 3, uVar2.f109041e);
        return new u0.b().U(str).g0("video/hevc").K(ts.e.c(aVarH.f115090a, aVarH.f115091b, aVarH.f115092c, aVarH.f115093d, aVarH.f115097h, aVarH.f115098i)).n0(aVarH.f115100k).S(aVarH.f115101l).c0(aVarH.f115102m).V(Collections.singletonList(bArr)).G();
    }

    @RequiresNonNull({"sampleReader"})
    private void j(long j11, int i11, int i12, long j12) {
        this.f108974d.g(j11, i11, i12, j12, this.f108975e);
        if (!this.f108975e) {
            this.f108977g.e(i12);
            this.f108978h.e(i12);
            this.f108979i.e(i12);
        }
        this.f108980j.e(i12);
        this.f108981k.e(i12);
    }

    @Override // rr.m
    public void a() {
        this.f108982l = 0L;
        this.f108983m = -9223372036854775807L;
        ts.z.a(this.f108976f);
        this.f108977g.d();
        this.f108978h.d();
        this.f108979i.d();
        this.f108980j.d();
        this.f108981k.d();
        a aVar = this.f108974d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        f();
        while (d0Var.a() > 0) {
            int iF = d0Var.f();
            int iG = d0Var.g();
            byte[] bArrE = d0Var.e();
            this.f108982l += (long) d0Var.a();
            this.f108973c.d(d0Var, d0Var.a());
            while (iF < iG) {
                int iC = ts.z.c(bArrE, iF, iG, this.f108976f);
                if (iC == iG) {
                    h(bArrE, iF, iG);
                    return;
                }
                int iE = ts.z.e(bArrE, iC);
                int i11 = iC - iF;
                if (i11 > 0) {
                    h(bArrE, iF, iC);
                }
                int i12 = iG - iC;
                long j11 = this.f108982l - ((long) i12);
                g(j11, i12, i11 < 0 ? -i11 : 0, this.f108983m);
                j(j11, i12, iE, this.f108983m);
                iF = iC + 3;
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108983m = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108972b = dVar.b();
        hr.b0 b0VarB = mVar.b(dVar.c(), 2);
        this.f108973c = b0VarB;
        this.f108974d = new a(b0VarB);
        this.f108971a.b(mVar, dVar);
    }

    @Override // rr.m
    public void e() {
    }
}
