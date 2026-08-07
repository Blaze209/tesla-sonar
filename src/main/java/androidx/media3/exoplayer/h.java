package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements l2, m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9859b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z7.y f9861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a8.o2 f9863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s7.j f9864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n8.s f9866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p7.u[] f9867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f9869l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f9871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9872o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.media3.exoplayer.source.r.b f9874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private m2.a f9875r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9858a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z7.u f9860c = new z7.u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f9870m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p7.r0 f9873p = p7.r0.f101451a;

    public h(int i11) {
        this.f9859b = i11;
    }

    private void o0(long j11, boolean z11) {
        this.f9871n = false;
        this.f9869l = j11;
        this.f9870m = j11;
        f0(j11, z11);
    }

    @Override // androidx.media3.exoplayer.m2
    public int A() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.l2
    public final void G(p7.r0 r0Var) {
        if (Objects.equals(this.f9873p, r0Var)) {
            return;
        }
        this.f9873p = r0Var;
        m0(r0Var);
    }

    @Override // androidx.media3.exoplayer.l2
    public final void I(int i11, a8.o2 o2Var, s7.j jVar) {
        this.f9862e = i11;
        this.f9863f = o2Var;
        this.f9864g = jVar;
        e0();
    }

    @Override // androidx.media3.exoplayer.l2
    public final void N(p7.u[] uVarArr, n8.s sVar, long j11, long j12, androidx.media3.exoplayer.source.r.b bVar) {
        s7.a.h(!this.f9871n);
        this.f9866i = sVar;
        this.f9874q = bVar;
        if (this.f9870m == Long.MIN_VALUE) {
            this.f9870m = j11;
        }
        this.f9867j = uVarArr;
        this.f9868k = j12;
        l0(uVarArr, j11, j12, bVar);
    }

    @Override // androidx.media3.exoplayer.m2
    public final void O(m2.a aVar) {
        synchronized (this.f9858a) {
            this.f9875r = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public final void P(z7.y yVar, p7.u[] uVarArr, n8.s sVar, long j11, boolean z11, boolean z12, long j12, long j13, androidx.media3.exoplayer.source.r.b bVar) {
        s7.a.h(this.f9865h == 0);
        this.f9861d = yVar;
        this.f9874q = bVar;
        this.f9865h = 1;
        d0(z11, z12);
        N(uVarArr, sVar, j12, j13, bVar);
        o0(j12, z11);
    }

    protected final ExoPlaybackException Q(Throwable th2, p7.u uVar, int i11) {
        return R(th2, uVar, false, i11);
    }

    protected final ExoPlaybackException R(Throwable th2, p7.u uVar, boolean z11, int i11) {
        int iQ;
        if (uVar == null || this.f9872o) {
            iQ = 4;
        } else {
            this.f9872o = true;
            try {
                iQ = m2.q(b(uVar));
                this.f9872o = false;
            } catch (ExoPlaybackException unused) {
                this.f9872o = false;
                iQ = 4;
            } catch (Throwable th3) {
                this.f9872o = false;
                throw th3;
            }
        }
        return ExoPlaybackException.k(th2, getName(), V(), uVar, iQ, this.f9874q, z11, i11);
    }

    protected final s7.j S() {
        return (s7.j) s7.a.f(this.f9864g);
    }

    protected final z7.y T() {
        return (z7.y) s7.a.f(this.f9861d);
    }

    protected final z7.u U() {
        this.f9860c.a();
        return this.f9860c;
    }

    protected final int V() {
        return this.f9862e;
    }

    protected final long W() {
        return this.f9869l;
    }

    protected final a8.o2 X() {
        return (a8.o2) s7.a.f(this.f9863f);
    }

    protected final p7.u[] Y() {
        return (p7.u[]) s7.a.f(this.f9867j);
    }

    protected final long Z() {
        return this.f9868k;
    }

    protected final p7.r0 a0() {
        return this.f9873p;
    }

    protected final boolean b0() {
        return h() ? this.f9871n : ((n8.s) s7.a.f(this.f9866i)).isReady();
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public final int c() {
        return this.f9859b;
    }

    protected abstract void c0();

    protected void d0(boolean z11, boolean z12) {
    }

    @Override // androidx.media3.exoplayer.l2
    public final void disable() {
        s7.a.h(this.f9865h == 1);
        this.f9860c.a();
        this.f9865h = 0;
        this.f9866i = null;
        this.f9867j = null;
        this.f9871n = false;
        c0();
        this.f9874q = null;
    }

    protected void e0() {
    }

    @Override // androidx.media3.exoplayer.l2
    public final n8.s f() {
        return this.f9866i;
    }

    protected abstract void f0(long j11, boolean z11);

    protected void g0() {
    }

    @Override // androidx.media3.exoplayer.l2
    public final int getState() {
        return this.f9865h;
    }

    @Override // androidx.media3.exoplayer.l2
    public final boolean h() {
        return this.f9870m == Long.MIN_VALUE;
    }

    protected final void h0() {
        m2.a aVar;
        synchronized (this.f9858a) {
            aVar = this.f9875r;
        }
        if (aVar != null) {
            aVar.d(this);
        }
    }

    protected void i0() {
    }

    protected void j0() {
    }

    @Override // androidx.media3.exoplayer.j2.b
    public void k(int i11, Object obj) {
    }

    protected void k0() {
    }

    @Override // androidx.media3.exoplayer.l2
    public final boolean l() {
        return this.f9871n;
    }

    @Override // androidx.media3.exoplayer.l2
    public final long n() {
        return this.f9870m;
    }

    protected final int n0(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        int iJ = ((n8.s) s7.a.f(this.f9866i)).j(uVar, decoderInputBuffer, i11);
        if (iJ != -4) {
            if (iJ == -5) {
                p7.u uVar2 = (p7.u) s7.a.f(uVar.f127112b);
                if (uVar2.f101549t != Long.MAX_VALUE) {
                    uVar.f127112b = uVar2.b().C0(uVar2.f101549t + this.f9868k).P();
                }
            }
            return iJ;
        }
        if (decoderInputBuffer.i()) {
            this.f9870m = Long.MIN_VALUE;
            return this.f9871n ? -4 : -3;
        }
        long j11 = decoderInputBuffer.f9288f + this.f9868k;
        decoderInputBuffer.f9288f = j11;
        this.f9870m = Math.max(this.f9870m, j11);
        return iJ;
    }

    @Override // androidx.media3.exoplayer.l2
    public final void o(long j11) {
        o0(j11, false);
    }

    @Override // androidx.media3.exoplayer.l2
    public z7.w p() {
        return null;
    }

    protected int p0(long j11) {
        return ((n8.s) s7.a.f(this.f9866i)).b(j11 - this.f9868k);
    }

    @Override // androidx.media3.exoplayer.m2
    public final void r() {
        synchronized (this.f9858a) {
            this.f9875r = null;
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public final void release() {
        s7.a.h(this.f9865h == 0);
        g0();
    }

    @Override // androidx.media3.exoplayer.l2
    public final void reset() {
        s7.a.h(this.f9865h == 0);
        this.f9860c.a();
        i0();
    }

    @Override // androidx.media3.exoplayer.l2
    public final void start() {
        s7.a.h(this.f9865h == 1);
        this.f9865h = 2;
        j0();
    }

    @Override // androidx.media3.exoplayer.l2
    public final void stop() {
        s7.a.h(this.f9865h == 2);
        this.f9865h = 1;
        k0();
    }

    @Override // androidx.media3.exoplayer.l2
    public final void t() {
        this.f9871n = true;
    }

    @Override // androidx.media3.exoplayer.l2
    public final void w() {
        ((n8.s) s7.a.f(this.f9866i)).a();
    }

    @Override // androidx.media3.exoplayer.l2
    public final m2 x() {
        return this;
    }

    protected void m0(p7.r0 r0Var) {
    }

    protected void l0(p7.u[] uVarArr, long j11, long j12, androidx.media3.exoplayer.source.r.b bVar) {
    }
}
