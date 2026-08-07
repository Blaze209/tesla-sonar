package b9;

import androidx.media3.common.ParserException;
import p7.f0;
import s7.c0;
import s7.q0;
import w8.i0;
import w8.j0;
import w8.o0;
import w8.p;
import w8.q;
import w8.r;
import w8.u;
import w8.v;
import w8.w;
import w8.x;
import w8.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f16883o = new u() { // from class: b9.c
        @Override // w8.u
        public final p[] d() {
            return d.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f16885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f16887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f16888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f16889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f16891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f16892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f16895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f16897n;

    public d() {
        this(0);
    }

    public static /* synthetic */ p[] b() {
        return new p[]{new d()};
    }

    private long c(c0 c0Var, boolean z11) {
        boolean zD;
        s7.a.f(this.f16892i);
        int iG = c0Var.g();
        while (iG <= c0Var.j() - 16) {
            c0Var.b0(iG);
            if (v.d(c0Var, this.f16892i, this.f16894k, this.f16887d)) {
                c0Var.b0(iG);
                return this.f16887d.f121419a;
            }
            iG++;
        }
        if (!z11) {
            c0Var.b0(iG);
            return -1L;
        }
        while (iG <= c0Var.j() - this.f16893j) {
            c0Var.b0(iG);
            try {
                zD = v.d(c0Var, this.f16892i, this.f16894k, this.f16887d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (c0Var.g() <= c0Var.j() ? zD : false) {
                c0Var.b0(iG);
                return this.f16887d.f121419a;
            }
            iG++;
        }
        c0Var.b0(c0Var.j());
        return -1L;
    }

    private void d(q qVar) {
        this.f16894k = w.b(qVar);
        ((r) q0.l(this.f16888e)).t(f(qVar.getPosition(), qVar.getLength()));
        this.f16890g = 5;
    }

    private j0 f(long j11, long j12) {
        s7.a.f(this.f16892i);
        y yVar = this.f16892i;
        y.a aVar = yVar.f121433k;
        if (aVar != null && aVar.f121435a.length > 0) {
            return new x(yVar, j11);
        }
        if (j12 == -1 || yVar.f121432j <= 0) {
            return new j0.b(yVar.f());
        }
        b bVar = new b(yVar, this.f16894k, j11, j12);
        this.f16895l = bVar;
        return bVar.b();
    }

    private void g(q qVar) {
        byte[] bArr = this.f16884a;
        qVar.e(bArr, 0, bArr.length);
        qVar.g();
        this.f16890g = 2;
    }

    private void k() {
        ((o0) q0.l(this.f16889f)).b((this.f16897n * 1000000) / ((long) ((y) q0.l(this.f16892i)).f121427e), 1, this.f16896m, 0, null);
    }

    private int m(q qVar, i0 i0Var) {
        boolean z11;
        s7.a.f(this.f16889f);
        s7.a.f(this.f16892i);
        b bVar = this.f16895l;
        if (bVar != null && bVar.d()) {
            return this.f16895l.c(qVar, i0Var);
        }
        if (this.f16897n == -1) {
            this.f16897n = v.i(qVar, this.f16892i);
            return 0;
        }
        int iJ = this.f16885b.j();
        if (iJ < 32768) {
            int i11 = qVar.read(this.f16885b.f(), iJ, 32768 - iJ);
            z11 = i11 == -1;
            if (!z11) {
                this.f16885b.a0(iJ + i11);
            } else if (this.f16885b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z11 = false;
        }
        int iG = this.f16885b.g();
        int i12 = this.f16896m;
        int i13 = this.f16893j;
        if (i12 < i13) {
            c0 c0Var = this.f16885b;
            c0Var.c0(Math.min(i13 - i12, c0Var.a()));
        }
        long jC = c(this.f16885b, z11);
        int iG2 = this.f16885b.g() - iG;
        this.f16885b.b0(iG);
        this.f16889f.f(this.f16885b, iG2);
        this.f16896m += iG2;
        if (jC != -1) {
            k();
            this.f16896m = 0;
            this.f16897n = jC;
        }
        int length = this.f16885b.f().length - this.f16885b.j();
        if (this.f16885b.a() < 16 && length < 16) {
            int iA = this.f16885b.a();
            System.arraycopy(this.f16885b.f(), this.f16885b.g(), this.f16885b.f(), 0, iA);
            this.f16885b.b0(0);
            this.f16885b.a0(iA);
        }
        return 0;
    }

    private void n(q qVar) {
        this.f16891h = w.d(qVar, !this.f16886c);
        this.f16890g = 1;
    }

    private void o(q qVar) {
        w.a aVar = new w.a(this.f16892i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(qVar, aVar);
            this.f16892i = (y) q0.l(aVar.f121420a);
        }
        s7.a.f(this.f16892i);
        this.f16893j = Math.max(this.f16892i.f121425c, 6);
        ((o0) q0.l(this.f16889f)).g(this.f16892i.g(this.f16884a, this.f16891h).b().W("audio/flac").P());
        ((o0) q0.l(this.f16889f)).d(this.f16892i.f());
        this.f16890g = 4;
    }

    private void p(q qVar) throws ParserException {
        w.i(qVar);
        this.f16890g = 3;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f16890g = 0;
        } else {
            b bVar = this.f16895l;
            if (bVar != null) {
                bVar.h(j12);
            }
        }
        this.f16897n = j12 != 0 ? -1L : 0L;
        this.f16896m = 0;
        this.f16885b.X(0);
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f16888e = rVar;
        this.f16889f = rVar.b(0, 1);
        rVar.j();
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) throws ParserException {
        int i11 = this.f16890g;
        if (i11 == 0) {
            n(qVar);
            return 0;
        }
        if (i11 == 1) {
            g(qVar);
            return 0;
        }
        if (i11 == 2) {
            p(qVar);
            return 0;
        }
        if (i11 == 3) {
            o(qVar);
            return 0;
        }
        if (i11 == 4) {
            d(qVar);
            return 0;
        }
        if (i11 == 5) {
            return m(qVar, i0Var);
        }
        throw new IllegalStateException();
    }

    @Override // w8.p
    public boolean l(q qVar) throws Throwable {
        w.c(qVar, false);
        return w.a(qVar);
    }

    public d(int i11) {
        this.f16884a = new byte[42];
        this.f16885b = new c0(new byte[32768], 0);
        this.f16886c = (i11 & 1) != 0;
        this.f16887d = new v.a();
        this.f16890g = 0;
    }

    @Override // w8.p
    public void release() {
    }
}
