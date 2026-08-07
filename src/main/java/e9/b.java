package e9;

import com.reactnativecommunity.clipboard.ClipboardModule;
import p7.f0;
import p7.u;
import q9.n;
import s7.c0;
import w8.i0;
import w8.j0;
import w8.p;
import w8.q;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
final class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f62262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62265e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l9.a f62267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f62268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f62269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f62270j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f62261a = new c0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f62266f = -1;

    private void b(q qVar) {
        this.f62261a.X(2);
        qVar.e(this.f62261a.f(), 0, 2);
        qVar.i(this.f62261a.U() - 2);
    }

    private void c() {
        ((r) s7.a.f(this.f62262b)).j();
        this.f62262b.t(new j0.b(-9223372036854775807L));
        this.f62263c = 6;
    }

    private static l9.a d(String str, long j11) {
        c cVarA;
        if (j11 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j11);
    }

    private void f(l9.a aVar) {
        ((r) s7.a.f(this.f62262b)).b(1024, 4).g(new u.b().W(ClipboardModule.MIMETYPE_JPEG).r0(new f0(aVar)).P());
    }

    private int g(q qVar) {
        this.f62261a.X(2);
        qVar.e(this.f62261a.f(), 0, 2);
        return this.f62261a.U();
    }

    private void k(q qVar) {
        this.f62261a.X(2);
        qVar.readFully(this.f62261a.f(), 0, 2);
        int iU = this.f62261a.U();
        this.f62264d = iU;
        if (iU == 65498) {
            if (this.f62266f != -1) {
                this.f62263c = 4;
                return;
            } else {
                c();
                return;
            }
        }
        if ((iU < 65488 || iU > 65497) && iU != 65281) {
            this.f62263c = 1;
        }
    }

    private void m(q qVar) {
        String strG;
        if (this.f62264d == 65505) {
            c0 c0Var = new c0(this.f62265e);
            qVar.readFully(c0Var.f(), 0, this.f62265e);
            if (this.f62267g == null && "http://ns.adobe.com/xap/1.0/".equals(c0Var.G()) && (strG = c0Var.G()) != null) {
                l9.a aVarD = d(strG, qVar.getLength());
                this.f62267g = aVarD;
                if (aVarD != null) {
                    this.f62266f = aVarD.f89713d;
                }
            }
        } else {
            qVar.k(this.f62265e);
        }
        this.f62263c = 0;
    }

    private void n(q qVar) {
        this.f62261a.X(2);
        qVar.readFully(this.f62261a.f(), 0, 2);
        this.f62265e = this.f62261a.U() - 2;
        this.f62263c = 2;
    }

    private void o(q qVar) {
        if (!qVar.f(this.f62261a.f(), 0, 1, true)) {
            c();
            return;
        }
        qVar.g();
        if (this.f62270j == null) {
            this.f62270j = new n(t9.q.a.f112982a, 8);
        }
        d dVar = new d(qVar, this.f62266f);
        this.f62269i = dVar;
        if (!this.f62270j.l(dVar)) {
            c();
        } else {
            this.f62270j.e(new e(this.f62266f, (r) s7.a.f(this.f62262b)));
            p();
        }
    }

    private void p() {
        f((l9.a) s7.a.f(this.f62267g));
        this.f62263c = 5;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f62263c = 0;
            this.f62270j = null;
        } else if (this.f62263c == 5) {
            ((n) s7.a.f(this.f62270j)).a(j11, j12);
        }
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f62262b = rVar;
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        int i11 = this.f62263c;
        if (i11 == 0) {
            k(qVar);
            return 0;
        }
        if (i11 == 1) {
            n(qVar);
            return 0;
        }
        if (i11 == 2) {
            m(qVar);
            return 0;
        }
        if (i11 == 4) {
            long position = qVar.getPosition();
            long j11 = this.f62266f;
            if (position != j11) {
                i0Var.f121323a = j11;
                return 1;
            }
            o(qVar);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f62269i == null || qVar != this.f62268h) {
            this.f62268h = qVar;
            this.f62269i = new d(qVar, this.f62266f);
        }
        int iH = ((n) s7.a.f(this.f62270j)).h(this.f62269i, i0Var);
        if (iH == 1) {
            i0Var.f121323a += this.f62266f;
        }
        return iH;
    }

    @Override // w8.p
    public boolean l(q qVar) {
        if (g(qVar) != 65496) {
            return false;
        }
        int iG = g(qVar);
        this.f62264d = iG;
        if (iG == 65504) {
            b(qVar);
            this.f62264d = g(qVar);
        }
        return this.f62264d == 65505;
    }

    @Override // w8.p
    public void release() {
        n nVar = this.f62270j;
        if (nVar != null) {
            nVar.release();
        }
    }
}
