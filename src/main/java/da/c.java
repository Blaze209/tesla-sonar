package da;

import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.b0 f59936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f59937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f59940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f59941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w8.o0 f59942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f59943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f59944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f59946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p7.u f59947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f59948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f59949n;

    public c(String str) {
        this(null, 0, str);
    }

    private boolean f(s7.c0 c0Var, byte[] bArr, int i11) {
        int iMin = Math.min(c0Var.a(), i11 - this.f59944i);
        c0Var.q(bArr, this.f59944i, iMin);
        int i12 = this.f59944i + iMin;
        this.f59944i = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void g() {
        this.f59936a.p(0);
        w8.b.C2598b c2598bF = w8.b.f(this.f59936a);
        p7.u uVar = this.f59947l;
        if (uVar == null || c2598bF.f121219d != uVar.G || c2598bF.f121218c != uVar.H || !Objects.equals(c2598bF.f121216a, uVar.f101544o)) {
            p7.u.b bVarT0 = new p7.u.b().j0(this.f59941f).W(this.f59940e).y0(c2598bF.f121216a).T(c2598bF.f121219d).z0(c2598bF.f121218c).n0(this.f59938c).w0(this.f59939d).t0(c2598bF.f121222g);
            if ("audio/ac3".equals(c2598bF.f121216a)) {
                bVarT0.S(c2598bF.f121222g);
            }
            p7.u uVarP = bVarT0.P();
            this.f59947l = uVarP;
            this.f59942g.g(uVarP);
        }
        this.f59948m = c2598bF.f121220e;
        this.f59946k = (((long) c2598bF.f121221f) * 1000000) / ((long) this.f59947l.H);
    }

    private boolean h(s7.c0 c0Var) {
        while (true) {
            if (c0Var.a() <= 0) {
                return false;
            }
            if (this.f59945j) {
                int iM = c0Var.M();
                if (iM == 119) {
                    this.f59945j = false;
                    return true;
                }
                this.f59945j = iM == 11;
            } else {
                this.f59945j = c0Var.M() == 11;
            }
        }
    }

    @Override // da.m
    public void a() {
        this.f59943h = 0;
        this.f59944i = 0;
        this.f59945j = false;
        this.f59949n = -9223372036854775807L;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        s7.a.j(this.f59942g);
        while (c0Var.a() > 0) {
            int i11 = this.f59943h;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int iMin = Math.min(c0Var.a(), this.f59948m - this.f59944i);
                        this.f59942g.f(c0Var, iMin);
                        int i12 = this.f59944i + iMin;
                        this.f59944i = i12;
                        if (i12 == this.f59948m) {
                            s7.a.h(this.f59949n != -9223372036854775807L);
                            this.f59942g.b(this.f59949n, 1, this.f59948m, 0, null);
                            this.f59949n += this.f59946k;
                            this.f59943h = 0;
                        }
                    }
                } else if (f(c0Var, this.f59937b.f(), 128)) {
                    g();
                    this.f59937b.b0(0);
                    this.f59942g.f(this.f59937b, 128);
                    this.f59943h = 2;
                }
            } else if (h(c0Var)) {
                this.f59943h = 1;
                this.f59937b.f()[0] = 11;
                this.f59937b.f()[1] = 119;
                this.f59944i = 2;
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f59949n = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f59941f = dVar.b();
        this.f59942g = rVar.b(dVar.c(), 1);
    }

    public c(String str, int i11, String str2) {
        s7.b0 b0Var = new s7.b0(new byte[128]);
        this.f59936a = b0Var;
        this.f59937b = new s7.c0(b0Var.f110390a);
        this.f59943h = 0;
        this.f59949n = -9223372036854775807L;
        this.f59938c = str;
        this.f59939d = i11;
        this.f59940e = str2;
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
