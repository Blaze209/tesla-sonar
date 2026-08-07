package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p7.t0;
import s7.q0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
final class b0 implements q, w8.r, Loader.b<b>, Loader.f, f0.d {
    private static final Map<String, String> R = N();
    private static final p7.u S = new p7.u.b().j0("icy").y0("application/x-icy").P();
    private boolean A;
    private f B;
    private w8.j0 C;
    private long D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private boolean K;
    private long L;
    private long M;
    private boolean N;
    private int O;
    private boolean P;
    private boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f10853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a f10854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f10855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.a f10857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f10858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f10859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s8.b f10860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f10861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f10862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f10863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p7.u f10864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f10865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Loader f10866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f10867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s7.m f10868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f10869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f10870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f10871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q.a f10872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j9.b f10873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f0[] f10874v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e[] f10875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10877y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10878z;

    class a extends w8.a0 {
        a(w8.j0 j0Var) {
            super(j0Var);
        }

        @Override // w8.a0, w8.j0
        public long g() {
            return b0.this.D;
        }
    }

    final class b implements Loader.e, n.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f10881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v7.o f10882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w f10883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final w8.r f10884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final s7.m f10885f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f10887h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f10889j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private o0 f10891l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f10892m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final w8.i0 f10886g = new w8.i0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10888i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f10880a = n8.i.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private v7.j f10890k = i(0);

        public b(Uri uri, androidx.media3.datasource.a aVar, w wVar, w8.r rVar, s7.m mVar) {
            this.f10881b = uri;
            this.f10882c = new v7.o(aVar);
            this.f10883d = wVar;
            this.f10884e = rVar;
            this.f10885f = mVar;
        }

        private v7.j i(long j11) {
            return new v7.j.b().i(this.f10881b).h(j11).f(b0.this.f10861i).b(6).e(b0.R).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j11, long j12) {
            this.f10886g.f121323a = j11;
            this.f10889j = j12;
            this.f10888i = true;
            this.f10892m = false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0048 */
        @Override // androidx.media3.exoplayer.upstream.Loader.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.b0.b.a():void");
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() {
            this.f10887h = true;
        }

        @Override // androidx.media3.exoplayer.source.n.a
        public void c(s7.c0 c0Var) {
            long jMax = !this.f10892m ? this.f10889j : Math.max(b0.this.P(true), this.f10889j);
            int iA = c0Var.a();
            o0 o0Var = (o0) s7.a.f(this.f10891l);
            o0Var.f(c0Var, iA);
            o0Var.b(jMax, 1, iA, 0, null);
            this.f10892m = true;
        }
    }

    interface c {
        void g(long j11, w8.j0 j0Var, boolean z11);
    }

    private final class d implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10894a;

        public d(int i11) {
            this.f10894a = i11;
        }

        @Override // n8.s
        public void a() throws IOException {
            b0.this.X(this.f10894a);
        }

        @Override // n8.s
        public int b(long j11) {
            return b0.this.i0(this.f10894a, j11);
        }

        @Override // n8.s
        public boolean isReady() {
            return b0.this.S(this.f10894a);
        }

        @Override // n8.s
        public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            return b0.this.e0(this.f10894a, uVar, decoderInputBuffer, i11);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10897b;

        public e(int i11, boolean z11) {
            this.f10896a = i11;
            this.f10897b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f10896a == eVar.f10896a && this.f10897b == eVar.f10897b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f10896a * 31) + (this.f10897b ? 1 : 0);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n8.y f10898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f10899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f10900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f10901d;

