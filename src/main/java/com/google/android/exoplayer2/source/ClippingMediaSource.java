package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.f2;
import java.io.IOException;
import java.util.ArrayList;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ClippingMediaSource extends g0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f40318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f40319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f40320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f40321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f40322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList<b> f40323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f2.d f40324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f40325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IllegalClippingException f40326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f40327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f40328w;

    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40329a;

        public IllegalClippingException(int i11) {
            super("Illegal clipping: " + a(i11));
            this.f40329a = i11;
        }

        private static String a(int i11) {
            if (i11 == 0) {
                return "invalid period count";
            }
            if (i11 != 1) {
                return i11 != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    private static final class a extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f40330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f40331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f40332i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f40333j;

        public a(f2 f2Var, long j11, long j12) throws IllegalClippingException {
            super(f2Var);
            boolean z11 = false;
            if (f2Var.m() != 1) {
                throw new IllegalClippingException(0);
            }
            f2.d dVarR = f2Var.r(0, new f2.d());
            long jMax = Math.max(0L, j11);
            if (!dVarR.f39953l && jMax != 0 && !dVarR.f39949h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j12 == Long.MIN_VALUE ? dVarR.f39955n : Math.max(0L, j12);
            long j13 = dVarR.f39955n;
            if (j13 != -9223372036854775807L) {
                jMax2 = jMax2 > j13 ? j13 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f40330g = jMax;
            this.f40331h = jMax2;
            this.f40332i = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarR.f39950i && (jMax2 == -9223372036854775807L || (j13 != -9223372036854775807L && jMax2 == j13))) {
                z11 = true;
            }
            this.f40333j = z11;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.b k(int i11, f2.b bVar, boolean z11) {
            this.f40476f.k(0, bVar, z11);
            long jQ = bVar.q() - this.f40330g;
            long j11 = this.f40332i;
            return bVar.v(bVar.f39922a, bVar.f39923b, 0, j11 != -9223372036854775807L ? j11 - jQ : -9223372036854775807L, jQ);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.d s(int i11, f2.d dVar, long j11) {
            this.f40476f.s(0, dVar, 0L);
            long j12 = dVar.f39958q;
            long j13 = this.f40330g;
            dVar.f39958q = j12 + j13;
            dVar.f39955n = this.f40332i;
            dVar.f39950i = this.f40333j;
            long j14 = dVar.f39954m;
            if (j14 != -9223372036854775807L) {
                long jMax = Math.max(j14, j13);
                dVar.f39954m = jMax;
                long j15 = this.f40331h;
                if (j15 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j15);
                }
                dVar.f39954m = jMax - this.f40330g;
            }
            long jZ0 = p0.Z0(this.f40330g);
            long j16 = dVar.f39946e;
            if (j16 != -9223372036854775807L) {
                dVar.f39946e = j16 + jZ0;
            }
            long j17 = dVar.f39947f;
            if (j17 != -9223372036854775807L) {
                dVar.f39947f = j17 + jZ0;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(o oVar, long j11, long j12) {
        this(oVar, j11, j12, true, false, false);
    }

    private void Q(f2 f2Var) {
        long j11;
        f2Var.r(0, this.f40324s);
        long jG = this.f40324s.g();
        long j12 = Long.MIN_VALUE;
        if (this.f40325t == null || this.f40323r.isEmpty() || this.f40321p) {
            j11 = this.f40318m;
            long j13 = this.f40319n;
            if (this.f40322q) {
                long jE = this.f40324s.e();
                j11 += jE;
                j13 += jE;
            }
            this.f40327v = jG + j11;
            this.f40328w = this.f40319n != Long.MIN_VALUE ? jG + j13 : Long.MIN_VALUE;
            int size = this.f40323r.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f40323r.get(i11).t(this.f40327v, this.f40328w);
            }
            j12 = j13;
        } else {
            j11 = this.f40327v - jG;
            if (this.f40319n != Long.MIN_VALUE) {
                j12 = this.f40328w - jG;
            }
        }
        try {
            a aVar = new a(f2Var, j11, j12);
            this.f40325t = aVar;
            y(aVar);
        } catch (IllegalClippingException e11) {
            this.f40326u = e11;
            for (int i12 = 0; i12 < this.f40323r.size(); i12++) {
                this.f40323r.get(i12).q(this.f40326u);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.g0
    protected void M(f2 f2Var) {
        if (this.f40326u != null) {
            return;
        }
        Q(f2Var);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.o
    public void b() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f40326u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.b();
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ss.b bVar2, long j11) {
        b bVar3 = new b(this.f40454k.g(bVar, bVar2, j11), this.f40320o, this.f40327v, this.f40328w);
        this.f40323r.add(bVar3);
        return bVar3;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void i(n nVar) {
        ts.a.g(this.f40323r.remove(nVar));
        this.f40454k.i(((b) nVar).f40357a);
        if (!this.f40323r.isEmpty() || this.f40321p) {
            return;
        }
        Q(((a) ts.a.e(this.f40325t)).f40476f);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void z() {
        super.z();
        this.f40326u = null;
        this.f40325t = null;
    }

    public ClippingMediaSource(o oVar, long j11, long j12, boolean z11, boolean z12, boolean z13) {
        super((o) ts.a.e(oVar));
        ts.a.a(j11 >= 0);
        this.f40318m = j11;
        this.f40319n = j12;
        this.f40320o = z11;
        this.f40321p = z12;
        this.f40322q = z13;
        this.f40323r = new ArrayList<>();
        this.f40324s = new f2.d();
    }
}
