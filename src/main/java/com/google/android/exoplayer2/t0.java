package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class t0 implements Handler.Callback, com.google.android.exoplayer2.source.n.a, qs.a0.a, q1.d, i.a, w1.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private h K;
    private long L;
    private int M;
    private boolean N;
    private ExoPlaybackException O;
    private long P;
    private long Q = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1[] f40609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<z1> f40610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a2[] f40611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qs.a0 f40612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qs.b0 f40613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final br.t f40614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ss.d f40615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ts.q f40616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HandlerThread f40617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f40618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f2.d f40619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f2.b f40620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f40621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f40622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f40623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<d> f40624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ts.d f40625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f40626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c1 f40627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final q1 f40628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final w0 f40629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f40630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private br.l0 f40631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t1 f40632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e f40633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f40634z;

    class a implements z1.a {
        a() {
        }

        @Override // com.google.android.exoplayer2.z1.a
        public void a() {
            t0.this.H = true;
        }

        @Override // com.google.android.exoplayer2.z1.a
        public void b() {
            t0.this.f40616h.h(2);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<q1.c> f40636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final es.r f40637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f40639d;

        /* synthetic */ b(List list, es.r rVar, int i11, long j11, a aVar) {
            this(list, rVar, i11, j11);
        }

        private b(List<q1.c> list, es.r rVar, int i11, long j11) {
            this.f40636a = list;
            this.f40637b = rVar;
            this.f40638c = i11;
            this.f40639d = j11;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final es.r f40643d;
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f40644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f40647d;

        public d(w1 w1Var) {
            this.f40644a = w1Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f40647d;
            if ((obj == null) != (dVar.f40647d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i11 = this.f40645b - dVar.f40645b;
            return i11 != 0 ? i11 : ts.p0.o(this.f40646c, dVar.f40646c);
        }

        public void b(int i11, long j11, Object obj) {
            this.f40645b = i11;
            this.f40646c = j11;
            this.f40647d = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t1 f40649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f40651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f40653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f40654g;

        public e(t1 t1Var) {
            this.f40649b = t1Var;
        }

        public void b(int i11) {
            this.f40648a |= i11 > 0;
            this.f40650c += i11;
        }

        public void c(int i11) {
            this.f40648a = true;
            this.f40653f = true;
            this.f40654g = i11;
        }

        public void d(t1 t1Var) {
            this.f40648a |= this.f40649b != t1Var;
            this.f40649b = t1Var;
        }

        public void e(int i11) {
            if (this.f40651d && this.f40652e != 5) {
                ts.a.a(i11 == 5);
                return;
            }
            this.f40648a = true;
            this.f40651d = true;
            this.f40652e = i11;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o.b f40655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f40657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f40658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f40659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f40660f;

        public g(com.google.android.exoplayer2.source.o.b bVar, long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.f40655a = bVar;
            this.f40656b = j11;
            this.f40657c = j12;
            this.f40658d = z11;
            this.f40659e = z12;
            this.f40660f = z13;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f2 f40661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f40663c;

        public h(f2 f2Var, int i11, long j11) {
            this.f40661a = f2Var;
            this.f40662b = i11;
            this.f40663c = j11;
        }
    }

    public t0(z1[] z1VarArr, qs.a0 a0Var, qs.b0 b0Var, br.t tVar, ss.d dVar, int i11, boolean z11, cr.a aVar, br.l0 l0Var, w0 w0Var, long j11, boolean z12, Looper looper, ts.d dVar2, f fVar, cr.q1 q1Var, Looper looper2) {
        this.f40626r = fVar;
        this.f40609a = z1VarArr;
        this.f40612d = a0Var;
        this.f40613e = b0Var;
        this.f40614f = tVar;
        this.f40615g = dVar;
        this.E = i11;
        this.F = z11;
        this.f40631w = l0Var;
        this.f40629u = w0Var;
        this.f40630v = j11;
        this.P = j11;
        this.A = z12;
        this.f40625q = dVar2;
        this.f40621m = tVar.e();
        this.f40622n = tVar.c();
        t1 t1VarK = t1.k(b0Var);
        this.f40632x = t1VarK;
        this.f40633y = new e(t1VarK);
        this.f40611c = new a2[z1VarArr.length];
        a2.a aVarD = a0Var.d();
        for (int i12 = 0; i12 < z1VarArr.length; i12++) {
            z1VarArr[i12].F(i12, q1Var);
            this.f40611c[i12] = z1VarArr[i12].x();
            if (aVarD != null) {
                this.f40611c[i12].E(aVarD);
            }
        }
        this.f40623o = new i(this, dVar2);
        this.f40624p = new ArrayList<>();
        this.f40610b = com.google.common.collect.z0.g();
        this.f40619k = new f2.d();
        this.f40620l = new f2.b();
        a0Var.e(this, dVar);
        this.N = true;
        ts.q qVarC = dVar2.c(looper, null);
        this.f40627s = new c1(aVar, qVarC);
        this.f40628t = new q1(this, aVar, qVarC, q1Var);
        if (looper2 != null) {
            this.f40617i = null;
            this.f40618j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f40617i = handlerThread;
            handlerThread.start();
            this.f40618j = handlerThread.getLooper();
        }
        this.f40616h = dVar2.c(this.f40618j, this);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void A0(h hVar) throws Throwable {
        long jLongValue;
        com.google.android.exoplayer2.source.o.b bVarE;
        long j11;
        boolean z11;
        long j12;
        com.google.android.exoplayer2.source.o.b bVar;
        long j13;
        com.google.android.exoplayer2.source.o.b bVar2;
        z0 z0VarR;
        long jL;
        t1 t1Var;
        int i11;
        int i12;
        long j14;
        com.google.android.exoplayer2.source.o.b bVar3;
        long j15;
        boolean z12;
        long jB0;
        com.google.android.exoplayer2.source.o.b bVar4;
        long j16;
        t0 t0Var = this;
        t0Var.f40633y.b(1);
        Pair<Object, Long> pairV0 = v0(t0Var.f40632x.f40665a, hVar, true, t0Var.E, t0Var.F, t0Var.f40619k, t0Var.f40620l);
        try {
            if (pairV0 != null) {
                Object obj = pairV0.first;
                jLongValue = ((Long) pairV0.second).longValue();
                long j17 = hVar.f40663c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                bVarE = t0Var.f40627s.E(t0Var.f40632x.f40665a, obj, jLongValue);
                if (bVarE.b()) {
                    t0Var.f40632x.f40665a.l(bVarE.f63157a, t0Var.f40620l);
                    jLongValue = t0Var.f40620l.n(bVarE.f63158b) == bVarE.f63159c ? t0Var.f40620l.j() : 0L;
                    z11 = true;
                    j12 = j17;
                } else {
                    j11 = 0;
                    z11 = hVar.f40663c == -9223372036854775807L;
                    j12 = j17;
                }
                if (t0Var.f40632x.f40665a.u()) {
                    if (pairV0 == null) {
                        if (t0Var.f40632x.f40669e != 1) {
                            t0Var.Y0(4);
                        }
                        t0Var.o0(false, true, false, true);
                    } else {
                        if (bVarE.equals(t0Var.f40632x.f40666b)) {
                            try {
                                z0VarR = t0Var.f40627s.r();
                                if (z0VarR == null && z0VarR.f41392d && jLongValue != j11) {
                                    jL = z0VarR.f41389a.l(jLongValue, t0Var.f40631w);
                                } else {
                                    jL = jLongValue;
                                }
                                bVar2 = bVarE;
                                try {
                                    if (ts.p0.Z0(jL) != ts.p0.Z0(t0Var.f40632x.f40682r) && ((i11 = (t1Var = t0Var.f40632x).f40669e) == 2 || i11 == 3)) {
                                        long j18 = t1Var.f40682r;
                                        i12 = 2;
                                        z11 = z11;
                                        j14 = j18;
                                        bVar3 = bVar2;
                                        j15 = j18;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = z11;
                                    bVar = bVar2;
                                    j13 = jLongValue;
                                    t0Var.f40632x = t0Var.K(bVar, j13, j12, j13, z11, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = z11;
                                bVar2 = bVarE;
                            }
                        } else {
                            bVar2 = bVarE;
                            jL = jLongValue;
                        }
                        try {
                            if (t0Var.f40632x.f40669e == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            jB0 = t0Var.B0(bVar2, jL, z12);
                            z11 |= jLongValue != jB0;
                            try {
                                t1 t1Var2 = t0Var.f40632x;
                                f2 f2Var = t1Var2.f40665a;
                                bVar4 = bVar2;
                                j16 = j12;
                                try {
                                    t0Var.m1(f2Var, bVar4, f2Var, t1Var2.f40666b, j16, true);
                                    bVar3 = bVar4;
                                    j12 = j16;
                                    j15 = jB0;
                                    i12 = 2;
                                    j14 = j15;
                                    t0Var = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar = bVar4;
                                    j12 = j16;
                                    j13 = jB0;
                                    t0Var.f40632x = t0Var.K(bVar, j13, j12, j13, z11, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = bVar2;
                            j13 = jLongValue;
                            t0Var.f40632x = t0Var.K(bVar, j13, j12, j13, z11, 2);
                            throw th;
                        }
                    }
                    t0Var.f40632x = t0Var.K(bVar3, j15, j12, j14, z11, i12);
                    return;
                }
                t0Var.K = hVar;
                z11 = z11;
                bVar3 = bVarE;
                j15 = jLongValue;
                i12 = 2;
                j14 = j15;
                t0Var = this;
                t0Var.f40632x = t0Var.K(bVar3, j15, j12, j14, z11, i12);
                return;
            }
            Pair<com.google.android.exoplayer2.source.o.b, Long> pairZ = t0Var.z(t0Var.f40632x.f40665a);
            bVarE = (com.google.android.exoplayer2.source.o.b) pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            z11 = !t0Var.f40632x.f40665a.u();
            j12 = -9223372036854775807L;
            if (t0Var.f40632x.f40665a.u()) {
                if (pairV0 == null) {
                    if (t0Var.f40632x.f40669e != 1) {
                        t0Var.Y0(4);
                    }
                    t0Var.o0(false, true, false, true);
                } else {
                    if (bVarE.equals(t0Var.f40632x.f40666b)) {
                        z0VarR = t0Var.f40627s.r();
                        if (z0VarR == null) {
                            jL = jLongValue;
                        } else {
                            jL = jLongValue;
                        }
                        bVar2 = bVarE;
                        if (ts.p0.Z0(jL) != ts.p0.Z0(t0Var.f40632x.f40682r)) {
                        }
                    } else {
                        bVar2 = bVarE;
                        jL = jLongValue;
                    }
                    if (t0Var.f40632x.f40669e == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    jB0 = t0Var.B0(bVar2, jL, z12);
                    z11 |= jLongValue != jB0;
                    t1 t1Var3 = t0Var.f40632x;
                    f2 f2Var2 = t1Var3.f40665a;
                    bVar4 = bVar2;
                    j16 = j12;
                    t0Var.m1(f2Var2, bVar4, f2Var2, t1Var3.f40666b, j16, true);
                    bVar3 = bVar4;
                    j12 = j16;
                    j15 = jB0;
                    i12 = 2;
                    j14 = j15;
                    t0Var = this;
                }
                t0Var.f40632x = t0Var.K(bVar3, j15, j12, j14, z11, i12);
                return;
            }
            t0Var.K = hVar;
            z11 = z11;
            bVar3 = bVarE;
            j15 = jLongValue;
            i12 = 2;
            j14 = j15;
            t0Var = this;
            t0Var.f40632x = t0Var.K(bVar3, j15, j12, j14, z11, i12);
            return;
        } catch (Throwable th7) {
            th = th7;
            z11 = z11;
            bVar = bVarE;
        }
        j11 = 0;
    }

    private long B() {
        return C(this.f40632x.f40680p);
    }

    private long B0(com.google.android.exoplayer2.source.o.b bVar, long j11, boolean z11) {
        return C0(bVar, j11, this.f40627s.r() != this.f40627s.s(), z11);
    }

    private long C(long j11) {
        z0 z0VarL = this.f40627s.l();
        if (z0VarL == null) {
            return 0L;
        }
        return Math.max(0L, j11 - z0VarL.y(this.L));
    }

    private long C0(com.google.android.exoplayer2.source.o.b bVar, long j11, boolean z11, boolean z12) throws ExoPlaybackException {
        h1();
        this.C = false;
        if (z12 || this.f40632x.f40669e == 3) {
            Y0(2);
        }
        z0 z0VarR = this.f40627s.r();
        z0 z0VarJ = z0VarR;
        while (z0VarJ != null && !bVar.equals(z0VarJ.f41394f.f39406a)) {
            z0VarJ = z0VarJ.j();
        }
        if (z11 || z0VarR != z0VarJ || (z0VarJ != null && z0VarJ.z(j11) < 0)) {
            for (z1 z1Var : this.f40609a) {
                n(z1Var);
            }
            if (z0VarJ != null) {
                while (this.f40627s.r() != z0VarJ) {
                    this.f40627s.b();
                }
                this.f40627s.C(z0VarJ);
                z0VarJ.x(1000000000000L);
                q();
            }
        }
        if (z0VarJ != null) {
            this.f40627s.C(z0VarJ);
            if (!z0VarJ.f41392d) {
                z0VarJ.f41394f = z0VarJ.f41394f.b(j11);
            } else if (z0VarJ.f41393e) {
                j11 = z0VarJ.f41389a.g(j11);
                z0VarJ.f41389a.o(j11 - this.f40621m, this.f40622n);
            }
            q0(j11);
            S();
        } else {
            this.f40627s.f();
            q0(j11);
        }
        F(false);
        this.f40616h.h(2);
        return j11;
    }

    private void D(com.google.android.exoplayer2.source.n nVar) {
        if (this.f40627s.y(nVar)) {
            this.f40627s.B(this.L);
            S();
        }
    }

    private void D0(w1 w1Var) {
        if (w1Var.f() == -9223372036854775807L) {
            E0(w1Var);
            return;
        }
        if (this.f40632x.f40665a.u()) {
            this.f40624p.add(new d(w1Var));
            return;
        }
        d dVar = new d(w1Var);
        f2 f2Var = this.f40632x.f40665a;
        if (!s0(dVar, f2Var, f2Var, this.E, this.F, this.f40619k, this.f40620l)) {
            w1Var.k(false);
        } else {
            this.f40624p.add(dVar);
            Collections.sort(this.f40624p);
        }
    }

    private void E(IOException iOException, int i11) {
        ExoPlaybackException exoPlaybackExceptionG = ExoPlaybackException.g(iOException, i11);
        z0 z0VarR = this.f40627s.r();
        if (z0VarR != null) {
            exoPlaybackExceptionG = exoPlaybackExceptionG.e(z0VarR.f41394f.f39406a);
        }
        ts.u.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionG);
        g1(false, false);
        this.f40632x = this.f40632x.f(exoPlaybackExceptionG);
    }

    private void E0(w1 w1Var) {
        if (w1Var.c() != this.f40618j) {
            this.f40616h.c(15, w1Var).a();
            return;
        }
        m(w1Var);
        int i11 = this.f40632x.f40669e;
        if (i11 == 3 || i11 == 2) {
            this.f40616h.h(2);
        }
    }

    private void F(boolean z11) {
        z0 z0VarL = this.f40627s.l();
        com.google.android.exoplayer2.source.o.b bVar = z0VarL == null ? this.f40632x.f40666b : z0VarL.f41394f.f39406a;
        boolean zEquals = this.f40632x.f40675k.equals(bVar);
        if (!zEquals) {
            this.f40632x = this.f40632x.c(bVar);
        }
        t1 t1Var = this.f40632x;
        t1Var.f40680p = z0VarL == null ? t1Var.f40682r : z0VarL.i();
        this.f40632x.f40681q = B();
        if ((!zEquals || z11) && z0VarL != null && z0VarL.f41392d) {
            j1(z0VarL.f41394f.f39406a, z0VarL.n(), z0VarL.o());
        }
    }

    private void F0(final w1 w1Var) {
        Looper looperC = w1Var.c();
        if (looperC.getThread().isAlive()) {
            this.f40625q.c(looperC, null).g(new Runnable() { // from class: com.google.android.exoplayer2.s0
                @Override // java.lang.Runnable
                public final void run() {
                    t0.f(this.f40316a, w1Var);
                }
            });
        } else {
            ts.u.i("TAG", "Trying to send message on a dead thread.");
            w1Var.k(false);
        }
    }

    private void G(f2 f2Var, boolean z11) throws Throwable {
        int i11;
        f2 f2Var2;
        f2 f2Var3;
        g gVarU0 = u0(f2Var, this.f40632x, this.K, this.f40627s, this.E, this.F, this.f40619k, this.f40620l);
        com.google.android.exoplayer2.source.o.b bVar = gVarU0.f40655a;
        long j11 = gVarU0.f40657c;
        boolean z12 = gVarU0.f40658d;
        long jB0 = gVarU0.f40656b;
        int i12 = 1;
        boolean z13 = (this.f40632x.f40666b.equals(bVar) && jB0 == this.f40632x.f40682r) ? false : true;
        f2 f2Var4 = null;
        try {
            if (gVarU0.f40659e) {
                if (this.f40632x.f40669e != 1) {
                    Y0(4);
                }
                o0(false, false, false, true);
            }
            try {
                if (z13) {
                    f2Var3 = f2Var;
                    i12 = -1;
                    i11 = 4;
                    if (!f2Var3.u()) {
                        for (z0 z0VarR = this.f40627s.r(); z0VarR != null; z0VarR = z0VarR.j()) {
                            if (z0VarR.f41394f.f39406a.equals(bVar)) {
                                z0VarR.f41394f = this.f40627s.t(f2Var3, z0VarR.f41394f);
                                z0VarR.A();
                            }
                        }
                        jB0 = B0(bVar, jB0, z12);
                    }
                } else {
                    try {
                        try {
                            i11 = 4;
                            try {
                                i12 = -1;
                                try {
                                    f2Var3 = f2Var;
                                    if (!this.f40627s.I(f2Var, this.L, y())) {
                                        z0(false);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f2Var4 = f2Var;
                                    f2Var2 = f2Var4;
                                    t1 t1Var = this.f40632x;
                                    m1(f2Var2, bVar, t1Var.f40665a, t1Var.f40666b, gVarU0.f40660f ? jB0 : -9223372036854775807L, false);
                                    if (z13 || j11 != this.f40632x.f40667c) {
                                        t1 t1Var2 = this.f40632x;
                                        Object obj = t1Var2.f40666b.f63157a;
                                        f2 f2Var5 = t1Var2.f40665a;
                                        this.f40632x = K(bVar, jB0, j11, this.f40632x.f40668d, z13 && z11 && !f2Var5.u() && !f2Var5.l(obj, this.f40620l).f39927f, f2Var2.f(obj) == i12 ? i11 : 3);
                                    }
                                    p0();
                                    t0(f2Var2, this.f40632x.f40665a);
                                    this.f40632x = this.f40632x.j(f2Var2);
                                    if (!f2Var2.u()) {
                                        this.K = null;
                                    }
                                    F(false);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                f2Var4 = f2Var;
                                i12 = -1;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            f2Var4 = f2Var;
                            i12 = -1;
                            i11 = 4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        f2Var4 = f2Var;
                        i12 = -1;
                        i11 = 4;
                    }
                }
                t1 t1Var3 = this.f40632x;
                m1(f2Var3, bVar, t1Var3.f40665a, t1Var3.f40666b, gVarU0.f40660f ? jB0 : -9223372036854775807L, false);
                if (z13 || j11 != this.f40632x.f40667c) {
                    t1 t1Var4 = this.f40632x;
                    Object obj2 = t1Var4.f40666b.f63157a;
                    f2 f2Var6 = t1Var4.f40665a;
                    this.f40632x = K(bVar, jB0, j11, this.f40632x.f40668d, z13 && z11 && !f2Var6.u() && !f2Var6.l(obj2, this.f40620l).f39927f, f2Var3.f(obj2) == i12 ? i11 : 3);
                }
                p0();
                t0(f2Var3, this.f40632x.f40665a);
                this.f40632x = this.f40632x.j(f2Var3);
                if (!f2Var3.u()) {
                    this.K = null;
                }
                F(false);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            i12 = -1;
            i11 = 4;
            f2Var2 = f2Var;
        }
    }

    private void G0(long j11) {
        for (z1 z1Var : this.f40609a) {
            if (z1Var.f() != null) {
                H0(z1Var, j11);
            }
        }
    }

    private void H(com.google.android.exoplayer2.source.n nVar) throws ExoPlaybackException {
        if (this.f40627s.y(nVar)) {
            z0 z0VarL = this.f40627s.l();
            z0VarL.p(this.f40623o.e().f40757a, this.f40632x.f40665a);
            j1(z0VarL.f41394f.f39406a, z0VarL.n(), z0VarL.o());
            if (z0VarL == this.f40627s.r()) {
                q0(z0VarL.f41394f.f39407b);
                q();
                t1 t1Var = this.f40632x;
                com.google.android.exoplayer2.source.o.b bVar = t1Var.f40666b;
                long j11 = z0VarL.f41394f.f39407b;
                this.f40632x = K(bVar, j11, t1Var.f40667c, j11, false, 5);
            }
            S();
        }
    }

    private void H0(z1 z1Var, long j11) {
        z1Var.t();
        if (z1Var instanceof gs.p) {
            ((gs.p) z1Var).k0(j11);
        }
    }

    private void I(u1 u1Var, float f11, boolean z11, boolean z12) {
        if (z11) {
            if (z12) {
                this.f40633y.b(1);
            }
            this.f40632x = this.f40632x.g(u1Var);
        }
        n1(u1Var.f40757a);
        for (z1 z1Var : this.f40609a) {
            if (z1Var != null) {
                z1Var.z(f11, u1Var.f40757a);
            }
        }
    }

    private void I0(boolean z11, AtomicBoolean atomicBoolean) {
        if (this.G != z11) {
            this.G = z11;
            if (!z11) {
                for (z1 z1Var : this.f40609a) {
                    if (!P(z1Var) && this.f40610b.remove(z1Var)) {
                        z1Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void J(u1 u1Var, boolean z11) {
        I(u1Var, u1Var.f40757a, true, z11);
    }

    private void J0(u1 u1Var) {
        this.f40616h.j(16);
        this.f40623o.j(u1Var);
    }

    private t1 K(com.google.android.exoplayer2.source.o.b bVar, long j11, long j12, long j13, boolean z11, int i11) {
        List<ur.a> list;
        es.w wVar;
        qs.b0 b0Var;
        this.N = (!this.N && j11 == this.f40632x.f40682r && bVar.equals(this.f40632x.f40666b)) ? false : true;
        p0();
        t1 t1Var = this.f40632x;
        es.w wVar2 = t1Var.f40672h;
        qs.b0 b0Var2 = t1Var.f40673i;
        List<ur.a> listR = t1Var.f40674j;
        if (this.f40628t.t()) {
            z0 z0VarR = this.f40627s.r();
            es.w wVarN = z0VarR == null ? es.w.f63210d : z0VarR.n();
            qs.b0 b0VarO = z0VarR == null ? this.f40613e : z0VarR.o();
            com.google.common.collect.x<ur.a> xVarU = u(b0VarO.f105960c);
            if (z0VarR != null) {
                a1 a1Var = z0VarR.f41394f;
                if (a1Var.f39408c != j12) {
                    z0VarR.f41394f = a1Var.a(j12);
                }
            }
            wVar = wVarN;
            b0Var = b0VarO;
            list = xVarU;
        } else {
            if (!bVar.equals(this.f40632x.f40666b)) {
                wVar2 = es.w.f63210d;
                b0Var2 = this.f40613e;
                listR = com.google.common.collect.x.r();
            }
            list = listR;
            wVar = wVar2;
            b0Var = b0Var2;
        }
        if (z11) {
            this.f40633y.e(i11);
        }
        return this.f40632x.d(bVar, j11, j12, j13, B(), wVar, b0Var, list);
    }

    private void K0(b bVar) throws Throwable {
        this.f40633y.b(1);
        if (bVar.f40638c != -1) {
            this.K = new h(new x1(bVar.f40636a, bVar.f40637b), bVar.f40638c, bVar.f40639d);
        }
        G(this.f40628t.C(bVar.f40636a, bVar.f40637b), false);
    }

    private boolean L(z1 z1Var, z0 z0Var) {
        z0 z0VarJ = z0Var.j();
        if (z0Var.f41394f.f39411f && z0VarJ.f41392d) {
            return (z1Var instanceof gs.p) || (z1Var instanceof ur.f) || z1Var.n() >= z0VarJ.m();
        }
        return false;
    }

    private boolean M() {
        z0 z0VarS = this.f40627s.s();
        if (!z0VarS.f41392d) {
            return false;
        }
        int i11 = 0;
        while (true) {
            z1[] z1VarArr = this.f40609a;
            if (i11 >= z1VarArr.length) {
                return true;
            }
            z1 z1Var = z1VarArr[i11];
            es.q qVar = z0VarS.f41391c[i11];
            if (z1Var.f() != qVar || (qVar != null && !z1Var.h() && !L(z1Var, z0VarS))) {
                return false;
            }
            i11++;
        }
    }

    private void M0(boolean z11) {
        if (z11 == this.I) {
            return;
        }
        this.I = z11;
        if (z11 || !this.f40632x.f40679o) {
            return;
        }
        this.f40616h.h(2);
    }

    private static boolean N(boolean z11, com.google.android.exoplayer2.source.o.b bVar, long j11, com.google.android.exoplayer2.source.o.b bVar2, f2.b bVar3, long j12) {
        if (!z11 && j11 == j12 && bVar.f63157a.equals(bVar2.f63157a)) {
            if (bVar.b() && bVar3.u(bVar.f63158b)) {
                return (bVar3.k(bVar.f63158b, bVar.f63159c) == 4 || bVar3.k(bVar.f63158b, bVar.f63159c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.u(bVar2.f63158b)) {
                return true;
            }
        }
        return false;
    }

    private void N0(boolean z11) throws ExoPlaybackException {
        this.A = z11;
        p0();
        if (!this.B || this.f40627s.s() == this.f40627s.r()) {
            return;
        }
        z0(true);
        F(false);
    }

    private boolean O() {
        z0 z0VarL = this.f40627s.l();
        return (z0VarL == null || z0VarL.k() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean P(z1 z1Var) {
        return z1Var.getState() != 0;
    }

    private void P0(boolean z11, int i11, boolean z12, int i12) {
        this.f40633y.b(z12 ? 1 : 0);
        this.f40633y.c(i12);
        this.f40632x = this.f40632x.e(z11, i11);
        this.C = false;
        c0(z11);
        if (!b1()) {
            h1();
            l1();
            return;
        }
        int i13 = this.f40632x.f40669e;
        if (i13 == 3) {
            e1();
            this.f40616h.h(2);
        } else if (i13 == 2) {
            this.f40616h.h(2);
        }
    }

    private boolean Q() {
        z0 z0VarR = this.f40627s.r();
        long j11 = z0VarR.f41394f.f39410e;
        if (z0VarR.f41392d) {
            return j11 == -9223372036854775807L || this.f40632x.f40682r < j11 || !b1();
        }
        return false;
    }

    private static boolean R(t1 t1Var, f2.b bVar) {
        com.google.android.exoplayer2.source.o.b bVar2 = t1Var.f40666b;
        f2 f2Var = t1Var.f40665a;
        return f2Var.u() || f2Var.l(bVar2.f63157a, bVar).f39927f;
    }

    private void R0(u1 u1Var) {
        J0(u1Var);
        J(this.f40623o.e(), true);
    }

    private void S() {
        boolean zA1 = a1();
        this.D = zA1;
        if (zA1) {
            this.f40627s.l().d(this.L);
        }
        i1();
    }

    private void T() {
        this.f40633y.d(this.f40632x);
        if (this.f40633y.f40648a) {
            this.f40626r.a(this.f40633y);
            this.f40633y = new e(this.f40632x);
        }
    }

    private void T0(int i11) throws ExoPlaybackException {
        this.E = i11;
        if (!this.f40627s.J(this.f40632x.f40665a, i11)) {
            z0(true);
        }
        F(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.t0.U(long, long):void");
    }

    private void U0(br.l0 l0Var) {
        this.f40631w = l0Var;
    }

    private void V() {
        a1 a1VarQ;
        this.f40627s.B(this.L);
        if (this.f40627s.G() && (a1VarQ = this.f40627s.q(this.L, this.f40632x)) != null) {
            z0 z0VarG = this.f40627s.g(this.f40611c, this.f40612d, this.f40614f.g(), this.f40628t, a1VarQ, this.f40613e);
            z0VarG.f41389a.s(this, a1VarQ.f39407b);
            if (this.f40627s.r() == z0VarG) {
                q0(a1VarQ.f39407b);
            }
            F(false);
        }
        if (!this.D) {
            S();
        } else {
            this.D = O();
            i1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    private void W() {
        boolean z11;
        boolean z12 = false;
        while (Z0()) {
            if (z12) {
                T();
            }
            z0 z0Var = (z0) ts.a.e(this.f40627s.b());
            if (this.f40632x.f40666b.f63157a.equals(z0Var.f41394f.f39406a.f63157a)) {
                com.google.android.exoplayer2.source.o.b bVar = this.f40632x.f40666b;
                if (bVar.f63158b == -1) {
                    com.google.android.exoplayer2.source.o.b bVar2 = z0Var.f41394f.f39406a;
                    if (bVar2.f63158b != -1 || bVar.f63161e == bVar2.f63161e) {
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
            a1 a1Var = z0Var.f41394f;
            com.google.android.exoplayer2.source.o.b bVar3 = a1Var.f39406a;
            long j11 = a1Var.f39407b;
            this.f40632x = K(bVar3, j11, a1Var.f39408c, j11, !z11, 0);
            p0();
            l1();
            z12 = true;
        }
    }

    private void W0(boolean z11) throws ExoPlaybackException {
        this.F = z11;
        if (!this.f40627s.K(this.f40632x.f40665a, z11)) {
            z0(true);
        }
        F(false);
    }

    private void X() {
        z0 z0VarS = this.f40627s.s();
        if (z0VarS == null) {
            return;
        }
        int i11 = 0;
        if (z0VarS.j() != null && !this.B) {
            if (M()) {
                if (z0VarS.j().f41392d || this.L >= z0VarS.j().m()) {
                    qs.b0 b0VarO = z0VarS.o();
                    z0 z0VarC = this.f40627s.c();
                    qs.b0 b0VarO2 = z0VarC.o();
                    f2 f2Var = this.f40632x.f40665a;
                    m1(f2Var, z0VarC.f41394f.f39406a, f2Var, z0VarS.f41394f.f39406a, -9223372036854775807L, false);
                    if (z0VarC.f41392d && z0VarC.f41389a.h() != -9223372036854775807L) {
                        G0(z0VarC.m());
                        return;
                    }
                    for (int i12 = 0; i12 < this.f40609a.length; i12++) {
                        boolean zC = b0VarO.c(i12);
                        boolean zC2 = b0VarO2.c(i12);
                        if (zC && !this.f40609a[i12].l()) {
                            boolean z11 = this.f40611c[i12].c() == -2;
                            br.j0 j0Var = b0VarO.f105959b[i12];
                            br.j0 j0Var2 = b0VarO2.f105959b[i12];
                            if (!zC2 || !j0Var2.equals(j0Var) || z11) {
                                H0(this.f40609a[i12], z0VarC.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!z0VarS.f41394f.f39414i && !this.B) {
            return;
        }
        while (true) {
            z1[] z1VarArr = this.f40609a;
            if (i11 >= z1VarArr.length) {
                return;
            }
            z1 z1Var = z1VarArr[i11];
            es.q qVar = z0VarS.f41391c[i11];
            if (qVar != null && z1Var.f() == qVar && z1Var.h()) {
                long j11 = z0VarS.f41394f.f39410e;
                H0(z1Var, (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? -9223372036854775807L : z0VarS.l() + z0VarS.f41394f.f39410e);
            }
            i11++;
        }
    }

    private void X0(es.r rVar) throws Throwable {
        this.f40633y.b(1);
        G(this.f40628t.D(rVar), false);
    }

    private void Y() throws ExoPlaybackException {
        z0 z0VarS = this.f40627s.s();
        if (z0VarS == null || this.f40627s.r() == z0VarS || z0VarS.f41395g || !l0()) {
            return;
        }
        q();
    }

    private void Y0(int i11) {
        t1 t1Var = this.f40632x;
        if (t1Var.f40669e != i11) {
            if (i11 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f40632x = t1Var.h(i11);
        }
    }

    private void Z() throws Throwable {
        G(this.f40628t.i(), true);
    }

    private boolean Z0() {
        z0 z0VarR;
        z0 z0VarJ;
        return b1() && !this.B && (z0VarR = this.f40627s.r()) != null && (z0VarJ = z0VarR.j()) != null && this.L >= z0VarJ.m() && z0VarJ.f41395g;
    }

    private void a0(c cVar) throws Throwable {
        this.f40633y.b(1);
        G(this.f40628t.v(cVar.f40640a, cVar.f40641b, cVar.f40642c, cVar.f40643d), false);
    }

    private boolean a1() {
        if (!O()) {
            return false;
        }
        z0 z0VarL = this.f40627s.l();
        long jC = C(z0VarL.k());
        long jY = z0VarL == this.f40627s.r() ? z0VarL.y(this.L) : z0VarL.y(this.L) - z0VarL.f41394f.f39407b;
        boolean zD = this.f40614f.d(jY, jC, this.f40623o.e().f40757a);
        if (zD || jC >= 500000) {
            return zD;
        }
        if (this.f40621m <= 0 && !this.f40622n) {
            return zD;
        }
        this.f40627s.r().f41389a.o(this.f40632x.f40682r, false);
        return this.f40614f.d(jY, jC, this.f40623o.e().f40757a);
    }

    private void b0() {
        for (z0 z0VarR = this.f40627s.r(); z0VarR != null; z0VarR = z0VarR.j()) {
            for (qs.r rVar : z0VarR.o().f105960c) {
                if (rVar != null) {
                    rVar.c();
                }
            }
        }
    }

    private boolean b1() {
        t1 t1Var = this.f40632x;
        return t1Var.f40676l && t1Var.f40677m == 0;
    }

    private void c0(boolean z11) {
        for (z0 z0VarR = this.f40627s.r(); z0VarR != null; z0VarR = z0VarR.j()) {
            for (qs.r rVar : z0VarR.o().f105960c) {
                if (rVar != null) {
                    rVar.j(z11);
                }
            }
        }
    }

    private boolean c1(boolean z11) {
        if (this.J == 0) {
            return Q();
        }
        if (!z11) {
            return false;
        }
        if (!this.f40632x.f40671g) {
            return true;
        }
        z0 z0VarR = this.f40627s.r();
        long jB = d1(this.f40632x.f40665a, z0VarR.f41394f.f39406a) ? this.f40629u.b() : -9223372036854775807L;
        z0 z0VarL = this.f40627s.l();
        return (z0VarL.q() && z0VarL.f41394f.f39414i) || (z0VarL.f41394f.f39406a.b() && !z0VarL.f41392d) || this.f40614f.h(this.f40632x.f40665a, z0VarR.f41394f.f39406a, B(), this.f40623o.e().f40757a, this.C, jB);
    }

    private void d0() {
        for (z0 z0VarR = this.f40627s.r(); z0VarR != null; z0VarR = z0VarR.j()) {
            for (qs.r rVar : z0VarR.o().f105960c) {
                if (rVar != null) {
                    rVar.g();
                }
            }
        }
    }

    private boolean d1(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar) {
        if (!bVar.b() && !f2Var.u()) {
            f2Var.r(f2Var.l(bVar.f63157a, this.f40620l).f39924c, this.f40619k);
            if (this.f40619k.h()) {
                f2.d dVar = this.f40619k;
                if (dVar.f39950i && dVar.f39947f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void e1() {
        this.C = false;
        this.f40623o.f();
        for (z1 z1Var : this.f40609a) {
            if (P(z1Var)) {
                z1Var.start();
            }
        }
    }

    public static /* synthetic */ void f(t0 t0Var, w1 w1Var) {
        t0Var.getClass();
        try {
            t0Var.m(w1Var);
        } catch (ExoPlaybackException e11) {
            ts.u.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    private void g0() {
        this.f40633y.b(1);
        o0(false, false, false, true);
        this.f40614f.a();
        Y0(this.f40632x.f40665a.u() ? 4 : 2);
        this.f40628t.w(this.f40615g.a());
        this.f40616h.h(2);
    }

    private void g1(boolean z11, boolean z12) {
        o0(z11 || !this.G, false, true, false);
        this.f40633y.b(z12 ? 1 : 0);
        this.f40614f.b();
        Y0(1);
    }

    private void h1() {
        this.f40623o.g();
        for (z1 z1Var : this.f40609a) {
            if (P(z1Var)) {
                s(z1Var);
            }
        }
    }

    private void i0() {
        o0(true, false, true, false);
        j0();
        this.f40614f.onReleased();
        Y0(1);
        HandlerThread handlerThread = this.f40617i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f40634z = true;
            notifyAll();
        }
    }

    private void i1() {
        z0 z0VarL = this.f40627s.l();
        boolean z11 = this.D || (z0VarL != null && z0VarL.f41389a.c());
        t1 t1Var = this.f40632x;
        if (z11 != t1Var.f40671g) {
            this.f40632x = t1Var.b(z11);
        }
    }

    private void j0() {
        for (int i11 = 0; i11 < this.f40609a.length; i11++) {
            this.f40611c[i11].r();
            this.f40609a[i11].release();
        }
    }

    private void j1(com.google.android.exoplayer2.source.o.b bVar, es.w wVar, qs.b0 b0Var) {
        this.f40614f.i(this.f40632x.f40665a, bVar, this.f40609a, wVar, b0Var.f105960c);
    }

    private void k(b bVar, int i11) throws Throwable {
        this.f40633y.b(1);
        q1 q1Var = this.f40628t;
        if (i11 == -1) {
            i11 = q1Var.r();
        }
        G(q1Var.f(i11, bVar.f40636a, bVar.f40637b), false);
    }

    private void k0(int i11, int i12, es.r rVar) throws Throwable {
        this.f40633y.b(1);
        G(this.f40628t.A(i11, i12, rVar), false);
    }

    private void k1() throws ExoPlaybackException {
        if (this.f40632x.f40665a.u() || !this.f40628t.t()) {
            return;
        }
        V();
        X();
        Y();
        W();
    }

    private void l() throws ExoPlaybackException {
        n0();
    }

    private boolean l0() {
        z0 z0VarS = this.f40627s.s();
        qs.b0 b0VarO = z0VarS.o();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            z1[] z1VarArr = this.f40609a;
            if (i11 >= z1VarArr.length) {
                return !z11;
            }
            z1 z1Var = z1VarArr[i11];
            if (P(z1Var)) {
                boolean z12 = z1Var.f() != z0VarS.f41391c[i11];
                if (!b0VarO.c(i11) || z12) {
                    if (!z1Var.l()) {
                        z1Var.D(w(b0VarO.f105960c[i11]), z0VarS.f41391c[i11], z0VarS.m(), z0VarS.l());
                    } else if (z1Var.a()) {
                        n(z1Var);
                    } else {
                        z11 = true;
                    }
                }
            }
            i11++;
        }
    }

    private void l1() {
        z0 z0VarR = this.f40627s.r();
        if (z0VarR == null) {
            return;
        }
        long jH = z0VarR.f41392d ? z0VarR.f41389a.h() : -9223372036854775807L;
        if (jH != -9223372036854775807L) {
            q0(jH);
            if (jH != this.f40632x.f40682r) {
                t1 t1Var = this.f40632x;
                long j11 = jH;
                this.f40632x = K(t1Var.f40666b, j11, t1Var.f40667c, j11, true, 5);
            }
        } else {
            long jH2 = this.f40623o.h(z0VarR != this.f40627s.s());
            this.L = jH2;
            long jY = z0VarR.y(jH2);
            U(this.f40632x.f40682r, jY);
            this.f40632x.o(jY);
        }
        this.f40632x.f40680p = this.f40627s.l().i();
        this.f40632x.f40681q = B();
        t1 t1Var2 = this.f40632x;
        if (t1Var2.f40676l && t1Var2.f40669e == 3 && d1(t1Var2.f40665a, t1Var2.f40666b) && this.f40632x.f40678n.f40757a == 1.0f) {
            float fA = this.f40629u.a(v(), B());
            if (this.f40623o.e().f40757a != fA) {
                J0(this.f40632x.f40678n.c(fA));
                I(this.f40632x.f40678n, this.f40623o.e().f40757a, false, false);
            }
        }
    }

    private void m(w1 w1Var) {
        if (w1Var.j()) {
            return;
        }
        try {
            w1Var.g().k(w1Var.i(), w1Var.e());
        } finally {
            w1Var.k(true);
        }
    }

    private void m0() throws ExoPlaybackException {
        int i11;
        float f11 = this.f40623o.e().f40757a;
        z0 z0VarS = this.f40627s.s();
        boolean z11 = true;
        for (z0 z0VarR = this.f40627s.r(); z0VarR != null && z0VarR.f41392d; z0VarR = z0VarR.j()) {
            qs.b0 b0VarV = z0VarR.v(f11, this.f40632x.f40665a);
            if (!b0VarV.a(z0VarR.o())) {
                if (z11) {
                    z0 z0VarR2 = this.f40627s.r();
                    boolean zC = this.f40627s.C(z0VarR2);
                    boolean[] zArr = new boolean[this.f40609a.length];
                    long jB = z0VarR2.b(b0VarV, this.f40632x.f40682r, zC, zArr);
                    t1 t1Var = this.f40632x;
                    boolean z12 = (t1Var.f40669e == 4 || jB == t1Var.f40682r) ? false : true;
                    t1 t1Var2 = this.f40632x;
                    i11 = 4;
                    this.f40632x = K(t1Var2.f40666b, jB, t1Var2.f40667c, t1Var2.f40668d, z12, 5);
                    if (z12) {
                        q0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f40609a.length];
                    int i12 = 0;
                    while (true) {
                        z1[] z1VarArr = this.f40609a;
                        if (i12 >= z1VarArr.length) {
                            break;
                        }
                        z1 z1Var = z1VarArr[i12];
                        boolean zP = P(z1Var);
                        zArr2[i12] = zP;
                        es.q qVar = z0VarR2.f41391c[i12];
                        if (zP) {
                            if (qVar != z1Var.f()) {
                                n(z1Var);
                            } else if (zArr[i12]) {
                                z1Var.o(this.L);
                            }
                        }
                        i12++;
                    }
                    r(zArr2);
                } else {
                    i11 = 4;
                    this.f40627s.C(z0VarR);
                    if (z0VarR.f41392d) {
                        z0VarR.a(b0VarV, Math.max(z0VarR.f41394f.f39407b, z0VarR.y(this.L)), false);
                    }
                }
                F(true);
                if (this.f40632x.f40669e != i11) {
                    S();
                    l1();
                    this.f40616h.h(2);
                    return;
                }
                return;
            }
            if (z0VarR == z0VarS) {
                z11 = false;
            }
        }
    }

    private void m1(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var2, com.google.android.exoplayer2.source.o.b bVar2, long j11, boolean z11) {
        if (!d1(f2Var, bVar)) {
            u1 u1Var = bVar.b() ? u1.f40753d : this.f40632x.f40678n;
            if (this.f40623o.e().equals(u1Var)) {
                return;
            }
            J0(u1Var);
            I(this.f40632x.f40678n, u1Var.f40757a, false, false);
            return;
        }
        f2Var.r(f2Var.l(bVar.f63157a, this.f40620l).f39924c, this.f40619k);
        this.f40629u.e((x0.g) ts.p0.j(this.f40619k.f39952k));
        if (j11 != -9223372036854775807L) {
            this.f40629u.d(x(f2Var, bVar.f63157a, j11));
            return;
        }
        if (!ts.p0.c(!f2Var2.u() ? f2Var2.r(f2Var2.l(bVar2.f63157a, this.f40620l).f39924c, this.f40619k).f39942a : null, this.f40619k.f39942a) || z11) {
            this.f40629u.d(-9223372036854775807L);
        }
    }

    private void n(z1 z1Var) {
        if (P(z1Var)) {
            this.f40623o.a(z1Var);
            s(z1Var);
            z1Var.disable();
            this.J--;
        }
    }

    private void n0() throws ExoPlaybackException {
        m0();
        z0(true);
    }

    private void n1(float f11) {
        for (z0 z0VarR = this.f40627s.r(); z0VarR != null; z0VarR = z0VarR.j()) {
            for (qs.r rVar : z0VarR.o().f105960c) {
                if (rVar != null) {
                    rVar.i(f11);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    private void o() throws ExoPlaybackException {
        boolean z11;
        boolean z12;
        int i11;
        long jA = this.f40625q.a();
        this.f40616h.j(2);
        k1();
        int i12 = this.f40632x.f40669e;
        if (i12 == 1 || i12 == 4) {
            return;
        }
        z0 z0VarR = this.f40627s.r();
        if (z0VarR == null) {
            x0(jA, 10L);
            return;
        }
        ts.n0.a("doSomeWork");
        l1();
        if (z0VarR.f41392d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            z0VarR.f41389a.o(this.f40632x.f40682r - this.f40621m, this.f40622n);
            z11 = true;
            z12 = true;
            int i13 = 0;
            while (true) {
                z1[] z1VarArr = this.f40609a;
                if (i13 >= z1VarArr.length) {
                    break;
                }
                z1 z1Var = z1VarArr[i13];
                if (P(z1Var)) {
                    z1Var.d(this.L, jElapsedRealtime);
                    z11 = z11 && z1Var.a();
                    boolean z13 = z0VarR.f41391c[i13] != z1Var.f();
                    boolean z14 = z13 || (!z13 && z1Var.h()) || z1Var.isReady() || z1Var.a();
                    z12 = z12 && z14;
                    if (!z14) {
                        z1Var.w();
                    }
                }
                i13++;
            }
        } else {
            z0VarR.f41389a.n();
            z11 = true;
            z12 = true;
        }
        long j11 = z0VarR.f41394f.f39410e;
        boolean z15 = z11 && z0VarR.f41392d && (j11 == -9223372036854775807L || j11 <= this.f40632x.f40682r);
        if (z15 && this.B) {
            this.B = false;
            P0(false, this.f40632x.f40677m, false, 5);
        }
        if (z15 && z0VarR.f41394f.f39414i) {
            Y0(4);
            h1();
        } else if (this.f40632x.f40669e == 2 && c1(z12)) {
            Y0(3);
            this.O = null;
            if (b1()) {
                e1();
            }
        } else if (this.f40632x.f40669e == 3 && (this.J != 0 ? !z12 : !Q())) {
            this.C = b1();
            Y0(2);
            if (this.C) {
                d0();
                this.f40629u.c();
            }
            h1();
        }
        if (this.f40632x.f40669e == 2) {
            int i14 = 0;
            while (true) {
                z1[] z1VarArr2 = this.f40609a;
                if (i14 >= z1VarArr2.length) {
                    break;
                }
                if (P(z1VarArr2[i14]) && this.f40609a[i14].f() == z0VarR.f41391c[i14]) {
                    this.f40609a[i14].w();
                }
                i14++;
            }
            t1 t1Var = this.f40632x;
            if (t1Var.f40671g || t1Var.f40681q >= 500000 || !O()) {
                this.Q = -9223372036854775807L;
            } else if (this.Q == -9223372036854775807L) {
                this.Q = this.f40625q.elapsedRealtime();
            } else if (this.f40625q.elapsedRealtime() - this.Q >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        } else {
            this.Q = -9223372036854775807L;
        }
        boolean z16 = b1() && this.f40632x.f40669e == 3;
        boolean z17 = this.I && this.H && z16;
        t1 t1Var2 = this.f40632x;
        if (t1Var2.f40679o != z17) {
            this.f40632x = t1Var2.i(z17);
        }
        this.H = false;
        if (!z17 && (i11 = this.f40632x.f40669e) != 4) {
            if (z16 || i11 == 2) {
                x0(jA, 10L);
            } else if (i11 == 3 && this.J != 0) {
                x0(jA, 1000L);
            }
        }
        ts.n0.c();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[PHI: r4 r5 r7
      0x00a3: PHI (r4v3 com.google.android.exoplayer2.source.o$b) = (r4v2 com.google.android.exoplayer2.source.o$b), (r4v6 com.google.android.exoplayer2.source.o$b) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v2 long) = (r5v1 long), (r5v16 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea A[PHI: r3
      0x00ea: PHI (r3v3 com.google.android.exoplayer2.f2) = 
      (r3v2 com.google.android.exoplayer2.f2)
      (r3v2 com.google.android.exoplayer2.f2)
      (r3v7 com.google.android.exoplayer2.f2)
      (r3v7 com.google.android.exoplayer2.f2)
     binds: [B:37:0x00b0, B:39:0x00b4, B:41:0x00c5, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    private void o0(boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        f2 f2Var;
        com.google.android.exoplayer2.source.o.b bVar;
        this.f40616h.j(2);
        this.O = null;
        this.C = false;
        this.f40623o.g();
        this.L = 1000000000000L;
        for (z1 z1Var : this.f40609a) {
            try {
                n(z1Var);
            } catch (ExoPlaybackException | RuntimeException e11) {
                ts.u.d("ExoPlayerImplInternal", "Disable failed.", e11);
            }
        }
        if (z11) {
            for (z1 z1Var2 : this.f40609a) {
                if (this.f40610b.remove(z1Var2)) {
                    try {
                        z1Var2.reset();
                    } catch (RuntimeException e12) {
                        ts.u.d("ExoPlayerImplInternal", "Reset failed.", e12);
                    }
                }
            }
        }
        this.J = 0;
        t1 t1Var = this.f40632x;
        com.google.android.exoplayer2.source.o.b bVar2 = t1Var.f40666b;
        long jLongValue = t1Var.f40682r;
        long j11 = (this.f40632x.f40666b.b() || R(this.f40632x, this.f40620l)) ? this.f40632x.f40667c : this.f40632x.f40682r;
        if (z12) {
            this.K = null;
            Pair<com.google.android.exoplayer2.source.o.b, Long> pairZ = z(this.f40632x.f40665a);
            bVar2 = (com.google.android.exoplayer2.source.o.b) pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            j11 = -9223372036854775807L;
            if (bVar2.equals(this.f40632x.f40666b)) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = false;
        }
        long j12 = jLongValue;
        long j13 = j11;
        this.f40627s.f();
        this.D = false;
        f2 f2VarI = this.f40632x.f40665a;
        if (z13 && (f2VarI instanceof x1)) {
            f2VarI = ((x1) f2VarI).I(this.f40628t.q());
            if (bVar2.f63158b != -1) {
                f2VarI.l(bVar2.f63157a, this.f40620l);
                if (f2VarI.r(this.f40620l.f39924c, this.f40619k).h()) {
                    f2Var = f2VarI;
                    bVar = new com.google.android.exoplayer2.source.o.b(bVar2.f63157a, bVar2.f63160d);
                } else {
                    f2Var = f2VarI;
                    bVar = bVar2;
                }
            } else {
                f2Var = f2VarI;
                bVar = bVar2;
            }
        } else {
            f2Var = f2VarI;
            bVar = bVar2;
        }
        t1 t1Var2 = this.f40632x;
        int i11 = t1Var2.f40669e;
        ExoPlaybackException exoPlaybackException = z14 ? null : t1Var2.f40670f;
        es.w wVar = z15 ? es.w.f63210d : t1Var2.f40672h;
        qs.b0 b0Var = z15 ? this.f40613e : t1Var2.f40673i;
        List listR = z15 ? com.google.common.collect.x.r() : t1Var2.f40674j;
        t1 t1Var3 = this.f40632x;
        this.f40632x = new t1(f2Var, bVar, j13, j12, i11, exoPlaybackException, false, wVar, b0Var, listR, bVar, t1Var3.f40676l, t1Var3.f40677m, t1Var3.f40678n, j12, 0L, j12, 0L, false);
        if (z13) {
            this.f40628t.y();
        }
    }

    private synchronized void o1(ou.x<Boolean> xVar, long j11) {
        long jElapsedRealtime = this.f40625q.elapsedRealtime() + j11;
        boolean z11 = false;
        while (!xVar.get().booleanValue() && j11 > 0) {
            try {
                this.f40625q.b();
                wait(j11);
            } catch (InterruptedException unused) {
                z11 = true;
            }
            j11 = jElapsedRealtime - this.f40625q.elapsedRealtime();
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    private void p(int i11, boolean z11) throws ExoPlaybackException {
        z1 z1Var = this.f40609a[i11];
        if (P(z1Var)) {
            return;
        }
        z0 z0VarS = this.f40627s.s();
        boolean z12 = z0VarS == this.f40627s.r();
        qs.b0 b0VarO = z0VarS.o();
        br.j0 j0Var = b0VarO.f105959b[i11];
        u0[] u0VarArrW = w(b0VarO.f105960c[i11]);
        boolean z13 = b1() && this.f40632x.f40669e == 3;
        boolean z14 = !z11 && z13;
        this.J++;
        this.f40610b.add(z1Var);
        z1Var.C(j0Var, u0VarArrW, z0VarS.f41391c[i11], this.L, z14, z12, z0VarS.m(), z0VarS.l());
        z1Var.k(11, new a());
        this.f40623o.b(z1Var);
        if (z13) {
            z1Var.start();
        }
    }

    private void p0() {
        z0 z0VarR = this.f40627s.r();
        this.B = z0VarR != null && z0VarR.f41394f.f39413h && this.A;
    }

    private void q() throws ExoPlaybackException {
        r(new boolean[this.f40609a.length]);
    }

    private void q0(long j11) {
        z0 z0VarR = this.f40627s.r();
        long jZ = z0VarR == null ? j11 + 1000000000000L : z0VarR.z(j11);
        this.L = jZ;
        this.f40623o.c(jZ);
        for (z1 z1Var : this.f40609a) {
            if (P(z1Var)) {
                z1Var.o(this.L);
            }
        }
        b0();
    }

    private void r(boolean[] zArr) throws ExoPlaybackException {
        z0 z0VarS = this.f40627s.s();
        qs.b0 b0VarO = z0VarS.o();
        for (int i11 = 0; i11 < this.f40609a.length; i11++) {
            if (!b0VarO.c(i11) && this.f40610b.remove(this.f40609a[i11])) {
                this.f40609a[i11].reset();
            }
        }
        for (int i12 = 0; i12 < this.f40609a.length; i12++) {
            if (b0VarO.c(i12)) {
                p(i12, zArr[i12]);
            }
        }
        z0VarS.f41395g = true;
    }

    private static void r0(f2 f2Var, d dVar, f2.d dVar2, f2.b bVar) {
        int i11 = f2Var.r(f2Var.l(dVar.f40647d, bVar).f39924c, dVar2).f39957p;
        Object obj = f2Var.k(i11, bVar, true).f39923b;
        long j11 = bVar.f39925d;
        dVar.b(i11, j11 != -9223372036854775807L ? j11 - 1 : Long.MAX_VALUE, obj);
    }

    private void s(z1 z1Var) {
        if (z1Var.getState() == 2) {
            z1Var.stop();
        }
    }

    private static boolean s0(d dVar, f2 f2Var, f2 f2Var2, int i11, boolean z11, f2.d dVar2, f2.b bVar) {
        Object obj = dVar.f40647d;
        if (obj == null) {
            Pair<Object, Long> pairV0 = v0(f2Var, new h(dVar.f40644a.h(), dVar.f40644a.d(), dVar.f40644a.f() == Long.MIN_VALUE ? -9223372036854775807L : ts.p0.D0(dVar.f40644a.f())), false, i11, z11, dVar2, bVar);
            if (pairV0 == null) {
                return false;
            }
            dVar.b(f2Var.f(pairV0.first), ((Long) pairV0.second).longValue(), pairV0.first);
            if (dVar.f40644a.f() == Long.MIN_VALUE) {
                r0(f2Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = f2Var.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f40644a.f() == Long.MIN_VALUE) {
            r0(f2Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f40645b = iF;
        f2Var2.l(dVar.f40647d, bVar);
        if (bVar.f39927f && f2Var2.r(bVar.f39924c, dVar2).f39956o == f2Var2.f(dVar.f40647d)) {
            Pair<Object, Long> pairN = f2Var.n(dVar2, bVar, f2Var.l(dVar.f40647d, bVar).f39924c, dVar.f40646c + bVar.q());
            dVar.b(f2Var.f(pairN.first), ((Long) pairN.second).longValue(), pairN.first);
        }
        return true;
    }

    private void t0(f2 f2Var, f2 f2Var2) {
        if (f2Var.u() && f2Var2.u()) {
            return;
        }
        int size = this.f40624p.size() - 1;
        while (size >= 0) {
            f2 f2Var3 = f2Var;
            f2 f2Var4 = f2Var2;
            if (!s0(this.f40624p.get(size), f2Var3, f2Var4, this.E, this.F, this.f40619k, this.f40620l)) {
                this.f40624p.get(size).f40644a.k(false);
                this.f40624p.remove(size);
            }
            size--;
            f2Var = f2Var3;
            f2Var2 = f2Var4;
        }
        Collections.sort(this.f40624p);
    }

    private com.google.common.collect.x<ur.a> u(qs.r[] rVarArr) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        boolean z11 = false;
        for (qs.r rVar : rVarArr) {
            if (rVar != null) {
                ur.a aVar2 = rVar.h(0).f40710j;
                if (aVar2 == null) {
                    aVar.a(new ur.a(new ur.a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z11 = true;
                }
            }
        }
        return z11 ? aVar.k() : com.google.common.collect.x.r();
    }

    private static g u0(f2 f2Var, t1 t1Var, h hVar, c1 c1Var, int i11, boolean z11, f2.d dVar, f2.b bVar) {
        int iE;
        boolean z12;
        boolean z13;
        boolean z14;
        int iE2;
        boolean z15;
        f2 f2Var2;
        f2.b bVar2;
        long j11;
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        if (f2Var.u()) {
            return new g(t1.l(), 0L, -9223372036854775807L, false, true, false);
        }
        com.google.android.exoplayer2.source.o.b bVar3 = t1Var.f40666b;
        Object obj = bVar3.f63157a;
        boolean zR = R(t1Var, bVar);
        long jLongValue = (t1Var.f40666b.b() || zR) ? t1Var.f40667c : t1Var.f40682r;
        long j12 = -9223372036854775807L;
        boolean z19 = false;
        if (hVar != null) {
            Pair<Object, Long> pairV0 = v0(f2Var, hVar, true, i11, z11, dVar, bVar);
            if (pairV0 == null) {
                iE = f2Var.e(z11);
                jLongValue = jLongValue;
                z16 = false;
                z17 = false;
                z18 = true;
            } else {
                if (hVar.f40663c == -9223372036854775807L) {
                    iE = f2Var.l(pairV0.first, bVar).f39924c;
                    jLongValue = jLongValue;
                    z16 = false;
                } else {
                    obj = pairV0.first;
                    jLongValue = ((Long) pairV0.second).longValue();
                    iE = -1;
                    z16 = true;
                }
                z17 = t1Var.f40669e == 4;
                z18 = false;
            }
            z14 = z16;
            z12 = z17;
            z13 = z18;
        } else {
            j12 = -9223372036854775807L;
            if (t1Var.f40665a.u()) {
                iE = f2Var.e(z11);
            } else if (f2Var.f(obj) == -1) {
                Object objW0 = w0(dVar, bVar, i11, z11, obj, t1Var.f40665a, f2Var);
                if (objW0 == null) {
                    iE2 = f2Var.e(z11);
                    z15 = true;
                } else {
                    iE2 = f2Var.l(objW0, bVar).f39924c;
                    z15 = false;
                }
                iE = iE2;
                obj = obj;
                jLongValue = jLongValue;
                z13 = z15;
                z12 = false;
                z14 = false;
            } else if (jLongValue == -9223372036854775807L) {
                iE = f2Var.l(obj, bVar).f39924c;
                obj = obj;
            } else if (zR) {
                t1Var.f40665a.l(bVar3.f63157a, bVar);
                if (t1Var.f40665a.r(bVar.f39924c, dVar).f39956o == t1Var.f40665a.f(bVar3.f63157a)) {
                    Pair<Object, Long> pairN = f2Var.n(dVar, bVar, f2Var.l(obj, bVar).f39924c, bVar.q() + jLongValue);
                    obj = pairN.first;
                    jLongValue = ((Long) pairN.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jLongValue;
                }
                iE = -1;
                z12 = false;
                z13 = false;
                z14 = true;
            } else {
                obj = obj;
                iE = -1;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (iE != -1) {
            f2Var2 = f2Var;
            Pair<Object, Long> pairN2 = f2Var2.n(dVar, bVar, iE, -9223372036854775807L);
            bVar2 = bVar;
            obj = pairN2.first;
            jLongValue = ((Long) pairN2.second).longValue();
            j11 = j12;
        } else {
            f2Var2 = f2Var;
            bVar2 = bVar;
            j11 = jLongValue;
        }
        com.google.android.exoplayer2.source.o.b bVarE = c1Var.E(f2Var2, obj, jLongValue);
        int i13 = bVarE.f63161e;
        boolean z21 = i13 == -1 || ((i12 = bVar3.f63161e) != -1 && i13 >= i12);
        if (bVar3.f63157a.equals(obj) && !bVar3.b() && !bVarE.b() && z21) {
            z19 = true;
        }
        com.google.android.exoplayer2.source.o.b bVar4 = bVarE;
        boolean zN = N(zR, bVar3, jLongValue, bVar4, f2Var2.l(obj, bVar2), j11);
        if (z19 || zN) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jLongValue = t1Var.f40682r;
            } else {
                f2Var2.l(bVar4.f63157a, bVar2);
                jLongValue = bVar4.f63159c == bVar2.n(bVar4.f63158b) ? bVar2.j() : 0L;
            }
        }
        return new g(bVar4, jLongValue, j11, z12, z13, z14);
    }

    private long v() {
        t1 t1Var = this.f40632x;
        return x(t1Var.f40665a, t1Var.f40666b.f63157a, t1Var.f40682r);
    }

    private static Pair<Object, Long> v0(f2 f2Var, h hVar, boolean z11, int i11, boolean z12, f2.d dVar, f2.b bVar) {
        f2 f2Var2;
        Object objW0;
        f2 f2Var3 = hVar.f40661a;
        if (f2Var.u()) {
            return null;
        }
        if (f2Var3.u()) {
            f2Var2 = f2Var3;
            f2Var2 = f2Var;
        }
        try {
            f2Var2 = f2Var3;
            Pair<Object, Long> pairN = f2Var2.n(dVar, bVar, hVar.f40662b, hVar.f40663c);
            f2 f2Var4 = f2Var2;
            if (f2Var.equals(f2Var4)) {
                return pairN;
            }
            if (f2Var.f(pairN.first) != -1) {
                return (f2Var4.l(pairN.first, bVar).f39927f && f2Var4.r(bVar.f39924c, dVar).f39956o == f2Var4.f(pairN.first)) ? f2Var.n(dVar, bVar, f2Var.l(pairN.first, bVar).f39924c, hVar.f40663c) : pairN;
            }
            if (z11 && (objW0 = w0(dVar, bVar, i11, z12, pairN.first, f2Var4, f2Var)) != null) {
                return f2Var.n(dVar, bVar, f2Var.l(objW0, bVar).f39924c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static u0[] w(qs.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        u0[] u0VarArr = new u0[length];
        for (int i11 = 0; i11 < length; i11++) {
            u0VarArr[i11] = rVar.h(i11);
        }
        return u0VarArr;
    }

    static Object w0(f2.d dVar, f2.b bVar, int i11, boolean z11, Object obj, f2 f2Var, f2 f2Var2) {
        int iF = f2Var.f(obj);
        int iM = f2Var.m();
        int i12 = 0;
        int iH = iF;
        int iF2 = -1;
        while (i12 < iM && iF2 == -1) {
            f2.d dVar2 = dVar;
            f2.b bVar2 = bVar;
            int i13 = i11;
            boolean z12 = z11;
            f2 f2Var3 = f2Var;
            iH = f2Var3.h(iH, bVar2, dVar2, i13, z12);
            if (iH == -1) {
                break;
            }
            iF2 = f2Var2.f(f2Var3.q(iH));
            i12++;
            f2Var = f2Var3;
            bVar = bVar2;
            dVar = dVar2;
            i11 = i13;
            z11 = z12;
        }
        if (iF2 == -1) {
            return null;
        }
        return f2Var2.q(iF2);
    }

    private long x(f2 f2Var, Object obj, long j11) {
        f2Var.r(f2Var.l(obj, this.f40620l).f39924c, this.f40619k);
        f2.d dVar = this.f40619k;
        if (dVar.f39947f != -9223372036854775807L && dVar.h()) {
            f2.d dVar2 = this.f40619k;
            if (dVar2.f39950i) {
                return ts.p0.D0(dVar2.c() - this.f40619k.f39947f) - (j11 + this.f40620l.q());
            }
        }
        return -9223372036854775807L;
    }

    private void x0(long j11, long j12) {
        this.f40616h.i(2, j11 + j12);
    }

    private long y() {
        z0 z0VarS = this.f40627s.s();
        if (z0VarS == null) {
            return 0L;
        }
        long jL = z0VarS.l();
        if (!z0VarS.f41392d) {
            return jL;
        }
        int i11 = 0;
        while (true) {
            z1[] z1VarArr = this.f40609a;
            if (i11 >= z1VarArr.length) {
                return jL;
            }
            if (P(z1VarArr[i11]) && this.f40609a[i11].f() == z0VarS.f41391c[i11]) {
                long jN = this.f40609a[i11].n();
                if (jN == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jN, jL);
            }
            i11++;
        }
    }

    private Pair<com.google.android.exoplayer2.source.o.b, Long> z(f2 f2Var) {
        if (f2Var.u()) {
            return Pair.create(t1.l(), 0L);
        }
        Pair<Object, Long> pairN = f2Var.n(this.f40619k, this.f40620l, f2Var.e(this.F), -9223372036854775807L);
        com.google.android.exoplayer2.source.o.b bVarE = this.f40627s.E(f2Var, pairN.first, 0L);
        long jLongValue = ((Long) pairN.second).longValue();
        if (bVarE.b()) {
            f2Var.l(bVarE.f63157a, this.f40620l);
            jLongValue = bVarE.f63159c == this.f40620l.n(bVarE.f63158b) ? this.f40620l.j() : 0L;
        }
        return Pair.create(bVarE, Long.valueOf(jLongValue));
    }

    private void z0(boolean z11) throws ExoPlaybackException {
        com.google.android.exoplayer2.source.o.b bVar = this.f40627s.r().f41394f.f39406a;
        long jC0 = C0(bVar, this.f40632x.f40682r, true, false);
        if (jC0 != this.f40632x.f40682r) {
            t1 t1Var = this.f40632x;
            this.f40632x = K(bVar, jC0, t1Var.f40667c, t1Var.f40668d, z11, 5);
        }
    }

    public Looper A() {
        return this.f40618j;
    }

    public void L0(List<q1.c> list, int i11, long j11, es.r rVar) {
        this.f40616h.c(17, new b(list, rVar, i11, j11, null)).a();
    }

    public void O0(boolean z11, int i11) {
        this.f40616h.e(1, z11 ? 1 : 0, i11).a();
    }

    public void Q0(u1 u1Var) {
        this.f40616h.c(4, u1Var).a();
    }

    public void S0(int i11) {
        this.f40616h.e(11, i11, 0).a();
    }

    public void V0(boolean z11) {
        this.f40616h.e(12, z11 ? 1 : 0, 0).a();
    }

    @Override // qs.a0.a
    public void a(z1 z1Var) {
        this.f40616h.h(26);
    }

    @Override // qs.a0.a
    public void b() {
        this.f40616h.h(10);
    }

    @Override // com.google.android.exoplayer2.q1.d
    public void c() {
        this.f40616h.h(22);
    }

    @Override // com.google.android.exoplayer2.w1.a
    public synchronized void d(w1 w1Var) {
        if (!this.f40634z && this.f40618j.getThread().isAlive()) {
            this.f40616h.c(14, w1Var).a();
            return;
        }
        ts.u.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        w1Var.k(false);
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void i(com.google.android.exoplayer2.source.n nVar) {
        this.f40616h.c(9, nVar).a();
    }

    public void f0() {
        this.f40616h.a(0).a();
    }

    public void f1() {
        this.f40616h.a(6).a();
    }

    public synchronized boolean h0() {
        if (!this.f40634z && this.f40618j.getThread().isAlive()) {
            this.f40616h.h(7);
            o1(new ou.x() { // from class: com.google.android.exoplayer2.r0
                @Override // ou.x
                public final Object get() {
                    return Boolean.valueOf(this.f40311a.f40634z);
                }
            }, this.f40630v);
            return this.f40634z;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i11;
        z0 z0VarS;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 0:
                    g0();
                    break;
                case 1:
                    P0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    o();
                    break;
                case 3:
                    A0((h) message.obj);
                    break;
                case 4:
                    R0((u1) message.obj);
                    break;
                case 5:
                    U0((br.l0) message.obj);
                    break;
                case 6:
                    g1(false, true);
                    break;
                case 7:
                    i0();
                    return true;
                case 8:
                    H((com.google.android.exoplayer2.source.n) message.obj);
                    break;
                case 9:
                    D((com.google.android.exoplayer2.source.n) message.obj);
                    break;
                case 10:
                    m0();
                    break;
                case 11:
                    T0(message.arg1);
                    break;
                case 12:
                    W0(message.arg1 != 0);
                    break;
                case 13:
                    I0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    D0((w1) message.obj);
                    break;
                case 15:
                    F0((w1) message.obj);
                    break;
                case 16:
                    J((u1) message.obj, false);
                    break;
                case 17:
                    K0((b) message.obj);
                    break;
                case 18:
                    k((b) message.obj, message.arg1);
                    break;
                case 19:
                    a0((c) message.obj);
                    break;
                case 20:
                    k0(message.arg1, message.arg2, (es.r) message.obj);
                    break;
                case 21:
                    X0((es.r) message.obj);
                    break;
                case 22:
                    Z();
                    break;
                case 23:
                    N0(message.arg1 != 0);
                    break;
                case 24:
                    M0(message.arg1 == 1);
                    break;
                case 25:
                    l();
                    break;
                case 26:
                    n0();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e11) {
            e = e11;
            if (e.f39381i == 1 && (z0VarS = this.f40627s.s()) != null) {
                e = e.e(z0VarS.f41394f.f39406a);
            }
            if (e.f39387o && this.O == null) {
                ts.u.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.O = e;
                ts.q qVar = this.f40616h;
                qVar.k(qVar.c(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.O;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.O;
                }
                ts.u.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f39381i == 1 && this.f40627s.r() != this.f40627s.s()) {
                    while (this.f40627s.r() != this.f40627s.s()) {
                        this.f40627s.b();
                    }
                    a1 a1Var = ((z0) ts.a.e(this.f40627s.r())).f41394f;
                    com.google.android.exoplayer2.source.o.b bVar = a1Var.f39406a;
                    long j11 = a1Var.f39407b;
                    this.f40632x = K(bVar, j11, a1Var.f39408c, j11, true, 0);
                }
                g1(true, false);
                this.f40632x = this.f40632x.f(e);
            }
        } catch (ParserException e12) {
            int i13 = e12.f39393b;
            if (i13 == 1) {
                i11 = e12.f39392a ? AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else {
                if (i13 == 4) {
                    i11 = e12.f39392a ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                }
                E(e12, i12);
            }
            i12 = i11;
            E(e12, i12);
        } catch (DrmSession.DrmSessionException e13) {
            E(e13, e13.f39803a);
        } catch (BehindLiveWindowException e14) {
            E(e14, 1002);
        } catch (DataSourceException e15) {
            E(e15, e15.f41028a);
        } catch (IOException e16) {
            E(e16, 2000);
        } catch (RuntimeException e17) {
            ExoPlaybackException exoPlaybackExceptionI = ExoPlaybackException.i(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            ts.u.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionI);
            g1(true, false);
            this.f40632x = this.f40632x.f(exoPlaybackExceptionI);
        }
        T();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void j(com.google.android.exoplayer2.source.n nVar) {
        this.f40616h.c(8, nVar).a();
    }

    @Override // com.google.android.exoplayer2.i.a
    public void onPlaybackParametersChanged(u1 u1Var) {
        this.f40616h.c(16, u1Var).a();
    }

    public void t(long j11) {
        this.P = j11;
    }

    public void y0(f2 f2Var, int i11, long j11) {
        this.f40616h.c(3, new h(f2Var, i11, j11)).a();
    }
}
