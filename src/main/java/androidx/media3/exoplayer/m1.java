package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class m1 implements Handler.Callback, androidx.media3.exoplayer.source.q.a, r8.a0.a, h2.d, k.a, j2.a, androidx.media3.exoplayer.g.a, u8.k {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final long f10380j0 = s7.q0.O1(10000);
    private final boolean A;
    private final androidx.media3.exoplayer.g B;
    private z7.b0 C;
    private z7.b0 E;
    private boolean F;
    private boolean G;
    private h H;
    private i2 I;
    private e J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private h W;
    private long X;
    private long Y;
    private int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n2[] f10381a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f10382a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2[] f10383b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ExoPlaybackException f10384b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f10385c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f10386c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r8.a0 f10387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r8.b0 f10389e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private ExoPlayer.c f10390e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n1 f10391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s8.d f10393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s7.p f10395h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f10396h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z7.x f10397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f10399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p7.r0.d f10400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p7.r0.b f10401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f10402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f10404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<d> f10405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s7.j f10406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f10407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final s1 f10408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h2 f10409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final z7.v f10410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f10411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final a8.o2 f10412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f10413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final a8.a f10414y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final s7.p f10415z;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private long f10394g0 = -9223372036854775807L;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f10398i0 = 1.0f;
    private z7.a0 D = z7.a0.f127045i;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f10388d0 = -9223372036854775807L;
    private long O = -9223372036854775807L;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private p7.r0 f10392f0 = p7.r0.f101451a;

    class a implements l2.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.l2.a
        public void a() {
            m1.this.T = true;
        }

        @Override // androidx.media3.exoplayer.l2.a
        public void b() {
            if (m1.this.h0() || m1.this.U) {
                m1.this.f10395h.h(2);
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<h2.c> f10417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n8.t f10418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f10419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f10420d;

        /* synthetic */ b(List list, n8.t tVar, int i11, long j11, a aVar) {
            this(list, tVar, i11, j11);
        }

        private b(List<h2.c> list, n8.t tVar, int i11, long j11) {
            this.f10417a = list;
            this.f10418b = tVar;
            this.f10419c = i11;
            this.f10420d = j11;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n8.t f10424d;

        public c(int i11, int i12, int i13, n8.t tVar) {
            this.f10421a = i11;
            this.f10422b = i12;
            this.f10423c = i13;
            this.f10424d = tVar;
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j2 f10425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10428d;

        public d(j2 j2Var) {
            this.f10425a = j2Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f10428d;
            if ((obj == null) != (dVar.f10428d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i11 = this.f10426b - dVar.f10426b;
            return i11 != 0 ? i11 : Long.compare(this.f10427c, dVar.f10427c);
        }

        public void b(int i11, long j11, Object obj) {
            this.f10426b = i11;
            this.f10427c = j11;
            this.f10428d = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i2 f10430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10433e;

        public e(i2 i2Var) {
            this.f10430b = i2Var;
        }

        public void b(int i11) {
            this.f10429a |= i11 > 0;
            this.f10431c += i11;
        }

        public void c(i2 i2Var) {
            this.f10429a |= this.f10430b != i2Var;
            this.f10430b = i2Var;
        }

        public void d(int i11) {
            if (this.f10432d && this.f10433e != 5) {
                s7.a.a(i11 == 5);
                return;
            }
            this.f10429a = true;
            this.f10432d = true;
            this.f10433e = i11;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f10434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f10437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f10438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f10439f;

        public g(androidx.media3.exoplayer.source.r.b bVar, long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.f10434a = bVar;
            this.f10435b = j11;
            this.f10436c = j12;
            this.f10437d = z11;
            this.f10438e = z12;
            this.f10439f = z13;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7.r0 f10440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10442c;

        public h(p7.r0 r0Var, int i11, long j11) {
            this.f10440a = r0Var;
            this.f10441b = i11;
            this.f10442c = j11;
        }
    }

    public m1(Context context, l2[] l2VarArr, l2[] l2VarArr2, r8.a0 a0Var, r8.b0 b0Var, n1 n1Var, s8.d dVar, int i11, boolean z11, a8.a aVar, z7.b0 b0Var2, z7.v vVar, long j11, boolean z12, boolean z13, Looper looper, s7.j jVar, f fVar, a8.o2 o2Var, z7.x xVar, ExoPlayer.c cVar, final u8.k kVar) {
        this.f10407r = fVar;
        this.f10387d = a0Var;
        this.f10389e = b0Var;
        this.f10391f = n1Var;
        this.f10393g = dVar;
        this.Q = i11;
        this.R = z11;
        this.C = b0Var2;
        this.f10410u = vVar;
        this.f10411v = j11;
        this.f10386c0 = j11;
        this.L = z12;
        this.f10413x = z13;
        this.f10406q = jVar;
        this.f10412w = o2Var;
        this.f10390e0 = cVar;
        this.f10414y = aVar;
        this.f10402m = n1Var.h(o2Var);
        this.f10403n = n1Var.l(o2Var);
        i2 i2VarK = i2.k(b0Var);
        this.I = i2VarK;
        this.J = new e(i2VarK);
        this.f10383b = new m2[l2VarArr.length];
        this.f10385c = new boolean[l2VarArr.length];
        m2.a aVarC = a0Var.c();
        this.f10381a = new n2[l2VarArr.length];
        boolean z14 = false;
        for (int i12 = 0; i12 < l2VarArr.length; i12++) {
            l2VarArr[i12].I(i12, o2Var, jVar);
            this.f10383b[i12] = l2VarArr[i12].x();
            if (aVarC != null) {
                this.f10383b[i12].O(aVarC);
            }
            l2 l2Var = l2VarArr2[i12];
            if (l2Var != null) {
                l2Var.I(i12, o2Var, jVar);
                z14 = true;
            }
            this.f10381a[i12] = new n2(l2VarArr[i12], l2VarArr2[i12], i12);
        }
        this.A = z14;
        this.f10404o = new k(this, jVar);
        this.f10405p = new ArrayList<>();
        this.f10400k = new p7.r0.d();
        this.f10401l = new p7.r0.b();
        a0Var.e(this, dVar);
        this.f10382a0 = true;
        s7.p pVarC = jVar.c(looper, null);
        this.f10415z = pVarC;
        this.f10408s = new s1(aVar, pVarC, new p1.a() { // from class: androidx.media3.exoplayer.k1
            @Override // androidx.media3.exoplayer.p1.a
            public final p1 a(q1 q1Var, long j12) {
                return this.f10346a.A(q1Var, j12);
            }
        }, cVar);
        this.f10409t = new h2(this, aVar, pVarC, o2Var);
        z7.x xVar2 = xVar == null ? new z7.x() : xVar;
        this.f10397i = xVar2;
        Looper looperA = xVar2.a();
        this.f10399j = looperA;
        s7.p pVarC2 = jVar.c(looperA, this);
        this.f10395h = pVarC2;
        this.B = new androidx.media3.exoplayer.g(context, looperA, this);
        pVarC2.c(35, new u8.k() { // from class: androidx.media3.exoplayer.l1
            @Override // u8.k
            public final void g(long j12, long j13, p7.u uVar, MediaFormat mediaFormat) {
                m1.k(this.f10376a, kVar, j12, j13, uVar, mediaFormat);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p1 A(q1 q1Var, long j11) {
        return new p1(this.f10383b, j11, this.f10387d, this.f10391f.g(), this.f10409t, q1Var, this.f10389e, this.f10390e0.f9328a);
    }

    private void A0() {
        p1 p1VarY = this.f10408s.y();
        if (p1VarY == null) {
            return;
        }
        int i11 = 0;
        if (p1VarY.k() == null || this.M) {
            if (p1VarY.f10616h.f10637j || this.M) {
                n2[] n2VarArr = this.f10381a;
                int length = n2VarArr.length;
                while (i11 < length) {
                    n2 n2Var = n2VarArr[i11];
                    if (n2Var.x(p1VarY) && n2Var.r(p1VarY)) {
                        long j11 = p1VarY.f10616h.f10632e;
                        n2Var.O(p1VarY, (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? -9223372036854775807L : p1VarY.m() + p1VarY.f10616h.f10632e);
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (g0()) {
            if (y() && this.f10408s.x() == this.f10408s.y()) {
                return;
            }
            if (p1VarY.k().f10614f || this.X >= p1VarY.k().n()) {
                r8.b0 b0VarP = p1VarY.p();
                p1 p1VarD = this.f10408s.d();
                r8.b0 b0VarP2 = p1VarD.p();
                p7.r0 r0Var = this.I.f10283a;
                h2(r0Var, p1VarD.f10616h.f10628a, r0Var, p1VarY.f10616h.f10628a, -9223372036854775807L, false);
                if (p1VarD.f10614f && ((this.A && this.f10394g0 != -9223372036854775807L) || p1VarD.f10609a.h() != -9223372036854775807L)) {
                    this.f10394g0 = -9223372036854775807L;
                    boolean z11 = this.A && !this.f10396h0;
                    if (z11) {
                        for (int i12 = 0; i12 < this.f10381a.length; i12++) {
                            if (b0VarP2.c(i12) && this.f10381a[i12].m() != -2 && !p7.g0.a(b0VarP2.f107156c[i12].f().f101544o, b0VarP2.f107156c[i12].f().f101540k) && !this.f10381a[i12].u()) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        k1(p1VarD.n());
                        if (p1VarD.s()) {
                            return;
                        }
                        this.f10408s.N(p1VarD);
                        Z(false);
                        n0();
                        return;
                    }
                }
                n2[] n2VarArr2 = this.f10381a;
                int length2 = n2VarArr2.length;
                while (i11 < length2) {
                    n2VarArr2[i11].F(b0VarP, b0VarP2, p1VarD.n());
                    i11++;
                }
            }
        }
    }

    private void B(j2 j2Var) {
        if (j2Var.i()) {
            return;
        }
        try {
            j2Var.f().k(j2Var.h(), j2Var.d());
        } finally {
            j2Var.j(true);
        }
    }

    private void B0() {
        p1 p1VarY = this.f10408s.y();
        if (p1VarY == null || this.f10408s.u() == p1VarY || p1VarY.f10617i || !k2()) {
            return;
        }
        this.f10408s.y().f10617i = true;
    }

    private void B1(boolean z11) throws Throwable {
        if (!z11) {
            this.G = false;
            this.f10395h.j(37);
            h hVar = this.H;
            if (hVar != null) {
                e1(hVar, false);
                this.H = null;
            }
        }
        this.F = z11;
        x();
    }

    private void C() {
        if (this.A && y()) {
            for (n2 n2Var : this.f10381a) {
                int iH = n2Var.h();
                n2Var.c(this.f10404o);
                this.V -= iH - n2Var.h();
            }
            this.f10394g0 = -9223372036854775807L;
        }
    }

    private void C0() throws Throwable {
        b0(this.f10409t.i(), true);
    }

    private void D(int i11) {
        int iH = this.f10381a[i11].h();
        this.f10381a[i11].b(this.f10404o);
        t0(i11, false);
        this.V -= iH;
    }

    private void D0(c cVar) throws Throwable {
        this.J.b(1);
        b0(this.f10409t.v(cVar.f10421a, cVar.f10422b, cVar.f10423c, cVar.f10424d), false);
    }

    private void D1(z7.a0 a0Var) {
        this.D = a0Var;
        x();
    }

    private void E() {
        for (int i11 = 0; i11 < this.f10381a.length; i11++) {
            D(i11);
        }
        this.f10394g0 = -9223372036854775807L;
    }

    private void E1(z7.b0 b0Var) {
        this.C = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0187  */
    /* JADX WARN: Code duplicated, block: B:103:0x0190  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:109:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:134:0x013f A[EDGE_INSN: B:134:0x013f->B:84:0x013f BREAK  A[LOOP:1: B:78:0x012c->B:83:0x013c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x0145  */
    private void F() throws ExoPlaybackException {
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        boolean z14;
        boolean z15;
        i2 i2Var;
        int i11;
        int i12;
        n2[] n2VarArr;
        i2 i2Var2;
        long jA = this.f10406q.a();
        this.f10395h.j(2);
        b2();
        int i13 = this.I.f10287e;
        if (i13 == 1 || i13 == 4) {
            return;
        }
        p1 p1VarU = this.f10408s.u();
        if (p1VarU == null) {
            b1(jA);
            return;
        }
        s7.j0.a("doSomeWork");
        g2();
        if (p1VarU.f10614f) {
            this.Y = s7.q0.b1(this.f10406q.elapsedRealtime());
            p1VarU.f10609a.o(this.I.f10301s - this.f10402m, this.f10403n);
            z11 = true;
            z12 = true;
            int i14 = 0;
            while (true) {
                n2[] n2VarArr2 = this.f10381a;
                if (i14 >= n2VarArr2.length) {
                    break;
                }
                n2 n2Var = n2VarArr2[i14];
                if (n2Var.h() == 0) {
                    t0(i14, false);
                } else {
                    n2Var.I(this.X, this.Y);
                    z11 = z11 && n2Var.t();
                    boolean zA = n2Var.a(p1VarU);
                    t0(i14, zA);
                    z12 = z12 && zA;
                    if (!zA) {
                        s0(i14);
                    }
                }
                i14++;
            }
        } else {
            p1VarU.f10609a.n();
            z11 = true;
            z12 = true;
        }
        long j12 = p1VarU.f10616h.f10632e;
        if (z11 && p1VarU.f10614f) {
            if (j12 != -9223372036854775807L) {
                j11 = -9223372036854775807L;
                if (j12 <= this.I.f10301s) {
                }
                if (z13 && this.M) {
                    this.M = false;
                    u1(false, this.I.f10296n, false, 5);
                }
                if (!z13 && p1VarU.f10616h.f10637j) {
                    I1(4);
                    W1();
                } else if (this.I.f10287e != 2 && R1(z12)) {
                    I1(3);
                    this.f10384b0 = null;
                    if (Q1()) {
                        j2(false, false);
                        this.f10404o.f();
                        T1();
                    }
                } else if (this.I.f10287e == 3 && (this.V != 0 ? !z12 : !l0())) {
                    j2(Q1(), false);
                    I1(2);
                    if (this.N) {
                        H0();
                        this.f10410u.c();
                    }
                    W1();
                }
                if (this.I.f10287e == 2) {
                    i12 = 0;
                    while (true) {
                        n2VarArr = this.f10381a;
                        if (i12 >= n2VarArr.length) {
                            break;
                        }
                        if (n2VarArr[i12].x(p1VarU)) {
                            s0(i12);
                        }
                        i12++;
                    }
                    i2Var2 = this.I;
                    if (!i2Var2.f10289g || i2Var2.f10300r >= 500000 || !j0(this.f10408s.n()) || !Q1()) {
                        this.f10388d0 = j11;
                    } else if (this.f10388d0 == j11) {
                        this.f10388d0 = this.f10406q.elapsedRealtime();
                    } else if (this.f10406q.elapsedRealtime() - this.f10388d0 >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                } else {
                    this.f10388d0 = j11;
                }
                if (Q1() || this.I.f10287e != 3) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                z15 = !this.U && this.T && z14;
                i2Var = this.I;
                if (i2Var.f10298p != z15) {
                    this.I = i2Var.i(z15);
                }
                this.T = false;
                if (!z15 && (i11 = this.I.f10287e) != 4 && (z14 || i11 == 2 || (i11 == 3 && this.V != 0))) {
                    b1(jA);
                }
                s7.j0.b();
            }
            j11 = -9223372036854775807L;
            z13 = true;
            if (z13) {
                this.M = false;
                u1(false, this.I.f10296n, false, 5);
            }
            if (!z13) {
                if (this.I.f10287e != 2) {
                    if (this.I.f10287e == 3) {
                        j2(Q1(), false);
                        I1(2);
                        if (this.N) {
                            H0();
                            this.f10410u.c();
                        }
                        W1();
                    }
                } else if (this.I.f10287e == 3) {
                    j2(Q1(), false);
                    I1(2);
                    if (this.N) {
                        H0();
                        this.f10410u.c();
                    }
                    W1();
                }
            } else if (this.I.f10287e != 2) {
                if (this.I.f10287e == 3) {
                    j2(Q1(), false);
                    I1(2);
                    if (this.N) {
                        H0();
                        this.f10410u.c();
                    }
                    W1();
                }
            } else if (this.I.f10287e == 3) {
                j2(Q1(), false);
                I1(2);
                if (this.N) {
                    H0();
                    this.f10410u.c();
                }
                W1();
            }
            if (this.I.f10287e == 2) {
                i12 = 0;
                while (true) {
                    n2VarArr = this.f10381a;
                    if (i12 >= n2VarArr.length) {
                        break;
                        break;
                    } else {
                        if (n2VarArr[i12].x(p1VarU)) {
                            s0(i12);
                        }
                        i12++;
                    }
                }
                i2Var2 = this.I;
                if (!i2Var2.f10289g) {
                    this.f10388d0 = j11;
                } else {
                    this.f10388d0 = j11;
                }
            } else {
                this.f10388d0 = j11;
            }
            if (Q1()) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (this.U) {
            }
            i2Var = this.I;
            if (i2Var.f10298p != z15) {
                this.I = i2Var.i(z15);
            }
            this.T = false;
            if (!z15) {
                b1(jA);
            }
            s7.j0.b();
        }
        j11 = -9223372036854775807L;
        z13 = false;
        if (z13) {
            this.M = false;
            u1(false, this.I.f10296n, false, 5);
        }
        if (!z13) {
            if (this.I.f10287e != 2) {
                if (this.I.f10287e == 3) {
                    j2(Q1(), false);
                    I1(2);
                    if (this.N) {
                        H0();
                        this.f10410u.c();
                    }
                    W1();
                }
            } else if (this.I.f10287e == 3) {
                j2(Q1(), false);
                I1(2);
                if (this.N) {
                    H0();
                    this.f10410u.c();
                }
                W1();
            }
        } else if (this.I.f10287e != 2) {
            if (this.I.f10287e == 3) {
                j2(Q1(), false);
                I1(2);
                if (this.N) {
                    H0();
                    this.f10410u.c();
                }
                W1();
            }
        } else if (this.I.f10287e == 3) {
            j2(Q1(), false);
            I1(2);
            if (this.N) {
                H0();
                this.f10410u.c();
            }
            W1();
        }
        if (this.I.f10287e == 2) {
            i12 = 0;
            while (true) {
                n2VarArr = this.f10381a;
                if (i12 >= n2VarArr.length) {
                    break;
                    break;
                } else {
                    if (n2VarArr[i12].x(p1VarU)) {
                        s0(i12);
                    }
                    i12++;
                }
            }
            i2Var2 = this.I;
            if (!i2Var2.f10289g) {
                this.f10388d0 = j11;
            } else {
                this.f10388d0 = j11;
            }
        } else {
            this.f10388d0 = j11;
        }
        if (Q1()) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (this.U) {
        }
        i2Var = this.I;
        if (i2Var.f10298p != z15) {
            this.I = i2Var.i(z15);
        }
        this.T = false;
        if (!z15) {
            b1(jA);
        }
        s7.j0.b();
    }

    private void F0() {
        for (p1 p1VarU = this.f10408s.u(); p1VarU != null; p1VarU = p1VarU.k()) {
            for (r8.t tVar : p1VarU.p().f107156c) {
                if (tVar != null) {
                    tVar.c();
                }
            }
        }
    }

    private void G(p1 p1Var, int i11, boolean z11, long j11) throws ExoPlaybackException {
        n2 n2Var = this.f10381a[i11];
        if (n2Var.y()) {
            return;
        }
        boolean z12 = p1Var == this.f10408s.u();
        r8.b0 b0VarP = p1Var.p();
        z7.y yVar = b0VarP.f107155b[i11];
        r8.t tVar = b0VarP.f107156c[i11];
        boolean z13 = Q1() && this.I.f10287e == 3;
        boolean z14 = !z11 && z13;
        this.V++;
        n2Var.e(yVar, tVar, p1Var.f10611c[i11], this.X, z14, z12, j11, p1Var.m(), p1Var.f10616h.f10628a, this.f10404o);
        n2Var.n(11, new a(), p1Var);
        if (z13 && z12) {
            n2Var.W();
        }
    }

    private void G0(boolean z11) {
        for (p1 p1VarU = this.f10408s.u(); p1VarU != null; p1VarU = p1VarU.k()) {
            for (r8.t tVar : p1VarU.p().f107156c) {
                if (tVar != null) {
                    tVar.j(z11);
                }
            }
        }
    }

    private void G1(boolean z11) throws ExoPlaybackException {
        this.R = z11;
        int iY = this.f10408s.Y(this.I.f10283a, z11);
        if ((iY & 1) != 0) {
            d1(true);
        } else if ((iY & 2) != 0) {
            C();
        }
        Z(false);
    }

    private void H() throws ExoPlaybackException {
        I(new boolean[this.f10381a.length], this.f10408s.y().n());
    }

    private void H0() {
        for (p1 p1VarU = this.f10408s.u(); p1VarU != null; p1VarU = p1VarU.k()) {
            for (r8.t tVar : p1VarU.p().f107156c) {
                if (tVar != null) {
                    tVar.g();
                }
            }
        }
    }

    private void H1(n8.t tVar) throws Throwable {
        this.J.b(1);
        b0(this.f10409t.D(tVar), false);
    }

    private void I(boolean[] zArr, long j11) throws ExoPlaybackException {
        long j12;
        p1 p1VarY = this.f10408s.y();
        r8.b0 b0VarP = p1VarY.p();
        for (int i11 = 0; i11 < this.f10381a.length; i11++) {
            if (!b0VarP.c(i11)) {
                this.f10381a[i11].L();
            }
        }
        int i12 = 0;
        while (i12 < this.f10381a.length) {
            if (!b0VarP.c(i12) || this.f10381a[i12].x(p1VarY)) {
                j12 = j11;
            } else {
                j12 = j11;
                G(p1VarY, i12, zArr[i12], j12);
            }
            i12++;
            j11 = j12;
        }
    }

    private void I1(int i11) {
        i2 i2Var = this.I;
        if (i2Var.f10287e != i11) {
            if (i11 != 2) {
                this.f10388d0 = -9223372036854775807L;
            }
            if (i11 != 3 && i2Var.f10298p) {
                this.I = i2Var.i(false);
            }
            this.I = this.I.h(i11);
        }
    }

    private void J1(u8.k kVar) {
        for (n2 n2Var : this.f10381a) {
            n2Var.T(kVar);
        }
    }

    private com.google.common.collect.x<p7.f0> K(r8.t[] tVarArr) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        boolean z11 = false;
        for (r8.t tVar : tVarArr) {
            if (tVar != null) {
                p7.f0 f0Var = tVar.h(0).f101541l;
                if (f0Var == null) {
                    aVar.a(new p7.f0(new p7.f0.a[0]));
                } else {
                    aVar.a(f0Var);
                    z11 = true;
                }
            }
        }
        return z11 ? aVar.k() : com.google.common.collect.x.r();
    }

    private void K0() {
        this.J.b(1);
        S0(false, false, false, true);
        this.f10391f.m(this.f10412w);
        I1(this.I.f10283a.u() ? 4 : 2);
        d2();
        this.f10409t.w(this.f10393g.a());
        this.f10395h.h(2);
    }

    private long L() {
        i2 i2Var = this.I;
        return N(i2Var.f10283a, i2Var.f10284b.f11103a, i2Var.f10301s);
    }

    private void L1(Object obj, s7.m mVar) {
        for (n2 n2Var : this.f10381a) {
            n2Var.U(obj);
        }
        int i11 = this.I.f10287e;
        if (i11 == 3 || i11 == 2) {
            this.f10395h.h(2);
        }
        if (mVar != null) {
            mVar.f();
        }
    }

    private long M() {
        long jMin = this.I.f10287e == 3 ? 1000L : f10380j0;
        for (n2 n2Var : this.f10381a) {
            jMin = Math.min(jMin, s7.q0.O1(n2Var.j(this.X, this.Y)));
        }
        if (!this.I.n()) {
            return jMin;
        }
        p1 p1VarK = this.f10408s.u() != null ? this.f10408s.u().k() : null;
        return (p1VarK == null || ((float) this.X) + (((float) s7.q0.b1(jMin)) * this.I.f10297o.f101379a) < ((float) p1VarK.n())) ? jMin : Math.min(jMin, f10380j0);
    }

    private void M0(s7.m mVar) {
        try {
            S0(true, false, true, false);
            N0();
            this.f10391f.p(this.f10412w);
            this.B.h();
            this.f10387d.j();
            I1(1);
        } finally {
            this.f10395h.d(null);
            this.f10397i.b();
            mVar.f();
        }
    }

    private long N(p7.r0 r0Var, Object obj, long j11) {
        r0Var.r(r0Var.l(obj, this.f10401l).f101462c, this.f10400k);
        p7.r0.d dVar = this.f10400k;
        if (dVar.f101486f != -9223372036854775807L && dVar.g()) {
            p7.r0.d dVar2 = this.f10400k;
            if (dVar2.f101489i) {
                return s7.q0.b1(dVar2.b() - this.f10400k.f101486f) - (j11 + this.f10401l.p());
            }
        }
        return -9223372036854775807L;
    }

    private void N0() {
        for (int i11 = 0; i11 < this.f10381a.length; i11++) {
            this.f10383b[i11].r();
            this.f10381a[i11].H();
        }
    }

    private void N1(float f11) {
        this.f10398i0 = f11;
        float f12 = f11 * this.B.f();
        for (n2 n2Var : this.f10381a) {
            n2Var.V(f12);
        }
    }

    private long O(p1 p1Var) {
        if (p1Var == null) {
            return 0L;
        }
        long jM = p1Var.m();
        if (!p1Var.f10614f) {
            return jM;
        }
        int i11 = 0;
        while (true) {
            n2[] n2VarArr = this.f10381a;
            if (i11 >= n2VarArr.length) {
                return jM;
            }
            if (n2VarArr[i11].x(p1Var)) {
                long jK = this.f10381a[i11].k(p1Var);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i11++;
        }
    }

    private void O0(int i11, int i12, n8.t tVar) throws Throwable {
        this.J.b(1);
        b0(this.f10409t.A(i11, i12, tVar), false);
    }

    private boolean O1() {
        p1 p1VarU;
        p1 p1VarK;
        return Q1() && !this.M && (p1VarU = this.f10408s.u()) != null && (p1VarK = p1VarU.k()) != null && this.X >= p1VarK.n() && p1VarK.f10617i;
    }

    private Pair<androidx.media3.exoplayer.source.r.b, Long> P(p7.r0 r0Var) {
        if (r0Var.u()) {
            return Pair.create(i2.l(), 0L);
        }
        Pair<Object, Long> pairN = r0Var.n(this.f10400k, this.f10401l, r0Var.e(this.R), -9223372036854775807L);
        androidx.media3.exoplayer.source.r.b bVarQ = this.f10408s.Q(r0Var, pairN.first, 0L);
        long jLongValue = ((Long) pairN.second).longValue();
        if (bVarQ.b()) {
            r0Var.l(bVarQ.f11103a, this.f10401l);
            jLongValue = bVarQ.f11105c == this.f10401l.m(bVarQ.f11104b) ? this.f10401l.h() : 0L;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    private boolean P1() {
        if (!j0(this.f10408s.n())) {
            return false;
        }
        p1 p1VarN = this.f10408s.n();
        long jU = U(p1VarN.l());
        n1.a aVar = new n1.a(this.f10412w, this.I.f10283a, p1VarN.f10616h.f10628a, p1VarN == this.f10408s.u() ? p1VarN.C(this.X) : p1VarN.C(this.X) - p1VarN.f10616h.f10629b, jU, this.f10404o.e().f101379a, this.I.f10294l, this.N, S1(this.I.f10283a, p1VarN.f10616h.f10628a) ? this.f10410u.b() : -9223372036854775807L, this.O);
        boolean zJ = this.f10391f.j(aVar);
        p1 p1VarU = this.f10408s.u();
        if (zJ || !p1VarU.f10614f || jU >= 500000) {
            return zJ;
        }
        if (this.f10402m <= 0 && !this.f10403n) {
            return zJ;
        }
        p1VarU.f10609a.o(this.I.f10301s, false);
        return this.f10391f.j(aVar);
    }

    private void Q0() throws ExoPlaybackException {
        float f11 = this.f10404o.e().f101379a;
        p1 p1VarY = this.f10408s.y();
        r8.b0 b0Var = null;
        boolean z11 = true;
        for (p1 p1VarU = this.f10408s.u(); p1VarU != null && p1VarU.f10614f; p1VarU = p1VarU.k()) {
            i2 i2Var = this.I;
            r8.b0 b0VarZ = p1VarU.z(f11, i2Var.f10283a, i2Var.f10294l);
            if (p1VarU == this.f10408s.u()) {
                b0Var = b0VarZ;
            }
            if (!b0VarZ.a(p1VarU.p())) {
                if (z11) {
                    p1 p1VarU2 = this.f10408s.u();
                    boolean z12 = (this.f10408s.N(p1VarU2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f10381a.length];
                    long jB = p1VarU2.b((r8.b0) s7.a.f(b0Var), this.I.f10301s, z12, zArr);
                    i2 i2Var2 = this.I;
                    boolean z13 = (i2Var2.f10287e == 4 || jB == i2Var2.f10301s) ? false : true;
                    i2 i2Var3 = this.I;
                    this.I = f0(i2Var3.f10284b, jB, i2Var3.f10285c, i2Var3.f10286d, z13, 5);
                    if (z13) {
                        U0(jB);
                    }
                    C();
                    boolean[] zArr2 = new boolean[this.f10381a.length];
                    int i11 = 0;
                    while (true) {
                        n2[] n2VarArr = this.f10381a;
                        if (i11 >= n2VarArr.length) {
                            break;
                        }
                        int iH = n2VarArr[i11].h();
                        zArr2[i11] = this.f10381a[i11].y();
                        this.f10381a[i11].B(p1VarU2.f10611c[i11], this.f10404o, this.X, zArr[i11]);
                        if (iH - this.f10381a[i11].h() > 0) {
                            t0(i11, false);
                        }
                        this.V -= iH - this.f10381a[i11].h();
                        i11++;
                    }
                    I(zArr2, this.X);
                    p1VarU2.f10617i = true;
                } else {
                    this.f10408s.N(p1VarU);
                    if (p1VarU.f10614f) {
                        long jMax = Math.max(p1VarU.f10616h.f10629b, p1VarU.C(this.X));
                        if (this.A && y() && this.f10408s.x() == p1VarU) {
                            C();
                        }
                        p1VarU.a(b0VarZ, jMax, false);
                    }
                }
                Z(true);
                if (this.I.f10287e != 4) {
                    n0();
                    g2();
                    this.f10395h.h(2);
                    return;
                }
                return;
            }
            if (p1VarU == p1VarY) {
                z11 = false;
            }
        }
    }

    private boolean Q1() {
        i2 i2Var = this.I;
        return i2Var.f10294l && i2Var.f10296n == 0;
    }

    private z7.b0 R(long j11) {
        z7.a0 a0Var;
        Double d11;
        if (!this.F || j11 == -9223372036854775807L || (d11 = (a0Var = this.D).f127047b) == null || a0Var.f127048c == null) {
            return this.C;
        }
        double d12 = j11;
        double dDoubleValue = d11.doubleValue() * d12;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long jF = qu.b.f(dDoubleValue, roundingMode);
        long jF2 = qu.b.f(this.D.f127048c.doubleValue() * d12, roundingMode);
        z7.b0 b0Var = this.E;
        if (b0Var == null || b0Var.f127078a != jF || b0Var.f127079b != jF2) {
            this.E = new z7.b0(jF, jF2);
        }
        return this.E;
    }

    private void R0() throws ExoPlaybackException {
        Q0();
        d1(true);
    }

    private boolean R1(boolean z11) {
        if (this.V == 0) {
            return l0();
        }
        boolean z12 = false;
        if (!z11) {
            return false;
        }
        if (!this.I.f10289g) {
            return true;
        }
        p1 p1VarU = this.f10408s.u();
        long jB = S1(this.I.f10283a, p1VarU.f10616h.f10628a) ? this.f10410u.b() : -9223372036854775807L;
        p1 p1VarN = this.f10408s.n();
        boolean z13 = p1VarN.s() && p1VarN.f10616h.f10637j;
        if (p1VarN.f10616h.f10628a.b() && !p1VarN.f10614f) {
            z12 = true;
        }
        if (z13 || z12) {
            return true;
        }
        return this.f10391f.k(new n1.a(this.f10412w, this.I.f10283a, p1VarU.f10616h.f10628a, p1VarU.C(this.X), U(p1VarN.j()), this.f10404o.e().f101379a, this.I.f10294l, this.N, jB, this.O));
    }

    private long S() {
        if (this.I.f10287e != 3 || Q1()) {
            return f10380j0;
        }
        return 1000L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[PHI: r2 r6 r8
      0x0095: PHI (r2v2 androidx.media3.exoplayer.source.r$b) = (r2v1 androidx.media3.exoplayer.source.r$b), (r2v12 androidx.media3.exoplayer.source.r$b) binds: [B:25:0x006b, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:25:0x006b, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:25:0x006b, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[PHI: r0
      0x00dc: PHI (r0v11 p7.r0) = (r0v10 p7.r0), (r0v10 p7.r0), (r0v21 p7.r0), (r0v21 p7.r0) binds: [B:31:0x00a2, B:33:0x00a6, B:35:0x00b7, B:37:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    private void S0(boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        p7.r0 r0Var;
        androidx.media3.exoplayer.source.r.b bVar;
        this.f10395h.j(2);
        this.G = false;
        this.H = null;
        this.f10384b0 = null;
        j2(false, true);
        this.f10404o.g();
        this.X = 1000000000000L;
        try {
            E();
        } catch (ExoPlaybackException | RuntimeException e11) {
            s7.t.e("ExoPlayerImplInternal", "Disable failed.", e11);
        }
        if (z11) {
            for (n2 n2Var : this.f10381a) {
                try {
                    n2Var.L();
                } catch (RuntimeException e12) {
                    s7.t.e("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.V = 0;
        i2 i2Var = this.I;
        androidx.media3.exoplayer.source.r.b bVar2 = i2Var.f10284b;
        long jLongValue = i2Var.f10301s;
        long j11 = (this.I.f10284b.b() || m0(this.I, this.f10401l)) ? this.I.f10285c : this.I.f10301s;
        if (z12) {
            this.W = null;
            Pair<androidx.media3.exoplayer.source.r.b, Long> pairP = P(this.I.f10283a);
            bVar2 = (androidx.media3.exoplayer.source.r.b) pairP.first;
            jLongValue = ((Long) pairP.second).longValue();
            j11 = -9223372036854775807L;
            z15 = bVar2.equals(this.I.f10284b) ? false : true;
        }
        long j12 = jLongValue;
        long j13 = j11;
        this.f10408s.g();
        this.P = false;
        p7.r0 r0VarJ = this.I.f10283a;
        if (z13 && (r0VarJ instanceof k2)) {
            r0VarJ = ((k2) r0VarJ).J(this.f10409t.q());
            if (bVar2.f11104b != -1) {
                r0VarJ.l(bVar2.f11103a, this.f10401l);
                if (r0VarJ.r(this.f10401l.f101462c, this.f10400k).g()) {
                    r0Var = r0VarJ;
                    bVar = new androidx.media3.exoplayer.source.r.b(bVar2.f11103a, bVar2.f11106d);
                } else {
                    r0Var = r0VarJ;
                    bVar = bVar2;
                }
            } else {
                r0Var = r0VarJ;
                bVar = bVar2;
            }
        } else {
            r0Var = r0VarJ;
            bVar = bVar2;
        }
        i2 i2Var2 = this.I;
        int i11 = i2Var2.f10287e;
        ExoPlaybackException exoPlaybackException = z14 ? null : i2Var2.f10288f;
        n8.y yVar = z15 ? n8.y.f93613d : i2Var2.f10290h;
        r8.b0 b0Var = z15 ? this.f10389e : i2Var2.f10291i;
        List listR = z15 ? com.google.common.collect.x.r() : i2Var2.f10292j;
        i2 i2Var3 = this.I;
        this.I = new i2(r0Var, bVar, j13, j12, i11, exoPlaybackException, false, yVar, b0Var, listR, bVar, i2Var3.f10294l, i2Var3.f10295m, i2Var3.f10296n, i2Var3.f10297o, j12, 0L, j12, 0L, false);
        if (z13) {
            this.f10408s.M();
            this.f10409t.y();
        }
    }

    private boolean S1(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar) {
        if (!bVar.b() && !r0Var.u()) {
            r0Var.r(r0Var.l(bVar.f11103a, this.f10401l).f101462c, this.f10400k);
            if (this.f10400k.g()) {
                p7.r0.d dVar = this.f10400k;
                if (dVar.f101489i && dVar.f101486f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private long T() {
        return U(this.I.f10299q);
    }

    private void T0() {
        p1 p1VarU = this.f10408s.u();
        this.M = p1VarU != null && p1VarU.f10616h.f10636i && this.L;
    }

    private void T1() {
        p1 p1VarU = this.f10408s.u();
        if (p1VarU == null) {
            return;
        }
        r8.b0 b0VarP = p1VarU.p();
        for (int i11 = 0; i11 < this.f10381a.length; i11++) {
            if (b0VarP.c(i11)) {
                this.f10381a[i11].W();
            }
        }
    }

    private long U(long j11) {
        p1 p1VarN = this.f10408s.n();
        if (p1VarN == null) {
            return 0L;
        }
        return Math.max(0L, j11 - p1VarN.C(this.X));
    }

    private void U0(long j11) {
        p1 p1VarU = this.f10408s.u();
        long jD = p1VarU == null ? j11 + 1000000000000L : p1VarU.D(j11);
        this.X = jD;
        this.f10404o.c(jD);
        for (n2 n2Var : this.f10381a) {
            n2Var.M(p1VarU, this.X);
        }
        F0();
    }

    private void V(int i11) {
        i2 i2Var = this.I;
        f2(i2Var.f10294l, i11, i2Var.f10296n, i2Var.f10295m);
    }

    private static void V0(p7.r0 r0Var, d dVar, p7.r0.d dVar2, p7.r0.b bVar) {
        int i11 = r0Var.r(r0Var.l(dVar.f10428d, bVar).f101462c, dVar2).f101495o;
        Object obj = r0Var.k(i11, bVar, true).f101461b;
        long j11 = bVar.f101463d;
        dVar.b(i11, j11 != -9223372036854775807L ? j11 - 1 : Long.MAX_VALUE, obj);
    }

    private void V1(boolean z11, boolean z12) {
        S0(z11 || !this.S, false, true, false);
        this.J.b(z12 ? 1 : 0);
        this.f10391f.o(this.f10412w);
        this.B.n(this.I.f10294l, 1);
        I1(1);
    }

    private void W() {
        N1(this.f10398i0);
    }

    private static boolean W0(d dVar, p7.r0 r0Var, p7.r0 r0Var2, int i11, boolean z11, p7.r0.d dVar2, p7.r0.b bVar) {
        Object obj = dVar.f10428d;
        if (obj == null) {
            Pair<Object, Long> pairZ0 = Z0(r0Var, new h(dVar.f10425a.g(), dVar.f10425a.c(), dVar.f10425a.e() == Long.MIN_VALUE ? -9223372036854775807L : s7.q0.b1(dVar.f10425a.e())), false, i11, z11, dVar2, bVar);
            if (pairZ0 == null) {
                return false;
            }
            dVar.b(r0Var.f(pairZ0.first), ((Long) pairZ0.second).longValue(), pairZ0.first);
            if (dVar.f10425a.e() == Long.MIN_VALUE) {
                V0(r0Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = r0Var.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f10425a.e() == Long.MIN_VALUE) {
            V0(r0Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f10426b = iF;
        r0Var2.l(dVar.f10428d, bVar);
        if (bVar.f101465f && r0Var2.r(bVar.f101462c, dVar2).f101494n == r0Var2.f(dVar.f10428d)) {
            Pair<Object, Long> pairN = r0Var.n(dVar2, bVar, r0Var.l(dVar.f10428d, bVar).f101462c, dVar.f10427c + bVar.p());
            dVar.b(r0Var.f(pairN.first), ((Long) pairN.second).longValue(), pairN.first);
        }
        return true;
    }

    private void W1() {
        this.f10404o.g();
        for (n2 n2Var : this.f10381a) {
            n2Var.Y();
        }
    }

    private void X(androidx.media3.exoplayer.source.q qVar) {
        if (this.f10408s.F(qVar)) {
            this.f10408s.K(this.X);
            n0();
        } else if (this.f10408s.G(qVar)) {
            o0();
        }
    }

    private void X0(p7.r0 r0Var, p7.r0 r0Var2) {
        if (r0Var.u() && r0Var2.u()) {
            return;
        }
        int size = this.f10405p.size() - 1;
        while (size >= 0) {
            p7.r0 r0Var3 = r0Var;
            p7.r0 r0Var4 = r0Var2;
            if (!W0(this.f10405p.get(size), r0Var3, r0Var4, this.Q, this.R, this.f10400k, this.f10401l)) {
                this.f10405p.get(size).f10425a.j(false);
                this.f10405p.remove(size);
            }
            size--;
            r0Var = r0Var3;
            r0Var2 = r0Var4;
        }
        Collections.sort(this.f10405p);
    }

    private void X1() {
        p1 p1VarN = this.f10408s.n();
        boolean z11 = this.P || (p1VarN != null && p1VarN.f10609a.c());
        i2 i2Var = this.I;
        if (z11 != i2Var.f10289g) {
            this.I = i2Var.b(z11);
        }
    }

    private void Y(IOException iOException, int i11) {
        ExoPlaybackException exoPlaybackExceptionL = ExoPlaybackException.l(iOException, i11);
        p1 p1VarU = this.f10408s.u();
        if (p1VarU != null) {
            exoPlaybackExceptionL = exoPlaybackExceptionL.j(p1VarU.f10616h.f10628a);
        }
        s7.t.e("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionL);
        V1(false, false);
        this.I = this.I.f(exoPlaybackExceptionL);
    }

    private static g Y0(p7.r0 r0Var, i2 i2Var, h hVar, s1 s1Var, int i11, boolean z11, p7.r0.d dVar, p7.r0.b bVar) {
        p7.r0 r0Var2;
        p7.r0.b bVar2;
        int iE;
        long jS;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long jH;
        long j11;
        int i12;
        long jLongValue;
        boolean z16;
        boolean z17;
        boolean z18;
        if (r0Var.u()) {
            return new g(i2.l(), 0L, -9223372036854775807L, false, true, false);
        }
        androidx.media3.exoplayer.source.r.b bVar3 = i2Var.f10284b;
        Object obj = bVar3.f11103a;
        boolean zM0 = m0(i2Var, bVar);
        long j12 = (i2Var.f10284b.b() || zM0) ? i2Var.f10285c : i2Var.f10301s;
        boolean z19 = false;
        int i13 = -1;
        if (hVar != null) {
            r0Var2 = r0Var;
            Pair<Object, Long> pairZ0 = Z0(r0Var2, hVar, true, i11, z11, dVar, bVar);
            if (pairZ0 == null) {
                iE = r0Var2.e(z11);
                jLongValue = j12;
                z16 = false;
                z17 = false;
                z18 = true;
            } else {
                if (hVar.f10442c == -9223372036854775807L) {
                    iE = r0Var2.l(pairZ0.first, bVar).f101462c;
                    jLongValue = j12;
                    z16 = false;
                } else {
                    obj = pairZ0.first;
                    jLongValue = ((Long) pairZ0.second).longValue();
                    iE = -1;
                    z16 = true;
                }
                z17 = i2Var.f10287e == 4;
                z18 = false;
            }
            z14 = z16;
            z12 = z17;
            z13 = z18;
            bVar2 = bVar;
            i13 = -1;
            jS = jLongValue;
        } else {
            r0Var2 = r0Var;
            if (i2Var.f10283a.u()) {
                iE = r0Var2.e(z11);
            } else if (r0Var2.f(obj) == -1) {
                int iA1 = a1(dVar, bVar, i11, z11, obj, i2Var.f10283a, r0Var2);
                if (iA1 == -1) {
                    r0Var2 = r0Var2;
                    iA1 = r0Var2.e(z11);
                    z15 = true;
                } else {
                    r0Var2 = r0Var2;
                    z15 = false;
                }
                iE = iA1;
                obj = obj;
                bVar2 = bVar;
                z13 = z15;
                z12 = false;
                z14 = false;
                jS = j12;
            } else if (j12 == -9223372036854775807L) {
                iE = r0Var2.l(obj, bVar).f101462c;
                obj = obj;
            } else if (zM0) {
                i2Var.f10283a.l(bVar3.f11103a, bVar);
                if (i2Var.f10283a.r(bVar.f101462c, dVar).f101494n == i2Var.f10283a.f(bVar3.f11103a)) {
                    bVar2 = bVar;
                    Pair<Object, Long> pairN = r0Var2.n(dVar, bVar2, r0Var2.l(obj, bVar).f101462c, bVar.p() + j12);
                    obj = pairN.first;
                    i13 = -1;
                    jS = ((Long) pairN.second).longValue();
                } else {
                    bVar2 = bVar;
                    if (r0Var2.l(obj, bVar2).f101463d != -9223372036854775807L) {
                        i13 = -1;
                        jS = s7.q0.s(j12, 0L, bVar2.f101463d - 1);
                        obj = obj;
                    } else {
                        i13 = -1;
                        obj = obj;
                        jS = j12;
                    }
                }
                iE = i13;
                z12 = false;
                z13 = false;
                z14 = true;
            } else {
                bVar2 = bVar;
                i13 = -1;
                iE = -1;
                jS = j12;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            bVar2 = bVar;
            z12 = false;
            z13 = false;
            z14 = false;
            jS = j12;
        }
        if (iE != i13) {
            obj = obj;
            Pair<Object, Long> pairN2 = r0Var2.n(dVar, bVar2, iE, -9223372036854775807L);
            obj = pairN2.first;
            jH = ((Long) pairN2.second).longValue();
            j11 = -9223372036854775807L;
        } else {
            obj = obj;
            jH = jS;
            j11 = jH;
        }
        androidx.media3.exoplayer.source.r.b bVarQ = s1Var.Q(r0Var2, obj, jH);
        int i14 = bVarQ.f11107e;
        boolean z21 = i14 == i13 || ((i12 = bVar3.f11107e) != i13 && i14 >= i12);
        if (bVar3.f11103a.equals(obj) && !bVar3.b() && !bVarQ.b() && z21) {
            z19 = true;
        }
        androidx.media3.exoplayer.source.r.b bVar4 = bVarQ;
        boolean zI0 = i0(zM0, bVar3, j12, bVar4, r0Var2.l(obj, bVar2), j11);
        if (z19 || zI0) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jH = i2Var.f10301s;
            } else {
                r0Var2.l(bVar4.f11103a, bVar2);
                jH = bVar4.f11105c == bVar2.m(bVar4.f11104b) ? bVar2.h() : 0L;
            }
        }
        return new g(bVar4, jH, j11, z12, z13, z14);
    }

    private void Y1(androidx.media3.exoplayer.source.r.b bVar, n8.y yVar, r8.b0 b0Var) {
        p1 p1Var = (p1) s7.a.f(this.f10408s.n());
        this.f10391f.q(new n1.a(this.f10412w, this.I.f10283a, bVar, p1Var == this.f10408s.u() ? p1Var.C(this.X) : p1Var.C(this.X) - p1Var.f10616h.f10629b, U(p1Var.j()), this.f10404o.e().f101379a, this.I.f10294l, this.N, S1(this.I.f10283a, p1Var.f10616h.f10628a) ? this.f10410u.b() : -9223372036854775807L, this.O), yVar, b0Var.f107156c);
    }

    private void Z(boolean z11) {
        p1 p1VarN = this.f10408s.n();
        androidx.media3.exoplayer.source.r.b bVar = p1VarN == null ? this.I.f10284b : p1VarN.f10616h.f10628a;
        boolean zEquals = this.I.f10293k.equals(bVar);
        if (!zEquals) {
            this.I = this.I.c(bVar);
        }
        i2 i2Var = this.I;
        i2Var.f10299q = p1VarN == null ? i2Var.f10301s : p1VarN.j();
        this.I.f10300r = T();
        if ((!zEquals || z11) && p1VarN != null && p1VarN.f10614f) {
            Y1(p1VarN.f10616h.f10628a, p1VarN.o(), p1VarN.p());
        }
    }

    private static Pair<Object, Long> Z0(p7.r0 r0Var, h hVar, boolean z11, int i11, boolean z12, p7.r0.d dVar, p7.r0.b bVar) {
        p7.r0 r0Var2;
        int iA1;
        p7.r0 r0Var3 = hVar.f10440a;
        if (r0Var.u()) {
            return null;
        }
        if (r0Var3.u()) {
            r0Var2 = r0Var3;
            r0Var2 = r0Var;
        }
        try {
            r0Var2 = r0Var3;
            Pair<Object, Long> pairN = r0Var2.n(dVar, bVar, hVar.f10441b, hVar.f10442c);
            p7.r0 r0Var4 = r0Var2;
            if (r0Var.equals(r0Var4)) {
                return pairN;
            }
            if (r0Var.f(pairN.first) != -1) {
                return (r0Var4.l(pairN.first, bVar).f101465f && r0Var4.r(bVar.f101462c, dVar).f101494n == r0Var4.f(pairN.first)) ? r0Var.n(dVar, bVar, r0Var.l(pairN.first, bVar).f101462c, hVar.f10442c) : pairN;
            }
            if (z11 && (iA1 = a1(dVar, bVar, i11, z12, pairN.first, r0Var4, r0Var)) != -1) {
                return r0Var.n(dVar, bVar, iA1, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void a0(p1 p1Var) throws ExoPlaybackException {
        if (!p1Var.f10614f) {
            float f11 = this.f10404o.e().f101379a;
            i2 i2Var = this.I;
            p1Var.q(f11, i2Var.f10283a, i2Var.f10294l);
        }
        Y1(p1Var.f10616h.f10628a, p1Var.o(), p1Var.p());
        if (p1Var == this.f10408s.u()) {
            U0(p1Var.f10616h.f10629b);
            H();
            p1Var.f10617i = true;
            i2 i2Var2 = this.I;
            androidx.media3.exoplayer.source.r.b bVar = i2Var2.f10284b;
            long j11 = p1Var.f10616h.f10629b;
            this.I = f0(bVar, j11, i2Var2.f10285c, j11, false, 5);
        }
        n0();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    static int a1(p7.r0.d dVar, p7.r0.b bVar, int i11, boolean z11, Object obj, p7.r0 r0Var, p7.r0 r0Var2) {
        p7.r0.b bVar2;
        Object obj2 = r0Var.r(r0Var.l(obj, bVar).f101462c, dVar).f101481a;
        int i12 = 0;
        for (int i13 = 0; i13 < r0Var2.t(); i13++) {
            if (r0Var2.r(i13, dVar).f101481a.equals(obj2)) {
                return i13;
            }
        }
        int iF = r0Var.f(obj);
        int iM = r0Var.m();
        int iH = iF;
        int iF2 = -1;
        while (i12 < iM && iF2 == -1) {
            p7.r0.d dVar2 = dVar;
            bVar2 = bVar;
            int i14 = i11;
            boolean z12 = z11;
            p7.r0 r0Var3 = r0Var;
            iH = r0Var3.h(iH, bVar2, dVar2, i14, z12);
            if (iH == -1) {
                if (iF2 == -1) {
                    return -1;
                }
                return r0Var2.j(iF2, bVar2).f101462c;
            }
            iF2 = r0Var2.f(r0Var3.q(iH));
            i12++;
            r0Var = r0Var3;
            bVar = bVar2;
            dVar = dVar2;
            i11 = i14;
            z11 = z12;
        }
        bVar2 = bVar;
        if (iF2 == -1) {
            return -1;
        }
        return r0Var2.j(iF2, bVar2).f101462c;
    }

    private void a2(int i11, int i12, List<p7.y> list) throws Throwable {
        this.J.b(1);
        b0(this.f10409t.E(i11, i12, list), false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x0205  */
    /* JADX WARN: Code duplicated, block: B:118:0x020b  */
    /* JADX WARN: Code duplicated, block: B:122:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [long] */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [long] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.media3.exoplayer.m1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    private void b0(p7.r0 r0Var, boolean z11) throws Throwable {
        androidx.media3.exoplayer.source.r.b bVar;
        boolean z12;
        boolean z13;
        ?? r21;
        int i11;
        ?? r12;
        long j11;
        androidx.media3.exoplayer.source.r.b bVar2;
        Object obj;
        ?? r11;
        int i12;
        ?? r22;
        int i13;
        ?? r23;
        ?? r24;
        boolean z14;
        ?? r25;
        p7.r0 r0Var2 = r0Var;
        g gVarY0 = Y0(r0Var2, this.I, this.W, this.f10408s, this.Q, this.R, this.f10400k, this.f10401l);
        androidx.media3.exoplayer.source.r.b bVar3 = gVarY0.f10434a;
        ?? r13 = gVarY0.f10436c;
        boolean z15 = gVarY0.f10437d;
        long jF1 = gVarY0.f10435b;
        boolean z16 = (this.I.f10284b.equals(bVar3) && jF1 == this.I.f10301s) ? false : true;
        int i14 = 4;
        try {
            if (gVarY0.f10438e) {
                if (this.I.f10287e != 1) {
                    I1(4);
                }
                S0(false, false, false, true);
            }
            for (n2 n2Var : this.f10381a) {
                try {
                    n2Var.S(r0Var2);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar3;
                    z13 = false;
                    z12 = true;
                    i11 = -1;
                    r12 = z13;
                    r21 = r13;
                    i2 i2Var = this.I;
                    p7.r0 r0Var3 = i2Var.f10283a;
                    androidx.media3.exoplayer.source.r.b bVar4 = i2Var.f10284b;
                    if (gVarY0.f10439f) {
                        j11 = jF1;
                    } else {
                        j11 = -9223372036854775807L;
                    }
                    bVar2 = bVar;
                    h2(r0Var2, bVar2, r0Var3, bVar4, j11, false);
                    if (z16 || r21 != this.I.f10285c) {
                        i2 i2Var2 = this.I;
                        obj = i2Var2.f10284b.f11103a;
                        p7.r0 r0Var4 = i2Var2.f10283a;
                        if (z16 || !z11 || r0Var4.u() || r0Var4.l(obj, this.f10401l).f101465f) {
                            r11 = r12;
                        } else {
                            r11 = z12;
                        }
                        long j12 = this.I.f10286d;
                        if (r0Var2.f(obj) == i11) {
                            i12 = i14;
                        } else {
                            i12 = 3;
                        }
                        this.I = f0(bVar2, jF1, r21, j12, r11, i12);
                    }
                    T0();
                    X0(r0Var2, this.I.f10283a);
                    this.I = this.I.j(r0Var2);
                    if (!r0Var2.u()) {
                        this.W = null;
                    }
                    Z(r12);
                    this.f10395h.h(2);
                    throw th;
                }
            }
            try {
                if (z16) {
                    i13 = 2;
                    i14 = 4;
                    r25 = r13;
                    z14 = false;
                    z14 = false;
                    z12 = true;
                    i11 = -1;
                    if (!r0Var2.u()) {
                        for (p1 p1VarU = this.f10408s.u(); p1VarU != null; p1VarU = p1VarU.k()) {
                            if (p1VarU.f10616h.f10628a.equals(bVar3)) {
                                r24 = r25;
                                p1VarU.f10616h = this.f10408s.z(r0Var2, p1VarU.f10616h);
                                p1VarU.E();
                            } else {
                                r24 = r25;
                            }
                        }
                        r24 = r25;
                        jF1 = f1(bVar3, jF1, z15);
                        r24 = r25;
                    }
                } else {
                    try {
                        long jO = 0;
                        long jO2 = this.f10408s.y() == null ? 0L : O(this.f10408s.y());
                        if (y() && this.f10408s.x() != null) {
                            jO = O(this.f10408s.x());
                        }
                        try {
                            try {
                                i13 = 2;
                                z12 = true;
                                i14 = 4;
                                r23 = r13;
                                r13 = 0;
                                z14 = false;
                                z14 = false;
                                z14 = false;
                                i11 = -1;
                                try {
                                    int iW = this.f10408s.W(r0Var, this.X, jO2, jO);
                                    r0Var2 = r0Var;
                                    if ((iW & 1) != 0) {
                                        d1(false);
                                        r24 = r23;
                                    } else if ((iW & 2) != 0) {
                                        r24 = r23;
                                        C();
                                        r24 = r23;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r0Var2 = r0Var;
                                    r22 = r23;
                                    r0Var2 = r0Var2;
                                    bVar = bVar3;
                                    r12 = r13;
                                    r21 = r22;
                                    i2 i2Var3 = this.I;
                                    p7.r0 r0Var5 = i2Var3.f10283a;
                                    androidx.media3.exoplayer.source.r.b bVar5 = i2Var3.f10284b;
                                    if (gVarY0.f10439f) {
                                        j11 = jF1;
                                    } else {
                                        j11 = -9223372036854775807L;
                                    }
                                    bVar2 = bVar;
                                    h2(r0Var2, bVar2, r0Var5, bVar5, j11, false);
                                    if (z16) {
                                        i2 i2Var4 = this.I;
                                        obj = i2Var4.f10284b.f11103a;
                                        p7.r0 r0Var6 = i2Var4.f10283a;
                                        if (z16) {
                                            r11 = r12;
                                        } else {
                                            r11 = r12;
                                        }
                                        long j13 = this.I.f10286d;
                                        if (r0Var2.f(obj) == i11) {
                                            i12 = i14;
                                        } else {
                                            i12 = 3;
                                        }
                                        this.I = f0(bVar2, jF1, r21, j13, r11, i12);
                                    } else {
                                        i2 i2Var5 = this.I;
                                        obj = i2Var5.f10284b.f11103a;
                                        p7.r0 r0Var7 = i2Var5.f10283a;
                                        if (z16) {
                                            r11 = r12;
                                        } else {
                                            r11 = r12;
                                        }
                                        long j14 = this.I.f10286d;
                                        if (r0Var2.f(obj) == i11) {
                                            i12 = i14;
                                        } else {
                                            i12 = 3;
                                        }
                                        this.I = f0(bVar2, jF1, r21, j14, r11, i12);
                                    }
                                    T0();
                                    X0(r0Var2, this.I.f10283a);
                                    this.I = this.I.j(r0Var2);
                                    if (!r0Var2.u()) {
                                        this.W = null;
                                    }
                                    Z(r12);
                                    this.f10395h.h(2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r0Var2 = r0Var;
                                i14 = 4;
                                r22 = r13;
                                r13 = 0;
                                z12 = true;
                                i11 = -1;
                                r0Var2 = r0Var2;
                                bVar = bVar3;
                                r12 = r13;
                                r21 = r22;
                                i2 i2Var6 = this.I;
                                p7.r0 r0Var8 = i2Var6.f10283a;
                                androidx.media3.exoplayer.source.r.b bVar6 = i2Var6.f10284b;
                                if (gVarY0.f10439f) {
                                    j11 = jF1;
                                } else {
                                    j11 = -9223372036854775807L;
                                }
                                bVar2 = bVar;
                                h2(r0Var2, bVar2, r0Var8, bVar6, j11, false);
                                if (z16) {
                                    i2 i2Var7 = this.I;
                                    obj = i2Var7.f10284b.f11103a;
                                    p7.r0 r0Var9 = i2Var7.f10283a;
                                    if (z16) {
                                        r11 = r12;
                                    } else {
                                        r11 = r12;
                                    }
                                    long j15 = this.I.f10286d;
                                    if (r0Var2.f(obj) == i11) {
                                        i12 = i14;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.I = f0(bVar2, jF1, r21, j15, r11, i12);
                                } else {
                                    i2 i2Var8 = this.I;
                                    obj = i2Var8.f10284b.f11103a;
                                    p7.r0 r0Var10 = i2Var8.f10283a;
                                    if (z16) {
                                        r11 = r12;
                                    } else {
                                        r11 = r12;
                                    }
                                    long j16 = this.I.f10286d;
                                    if (r0Var2.f(obj) == i11) {
                                        i12 = i14;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.I = f0(bVar2, jF1, r21, j16, r11, i12);
                                }
                                T0();
                                X0(r0Var2, this.I.f10283a);
                                this.I = this.I.j(r0Var2);
                                if (!r0Var2.u()) {
                                    this.W = null;
                                }
                                Z(r12);
                                this.f10395h.h(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r0Var2 = r0Var;
                            i14 = 4;
                            r22 = r13;
                            r13 = 0;
                            z12 = true;
                            i11 = -1;
                            r0Var2 = r0Var2;
                            bVar = bVar3;
                            r12 = r13;
                            r21 = r22;
                            i2 i2Var9 = this.I;
                            p7.r0 r0Var11 = i2Var9.f10283a;
                            androidx.media3.exoplayer.source.r.b bVar7 = i2Var9.f10284b;
                            if (gVarY0.f10439f) {
                                j11 = jF1;
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            h2(r0Var2, bVar2, r0Var11, bVar7, j11, false);
                            if (z16) {
                                i2 i2Var10 = this.I;
                                obj = i2Var10.f10284b.f11103a;
                                p7.r0 r0Var12 = i2Var10.f10283a;
                                if (z16) {
                                    r11 = r12;
                                } else {
                                    r11 = r12;
                                }
                                long j17 = this.I.f10286d;
                                if (r0Var2.f(obj) == i11) {
                                    i12 = i14;
                                } else {
                                    i12 = 3;
                                }
                                this.I = f0(bVar2, jF1, r21, j17, r11, i12);
                            } else {
                                i2 i2Var11 = this.I;
                                obj = i2Var11.f10284b.f11103a;
                                p7.r0 r0Var13 = i2Var11.f10283a;
                                if (z16) {
                                    r11 = r12;
                                } else {
                                    r11 = r12;
                                }
                                long j18 = this.I.f10286d;
                                if (r0Var2.f(obj) == i11) {
                                    i12 = i14;
                                } else {
                                    i12 = 3;
                                }
                                this.I = f0(bVar2, jF1, r21, j18, r11, i12);
                            }
                            T0();
                            X0(r0Var2, this.I.f10283a);
                            this.I = this.I.j(r0Var2);
                            if (!r0Var2.u()) {
                                this.W = null;
                            }
                            Z(r12);
                            this.f10395h.h(2);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                r24 = r23;
                r24 = r25;
                i2 i2Var12 = this.I;
                h2(r0Var2, bVar3, i2Var12.f10283a, i2Var12.f10284b, gVarY0.f10439f ? jF1 : -9223372036854775807L, false);
                p7.r0 r0Var14 = r0Var2;
                if (z16 || r24 != this.I.f10285c) {
                    i2 i2Var13 = this.I;
                    Object obj2 = i2Var13.f10284b.f11103a;
                    p7.r0 r0Var15 = i2Var13.f10283a;
                    this.I = f0(bVar3, jF1, r24, this.I.f10286d, (!z16 || !z11 || r0Var15.u() || r0Var15.l(obj2, this.f10401l).f101465f) ? z14 : z12, r0Var14.f(obj2) == i11 ? i14 : 3);
                }
                T0();
                X0(r0Var14, this.I.f10283a);
                this.I = this.I.j(r0Var14);
                if (!r0Var14.u()) {
                    this.W = null;
                }
                Z(z14);
                this.f10395h.h(i13);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            bVar = bVar3;
            z12 = true;
            z13 = false;
        }
    }

    private void b1(long j11) {
        this.f10395h.i(2, j11 + (h0() ? M() : S()));
    }

    private void b2() throws ExoPlaybackException {
        if (this.I.f10283a.u() || !this.f10409t.t()) {
            return;
        }
        boolean zV0 = v0();
        z0();
        A0();
        B0();
        x0();
        y0(zV0);
    }

    private void c0(androidx.media3.exoplayer.source.q qVar) throws ExoPlaybackException {
        if (this.f10408s.F(qVar)) {
            a0((p1) s7.a.f(this.f10408s.n()));
            return;
        }
        p1 p1VarV = this.f10408s.v(qVar);
        if (p1VarV != null) {
            s7.a.h(!p1VarV.f10614f);
            float f11 = this.f10404o.e().f101379a;
            i2 i2Var = this.I;
            p1VarV.q(f11, i2Var.f10283a, i2Var.f10294l);
            if (this.f10408s.G(qVar)) {
                o0();
            }
        }
    }

    private static int c2(int i11, int i12) {
        if (i11 == -1) {
            return 2;
        }
        if (i12 == 2) {
            return 1;
        }
        return i12;
    }

    private void d0(p7.i0 i0Var, float f11, boolean z11, boolean z12) {
        if (z11) {
            if (z12) {
                this.J.b(1);
            }
            this.I = this.I.g(i0Var);
        }
        l2(i0Var.f101379a);
        for (n2 n2Var : this.f10381a) {
            n2Var.Q(f11, i0Var.f101379a);
        }
    }

    private void d1(boolean z11) throws ExoPlaybackException {
        androidx.media3.exoplayer.source.r.b bVar = this.f10408s.u().f10616h.f10628a;
        long jG1 = g1(bVar, this.I.f10301s, true, false);
        if (jG1 != this.I.f10301s) {
            i2 i2Var = this.I;
            this.I = f0(bVar, jG1, i2Var.f10285c, i2Var.f10286d, z11, 5);
        }
    }

    private void d2() {
        i2 i2Var = this.I;
        e2(i2Var.f10294l, i2Var.f10296n, i2Var.f10295m);
    }

    private void e0(p7.i0 i0Var, boolean z11) {
        d0(i0Var, i0Var.f101379a, true, z11);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    private void e1(h hVar, boolean z11) throws Throwable {
        long jLongValue;
        androidx.media3.exoplayer.source.r.b bVarQ;
        long j11;
        boolean z12;
        long j12;
        androidx.media3.exoplayer.source.r.b bVar;
        long j13;
        long jM;
        boolean z13;
        long jF1;
        long j14;
        androidx.media3.exoplayer.source.r.b bVar2;
        androidx.media3.exoplayer.source.r.b bVar3;
        long j15;
        p1 p1VarU;
        boolean z14;
        i2 i2Var;
        int i11;
        int i12;
        long j16;
        m1 m1Var = this;
        m1Var.J.b(z11 ? 1 : 0);
        if (m1Var.G) {
            m1Var.H = hVar;
            return;
        }
        Pair<Object, Long> pairZ0 = Z0(m1Var.I.f10283a, hVar, true, m1Var.Q, m1Var.R, m1Var.f10400k, m1Var.f10401l);
        try {
            if (pairZ0 != null) {
                Object obj = pairZ0.first;
                jLongValue = ((Long) pairZ0.second).longValue();
                long j17 = hVar.f10442c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                bVarQ = m1Var.f10408s.Q(m1Var.I.f10283a, obj, jLongValue);
                if (bVarQ.b()) {
                    m1Var.I.f10283a.l(bVarQ.f11103a, m1Var.f10401l);
                    jLongValue = m1Var.f10401l.m(bVarQ.f11104b) == bVarQ.f11105c ? m1Var.f10401l.h() : 0L;
                    z12 = true;
                    j12 = j17;
                } else {
                    j11 = 0;
                    z12 = hVar.f10442c == -9223372036854775807L;
                    j12 = j17;
                }
                if (m1Var.I.f10283a.u()) {
                    if (pairZ0 == null) {
                        if (m1Var.I.f10287e != 1) {
                            m1Var.I1(4);
                        }
                        m1Var.S0(false, true, false, true);
                    } else {
                        if (bVarQ.equals(m1Var.I.f10284b)) {
                            p1VarU = m1Var.f10408s.u();
                            if (p1VarU == null && p1VarU.f10614f && jLongValue != j11) {
                                jM = p1VarU.f10609a.m(jLongValue, m1Var.R(m1Var.f10400k.f101493m));
                            } else {
                                jM = jLongValue;
                            }
                            z14 = z12;
                            try {
                                if (s7.q0.O1(jM) == s7.q0.O1(m1Var.I.f10301s) || !((i11 = (i2Var = m1Var.I).f10287e) == 2 || i11 == 3)) {
                                    z12 = z14;
                                } else {
                                    j15 = i2Var.f10301s;
                                    bVar3 = bVarQ;
                                    i12 = 2;
                                    j16 = j15;
                                    z12 = z14;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z12 = z14;
                                bVar = bVarQ;
                                j13 = jLongValue;
                                m1Var.I = m1Var.f0(bVar, j13, j12, j13, z12, 2);
                                throw th;
                            }
                        } else {
                            jM = jLongValue;
                        }
                        m1Var.G = m1Var.F;
                        if (m1Var.I.f10287e == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        jF1 = m1Var.f1(bVarQ, jM, z13);
                        z12 |= jLongValue != jF1;
                        try {
                            i2 i2Var2 = m1Var.I;
                            p7.r0 r0Var = i2Var2.f10283a;
                            j14 = j12;
                            bVar2 = bVarQ;
                            try {
                                m1Var.h2(r0Var, bVar2, r0Var, i2Var2.f10284b, j14, true);
                                bVar3 = bVar2;
                                j12 = j14;
                                j15 = jF1;
                                i12 = 2;
                                j16 = j15;
                                m1Var = this;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = bVar2;
                                j12 = j14;
                                j13 = jF1;
                                m1Var.I = m1Var.f0(bVar, j13, j12, j13, z12, 2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = bVarQ;
                        }
                    }
                    m1Var.I = m1Var.f0(bVar3, j15, j12, j16, z12, i12);
                    return;
                }
                m1Var.W = hVar;
                bVar3 = bVarQ;
                j15 = jLongValue;
                i12 = 2;
                j16 = j15;
                m1Var = this;
                m1Var.I = m1Var.f0(bVar3, j15, j12, j16, z12, i12);
                return;
            }
            Pair<androidx.media3.exoplayer.source.r.b, Long> pairP = m1Var.P(m1Var.I.f10283a);
            bVarQ = (androidx.media3.exoplayer.source.r.b) pairP.first;
            jLongValue = ((Long) pairP.second).longValue();
            z12 = !m1Var.I.f10283a.u();
            j12 = -9223372036854775807L;
            if (m1Var.I.f10283a.u()) {
                if (pairZ0 == null) {
                    if (m1Var.I.f10287e != 1) {
                        m1Var.I1(4);
                    }
                    m1Var.S0(false, true, false, true);
                } else {
                    if (bVarQ.equals(m1Var.I.f10284b)) {
                        p1VarU = m1Var.f10408s.u();
                        if (p1VarU == null) {
                            jM = jLongValue;
                        } else {
                            jM = jLongValue;
                        }
                        z14 = z12;
                        if (s7.q0.O1(jM) == s7.q0.O1(m1Var.I.f10301s)) {
                        }
                        z12 = z14;
                    } else {
                        jM = jLongValue;
                    }
                    m1Var.G = m1Var.F;
                    if (m1Var.I.f10287e == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jF1 = m1Var.f1(bVarQ, jM, z13);
                    z12 |= jLongValue != jF1;
                    i2 i2Var3 = m1Var.I;
                    p7.r0 r0Var2 = i2Var3.f10283a;
                    j14 = j12;
                    bVar2 = bVarQ;
                    m1Var.h2(r0Var2, bVar2, r0Var2, i2Var3.f10284b, j14, true);
                    bVar3 = bVar2;
                    j12 = j14;
                    j15 = jF1;
                    i12 = 2;
                    j16 = j15;
                    m1Var = this;
                }
                m1Var.I = m1Var.f0(bVar3, j15, j12, j16, z12, i12);
                return;
            }
            m1Var.W = hVar;
            bVar3 = bVarQ;
            j15 = jLongValue;
            i12 = 2;
            j16 = j15;
            m1Var = this;
            m1Var.I = m1Var.f0(bVar3, j15, j12, j16, z12, i12);
            return;
        } catch (Throwable th5) {
            th = th5;
        }
        j11 = 0;
    }

    private void e2(boolean z11, int i11, int i12) {
        f2(z11, this.B.n(z11, this.I.f10287e), i11, i12);
    }

    private i2 f0(androidx.media3.exoplayer.source.r.b bVar, long j11, long j12, long j13, boolean z11, int i11) {
        List<p7.f0> list;
        n8.y yVar;
        r8.b0 b0Var;
        this.f10382a0 = (!this.f10382a0 && j11 == this.I.f10301s && bVar.equals(this.I.f10284b)) ? false : true;
        T0();
        i2 i2Var = this.I;
        n8.y yVar2 = i2Var.f10290h;
        r8.b0 b0Var2 = i2Var.f10291i;
        List<p7.f0> listR = i2Var.f10292j;
        if (this.f10409t.t()) {
            p1 p1VarU = this.f10408s.u();
            n8.y yVarO = p1VarU == null ? n8.y.f93613d : p1VarU.o();
            r8.b0 b0VarP = p1VarU == null ? this.f10389e : p1VarU.p();
            com.google.common.collect.x<p7.f0> xVarK = K(b0VarP.f107156c);
            if (p1VarU != null) {
                q1 q1Var = p1VarU.f10616h;
                if (q1Var.f10630c != j12) {
                    p1VarU.f10616h = q1Var.a(j12);
                }
            }
            w0();
            yVar = yVarO;
            b0Var = b0VarP;
            list = xVarK;
        } else {
            if (!bVar.equals(this.I.f10284b)) {
                yVar2 = n8.y.f93613d;
                b0Var2 = this.f10389e;
                listR = com.google.common.collect.x.r();
            }
            list = listR;
            yVar = yVar2;
            b0Var = b0Var2;
        }
        if (z11) {
            this.J.d(i11);
        }
        return this.I.d(bVar, j11, j12, j13, T(), yVar, b0Var, list);
    }

    private long f1(androidx.media3.exoplayer.source.r.b bVar, long j11, boolean z11) {
        return g1(bVar, j11, this.f10408s.u() != this.f10408s.y(), z11);
    }

    private void f2(boolean z11, int i11, int i12, int i13) {
        boolean z12 = z11 && i11 != -1;
        int iC2 = c2(i11, i13);
        int iI2 = i2(i11, i12);
        i2 i2Var = this.I;
        if (i2Var.f10294l == z12 && i2Var.f10296n == iI2 && i2Var.f10295m == iC2) {
            return;
        }
        this.I = i2Var.e(z12, iC2, iI2);
        j2(false, false);
        G0(z12);
        if (!Q1()) {
            W1();
            g2();
            i2 i2Var2 = this.I;
            if (i2Var2.f10298p) {
                this.I = i2Var2.i(false);
            }
            this.f10408s.K(this.X);
            return;
        }
        int i14 = this.I.f10287e;
        if (i14 == 3) {
            this.f10404o.f();
            T1();
            this.f10395h.h(2);
        } else if (i14 == 2) {
            this.f10395h.h(2);
        }
    }

    private boolean g0() {
        p1 p1VarY = this.f10408s.y();
        if (!p1VarY.f10614f) {
            return false;
        }
        int i11 = 0;
        while (true) {
            n2[] n2VarArr = this.f10381a;
            if (i11 >= n2VarArr.length) {
                return true;
            }
            if (!n2VarArr[i11].o(p1VarY)) {
                return false;
            }
            i11++;
        }
    }

    private long g1(androidx.media3.exoplayer.source.r.b bVar, long j11, boolean z11, boolean z12) throws ExoPlaybackException {
        W1();
        j2(false, true);
        if (z12 || this.I.f10287e == 3) {
            I1(2);
        }
        p1 p1VarU = this.f10408s.u();
        p1 p1VarK = p1VarU;
        while (p1VarK != null && !bVar.equals(p1VarK.f10616h.f10628a)) {
            p1VarK = p1VarK.k();
        }
        if (z11 || p1VarU != p1VarK || (p1VarK != null && p1VarK.D(j11) < 0)) {
            E();
            if (p1VarK != null) {
                while (this.f10408s.u() != p1VarK) {
                    this.f10408s.b();
                }
                this.f10408s.N(p1VarK);
                p1VarK.B(1000000000000L);
                H();
                p1VarK.f10617i = true;
            }
        }
        C();
        if (p1VarK != null) {
            this.f10408s.N(p1VarK);
            if (!p1VarK.f10614f) {
                p1VarK.f10616h = p1VarK.f10616h.b(j11);
            } else if (p1VarK.f10615g) {
                j11 = p1VarK.f10609a.g(j11);
                p1VarK.f10609a.o(j11 - this.f10402m, this.f10403n);
            }
            U0(j11);
            n0();
        } else {
            this.f10408s.g();
            U0(j11);
        }
        Z(false);
        this.f10395h.h(2);
        return j11;
    }

    private void g2() {
        p1 p1VarU = this.f10408s.u();
        if (p1VarU == null) {
            return;
        }
        long jH = p1VarU.f10614f ? p1VarU.f10609a.h() : -9223372036854775807L;
        if (jH != -9223372036854775807L) {
            if (!p1VarU.s()) {
                this.f10408s.N(p1VarU);
                Z(false);
                n0();
            }
            U0(jH);
            if (jH != this.I.f10301s) {
                i2 i2Var = this.I;
                long j11 = jH;
                this.I = f0(i2Var.f10284b, j11, i2Var.f10285c, j11, true, 5);
            }
        } else {
            long jH2 = this.f10404o.h(p1VarU != this.f10408s.y());
            this.X = jH2;
            long jC = p1VarU.C(jH2);
            u0(this.I.f10301s, jC);
            if (this.f10404o.C()) {
                boolean z11 = !this.J.f10432d;
                i2 i2Var2 = this.I;
                this.I = f0(i2Var2.f10284b, jC, i2Var2.f10285c, jC, z11, 6);
            } else {
                this.I.o(jC);
            }
        }
        this.I.f10299q = this.f10408s.n().j();
        this.I.f10300r = T();
        i2 i2Var3 = this.I;
        if (i2Var3.f10294l && i2Var3.f10287e == 3 && S1(i2Var3.f10283a, i2Var3.f10284b) && this.I.f10297o.f101379a == 1.0f) {
            float fA = this.f10410u.a(L(), this.I.f10300r);
            if (this.f10404o.e().f101379a != fA) {
                o1(this.I.f10297o.d(fA));
                d0(this.I.f10297o, this.f10404o.e().f101379a, false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h0() {
        if (this.f10413x) {
            return true;
        }
        return this.F && this.D.f127052g;
    }

    private void h1(j2 j2Var) {
        if (j2Var.e() == -9223372036854775807L) {
            i1(j2Var);
            return;
        }
        if (this.I.f10283a.u()) {
            this.f10405p.add(new d(j2Var));
            return;
        }
        d dVar = new d(j2Var);
        p7.r0 r0Var = this.I.f10283a;
        if (!W0(dVar, r0Var, r0Var, this.Q, this.R, this.f10400k, this.f10401l)) {
            j2Var.j(false);
        } else {
            this.f10405p.add(dVar);
            Collections.sort(this.f10405p);
        }
    }

    private void h2(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, p7.r0 r0Var2, androidx.media3.exoplayer.source.r.b bVar2, long j11, boolean z11) {
        if (!S1(r0Var, bVar)) {
            p7.i0 i0Var = bVar.b() ? p7.i0.f101376d : this.I.f10297o;
            if (this.f10404o.e().equals(i0Var)) {
                return;
            }
            o1(i0Var);
            d0(this.I.f10297o, i0Var.f101379a, false, false);
            return;
        }
        r0Var.r(r0Var.l(bVar.f11103a, this.f10401l).f101462c, this.f10400k);
        this.f10410u.e((p7.y.g) s7.q0.l(this.f10400k.f101490j));
        if (j11 != -9223372036854775807L) {
            this.f10410u.d(N(r0Var, bVar.f11103a, j11));
            return;
        }
        if (!Objects.equals(!r0Var2.u() ? r0Var2.r(r0Var2.l(bVar2.f11103a, this.f10401l).f101462c, this.f10400k).f101481a : null, this.f10400k.f101481a) || z11) {
            this.f10410u.d(-9223372036854775807L);
        }
    }

    private static boolean i0(boolean z11, androidx.media3.exoplayer.source.r.b bVar, long j11, androidx.media3.exoplayer.source.r.b bVar2, p7.r0.b bVar3, long j12) {
        if (!z11 && j11 == j12 && bVar.f11103a.equals(bVar2.f11103a)) {
            if (bVar.b() && bVar3.t(bVar.f11104b)) {
                return (bVar3.i(bVar.f11104b, bVar.f11105c) == 4 || bVar3.i(bVar.f11104b, bVar.f11105c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.t(bVar2.f11104b)) {
                return true;
            }
        }
        return false;
    }

    private void i1(j2 j2Var) {
        if (j2Var.b() != this.f10399j) {
            this.f10395h.c(15, j2Var).a();
            return;
        }
        B(j2Var);
        int i11 = this.I.f10287e;
        if (i11 == 3 || i11 == 2) {
            this.f10395h.h(2);
        }
    }

    private static int i2(int i11, int i12) {
        if (i11 == 0) {
            return 1;
        }
        if (i12 == 1) {
            return 0;
        }
        return i12;
    }

    private boolean j0(p1 p1Var) {
        return (p1Var == null || p1Var.r() || p1Var.l() == Long.MIN_VALUE) ? false : true;
    }

    private void j1(final j2 j2Var) {
        Looper looperB = j2Var.b();
        if (looperB.getThread().isAlive()) {
            this.f10406q.c(looperB, null).g(new Runnable() { // from class: androidx.media3.exoplayer.j1
                @Override // java.lang.Runnable
                public final void run() {
                    m1.l(this.f10321a, j2Var);
                }
            });
        } else {
            s7.t.i("TAG", "Trying to send message on a dead thread.");
            j2Var.j(false);
        }
    }

    private void j2(boolean z11, boolean z12) {
        this.N = z11;
        this.O = (!z11 || z12) ? -9223372036854775807L : this.f10406q.elapsedRealtime();
    }

    public static /* synthetic */ void k(m1 m1Var, u8.k kVar, long j11, long j12, p7.u uVar, MediaFormat mediaFormat) {
        m1Var.getClass();
        kVar.g(j11, j12, uVar, mediaFormat);
        m1Var.g(j11, j12, uVar, mediaFormat);
    }

    private boolean k0(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        if (this.f10408s.x() == null || !this.f10408s.x().f10616h.f10628a.equals(bVar)) {
            return false;
        }
        return this.f10381a[i11].v(this.f10408s.x());
    }

    private void k1(long j11) {
        for (n2 n2Var : this.f10381a) {
            n2Var.N(j11);
        }
    }

    private boolean k2() throws ExoPlaybackException {
        p1 p1VarY = this.f10408s.y();
        r8.b0 b0VarP = p1VarY.p();
        boolean z11 = true;
        int i11 = 0;
        while (true) {
            n2[] n2VarArr = this.f10381a;
            if (i11 >= n2VarArr.length) {
                break;
            }
            int iH = n2VarArr[i11].h();
            int iJ = this.f10381a[i11].J(p1VarY, b0VarP, this.f10404o);
            if ((iJ & 2) != 0 && this.U) {
                r1(false);
            }
            this.V -= iH - this.f10381a[i11].h();
            z11 &= (iJ & 1) != 0;
            i11++;
        }
        if (z11) {
            for (int i12 = 0; i12 < this.f10381a.length; i12++) {
                if (b0VarP.c(i12) && !this.f10381a[i12].x(p1VarY)) {
                    G(p1VarY, i12, false, p1VarY.n());
                }
            }
        }
        return z11;
    }

    public static /* synthetic */ void l(m1 m1Var, j2 j2Var) {
        m1Var.getClass();
        try {
            m1Var.B(j2Var);
        } catch (ExoPlaybackException e11) {
            s7.t.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    private boolean l0() {
        p1 p1VarU = this.f10408s.u();
        long j11 = p1VarU.f10616h.f10632e;
        if (p1VarU.f10614f) {
            return j11 == -9223372036854775807L || this.I.f10301s < j11 || !Q1();
        }
        return false;
    }

    private void l2(float f11) {
        for (p1 p1VarU = this.f10408s.u(); p1VarU != null; p1VarU = p1VarU.k()) {
            for (r8.t tVar : p1VarU.p().f107156c) {
                if (tVar != null) {
                    tVar.i(f11);
                }
            }
        }
    }

    private static boolean m0(i2 i2Var, p7.r0.b bVar) {
        androidx.media3.exoplayer.source.r.b bVar2 = i2Var.f10284b;
        p7.r0 r0Var = i2Var.f10283a;
        return r0Var.u() || r0Var.l(bVar2.f11103a, bVar).f101465f;
    }

    private void m1(p7.d dVar, boolean z11) {
        this.f10387d.l(dVar);
        androidx.media3.exoplayer.g gVar = this.B;
        if (!z11) {
            dVar = null;
        }
        gVar.k(dVar);
        d2();
    }

    private void n0() {
        boolean zP1 = P1();
        this.P = zP1;
        if (zP1) {
            p1 p1Var = (p1) s7.a.f(this.f10408s.n());
            p1Var.e(new o1.b().f(p1Var.C(this.X)).g(this.f10404o.e().f101379a).e(this.O).d());
        }
        X1();
    }

    private void n1(boolean z11, s7.m mVar) {
        if (this.S != z11) {
            this.S = z11;
            if (!z11) {
                for (n2 n2Var : this.f10381a) {
                    n2Var.L();
                }
            }
        }
        if (mVar != null) {
            mVar.f();
        }
    }

    private void o0() {
        this.f10408s.I();
        p1 p1VarW = this.f10408s.w();
        if (p1VarW != null) {
            if ((!p1VarW.f10613e || p1VarW.f10614f) && !p1VarW.f10609a.c()) {
                if (this.f10391f.n(this.I.f10283a, p1VarW.f10616h.f10628a, p1VarW.f10614f ? p1VarW.f10609a.d() : 0L)) {
                    if (p1VarW.f10613e) {
                        p1VarW.e(new o1.b().f(p1VarW.C(this.X)).g(this.f10404o.e().f101379a).e(this.O).d());
                    } else {
                        p1VarW.v(this, p1VarW.f10616h.f10629b);
                    }
                }
            }
        }
    }

    private void o1(p7.i0 i0Var) {
        this.f10395h.j(16);
        this.f10404o.j(i0Var);
    }

    private void p0() {
        for (n2 n2Var : this.f10381a) {
            n2Var.D();
        }
    }

    private void p1(b bVar) throws Throwable {
        this.J.b(1);
        if (bVar.f10419c != -1) {
            this.W = new h(new k2(bVar.f10417a, bVar.f10418b), bVar.f10419c, bVar.f10420d);
        }
        b0(this.f10409t.C(bVar.f10417a, bVar.f10418b), false);
    }

    private void q0() {
        this.J.c(this.I);
        if (this.J.f10429a) {
            this.f10407r.a(this.J);
            this.J = new e(this.I);
        }
    }

    private void r(b bVar, int i11) throws Throwable {
        this.J.b(1);
        h2 h2Var = this.f10409t;
        if (i11 == -1) {
            i11 = h2Var.r();
        }
        b0(h2Var.f(i11, bVar.f10417a, bVar.f10418b), false);
    }

    private void r0() throws ExoPlaybackException {
        p1 p1VarX = this.f10408s.x();
        if (p1VarX == null) {
            return;
        }
        r8.b0 b0VarP = p1VarX.p();
        for (int i11 = 0; i11 < this.f10381a.length; i11++) {
            if (b0VarP.c(i11) && this.f10381a[i11].s() && !this.f10381a[i11].u()) {
                this.f10381a[i11].X();
                G(p1VarX, i11, false, p1VarX.n());
            }
        }
        if (y()) {
            this.f10394g0 = p1VarX.f10609a.h();
            if (p1VarX.s()) {
                return;
            }
            this.f10408s.N(p1VarX);
            Z(false);
            n0();
        }
    }

    private void r1(boolean z11) {
        if (z11 == this.U) {
            return;
        }
        this.U = z11;
        if (z11 || !this.I.f10298p) {
            return;
        }
        this.f10395h.h(2);
    }

    private void s0(int i11) {
        n2 n2Var = this.f10381a[i11];
        try {
            n2Var.G((p1) s7.a.f(this.f10408s.u()));
        } catch (IOException | RuntimeException e11) {
            int iM = n2Var.m();
            if (iM != 3 && iM != 5) {
                throw e11;
            }
            r8.b0 b0VarP = this.f10408s.u().p();
            s7.t.e("ExoPlayerImplInternal", "Disabling track due to error: " + p7.u.l(b0VarP.f107156c[i11].f()), e11);
            r8.b0 b0Var = new r8.b0((z7.y[]) b0VarP.f107155b.clone(), (r8.t[]) b0VarP.f107156c.clone(), b0VarP.f107157d, b0VarP.f107158e);
            b0Var.f107155b[i11] = null;
            b0Var.f107156c[i11] = null;
            D(i11);
            this.f10408s.u().a(b0Var, this.I.f10301s, false);
        }
    }

    private void s1(boolean z11) throws ExoPlaybackException {
        this.L = z11;
        T0();
        if (!this.M || this.f10408s.y() == this.f10408s.u()) {
            return;
        }
        d1(true);
        Z(false);
    }

    private void t0(final int i11, final boolean z11) {
        boolean[] zArr = this.f10385c;
        if (zArr[i11] != z11) {
            zArr[i11] = z11;
            this.f10415z.g(new Runnable() { // from class: androidx.media3.exoplayer.i1
                @Override // java.lang.Runnable
                public final void run() {
                    m1 m1Var = this.f10279a;
                    int i12 = i11;
                    m1Var.f10414y.c0(i12, m1Var.f10381a[i12].m(), z11);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u0(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.m1.u0(long, long):void");
    }

    private void u1(boolean z11, int i11, boolean z12, int i12) {
        this.J.b(z12 ? 1 : 0);
        e2(z11, i11, i12);
    }

    private boolean v0() {
        q1 q1VarT;
        this.f10408s.K(this.X);
        boolean z11 = false;
        if (this.f10408s.T() && (q1VarT = this.f10408s.t(this.X, this.I)) != null) {
            p1 p1VarH = this.f10408s.h(q1VarT);
            if (!p1VarH.f10613e) {
                p1VarH.v(this, q1VarT.f10629b);
            } else if (p1VarH.f10614f) {
                this.f10395h.c(8, p1VarH.f10609a).a();
            }
            if (this.f10408s.u() == p1VarH) {
                U0(q1VarT.f10629b);
            }
            Z(false);
            z11 = true;
        }
        if (!this.P) {
            n0();
            return z11;
        }
        this.P = j0(this.f10408s.n());
        X1();
        return z11;
    }

    private void w() {
        r8.b0 b0VarP = this.f10408s.u().p();
        for (int i11 = 0; i11 < this.f10381a.length; i11++) {
            if (b0VarP.c(i11)) {
                this.f10381a[i11].f();
            }
        }
    }

    private void w0() {
        p1 p1VarU;
        boolean z11;
        if (this.f10408s.u() == this.f10408s.y() && (p1VarU = this.f10408s.u()) != null) {
            r8.b0 b0VarP = p1VarU.p();
            boolean z12 = false;
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                if (i11 >= this.f10381a.length) {
                    z11 = true;
                    break;
                }
                if (b0VarP.c(i11)) {
                    if (this.f10381a[i11].m() != 1) {
                        z11 = false;
                        break;
                    } else if (b0VarP.f107155b[i11].f127118a != 0) {
                        z13 = true;
                    }
                }
                i11++;
            }
            if (z13 && z11) {
                z12 = true;
            }
            r1(z12);
        }
    }

    private void w1(p7.i0 i0Var) {
        o1(i0Var);
        e0(this.f10404o.e(), true);
    }

    private void x() {
        for (n2 n2Var : this.f10381a) {
            n2Var.R(this.F ? this.D : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    private void x0() {
        boolean z11;
        boolean z12 = false;
        while (O1()) {
            if (z12) {
                q0();
            }
            this.f10396h0 = false;
            p1 p1Var = (p1) s7.a.f(this.f10408s.b());
            if (this.I.f10284b.f11103a.equals(p1Var.f10616h.f10628a.f11103a)) {
                androidx.media3.exoplayer.source.r.b bVar = this.I.f10284b;
                if (bVar.f11104b == -1) {
                    androidx.media3.exoplayer.source.r.b bVar2 = p1Var.f10616h.f10628a;
                    if (bVar2.f11104b != -1 || bVar.f11107e == bVar2.f11107e) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            q1 q1Var = p1Var.f10616h;
            androidx.media3.exoplayer.source.r.b bVar3 = q1Var.f10628a;
            long j11 = q1Var.f10629b;
            this.I = f0(bVar3, j11, q1Var.f10630c, j11, !z11, 0);
            T0();
            g2();
            if (y() && p1Var == this.f10408s.x()) {
                p0();
            }
            if (this.I.f10287e == 3) {
                T1();
            }
            w();
            z12 = true;
        }
    }

    private void x1(ExoPlayer.c cVar) {
        this.f10390e0 = cVar;
        this.f10408s.V(this.I.f10283a, cVar);
    }

    private boolean y() {
        if (!this.A) {
            return false;
        }
        for (n2 n2Var : this.f10381a) {
            if (n2Var.u()) {
                return true;
            }
        }
        return false;
    }

    private void y0(boolean z11) {
        if (this.f10390e0.f9328a == -9223372036854775807L) {
            return;
        }
        if (z11 || !this.I.f10283a.equals(this.f10392f0)) {
            p7.r0 r0Var = this.I.f10283a;
            this.f10392f0 = r0Var;
            this.f10408s.B(r0Var);
        }
        o0();
    }

    private void z() throws ExoPlaybackException {
        R0();
    }

    private void z0() throws ExoPlaybackException {
        p1 p1VarX;
        if (this.M || !this.A || this.f10396h0 || y() || (p1VarX = this.f10408s.x()) == null || p1VarX != this.f10408s.y() || p1VarX.k() == null || !p1VarX.k().f10614f) {
            return;
        }
        this.f10408s.c();
        r0();
    }

    private void z1(int i11) throws ExoPlaybackException {
        this.Q = i11;
        int iX = this.f10408s.X(this.I.f10283a, i11);
        if ((iX & 1) != 0) {
            d1(true);
        } else if ((iX & 2) != 0) {
            C();
        }
        Z(false);
    }

    public void A1(boolean z11) {
        this.f10395h.c(36, Boolean.valueOf(z11)).a();
    }

    public void C1(z7.a0 a0Var) {
        this.f10395h.c(38, a0Var).a();
    }

    public void E0(int i11, int i12, int i13, n8.t tVar) {
        this.f10395h.c(19, new c(i11, i12, i13, tVar)).a();
    }

    public void F1(boolean z11) {
        this.f10395h.e(12, z11 ? 1 : 0, 0).a();
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public void j(androidx.media3.exoplayer.source.q qVar) {
        this.f10395h.c(9, qVar).a();
    }

    public void J(long j11) {
        this.f10386c0 = j11;
    }

    public void J0() {
        this.f10395h.a(29).a();
    }

    public boolean K1(Object obj, long j11) {
        if (!this.K && this.f10399j.getThread().isAlive()) {
            s7.m mVar = new s7.m(this.f10406q);
            this.f10395h.c(30, new Pair(obj, mVar)).a();
            if (j11 != -9223372036854775807L) {
                return mVar.c(j11);
            }
        }
        return true;
    }

    public boolean L0() {
        if (this.K || !this.f10399j.getThread().isAlive()) {
            return true;
        }
        this.K = true;
        s7.m mVar = new s7.m(this.f10406q);
        this.f10395h.c(7, mVar).a();
        return mVar.c(this.f10411v);
    }

    public void M1(float f11) {
        this.f10395h.c(32, Float.valueOf(f11)).a();
    }

    public void P0(int i11, int i12, n8.t tVar) {
        this.f10395h.k(20, i11, i12, tVar).a();
    }

    public Looper Q() {
        return this.f10399j;
    }

    public void U1() {
        this.f10395h.a(6).a();
    }

    public void Z1(int i11, int i12, List<p7.y> list) {
        this.f10395h.k(27, i11, i12, list).a();
    }

    @Override // r8.a0.a
    public void b() {
        this.f10395h.h(10);
    }

    @Override // androidx.media3.exoplayer.h2.d
    public void c() {
        this.f10395h.j(2);
        this.f10395h.h(22);
    }

    public void c1(p7.r0 r0Var, int i11, long j11) {
        this.f10395h.c(3, new h(r0Var, i11, j11)).a();
    }

    @Override // r8.a0.a
    public void d(l2 l2Var) {
        this.f10395h.h(26);
    }

    @Override // androidx.media3.exoplayer.j2.a
    public void e(j2 j2Var) {
        if (!this.K && this.f10399j.getThread().isAlive()) {
            this.f10395h.c(14, j2Var).a();
        } else {
            s7.t.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            j2Var.j(false);
        }
    }

    @Override // u8.k
    public void g(long j11, long j12, p7.u uVar, MediaFormat mediaFormat) {
        if (this.G) {
            this.f10395h.a(37).a();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i11;
        androidx.media3.exoplayer.source.r.b bVar;
        p1 p1VarY;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i13 = message.arg2;
                    u1(z11, i13 >> 4, true, i13 & 15);
                    break;
                case 2:
                    F();
                    break;
                case 3:
                    e1((h) message.obj, true);
                    break;
                case 4:
                    w1((p7.i0) message.obj);
                    break;
                case 5:
                    E1((z7.b0) message.obj);
                    break;
                case 6:
                    V1(false, true);
                    break;
                case 7:
                    M0((s7.m) message.obj);
                    return true;
                case 8:
                    c0((androidx.media3.exoplayer.source.q) message.obj);
                    break;
                case 9:
                    X((androidx.media3.exoplayer.source.q) message.obj);
                    break;
                case 10:
                    Q0();
                    break;
                case 11:
                    z1(message.arg1);
                    break;
                case 12:
                    G1(message.arg1 != 0);
                    break;
                case 13:
                    n1(message.arg1 != 0, (s7.m) message.obj);
                    break;
                case 14:
                    h1((j2) message.obj);
                    break;
                case 15:
                    j1((j2) message.obj);
                    break;
                case 16:
                    e0((p7.i0) message.obj, false);
                    break;
                case 17:
                    p1((b) message.obj);
                    break;
                case 18:
                    r((b) message.obj, message.arg1);
                    break;
                case 19:
                    D0((c) message.obj);
                    break;
                case 20:
                    O0(message.arg1, message.arg2, (n8.t) message.obj);
                    break;
                case 21:
                    H1((n8.t) message.obj);
                    break;
                case 22:
                    C0();
                    break;
                case 23:
                    s1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    z();
                    break;
                case 26:
                    R0();
                    break;
                case 27:
                    a2(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    x1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    K0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    L1(pair.first, (s7.m) pair.second);
                    break;
                case 31:
                    m1((p7.d) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    N1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    V(message.arg1);
                    break;
                case 34:
                    W();
                    break;
                case 35:
                    J1((u8.k) message.obj);
                    break;
                case 36:
                    B1(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.G = false;
                    h hVar = this.H;
                    if (hVar != null) {
                        e1(hVar, false);
                        this.H = null;
                    }
                    break;
                case 38:
                    D1((z7.a0) message.obj);
                    break;
            }
        } catch (ParserException e11) {
            int i14 = e11.f9011b;
            if (i14 == 1) {
                i12 = e11.f9010a ? AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else if (i14 == 4) {
                i12 = e11.f9010a ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
            }
            Y(e11, i12);
        } catch (DataSourceException e12) {
            Y(e12, e12.f9119a);
        } catch (ExoPlaybackException e13) {
            e = e13;
            if (e.f9294j == 1 && (p1VarY = this.f10408s.y()) != null && e.f9299o == null) {
                e = e.j(p1VarY.f10616h.f10628a);
            }
            if (e.f9294j == 1 && (bVar = e.f9299o) != null && k0(e.f9296l, bVar)) {
                this.f10396h0 = true;
                C();
                p1 p1VarX = this.f10408s.x();
                p1 p1VarU = this.f10408s.u();
                if (this.f10408s.u() != p1VarX) {
                    while (p1VarU != null && p1VarU.k() != p1VarX) {
                        p1VarU = p1VarU.k();
                    }
                }
                this.f10408s.N(p1VarU);
                if (this.I.f10287e != 4) {
                    n0();
                    this.f10395h.h(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.f10384b0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f10384b0;
                }
                if (e.f9294j == 1 && this.f10408s.u() != this.f10408s.y()) {
                    while (this.f10408s.u() != this.f10408s.y()) {
                        this.f10408s.b();
                    }
                    p1 p1Var = (p1) s7.a.f(this.f10408s.u());
                    q0();
                    q1 q1Var = p1Var.f10616h;
                    androidx.media3.exoplayer.source.r.b bVar2 = q1Var.f10628a;
                    long j11 = q1Var.f10629b;
                    this.I = f0(bVar2, j11, q1Var.f10630c, j11, true, 0);
                }
                if (e.f9300p && (this.f10384b0 == null || (i11 = e.f9018a) == 5004 || i11 == 5003)) {
                    s7.t.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f10384b0 == null) {
                        this.f10384b0 = e;
                    }
                    s7.p pVar = this.f10395h;
                    pVar.l(pVar.c(25, e));
                } else {
                    s7.t.e("ExoPlayerImplInternal", "Playback error", e);
                    V1(true, false);
                    this.I = this.I.f(e);
                }
            }
        } catch (DrmSession.DrmSessionException e14) {
            Y(e14, e14.f9783a);
        } catch (BehindLiveWindowException e15) {
            Y(e15, 1002);
        } catch (IOException e16) {
            Y(e16, 2000);
        } catch (RuntimeException e17) {
            ExoPlaybackException exoPlaybackExceptionM = ExoPlaybackException.m(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            s7.t.e("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionM);
            V1(true, false);
            this.I = this.I.f(exoPlaybackExceptionM);
        }
        q0();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void i(androidx.media3.exoplayer.source.q qVar) {
        this.f10395h.c(8, qVar).a();
    }

    public void l1(p7.d dVar, boolean z11) {
        this.f10395h.k(31, z11 ? 1 : 0, 0, dVar).a();
    }

    public void q1(List<h2.c> list, int i11, long j11, n8.t tVar) {
        this.f10395h.c(17, new b(list, tVar, i11, j11, null)).a();
    }

    public void s(int i11, List<h2.c> list, n8.t tVar) {
        this.f10395h.k(18, i11, 0, new b(list, tVar, -1, -9223372036854775807L, null)).a();
    }

    @Override // androidx.media3.exoplayer.g.a
    public void t(float f11) {
        this.f10395h.h(34);
    }

    public void t1(boolean z11, int i11, int i12) {
        this.f10395h.e(1, z11 ? 1 : 0, i11 | (i12 << 4)).a();
    }

    @Override // androidx.media3.exoplayer.g.a
    public void u(int i11) {
        this.f10395h.e(33, i11, 0).a();
    }

    @Override // androidx.media3.exoplayer.k.a
    public void v(p7.i0 i0Var) {
        this.f10395h.c(16, i0Var).a();
    }

    public void v1(p7.i0 i0Var) {
        this.f10395h.c(4, i0Var).a();
    }

    public void y1(int i11) {
        this.f10395h.e(11, i11, 0).a();
    }
}