        public f(n8.y yVar, boolean[] zArr) {
            this.f10898a = yVar;
            this.f10899b = zArr;
            int i11 = yVar.f93615a;
            this.f10900c = new boolean[i11];
            this.f10901d = new boolean[i11];
        }
    }

    public b0(Uri uri, androidx.media3.datasource.a aVar, w wVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar2, androidx.media3.exoplayer.upstream.b bVar, s.a aVar3, c cVar, s8.b bVar2, String str, int i11, int i12, p7.u uVar, long j11, t8.b bVar3) {
        this.f10853a = uri;
        this.f10854b = aVar;
        this.f10855c = iVar;
        this.f10858f = aVar2;
        this.f10856d = bVar;
        this.f10857e = aVar3;
        this.f10859g = cVar;
        this.f10860h = bVar2;
        this.f10861i = str;
        this.f10862j = i11;
        this.f10863k = i12;
        this.f10864l = uVar;
        this.f10866n = bVar3 != null ? new Loader(bVar3) : new Loader("ProgressiveMediaPeriod");
        this.f10867o = wVar;
        this.f10865m = j11;
        this.f10868p = new s7.m();
        this.f10869q = new Runnable() { // from class: androidx.media3.exoplayer.source.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f11126a.T();
            }
        };
        this.f10870r = new Runnable() { // from class: androidx.media3.exoplayer.source.z
            @Override // java.lang.Runnable
            public final void run() {
                b0.y(this.f11127a);
            }
        };
        this.f10871s = q0.C();
        this.f10875w = new e[0];
        this.f10874v = new f0[0];
        this.M = -9223372036854775807L;
        this.F = 1;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void L() {
        s7.a.h(this.f10877y);
        s7.a.f(this.B);
        s7.a.f(this.C);
    }

    private boolean M(b bVar, int i11) {
        w8.j0 j0Var;
        if (this.K || !((j0Var = this.C) == null || j0Var.g() == -9223372036854775807L)) {
            this.O = i11;
            return true;
        }
        if (this.f10877y && !k0()) {
            this.N = true;
            return false;
        }
        this.H = this.f10877y;
        this.L = 0L;
        this.O = 0;
        for (f0 f0Var : this.f10874v) {
            f0Var.X();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> N() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int O() {
        int iJ = 0;
        for (f0 f0Var : this.f10874v) {
            iJ += f0Var.J();
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z11) {
        long jMax = Long.MIN_VALUE;
        for (int i11 = 0; i11 < this.f10874v.length; i11++) {
            if (z11 || ((f) s7.a.f(this.B)).f10900c[i11]) {
                jMax = Math.max(jMax, this.f10874v[i11].C());
            }
        }
        return jMax;
    }

    private boolean R() {
        return this.M != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.Q || this.f10877y || !this.f10876x || this.C == null) {
            return;
        }
        for (f0 f0Var : this.f10874v) {
            if (f0Var.I() == null) {
                return;
            }
        }
        this.f10868p.d();
        int length = this.f10874v.length;
        t0[] t0VarArr = new t0[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            p7.u uVarP = (p7.u) s7.a.f(this.f10874v[i11].I());
            String str = uVarP.f101544o;
            boolean zO = p7.g0.o(str);
            boolean z11 = zO || p7.g0.t(str);
            zArr[i11] = z11;
            this.f10878z = z11 | this.f10878z;
            this.A = this.f10865m != -9223372036854775807L && length == 1 && p7.g0.q(str);
            j9.b bVar = this.f10873u;
            if (bVar != null) {
                if (zO || this.f10875w[i11].f10897b) {
                    p7.f0 f0Var2 = uVarP.f101541l;
                    uVarP = uVarP.b().r0(f0Var2 == null ? new p7.f0(bVar) : f0Var2.a(bVar)).P();
                }
                if (zO && uVarP.f101537h == -1 && uVarP.f101538i == -1 && bVar.f83119a != -1) {
                    uVarP = uVarP.b().S(bVar.f83119a).P();
                }
            }
            p7.u uVarC = uVarP.c(this.f10855c.e(uVarP));
            t0VarArr[i11] = new t0(Integer.toString(i11), uVarC);
            this.I = uVarC.f101550u | this.I;
        }
        this.B = new f(new n8.y(t0VarArr), zArr);
        if (this.A && this.D == -9223372036854775807L) {
            this.D = this.f10865m;
            this.C = new a(this.C);
        }
        this.f10859g.g(this.D, this.C, this.E);
        this.f10877y = true;
        ((q.a) s7.a.f(this.f10872t)).i(this);
    }

    private void U(int i11) {
        L();
        f fVar = this.B;
        boolean[] zArr = fVar.f10901d;
        if (zArr[i11]) {
            return;
        }
        p7.u uVarC = fVar.f10898a.b(i11).c(0);
        this.f10857e.j(p7.g0.k(uVarC.f101544o), uVarC, 0, null, this.L);
        zArr[i11] = true;
    }

    private void V(int i11) {
        L();
        if (this.N) {
            if (!this.f10878z || this.B.f10899b[i11]) {
                if (this.f10874v[i11].N(false)) {
                    return;
                }
                this.M = 0L;
                this.N = false;
                this.H = true;
                this.L = 0L;
                this.O = 0;
                for (f0 f0Var : this.f10874v) {
                    f0Var.X();
                }
                ((q.a) s7.a.f(this.f10872t)).j(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.f10871s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f11125a.K = true;
            }
        });
    }

    private o0 d0(e eVar) {
        int length = this.f10874v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (eVar.equals(this.f10875w[i11])) {
                return this.f10874v[i11];
            }
        }
        if (this.f10876x) {
            s7.t.i("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f10896a + ") after finishing tracks.");
            return new w8.n();
        }
        f0 f0VarL = f0.l(this.f10860h, this.f10855c, this.f10858f);
        f0VarL.f0(this);
        int i12 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f10875w, i12);
        eVarArr[length] = eVar;
        this.f10875w = (e[]) q0.m(eVarArr);
        f0[] f0VarArr = (f0[]) Arrays.copyOf(this.f10874v, i12);
        f0VarArr[length] = f0VarL;
        this.f10874v = (f0[]) q0.m(f0VarArr);
        return f0VarL;
    }

    private boolean g0(boolean[] zArr, long j11, boolean z11) {
        int length = this.f10874v.length;
        for (int i11 = 0; i11 < length; i11++) {
            f0 f0Var = this.f10874v[i11];
            if (f0Var.F() != 0 || !z11) {
                if (!(this.A ? f0Var.a0(f0Var.A()) : f0Var.b0(j11, this.P)) && (zArr[i11] || !this.f10878z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(w8.j0 j0Var) {
        this.C = this.f10873u == null ? j0Var : new w8.j0.b(-9223372036854775807L);
        this.D = j0Var.g();
        boolean z11 = !this.K && j0Var.g() == -9223372036854775807L;
        this.E = z11;
        this.F = z11 ? 7 : 1;
        if (this.f10877y) {
            this.f10859g.g(this.D, j0Var, z11);
        } else {
            T();
        }
    }

    private void j0() {
        b bVar = new b(this.f10853a, this.f10854b, this.f10867o, this, this.f10868p);
        if (this.f10877y) {
            s7.a.h(R());
            long j11 = this.D;
            if (j11 != -9223372036854775807L && this.M > j11) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            bVar.j(((w8.j0) s7.a.f(this.C)).c(this.M).f121331a.f121337b, this.M);
            for (f0 f0Var : this.f10874v) {
                f0Var.d0(this.M);
            }
            this.M = -9223372036854775807L;
        }
        this.O = O();
        this.f10866n.n(bVar, this, this.f10856d.b(this.F));
    }

    private boolean k0() {
        return this.H || R();
    }

    public static /* synthetic */ void y(b0 b0Var) {
        if (b0Var.Q) {
            return;
        }
        ((q.a) s7.a.f(b0Var.f10872t)).j(b0Var);
    }

    o0 Q() {
        return d0(new e(0, true));
    }

    boolean S(int i11) {
        return !k0() && this.f10874v[i11].N(this.P);
    }

    void W() throws IOException {
        this.f10866n.k(this.f10856d.b(this.F));
    }

    void X(int i11) throws IOException {
        this.f10874v[i11].P();
        W();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, long j11, long j12, boolean z11) {
        v7.o oVar = bVar.f10882c;
        n8.i iVar = new n8.i(bVar.f10880a, bVar.f10890k, oVar.p(), oVar.q(), j11, j12, oVar.o());
        this.f10856d.a(bVar.f10880a);
        this.f10857e.m(iVar, 1, -1, null, 0, null, bVar.f10889j, this.D);
        if (z11) {
            return;
        }
        for (f0 f0Var : this.f10874v) {
            f0Var.X();
        }
        if (this.J > 0) {
            ((q.a) s7.a.f(this.f10872t)).j(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.f0.d
    public void a(p7.u uVar) {
        this.f10871s.post(this.f10869q);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void v(b bVar, long j11, long j12) {
        if (this.D == -9223372036854775807L && this.C != null) {
            long jP = P(true);
            long j13 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.D = j13;
            this.f10859g.g(j13, this.C, this.E);
        }
        v7.o oVar = bVar.f10882c;
        n8.i iVar = new n8.i(bVar.f10880a, bVar.f10890k, oVar.p(), oVar.q(), j11, j12, oVar.o());
        this.f10856d.a(bVar.f10880a);
        this.f10857e.p(iVar, 1, -1, null, 0, null, bVar.f10889j, this.D);
        this.P = true;
        ((q.a) s7.a.f(this.f10872t)).j(this);
    }

    @Override // w8.r
    public o0 b(int i11, int i12) {
        return d0(new e(i11, false));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Loader.c p(b bVar, long j11, long j12, IOException iOException, int i11) {
        b bVar2;
        Loader.c cVarH;
        v7.o oVar = bVar.f10882c;
        n8.i iVar = new n8.i(bVar.f10880a, bVar.f10890k, oVar.p(), oVar.q(), j11, j12, oVar.o());
        long jD = this.f10856d.d(new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(1, -1, null, 0, null, q0.O1(bVar.f10889j), q0.O1(this.D)), iOException, i11));
        if (jD == -9223372036854775807L) {
            cVarH = Loader.f11138g;
            bVar2 = bVar;
        } else {
            int iO = O();
            bVar2 = bVar;
            cVarH = M(bVar2, iO) ? Loader.h(iO > this.O, jD) : Loader.f11137f;
        }
        boolean zC = cVarH.c();
        this.f10857e.r(iVar, 1, -1, null, 0, null, bVar2.f10889j, this.D, iOException, !zC);
        if (!zC) {
            this.f10856d.a(bVar2.f10880a);
        }
        return cVarH;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f10866n.j() && this.f10868p.e();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void q(b bVar, long j11, long j12, int i11) {
        v7.o oVar = bVar.f10882c;
        this.f10857e.v(i11 == 0 ? new n8.i(bVar.f10880a, bVar.f10890k, j11) : new n8.i(bVar.f10880a, bVar.f10890k, oVar.p(), oVar.q(), j11, j12, oVar.o()), 1, -1, null, 0, null, bVar.f10889j, this.D, i11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        long jP;
        L();
        if (this.P || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.M;
        }
        if (this.f10878z) {
            int length = this.f10874v.length;
            jP = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                f fVar = this.B;
                if (fVar.f10899b[i11] && fVar.f10900c[i11] && !this.f10874v[i11].M()) {
                    jP = Math.min(jP, this.f10874v[i11].C());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        return jP == Long.MIN_VALUE ? this.L : jP;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
    }

    int e0(int i11, z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (k0()) {
            return -3;
        }
        U(i11);
        int iU = this.f10874v[i11].U(uVar, decoderInputBuffer, i12, this.P);
        if (iU == -3) {
            V(i11);
        }
        return iU;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return d();
    }

    public void f0() {
        if (this.f10877y) {
            for (f0 f0Var : this.f10874v) {
                f0Var.T();
            }
        }
        this.f10866n.m(this);
        this.f10871s.removeCallbacksAndMessages(null);
        this.f10872t = null;
        this.Q = true;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        L();
        boolean[] zArr = this.B.f10899b;
        if (!this.C.d()) {
            j11 = 0;
        }
        int i11 = 0;
        this.H = false;
        boolean z11 = this.L == j11;
        this.L = j11;
        if (R()) {
            this.M = j11;
            return j11;
        }
        if (this.F == 7 || ((!this.P && !this.f10866n.j()) || !g0(zArr, j11, z11))) {
            this.N = false;
            this.M = j11;
            this.P = false;
            this.I = false;
            if (this.f10866n.j()) {
                f0[] f0VarArr = this.f10874v;
                int length = f0VarArr.length;
                while (i11 < length) {
                    f0VarArr[i11].s();
                    i11++;
                }
                this.f10866n.f();
                return j11;
            }
            this.f10866n.g();
            f0[] f0VarArr2 = this.f10874v;
            int length2 = f0VarArr2.length;
            while (i11 < length2) {
                f0VarArr2[i11].X();
                i11++;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        if (this.I) {
            this.I = false;
            return this.L;
        }
        if (!this.H) {
            return -9223372036854775807L;
        }
        if (!this.P && O() <= this.O) {
            return -9223372036854775807L;
        }
        this.H = false;
        return this.L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void i() {
        for (f0 f0Var : this.f10874v) {
            f0Var.V();
        }
        this.f10867o.release();
    }

    int i0(int i11, long j11) throws Throwable {
        if (k0()) {
            return 0;
        }
        U(i11);
        f0 f0Var = this.f10874v[i11];
        int iH = f0Var.H(j11, this.P);
        f0Var.g0(iH);
        if (iH == 0) {
            V(i11);
        }
        return iH;
    }

    @Override // w8.r
    public void j() {
        this.f10876x = true;
        this.f10871s.post(this.f10869q);
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        L();
        return this.B.f10898a;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        if (this.P || this.f10866n.i() || this.N) {
            return false;
        }
        if ((this.f10877y || this.f10864l != null) && this.J == 0) {
            return false;
        }
        boolean zF = this.f10868p.f();
        if (this.f10866n.j()) {
            return zF;
        }
        j0();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        L();
        if (!this.C.d()) {
            return 0L;
        }
        w8.j0.a aVarC = this.C.c(j11);
        return b0Var.a(j11, aVarC.f121331a.f121336a, aVarC.f121332b.f121336a);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        W();
        if (this.P && !this.f10877y) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        if (this.A) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.B.f10900c;
        int length = this.f10874v.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f10874v[i11].r(j11, z11, zArr[i11]);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        r8.t tVar;
        L();
        f fVar = this.B;
        n8.y yVar = fVar.f10898a;
        boolean[] zArr3 = fVar.f10900c;
        int i11 = this.J;
        int i12 = 0;
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            n8.s sVar = sVarArr[i13];
            if (sVar != null && (tVarArr[i13] == null || !zArr[i13])) {
                int i14 = ((d) sVar).f10894a;
                s7.a.h(zArr3[i14]);
                this.J--;
                zArr3[i14] = false;
                sVarArr[i13] = null;
            }
        }
        boolean z11 = !this.G ? j11 == 0 || this.A : i11 != 0;
        for (int i15 = 0; i15 < tVarArr.length; i15++) {
            if (sVarArr[i15] == null && (tVar = tVarArr[i15]) != null) {
                s7.a.h(tVar.length() == 1);
                s7.a.h(tVar.b(0) == 0);
                int iD = yVar.d(tVar.e());
                s7.a.h(!zArr3[iD]);
                this.J++;
                zArr3[iD] = true;
                this.I = tVar.f().f101550u | this.I;
                sVarArr[i15] = new d(iD);
                zArr2[i15] = true;
                if (!z11) {
                    f0 f0Var = this.f10874v[iD];
                    z11 = (f0Var.F() == 0 || f0Var.b0(j11, true)) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.N = false;
            this.H = false;
            this.I = false;
            if (this.f10866n.j()) {
                f0[] f0VarArr = this.f10874v;
                int length = f0VarArr.length;
                while (i12 < length) {
                    f0VarArr[i12].s();
                    i12++;
                }
                this.f10866n.f();
            } else {
                this.P = false;
                f0[] f0VarArr2 = this.f10874v;
                int length2 = f0VarArr2.length;
                while (i12 < length2) {
                    f0VarArr2[i12].X();
                    i12++;
                }
            }
        } else if (z11) {
            j11 = g(j11);
            while (i12 < sVarArr.length) {
                if (sVarArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.G = true;
        return j11;
    }

    @Override // w8.r
    public void t(final w8.j0 j0Var) {
        this.f10871s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10841a.h0(j0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f10872t = aVar;
        if (this.f10864l == null) {
            this.f10868p.f();
            j0();
        } else {
            b(this.f10863k, 3).g(this.f10864l);
            h0(new w8.e0(new long[]{0}, new long[]{0}, -9223372036854775807L));
            j();
            this.M = j11;
        }
    }
}
