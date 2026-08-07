package w8;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f121341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f121342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f121343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f121344g;

    public l0(int i11, int i12, String str) {
        this.f121338a = i11;
        this.f121339b = i12;
        this.f121340c = str;
    }

    @RequiresNonNull({"this.extractorOutput"})
    private void b(String str) {
        o0 o0VarB = this.f121343f.b(1024, 4);
        this.f121344g = o0VarB;
        o0VarB.g(new p7.u.b().W(str).y0(str).P());
        this.f121343f.j();
        this.f121343f.t(new m0(-9223372036854775807L));
        this.f121342e = 1;
    }

    private void c(q qVar) {
        int iE = ((o0) s7.a.f(this.f121344g)).e(qVar, 1024, true);
        if (iE != -1) {
            this.f121341d += iE;
            return;
        }
        this.f121342e = 2;
        this.f121344g.b(0L, 1, this.f121341d, 0, null);
        this.f121341d = 0;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        if (j11 == 0 || this.f121342e == 1) {
            this.f121342e = 1;
            this.f121341d = 0;
        }
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f121343f = rVar;
        b(this.f121340c);
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        int i11 = this.f121342e;
        if (i11 == 1) {
            c(qVar);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // w8.p
    public boolean l(q qVar) {
        s7.a.h((this.f121338a == -1 || this.f121339b == -1) ? false : true);
        s7.c0 c0Var = new s7.c0(this.f121339b);
        qVar.e(c0Var.f(), 0, this.f121339b);
        return c0Var.U() == this.f121338a;
    }

    @Override // w8.p
    public void release() {
    }
}
