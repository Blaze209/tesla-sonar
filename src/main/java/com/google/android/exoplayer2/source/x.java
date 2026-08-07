package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import br.l0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class x implements n, hr.m, Loader.b<a>, Loader.f, b0.d {
    private static final Map<String, String> M = L();
    private static final u0 N = new u0.b().U("icy").g0("application/x-icy").G();
    private boolean A;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private long G;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f40531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ss.i f40532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f40533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f40534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p.a f40535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f40536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f40537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ss.b f40538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f40539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f40540j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s f40542l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n.a f40547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private yr.b f40548r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f40551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40552v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e f40554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private hr.z f40555y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Loader f40541k = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ts.g f40543m = new ts.g();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f40544n = new Runnable() { // from class: com.google.android.exoplayer2.source.t
        @Override // java.lang.Runnable
        public final void run() {
            this.f40526a.R();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f40545o = new Runnable() { // from class: com.google.android.exoplayer2.source.u
        @Override // java.lang.Runnable
        public final void run() {
            x.x(this.f40527a);
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f40546p = p0.v();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d[] f40550t = new d[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b0[] f40549s = new b0[0];
    private long H = -9223372036854775807L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f40556z = -9223372036854775807L;
    private int B = 1;

    final class a implements Loader.e, k.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f40558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ss.y f40559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s f40560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final hr.m f40561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ts.g f40562f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f40564h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f40566j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private hr.b0 f40568l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f40569m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final hr.y f40563g = new hr.y();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f40565i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f40557a = es.h.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ss.l f40567k = i(0);

        public a(Uri uri, ss.i iVar, s sVar, hr.m mVar, ts.g gVar) {
            this.f40558b = uri;
            this.f40559c = new ss.y(iVar);
            this.f40560d = sVar;
            this.f40561e = mVar;
            this.f40562f = gVar;
        }

        private ss.l i(long j11) {
            return new ss.l.b().h(this.f40558b).g(j11).f(x.this.f40539i).b(6).e(x.M).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j11, long j12) {
            this.f40563g.f73403a = j11;
            this.f40566j = j12;
            this.f40565i = true;
            this.f40569m = false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0027 */
        @Override // com.google.android.exoplayer2.upstream.Loader.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.x.a.a():void");
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.f40564h = true;
        }

        @Override // com.google.android.exoplayer2.source.k.a
        public void c(ts.d0 d0Var) {
            long jMax = !this.f40569m ? this.f40566j : Math.max(x.this.N(true), this.f40566j);
            int iA = d0Var.a();
            hr.b0 b0Var = (hr.b0) ts.a.e(this.f40568l);
            b0Var.d(d0Var, iA);
            b0Var.e(jMax, 1, iA, 0, null);
            this.f40569m = true;
        }
    }

    interface b {
        void m(long j11, boolean z11, boolean z12);
    }

    private final class c implements es.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40571a;

        public c(int i11) {
            this.f40571a = i11;
        }

        @Override // es.q
        public void a() throws IOException {
            x.this.V(this.f40571a);
        }

        @Override // es.q
        public int b(long j11) {
            return x.this.f0(this.f40571a, j11);
        }

        @Override // es.q
        public int c(br.r rVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            return x.this.b0(this.f40571a, rVar, decoderInputBuffer, i11);
        }

        @Override // es.q
        public boolean isReady() {
            return x.this.Q(this.f40571a);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40574b;

        public d(int i11, boolean z11) {
            this.f40573a = i11;
            this.f40574b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f40573a == dVar.f40573a && this.f40574b == dVar.f40574b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f40573a * 31) + (this.f40574b ? 1 : 0);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final es.w f40575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f40576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f40577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f40578d;

        public e(es.w wVar, boolean[] zArr) {
            this.f40575a = wVar;
            this.f40576b = zArr;
            int i11 = wVar.f63213a;
            this.f40577c = new boolean[i11];
            this.f40578d = new boolean[i11];
        }
    }

    public x(Uri uri, ss.i iVar, s sVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar, com.google.android.exoplayer2.upstream.b bVar, p.a aVar2, b bVar2, ss.b bVar3, String str, int i11) {
        this.f40531a = uri;
        this.f40532b = iVar;
        this.f40533c = jVar;
        this.f40536f = aVar;
        this.f40534d = bVar;
        this.f40535e = aVar2;
        this.f40537g = bVar2;
        this.f40538h = bVar3;
        this.f40539i = str;
        this.f40540j = i11;
        this.f40542l = sVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void J() {
        ts.a.g(this.f40552v);
        ts.a.e(this.f40554x);
        ts.a.e(this.f40555y);
    }

    private boolean K(a aVar, int i11) {
        hr.z zVar;
        if (this.F || !((zVar = this.f40555y) == null || zVar.g() == -9223372036854775807L)) {
            this.J = i11;
            return true;
        }
        if (this.f40552v && !h0()) {
            this.I = true;
            return false;
        }
        this.D = this.f40552v;
        this.G = 0L;
        this.J = 0;
        for (b0 b0Var : this.f40549s) {
            b0Var.M();
        }
        aVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> L() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int M() {
        int iA = 0;
        for (b0 b0Var : this.f40549s) {
            iA += b0Var.A();
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N(boolean z11) {
        long jMax = Long.MIN_VALUE;
        for (int i11 = 0; i11 < this.f40549s.length; i11++) {
            if (z11 || ((e) ts.a.e(this.f40554x)).f40577c[i11]) {
                jMax = Math.max(jMax, this.f40549s[i11].t());
            }
        }
        return jMax;
    }

    private boolean P() {
        return this.H != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.L || this.f40552v || !this.f40551u || this.f40555y == null) {
            return;
        }
        for (b0 b0Var : this.f40549s) {
            if (b0Var.z() == null) {
                return;
            }
        }
        this.f40543m.c();
        int length = this.f40549s.length;
        es.u[] uVarArr = new es.u[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            u0 u0VarG = (u0) ts.a.e(this.f40549s[i11].z());
            String str = u0VarG.f40712l;
            boolean zL = ts.y.l(str);
            boolean z11 = zL || ts.y.o(str);
            zArr[i11] = z11;
            this.f40553w = z11 | this.f40553w;
            yr.b bVar = this.f40548r;
            if (bVar != null) {
                if (zL || this.f40550t[i11].f40574b) {
                    ur.a aVar = u0VarG.f40710j;
                    u0VarG = u0VarG.b().Z(aVar == null ? new ur.a(bVar) : aVar.a(bVar)).G();
                }
                if (zL && u0VarG.f40706f == -1 && u0VarG.f40707g == -1 && bVar.f125783a != -1) {
                    u0VarG = u0VarG.b().I(bVar.f125783a).G();
                }
            }
            uVarArr[i11] = new es.u(Integer.toString(i11), u0VarG.c(this.f40533c.d(u0VarG)));
        }
        this.f40554x = new e(new es.w(uVarArr), zArr);
        this.f40552v = true;
        ((n.a) ts.a.e(this.f40547q)).j(this);
    }

    private void S(int i11) {
        J();
        e eVar = this.f40554x;
        boolean[] zArr = eVar.f40578d;
        if (zArr[i11]) {
            return;
        }
        u0 u0VarC = eVar.f40575a.b(i11).c(0);
        this.f40535e.g(ts.y.i(u0VarC.f40712l), u0VarC, 0, null, this.G);
        zArr[i11] = true;
    }

    private void T(int i11) {
        J();
        boolean[] zArr = this.f40554x.f40576b;
        if (this.I && zArr[i11]) {
            if (this.f40549s[i11].D(false)) {
                return;
            }
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (b0 b0Var : this.f40549s) {
                b0Var.M();
            }
            ((n.a) ts.a.e(this.f40547q)).i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.f40546p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f40528a.F = true;
            }
        });
    }

    private hr.b0 a0(d dVar) {
        int length = this.f40549s.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (dVar.equals(this.f40550t[i11])) {
                return this.f40549s[i11];
            }
        }
        b0 b0VarK = b0.k(this.f40538h, this.f40533c, this.f40536f);
        b0VarK.S(this);
        int i12 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f40550t, i12);
        dVarArr[length] = dVar;
        this.f40550t = (d[]) p0.k(dVarArr);
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.f40549s, i12);
        b0VarArr[length] = b0VarK;
        this.f40549s = (b0[]) p0.k(b0VarArr);
        return b0VarK;
    }

    private boolean d0(boolean[] zArr, long j11) {
        int length = this.f40549s.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.f40549s[i11].P(j11, false) && (zArr[i11] || !this.f40553w)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(hr.z zVar) {
        this.f40555y = this.f40548r == null ? zVar : new hr.z.b(-9223372036854775807L);
        this.f40556z = zVar.g();
        boolean z11 = !this.F && zVar.g() == -9223372036854775807L;
        this.A = z11;
        this.B = z11 ? 7 : 1;
        this.f40537g.m(this.f40556z, zVar.d(), this.A);
        if (this.f40552v) {
            return;
        }
        R();
    }

    private void g0() {
        a aVar = new a(this.f40531a, this.f40532b, this.f40542l, this, this.f40543m);
        if (this.f40552v) {
            ts.a.g(P());
            long j11 = this.f40556z;
            if (j11 != -9223372036854775807L && this.H > j11) {
                this.K = true;
                this.H = -9223372036854775807L;
                return;
            }
            aVar.j(((hr.z) ts.a.e(this.f40555y)).c(this.H).f73404a.f73302b, this.H);
            for (b0 b0Var : this.f40549s) {
                b0Var.Q(this.H);
            }
            this.H = -9223372036854775807L;
        }
        this.J = M();
        this.f40535e.o(new es.h(aVar.f40557a, aVar.f40567k, this.f40541k.n(aVar, this, this.f40534d.b(this.B))), 1, -1, null, 0, null, aVar.f40566j, this.f40556z);
    }

    private boolean h0() {
        return this.D || P();
    }

    public static /* synthetic */ void x(x xVar) {
        if (xVar.L) {
            return;
        }
        ((n.a) ts.a.e(xVar.f40547q)).i(xVar);
    }

    hr.b0 O() {
        return a0(new d(0, true));
    }

    boolean Q(int i11) {
        return !h0() && this.f40549s[i11].D(this.K);
    }

    void U() throws IOException {
        this.f40541k.k(this.f40534d.b(this.B));
    }

    void V(int i11) throws IOException {
        this.f40549s[i11].F();
        U();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void q(a aVar, long j11, long j12, boolean z11) {
        ss.y yVar = aVar.f40559c;
        es.h hVar = new es.h(aVar.f40557a, aVar.f40567k, yVar.o(), yVar.p(), j11, j12, yVar.n());
        this.f40534d.a(aVar.f40557a);
        this.f40535e.i(hVar, 1, -1, null, 0, null, aVar.f40566j, this.f40556z);
        if (z11) {
            return;
        }
        for (b0 b0Var : this.f40549s) {
            b0Var.M();
        }
        if (this.E > 0) {
            ((n.a) ts.a.e(this.f40547q)).i(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void r(a aVar, long j11, long j12) {
        hr.z zVar;
        if (this.f40556z == -9223372036854775807L && (zVar = this.f40555y) != null) {
            boolean zD = zVar.d();
            long jN = N(true);
            long j13 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.f40556z = j13;
            this.f40537g.m(j13, zD, this.A);
        }
        ss.y yVar = aVar.f40559c;
        es.h hVar = new es.h(aVar.f40557a, aVar.f40567k, yVar.o(), yVar.p(), j11, j12, yVar.n());
        this.f40534d.a(aVar.f40557a);
        this.f40535e.k(hVar, 1, -1, null, 0, null, aVar.f40566j, this.f40556z);
        this.K = true;
        ((n.a) ts.a.e(this.f40547q)).i(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Loader.c t(a aVar, long j11, long j12, IOException iOException, int i11) {
        a aVar2;
        Loader.c cVarG;
        ss.y yVar = aVar.f40559c;
        es.h hVar = new es.h(aVar.f40557a, aVar.f40567k, yVar.o(), yVar.p(), j11, j12, yVar.n());
        long jC = this.f40534d.c(new com.google.android.exoplayer2.upstream.b.a(hVar, new es.i(1, -1, null, 0, null, p0.Z0(aVar.f40566j), p0.Z0(this.f40556z)), iOException, i11));
        if (jC == -9223372036854775807L) {
            cVarG = Loader.f41043g;
            aVar2 = aVar;
        } else {
            int iM = M();
            aVar2 = aVar;
            cVarG = K(aVar2, iM) ? Loader.g(iM > this.J, jC) : Loader.f41042f;
        }
        boolean zC = cVarG.c();
        this.f40535e.m(hVar, 1, -1, null, 0, null, aVar2.f40566j, this.f40556z, iOException, !zC);
        if (!zC) {
            this.f40534d.a(aVar2.f40557a);
        }
        return cVarG;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean a(long j11) {
        if (this.K || this.f40541k.h() || this.I) {
            return false;
        }
        if (this.f40552v && this.E == 0) {
            return false;
        }
        boolean zE = this.f40543m.e();
        if (this.f40541k.i()) {
            return zE;
        }
        g0();
        return true;
    }

    @Override // hr.m
    public hr.b0 b(int i11, int i12) {
        return a0(new d(i11, false));
    }

    int b0(int i11, br.r rVar, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (h0()) {
            return -3;
        }
        S(i11);
        int iJ = this.f40549s[i11].J(rVar, decoderInputBuffer, i12, this.K);
        if (iJ == -3) {
            T(i11);
        }
        return iJ;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean c() {
        return this.f40541k.i() && this.f40543m.d();
    }

    public void c0() {
        if (this.f40552v) {
            for (b0 b0Var : this.f40549s) {
                b0Var.I();
            }
        }
        this.f40541k.m(this);
        this.f40546p.removeCallbacksAndMessages(null);
        this.f40547q = null;
        this.L = true;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long d() {
        long jN;
        J();
        if (this.K || this.E == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.H;
        }
        if (this.f40553w) {
            int length = this.f40549s.length;
            jN = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                e eVar = this.f40554x;
                if (eVar.f40576b[i11] && eVar.f40577c[i11] && !this.f40549s[i11].C()) {
                    jN = Math.min(jN, this.f40549s[i11].t());
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = N(false);
        }
        return jN == Long.MIN_VALUE ? this.G : jN;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void e(long j11) {
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long f() {
        return d();
    }

    int f0(int i11, long j11) throws Throwable {
        if (h0()) {
            return 0;
        }
        S(i11);
        b0 b0Var = this.f40549s[i11];
        int iY = b0Var.y(j11, this.K);
        b0Var.T(iY);
        if (iY == 0) {
            T(i11);
        }
        return iY;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long g(long j11) {
        J();
        boolean[] zArr = this.f40554x.f40576b;
        if (!this.f40555y.d()) {
            j11 = 0;
        }
        int i11 = 0;
        this.D = false;
        this.G = j11;
        if (P()) {
            this.H = j11;
            return j11;
        }
        if (this.B == 7 || !d0(zArr, j11)) {
            this.I = false;
            this.H = j11;
            this.K = false;
            if (this.f40541k.i()) {
                b0[] b0VarArr = this.f40549s;
                int length = b0VarArr.length;
                while (i11 < length) {
                    b0VarArr[i11].p();
                    i11++;
                }
                this.f40541k.e();
                return j11;
            }
            this.f40541k.f();
            b0[] b0VarArr2 = this.f40549s;
            int length2 = b0VarArr2.length;
            while (i11 < length2) {
                b0VarArr2[i11].M();
                i11++;
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long h() {
        if (!this.D) {
            return -9223372036854775807L;
        }
        if (!this.K && M() <= this.J) {
            return -9223372036854775807L;
        }
        this.D = false;
        return this.G;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void i() {
        for (b0 b0Var : this.f40549s) {
            b0Var.K();
        }
        this.f40542l.release();
    }

    @Override // hr.m
    public void j() {
        this.f40551u = true;
        this.f40546p.post(this.f40544n);
    }

    @Override // com.google.android.exoplayer2.source.n
    public es.w k() {
        J();
        return this.f40554x.f40575a;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j11, l0 l0Var) {
        J();
        if (!this.f40555y.d()) {
            return 0L;
        }
        hr.z.a aVarC = this.f40555y.c(j11);
        return l0Var.a(j11, aVarC.f73404a.f73301a, aVarC.f73405b.f73301a);
    }

    @Override // com.google.android.exoplayer2.source.b0.d
    public void m(u0 u0Var) {
        this.f40546p.post(this.f40544n);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n() throws IOException {
        U();
        if (this.K && !this.f40552v) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public void o(long j11, boolean z11) {
        J();
        if (P()) {
            return;
        }
        boolean[] zArr = this.f40554x.f40577c;
        int length = this.f40549s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f40549s[i11].o(j11, z11, zArr[i11]);
        }
    }

    @Override // hr.m
    public void p(final hr.z zVar) {
        this.f40546p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f40529a.e0(zVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.n
    public void s(n.a aVar, long j11) {
        this.f40547q = aVar;
        this.f40543m.e();
        g0();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long u(qs.r[] rVarArr, boolean[] zArr, es.q[] qVarArr, boolean[] zArr2, long j11) {
        qs.r rVar;
        J();
        e eVar = this.f40554x;
        es.w wVar = eVar.f40575a;
        boolean[] zArr3 = eVar.f40577c;
        int i11 = this.E;
        int i12 = 0;
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            es.q qVar = qVarArr[i13];
            if (qVar != null && (rVarArr[i13] == null || !zArr[i13])) {
                int i14 = ((c) qVar).f40571a;
                ts.a.g(zArr3[i14]);
                this.E--;
                zArr3[i14] = false;
                qVarArr[i13] = null;
            }
        }
        boolean z11 = !this.C ? j11 == 0 : i11 != 0;
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (qVarArr[i15] == null && (rVar = rVarArr[i15]) != null) {
                ts.a.g(rVar.length() == 1);
                ts.a.g(rVar.b(0) == 0);
                int iC = wVar.c(rVar.e());
                ts.a.g(!zArr3[iC]);
                this.E++;
                zArr3[iC] = true;
                qVarArr[i15] = new c(iC);
                zArr2[i15] = true;
                if (!z11) {
                    b0 b0Var = this.f40549s[iC];
                    z11 = (b0Var.P(j11, true) || b0Var.w() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            if (this.f40541k.i()) {
                b0[] b0VarArr = this.f40549s;
                int length = b0VarArr.length;
                while (i12 < length) {
                    b0VarArr[i12].p();
                    i12++;
                }
                this.f40541k.e();
            } else {
                b0[] b0VarArr2 = this.f40549s;
                int length2 = b0VarArr2.length;
                while (i12 < length2) {
                    b0VarArr2[i12].M();
                    i12++;
                }
            }
        } else if (z11) {
            j11 = g(j11);
            while (i12 < qVarArr.length) {
                if (qVarArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.C = true;
        return j11;
    }
}
