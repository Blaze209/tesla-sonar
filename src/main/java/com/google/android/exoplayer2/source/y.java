package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.x0;
import cr.q1;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y extends com.google.android.exoplayer2.source.a implements x.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x0 f40579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x0.h f40580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ss.i.a f40581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s.a f40582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f40583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f40584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f40585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f40586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f40587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f40588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ss.z f40590s;

    class a extends j {
        a(f2 f2Var) {
            super(f2Var);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.b k(int i11, f2.b bVar, boolean z11) {
            super.k(i11, bVar, z11);
            bVar.f39927f = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.d s(int i11, f2.d dVar, long j11) {
            super.s(i11, dVar, j11);
            dVar.f39953l = true;
            return dVar;
        }
    }

    public static final class b implements q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ss.i.a f40592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private s.a f40593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private gr.k f40594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.b f40595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f40596g;

        public b(ss.i.a aVar, final hr.p pVar) {
            this(aVar, new s.a() { // from class: es.p
                @Override // com.google.android.exoplayer2.source.s.a
                public final com.google.android.exoplayer2.source.s a(q1 q1Var) {
                    return y.b.e(pVar, q1Var);
                }
            });
        }

        public static /* synthetic */ s e(hr.p pVar, q1 q1Var) {
            return new es.a(pVar);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public y b(x0 x0Var) {
            ts.a.e(x0Var.f41167b);
            return new y(x0Var, this.f40592c, this.f40593d, this.f40594e.a(x0Var), this.f40595f, this.f40596g, null);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b c(gr.k kVar) {
            this.f40594e = (gr.k) ts.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(com.google.android.exoplayer2.upstream.b bVar) {
            this.f40595f = (com.google.android.exoplayer2.upstream.b) ts.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(ss.i.a aVar, s.a aVar2) {
            this(aVar, aVar2, new com.google.android.exoplayer2.drm.g(), new com.google.android.exoplayer2.upstream.a(), PKIFailureInfo.badCertTemplate);
        }

        public b(ss.i.a aVar, s.a aVar2, gr.k kVar, com.google.android.exoplayer2.upstream.b bVar, int i11) {
            this.f40592c = aVar;
            this.f40593d = aVar2;
            this.f40594e = kVar;
            this.f40595f = bVar;
            this.f40596g = i11;
        }
    }

    /* synthetic */ y(x0 x0Var, ss.i.a aVar, s.a aVar2, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.b bVar, int i11, a aVar3) {
        this(x0Var, aVar, aVar2, jVar, bVar, i11);
    }

    private void A() {
        f2 sVar = new es.s(this.f40587p, this.f40588q, false, this.f40589r, null, this.f40579h);
        if (this.f40586o) {
            sVar = new a(sVar);
        }
        y(sVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public x0 a() {
        return this.f40579h;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void b() {
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ss.b bVar2, long j11) {
        ss.i iVarA = this.f40581j.a();
        ss.z zVar = this.f40590s;
        if (zVar != null) {
            iVarA.m(zVar);
        }
        return new x(this.f40580i.f41264a, iVarA, this.f40582k.a(v()), this.f40583l, q(bVar), this.f40584m, s(bVar), this, bVar2, this.f40580i.f41269f, this.f40585n);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void i(n nVar) {
        ((x) nVar).c0();
    }

    @Override // com.google.android.exoplayer2.source.x.b
    public void m(long j11, boolean z11, boolean z12) {
        if (j11 == -9223372036854775807L) {
            j11 = this.f40587p;
        }
        if (!this.f40586o && this.f40587p == j11 && this.f40588q == z11 && this.f40589r == z12) {
            return;
        }
        this.f40587p = j11;
        this.f40588q = z11;
        this.f40589r = z12;
        this.f40586o = false;
        A();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void x(ss.z zVar) {
        this.f40590s = zVar;
        this.f40583l.e((Looper) ts.a.e(Looper.myLooper()), v());
        this.f40583l.b();
        A();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void z() {
        this.f40583l.release();
    }

    private y(x0 x0Var, ss.i.a aVar, s.a aVar2, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.b bVar, int i11) {
        this.f40580i = (x0.h) ts.a.e(x0Var.f41167b);
        this.f40579h = x0Var;
        this.f40581j = aVar;
        this.f40582k = aVar2;
        this.f40583l = jVar;
        this.f40584m = bVar;
        this.f40585n = i11;
        this.f40586o = true;
        this.f40587p = -9223372036854775807L;
    }
}
