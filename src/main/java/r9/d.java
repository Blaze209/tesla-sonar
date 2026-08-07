package r9;

import androidx.media3.common.ParserException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import s7.c0;
import w8.i0;
import w8.o0;
import w8.p;
import w8.q;
import w8.r;
import w8.u;

/* JADX INFO: loaded from: classes3.dex */
public class d implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f107328d = new u() { // from class: r9.c
        @Override // w8.u
        public final p[] d() {
            return d.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f107329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f107330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f107331c;

    public static /* synthetic */ p[] b() {
        return new p[]{new d()};
    }

    private static c0 c(c0 c0Var) {
        c0Var.b0(0);
        return c0Var;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean d(q qVar) {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.f107338b & 2) == 2) {
            int iMin = Math.min(fVar.f107345i, 8);
            c0 c0Var = new c0(iMin);
            qVar.e(c0Var.f(), 0, iMin);
            if (b.p(c(c0Var))) {
                this.f107330b = new b();
            } else if (j.r(c(c0Var))) {
                this.f107330b = new j();
            } else if (h.o(c(c0Var))) {
                this.f107330b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        i iVar = this.f107330b;
        if (iVar != null) {
            iVar.m(j11, j12);
        }
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f107329a = rVar;
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) throws ParserException {
        s7.a.j(this.f107329a);
        if (this.f107330b == null) {
            if (!d(qVar)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            qVar.g();
        }
        if (!this.f107331c) {
            o0 o0VarB = this.f107329a.b(0, 1);
            this.f107329a.j();
            this.f107330b.d(this.f107329a, o0VarB);
            this.f107331c = true;
        }
        return this.f107330b.g(qVar, i0Var);
    }

    @Override // w8.p
    public boolean l(q qVar) {
        try {
            return d(qVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // w8.p
    public void release() {
    }
}
