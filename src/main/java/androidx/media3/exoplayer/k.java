package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class k implements z7.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7.c0 f10339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l2 f10341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z7.w f10342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10343e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10344f;

    public interface a {
        void v(p7.i0 i0Var);
    }

    public k(a aVar, s7.j jVar) {
        this.f10340b = aVar;
        this.f10339a = new z7.c0(jVar);
    }

    private boolean d(boolean z11) {
        l2 l2Var = this.f10341c;
        if (l2Var == null || l2Var.a()) {
            return true;
        }
        if (z11 && this.f10341c.getState() != 2) {
            return true;
        }
        if (this.f10341c.isReady()) {
            return false;
        }
        return z11 || this.f10341c.h();
    }

    private void i(boolean z11) {
        if (d(z11)) {
            this.f10343e = true;
            if (this.f10344f) {
                this.f10339a.b();
                return;
            }
            return;
        }
        z7.w wVar = (z7.w) s7.a.f(this.f10342d);
        long jY = wVar.y();
        if (this.f10343e) {
            if (jY < this.f10339a.y()) {
                this.f10339a.c();
                return;
            } else {
                this.f10343e = false;
                if (this.f10344f) {
                    this.f10339a.b();
                }
            }
        }
        this.f10339a.a(jY);
        p7.i0 i0VarE = wVar.e();
        if (i0VarE.equals(this.f10339a.e())) {
            return;
        }
        this.f10339a.j(i0VarE);
        this.f10340b.v(i0VarE);
    }

    @Override // z7.w
    public boolean C() {
        return this.f10343e ? this.f10339a.C() : ((z7.w) s7.a.f(this.f10342d)).C();
    }

    public void a(l2 l2Var) {
        if (l2Var == this.f10341c) {
            this.f10342d = null;
            this.f10341c = null;
            this.f10343e = true;
        }
    }

    public void b(l2 l2Var) throws ExoPlaybackException {
        z7.w wVar;
        z7.w wVarP = l2Var.p();
        if (wVarP == null || wVarP == (wVar = this.f10342d)) {
            return;
        }
        if (wVar != null) {
            throw ExoPlaybackException.m(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f10342d = wVarP;
        this.f10341c = l2Var;
        wVarP.j(this.f10339a.e());
    }

    public void c(long j11) {
        this.f10339a.a(j11);
    }

    @Override // z7.w
    public p7.i0 e() {
        z7.w wVar = this.f10342d;
        return wVar != null ? wVar.e() : this.f10339a.e();
    }

    public void f() {
        this.f10344f = true;
        this.f10339a.b();
    }

    public void g() {
        this.f10344f = false;
        this.f10339a.c();
    }

    public long h(boolean z11) {
        i(z11);
        return y();
    }

    @Override // z7.w
    public void j(p7.i0 i0Var) {
        z7.w wVar = this.f10342d;
        if (wVar != null) {
            wVar.j(i0Var);
            i0Var = this.f10342d.e();
        }
        this.f10339a.j(i0Var);
    }

    @Override // z7.w
    public long y() {
        return this.f10343e ? this.f10339a.y() : ((z7.w) s7.a.f(this.f10342d)).y();
    }
}
