package androidx.media3.exoplayer.source;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class MergingMediaSource extends androidx.media3.exoplayer.source.c<Integer> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final p7.y f10814w = new p7.y.c().c("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f10815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f10816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r[] f10817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<List<c>> f10818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r0[] f10819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<r> f10820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n8.e f10821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map<Object, Long> f10822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.common.collect.k0<Object, androidx.media3.exoplayer.source.b> f10823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f10825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private IllegalMergeException f10826v;

    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10827a;

        public IllegalMergeException(int i11) {
            this.f10827a = i11;
        }
    }

    private static final class b extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f10828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f10829g;

        public b(r0 r0Var, Map<Object, Long> map) {
            super(r0Var);
            int iT = r0Var.t();
            this.f10829g = new long[r0Var.t()];
            r0.d dVar = new r0.d();
            for (int i11 = 0; i11 < iT; i11++) {
                this.f10829g[i11] = r0Var.r(i11, dVar).f101493m;
            }
            int iM = r0Var.m();
            this.f10828f = new long[iM];
            r0.b bVar = new r0.b();
            for (int i12 = 0; i12 < iM; i12++) {
                r0Var.k(i12, bVar, true);
                long jLongValue = ((Long) s7.a.f(map.get(bVar.f101461b))).longValue();
                long[] jArr = this.f10828f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f101463d : jLongValue;
                jArr[i12] = jLongValue;
                long j11 = bVar.f101463d;
                if (j11 != -9223372036854775807L) {
                    long[] jArr2 = this.f10829g;
                    int i13 = bVar.f101462c;
                    jArr2[i13] = jArr2[i13] - (j11 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.b k(int i11, r0.b bVar, boolean z11) {
            super.k(i11, bVar, z11);
            bVar.f101463d = this.f10828f[i11];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.d s(int i11, r0.d dVar, long j11) {
            long jMin;
            super.s(i11, dVar, j11);
            long j12 = this.f10829g[i11];
            dVar.f101493m = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = dVar.f101492l;
                if (j13 == -9223372036854775807L) {
                    jMin = dVar.f101492l;
                } else {
                    jMin = Math.min(j13, j12);
                }
            } else {
                jMin = dVar.f101492l;
            }
            dVar.f101492l = jMin;
            return dVar;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r.b f10830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f10831b;

        private c(r.b bVar, q qVar) {
            this.f10830a = bVar;
            this.f10831b = qVar;
        }
    }

    public MergingMediaSource(r... rVarArr) {
        this(false, rVarArr);
    }

    private void N() {
        r0.b bVar = new r0.b();
        for (int i11 = 0; i11 < this.f10824t; i11++) {
            long j11 = -this.f10819o[0].j(i11, bVar).p();
            int i12 = 1;
            while (true) {
                r0[] r0VarArr = this.f10819o;
                if (i12 < r0VarArr.length) {
                    this.f10825u[i11][i12] = j11 - (-r0VarArr[i12].j(i11, bVar).p());
                    i12++;
                }
            }
        }
    }

    private void Q() {
        r0[] r0VarArr;
        r0.b bVar = new r0.b();
        for (int i11 = 0; i11 < this.f10824t; i11++) {
            int i12 = 0;
            long j11 = Long.MIN_VALUE;
            while (true) {
                r0VarArr = this.f10819o;
                if (i12 >= r0VarArr.length) {
                    break;
                }
                long jL = r0VarArr[i12].j(i11, bVar).l();
                if (jL != -9223372036854775807L) {
                    long j12 = jL + this.f10825u[i11][i12];
                    if (j11 == Long.MIN_VALUE || j12 < j11) {
                        j11 = j12;
                    }
                }
                i12++;
            }
            Object objQ = r0VarArr[0].q(i11);
            this.f10822r.put(objQ, Long.valueOf(j11));
            Iterator<androidx.media3.exoplayer.source.b> it = this.f10823s.get(objQ).iterator();
            while (it.hasNext()) {
                it.next().x(0L, j11);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected void E(v7.q qVar) {
        super.E(qVar);
        for (int i11 = 0; i11 < this.f10817m.length; i11++) {
            M(Integer.valueOf(i11), this.f10817m[i11]);
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected void G() {
        super.G();
        Arrays.fill(this.f10819o, (Object) null);
        this.f10824t = -1;
        this.f10826v = null;
        this.f10820p.clear();
        Collections.addAll(this.f10820p, this.f10817m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public r.b I(Integer num, r.b bVar) {
        List<c> list = this.f10818n.get(num.intValue());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).f10830a.equals(bVar)) {
                return this.f10818n.get(0).get(i11).f10830a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void L(Integer num, r rVar, r0 r0Var) {
        if (this.f10826v != null) {
            return;
        }
        if (this.f10824t == -1) {
            this.f10824t = r0Var.m();
        } else if (r0Var.m() != this.f10824t) {
            this.f10826v = new IllegalMergeException(0);
            return;
        }
        if (this.f10825u.length == 0) {
            this.f10825u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f10824t, this.f10819o.length);
        }
        this.f10820p.remove(rVar);
        this.f10819o[num.intValue()] = r0Var;
        if (this.f10820p.isEmpty()) {
            if (this.f10815k) {
                N();
            }
            r0 bVar = this.f10819o[0];
            if (this.f10816l) {
                Q();
                bVar = new b(bVar, this.f10822r);
            }
            F(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public p7.y a() {
        r[] rVarArr = this.f10817m;
        return rVarArr.length > 0 ? rVarArr[0].a() : f10814w;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.r
    public void b() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f10826v;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.b();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        if (this.f10816l) {
            androidx.media3.exoplayer.source.b bVar = (androidx.media3.exoplayer.source.b) qVar;
            for (Map.Entry<Object, androidx.media3.exoplayer.source.b> entry : this.f10823s.a()) {
                if (entry.getValue().equals(bVar)) {
                    this.f10823s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            qVar = bVar.f10843a;
        }
        v vVar = (v) qVar;
        for (int i11 = 0; i11 < this.f10817m.length; i11++) {
            List<c> list = this.f10818n.get(i11);
            q qVarQ = vVar.q(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (list.get(i12).f10831b.equals(qVarQ)) {
                    list.remove(i12);
                    break;
                }
            }
            this.f10817m[i11].h(vVar.q(i11));
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i(p7.y yVar) {
        this.f10817m[0].i(yVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(p7.y yVar) {
        r[] rVarArr = this.f10817m;
        return rVarArr.length > 0 && rVarArr[0].k(yVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q r(r.b bVar, s8.b bVar2, long j11) {
        int length = this.f10817m.length;
        q[] qVarArr = new q[length];
        int iF = this.f10819o[0].f(bVar.f11103a);
        for (int i11 = 0; i11 < length; i11++) {
            r.b bVarA = bVar.a(this.f10819o[i11].q(iF));
            qVarArr[i11] = this.f10817m[i11].r(bVarA, bVar2, j11 - this.f10825u[iF][i11]);
            this.f10818n.get(i11).add(new c(bVarA, qVarArr[i11]));
        }
        v vVar = new v(this.f10821q, this.f10825u[iF], qVarArr);
        if (!this.f10816l) {
            return vVar;
        }
        androidx.media3.exoplayer.source.b bVar3 = new androidx.media3.exoplayer.source.b(vVar, false, 0L, ((Long) s7.a.f(this.f10822r.get(bVar.f11103a))).longValue());
        this.f10823s.put(bVar.f11103a, bVar3);
        return bVar3;
    }

    public MergingMediaSource(boolean z11, r... rVarArr) {
        this(z11, false, rVarArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, r... rVarArr) {
        this(z11, z12, new n8.f(), rVarArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, n8.e eVar, r... rVarArr) {
        this.f10815k = z11;
        this.f10816l = z12;
        this.f10817m = rVarArr;
        this.f10821q = eVar;
        this.f10820p = new ArrayList<>(Arrays.asList(rVarArr));
        this.f10824t = -1;
        this.f10818n = new ArrayList(rVarArr.length);
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            this.f10818n.add(new ArrayList());
        }
        this.f10819o = new r0[rVarArr.length];
        this.f10825u = new long[0][];
        this.f10822r = new HashMap();
        this.f10823s = com.google.common.collect.l0.a().a().e();
    }
}
