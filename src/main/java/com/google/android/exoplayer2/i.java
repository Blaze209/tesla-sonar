package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i implements ts.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.h0 f40010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f40011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z1 f40012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ts.w f40013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40014e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40015f;

    public interface a {
        void onPlaybackParametersChanged(u1 u1Var);
    }

    public i(a aVar, ts.d dVar) {
        this.f40011b = aVar;
        this.f40010a = new ts.h0(dVar);
    }

    private boolean d(boolean z11) {
        z1 z1Var = this.f40012c;
        if (z1Var == null || z1Var.a()) {
            return true;
        }
        if (this.f40012c.isReady()) {
            return false;
        }
        return z11 || this.f40012c.h();
    }

    private void i(boolean z11) {
        if (d(z11)) {
            this.f40014e = true;
            if (this.f40015f) {
                this.f40010a.b();
                return;
            }
            return;
        }
        ts.w wVar = (ts.w) ts.a.e(this.f40013d);
        long jY = wVar.y();
        if (this.f40014e) {
            if (jY < this.f40010a.y()) {
                this.f40010a.c();
                return;
            } else {
                this.f40014e = false;
                if (this.f40015f) {
                    this.f40010a.b();
                }
            }
        }
        this.f40010a.a(jY);
        u1 u1VarE = wVar.e();
        if (u1VarE.equals(this.f40010a.e())) {
            return;
        }
        this.f40010a.j(u1VarE);
        this.f40011b.onPlaybackParametersChanged(u1VarE);
    }

    public void a(z1 z1Var) {
        if (z1Var == this.f40012c) {
            this.f40013d = null;
            this.f40012c = null;
            this.f40014e = true;
        }
    }

    public void b(z1 z1Var) throws ExoPlaybackException {
        ts.w wVar;
        ts.w wVarP = z1Var.p();
        if (wVarP == null || wVarP == (wVar = this.f40013d)) {
            return;
        }
        if (wVar != null) {
            throw ExoPlaybackException.h(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f40013d = wVarP;
        this.f40012c = z1Var;
        wVarP.j(this.f40010a.e());
    }

    public void c(long j11) {
        this.f40010a.a(j11);
    }

    @Override // ts.w
    public u1 e() {
        ts.w wVar = this.f40013d;
        return wVar != null ? wVar.e() : this.f40010a.e();
    }

    public void f() {
        this.f40015f = true;
        this.f40010a.b();
    }

    public void g() {
        this.f40015f = false;
        this.f40010a.c();
    }

    public long h(boolean z11) {
        i(z11);
        return y();
    }

    @Override // ts.w
    public void j(u1 u1Var) {
        ts.w wVar = this.f40013d;
        if (wVar != null) {
            wVar.j(u1Var);
            u1Var = this.f40013d.e();
        }
        this.f40010a.j(u1Var);
    }

    @Override // ts.w
    public long y() {
        return this.f40014e ? this.f40010a.y() : ((ts.w) ts.a.e(this.f40013d)).y();
    }
}
