package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class f implements z1, a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39892b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private br.j0 f39894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private cr.q1 f39896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private es.q f39898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u0[] f39899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f39900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f39901k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a2.a f39905o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39891a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final br.r f39893c = new br.r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39902l = Long.MIN_VALUE;

    public f(int i11) {
        this.f39892b = i11;
    }

    private void Y(long j11, boolean z11) {
        this.f39903m = false;
        this.f39901k = j11;
        this.f39902l = j11;
        Q(j11, z11);
    }

    @Override // com.google.android.exoplayer2.a2
    public int A() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void C(br.j0 j0Var, u0[] u0VarArr, es.q qVar, long j11, boolean z11, boolean z12, long j12, long j13) {
        ts.a.g(this.f39897g == 0);
        this.f39894d = j0Var;
        this.f39897g = 1;
        P(z11, z12);
        D(u0VarArr, qVar, j12, j13);
        Y(j11, z11);
    }

    @Override // com.google.android.exoplayer2.z1
    public final void D(u0[] u0VarArr, es.q qVar, long j11, long j12) {
        ts.a.g(!this.f39903m);
        this.f39898h = qVar;
        if (this.f39902l == Long.MIN_VALUE) {
            this.f39902l = j11;
        }
        this.f39899i = u0VarArr;
        this.f39900j = j12;
        W(u0VarArr, j11, j12);
    }

    @Override // com.google.android.exoplayer2.a2
    public final void E(a2.a aVar) {
        synchronized (this.f39891a) {
            this.f39905o = aVar;
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public final void F(int i11, cr.q1 q1Var) {
        this.f39895e = i11;
        this.f39896f = q1Var;
    }

    protected final ExoPlaybackException G(Throwable th2, u0 u0Var, int i11) {
        return H(th2, u0Var, false, i11);
    }

    protected final ExoPlaybackException H(Throwable th2, u0 u0Var, boolean z11, int i11) {
        int iQ;
        if (u0Var == null || this.f39904n) {
            iQ = 4;
        } else {
            this.f39904n = true;
            try {
                iQ = a2.q(b(u0Var));
                this.f39904n = false;
            } catch (ExoPlaybackException unused) {
                this.f39904n = false;
                iQ = 4;
            } catch (Throwable th3) {
                this.f39904n = false;
                throw th3;
            }
        }
        return ExoPlaybackException.f(th2, getName(), K(), u0Var, iQ, z11, i11);
    }

    protected final br.j0 I() {
        return (br.j0) ts.a.e(this.f39894d);
    }

    protected final br.r J() {
        this.f39893c.a();
        return this.f39893c;
    }

    protected final int K() {
        return this.f39895e;
    }

    protected final cr.q1 L() {
        return (cr.q1) ts.a.e(this.f39896f);
    }

    protected final u0[] M() {
        return (u0[]) ts.a.e(this.f39899i);
    }

    protected final boolean N() {
        return h() ? this.f39903m : ((es.q) ts.a.e(this.f39898h)).isReady();
    }

    protected abstract void O();

    protected void P(boolean z11, boolean z12) {
    }

    protected abstract void Q(long j11, boolean z11);

    protected void R() {
    }

    protected final void S() {
        a2.a aVar;
        synchronized (this.f39891a) {
            aVar = this.f39905o;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    protected void T() {
    }

    protected void U() {
    }

    protected void V() {
    }

    protected abstract void W(u0[] u0VarArr, long j11, long j12);

    protected final int X(br.r rVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        int iC = ((es.q) ts.a.e(this.f39898h)).c(rVar, decoderInputBuffer, i11);
        if (iC != -4) {
            if (iC == -5) {
                u0 u0Var = (u0) ts.a.e(rVar.f17943b);
                if (u0Var.f40716p != Long.MAX_VALUE) {
                    rVar.f17943b = u0Var.b().k0(u0Var.f40716p + this.f39900j).G();
                }
            }
            return iC;
        }
        if (decoderInputBuffer.k()) {
            this.f39902l = Long.MIN_VALUE;
            return this.f39903m ? -4 : -3;
        }
        long j11 = decoderInputBuffer.f39722e + this.f39900j;
        decoderInputBuffer.f39722e = j11;
        this.f39902l = Math.max(this.f39902l, j11);
        return iC;
    }

    protected int Z(long j11) {
        return ((es.q) ts.a.e(this.f39898h)).b(j11 - this.f39900j);
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public final int c() {
        return this.f39892b;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void disable() {
        ts.a.g(this.f39897g == 1);
        this.f39893c.a();
        this.f39897g = 0;
        this.f39898h = null;
        this.f39899i = null;
        this.f39903m = false;
        O();
    }

    @Override // com.google.android.exoplayer2.z1
    public final es.q f() {
        return this.f39898h;
    }

    @Override // com.google.android.exoplayer2.z1
    public final int getState() {
        return this.f39897g;
    }

    @Override // com.google.android.exoplayer2.z1
    public final boolean h() {
        return this.f39902l == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.w1.b
    public void k(int i11, Object obj) {
    }

    @Override // com.google.android.exoplayer2.z1
    public final boolean l() {
        return this.f39903m;
    }

    @Override // com.google.android.exoplayer2.z1
    public final long n() {
        return this.f39902l;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void o(long j11) {
        Y(j11, false);
    }

    @Override // com.google.android.exoplayer2.z1
    public ts.w p() {
        return null;
    }

    @Override // com.google.android.exoplayer2.a2
    public final void r() {
        synchronized (this.f39891a) {
            this.f39905o = null;
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public final void release() {
        ts.a.g(this.f39897g == 0);
        R();
    }

    @Override // com.google.android.exoplayer2.z1
    public final void reset() {
        ts.a.g(this.f39897g == 0);
        this.f39893c.a();
        T();
    }

    @Override // com.google.android.exoplayer2.z1
    public final void start() {
        ts.a.g(this.f39897g == 1);
        this.f39897g = 2;
        U();
    }

    @Override // com.google.android.exoplayer2.z1
    public final void stop() {
        ts.a.g(this.f39897g == 2);
        this.f39897g = 1;
        V();
    }

    @Override // com.google.android.exoplayer2.z1
    public final void t() {
        this.f39903m = true;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void w() {
        ((es.q) ts.a.e(this.f39898h)).a();
    }

    @Override // com.google.android.exoplayer2.z1
    public final a2 x() {
        return this;
    }
}
