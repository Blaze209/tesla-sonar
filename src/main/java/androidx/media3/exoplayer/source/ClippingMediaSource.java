package androidx.media3.exoplayer.source;

import java.io.IOException;
import java.util.ArrayList;
import p7.r0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class ClippingMediaSource extends l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f10789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f10790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f10791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f10792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f10793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f10794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<androidx.media3.exoplayer.source.b> f10795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final r0.d f10796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f10797u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private IllegalClippingException f10798v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f10799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f10800x;

    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10801a;

        public IllegalClippingException(int i11) {
            this(i11, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i11, long j11, long j12) {
            if (i11 == 0) {
                return "invalid period count";
            }
            if (i11 == 1) {
                return "not seekable to start";
            }
            if (i11 != 2) {
                return "unknown";
            }
            s7.a.h((j11 == -9223372036854775807L || j12 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j11 + ", End time: " + j12;
        }

        public IllegalClippingException(int i11, long j11, long j12) {
            super("Illegal clipping: " + a(i11, j11, j12));
            this.f10801a = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f10802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10803b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f10808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f10809h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10805d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10804c = Long.MIN_VALUE;

        public b(r rVar) {
            this.f10802a = (r) s7.a.f(rVar);
        }

        public ClippingMediaSource h() {
            this.f10809h = true;
            return new ClippingMediaSource(this);
        }

        public b i(boolean z11) {
            s7.a.h(!this.f10809h);
            this.f10806e = z11;
            return this;
        }

        public b j(boolean z11) {
            s7.a.h(!this.f10809h);
            this.f10808g = z11;
            return this;
        }

        public b k(boolean z11) {
            s7.a.h(!this.f10809h);
            this.f10805d = z11;
            return this;
        }

        public b l(long j11) {
            s7.a.h(!this.f10809h);
            this.f10804c = j11;
            return this;
        }

        public b m(boolean z11) {
            s7.a.h(!this.f10809h);
            this.f10807f = z11;
            return this;
        }

        public b n(long j11) {
            s7.a.a(j11 >= 0);
            s7.a.h(!this.f10809h);
            this.f10803b = j11;
            return this;
        }
    }

    private static final class c extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f10810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f10811g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f10812h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f10813i;

        public c(r0 r0Var, long j11, long j12, boolean z11) throws IllegalClippingException {
            super(r0Var);
            if (j12 != Long.MIN_VALUE && j12 < j11) {
                throw new IllegalClippingException(2, j11, j12);
            }
            boolean z12 = false;
            if (r0Var.m() != 1) {
                throw new IllegalClippingException(0);
            }
            r0.d dVarR = r0Var.r(0, new r0.d());
            long jMax = Math.max(0L, j11);
            if (!z11 && !dVarR.f101491k && jMax != 0 && !dVarR.f101488h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j12 == Long.MIN_VALUE ? dVarR.f101493m : Math.max(0L, j12);
            long j13 = dVarR.f101493m;
            if (j13 != -9223372036854775807L) {
                jMax2 = jMax2 > j13 ? j13 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f10810f = jMax;
            this.f10811g = jMax2;
            this.f10812h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarR.f101489i && (jMax2 == -9223372036854775807L || (j13 != -9223372036854775807L && jMax2 == j13))) {
                z12 = true;
            }
            this.f10813i = z12;
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.b k(int i11, r0.b bVar, boolean z11) {
            this.f11075e.k(0, bVar, z11);
            long jP = bVar.p() - this.f10810f;
            long j11 = this.f10812h;
            return bVar.u(bVar.f101460a, bVar.f101461b, 0, j11 != -9223372036854775807L ? j11 - jP : -9223372036854775807L, jP);
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.d s(int i11, r0.d dVar, long j11) {
            this.f11075e.s(0, dVar, 0L);
            long j12 = dVar.f101496p;
            long j13 = this.f10810f;
            dVar.f101496p = j12 + j13;
            dVar.f101493m = this.f10812h;
            dVar.f101489i = this.f10813i;
            long j14 = dVar.f101492l;
            if (j14 != -9223372036854775807L) {
                long jMax = Math.max(j14, j13);
                dVar.f101492l = jMax;
                long j15 = this.f10811g;
                if (j15 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j15);
                }
                dVar.f101492l = jMax - this.f10810f;
            }
            long jO1 = q0.O1(this.f10810f);
            long j16 = dVar.f101485e;
            if (j16 != -9223372036854775807L) {
                dVar.f101485e = j16 + jO1;
            }
            long j17 = dVar.f101486f;
            if (j17 != -9223372036854775807L) {
                dVar.f101486f = j17 + jO1;
            }
            return dVar;
        }
    }

    private void X(r0 r0Var) {
        long j11;
        r0Var.r(0, this.f10796t);
        long jF = this.f10796t.f();
        long j12 = Long.MIN_VALUE;
        if (this.f10797u == null || this.f10795s.isEmpty() || this.f10792p) {
            j11 = this.f10789m;
            long j13 = this.f10790n;
            if (this.f10793q) {
                long jD = this.f10796t.d();
                j11 += jD;
                j13 += jD;
            }
            this.f10799w = jF + j11;
            this.f10800x = this.f10790n != Long.MIN_VALUE ? jF + j13 : Long.MIN_VALUE;
            int size = this.f10795s.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f10795s.get(i11).x(this.f10799w, this.f10800x);
            }
            j12 = j13;
        } else {
            j11 = this.f10799w - jF;
            if (this.f10790n != Long.MIN_VALUE) {
                j12 = this.f10800x - jF;
            }
        }
        try {
            c cVar = new c(r0Var, j11, j12, this.f10794r);
            this.f10797u = cVar;
            F(cVar);
        } catch (IllegalClippingException e11) {
            this.f10798v = e11;
            for (int i12 = 0; i12 < this.f10795s.size(); i12++) {
                this.f10795s.get(i12).v(this.f10798v);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected void G() {
        super.G();
        this.f10798v = null;
        this.f10797u = null;
    }

    @Override // androidx.media3.exoplayer.source.l0
    protected void U(r0 r0Var) {
        if (this.f10798v != null) {
            return;
        }
        X(r0Var);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.r
    public void b() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f10798v;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.b();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        s7.a.h(this.f10795s.remove(qVar));
        this.f11074k.h(((androidx.media3.exoplayer.source.b) qVar).f10843a);
        if (!this.f10795s.isEmpty() || this.f10792p) {
            return;
        }
        X(((c) s7.a.f(this.f10797u)).f11075e);
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(p7.y yVar) {
        return a().f101686f.equals(yVar.f101686f) && this.f11074k.k(yVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q r(r.b bVar, s8.b bVar2, long j11) {
        androidx.media3.exoplayer.source.b bVar3 = new androidx.media3.exoplayer.source.b(this.f11074k.r(bVar, bVar2, j11), this.f10791o, this.f10799w, this.f10800x);
        this.f10795s.add(bVar3);
        return bVar3;
    }

    @Deprecated
    public ClippingMediaSource(r rVar, long j11, long j12) {
        this(new b(rVar).n(j11).l(j12));
    }

    private ClippingMediaSource(b bVar) {
        super(bVar.f10802a);
        this.f10789m = bVar.f10803b;
        this.f10790n = bVar.f10804c;
        this.f10791o = bVar.f10805d;
        this.f10792p = bVar.f10806e;
        this.f10793q = bVar.f10807f;
        this.f10794r = bVar.f10808g;
        this.f10795s = new ArrayList<>();
        this.f10796t = new r0.d();
    }
}
