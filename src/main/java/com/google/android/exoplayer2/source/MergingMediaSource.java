package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.x0;
import com.google.common.collect.k0;
import com.google.common.collect.l0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MergingMediaSource extends c<Integer> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final x0 f40334v = new x0.c().c("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f40335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f40336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o[] f40337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f2[] f40338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList<o> f40339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final es.d f40340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map<Object, Long> f40341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k0<Object, b> f40342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[][] f40344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IllegalMergeException f40345u;

    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40346a;

        public IllegalMergeException(int i11) {
            this.f40346a = i11;
        }
    }

    private static final class a extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f40347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long[] f40348h;

        public a(f2 f2Var, Map<Object, Long> map) {
            super(f2Var);
            int iT = f2Var.t();
            this.f40348h = new long[f2Var.t()];
            f2.d dVar = new f2.d();
            for (int i11 = 0; i11 < iT; i11++) {
                this.f40348h[i11] = f2Var.r(i11, dVar).f39955n;
            }
            int iM = f2Var.m();
            this.f40347g = new long[iM];
            f2.b bVar = new f2.b();
            for (int i12 = 0; i12 < iM; i12++) {
                f2Var.k(i12, bVar, true);
                long jLongValue = ((Long) ts.a.e(map.get(bVar.f39923b))).longValue();
                long[] jArr = this.f40347g;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f39925d : jLongValue;
                jArr[i12] = jLongValue;
                long j11 = bVar.f39925d;
                if (j11 != -9223372036854775807L) {
                    long[] jArr2 = this.f40348h;
                    int i13 = bVar.f39924c;
                    jArr2[i13] = jArr2[i13] - (j11 - jLongValue);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.b k(int i11, f2.b bVar, boolean z11) {
            super.k(i11, bVar, z11);
            bVar.f39925d = this.f40347g[i11];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.d s(int i11, f2.d dVar, long j11) {
            long jMin;
            super.s(i11, dVar, j11);
            long j12 = this.f40348h[i11];
            dVar.f39955n = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = dVar.f39954m;
                if (j13 == -9223372036854775807L) {
                    jMin = dVar.f39954m;
                } else {
                    jMin = Math.min(j13, j12);
                }
            } else {
                jMin = dVar.f39954m;
            }
            dVar.f39954m = jMin;
            return dVar;
        }
    }

    public MergingMediaSource(o... oVarArr) {
        this(false, oVarArr);
    }

    private void G() {
        f2.b bVar = new f2.b();
        for (int i11 = 0; i11 < this.f40343s; i11++) {
            long j11 = -this.f40338n[0].j(i11, bVar).q();
            int i12 = 1;
            while (true) {
                f2[] f2VarArr = this.f40338n;
                if (i12 < f2VarArr.length) {
                    this.f40344t[i11][i12] = j11 - (-f2VarArr[i12].j(i11, bVar).q());
                    i12++;
                }
            }
        }
    }

    private void J() {
        f2[] f2VarArr;
        f2.b bVar = new f2.b();
        for (int i11 = 0; i11 < this.f40343s; i11++) {
            int i12 = 0;
            long j11 = Long.MIN_VALUE;
            while (true) {
                f2VarArr = this.f40338n;
                if (i12 >= f2VarArr.length) {
                    break;
                }
                long jM = f2VarArr[i12].j(i11, bVar).m();
                if (jM != -9223372036854775807L) {
                    long j12 = jM + this.f40344t[i11][i12];
                    if (j11 == Long.MIN_VALUE || j12 < j11) {
                        j11 = j12;
                    }
                }
                i12++;
            }
            Object objQ = f2VarArr[0].q(i11);
            this.f40341q.put(objQ, Long.valueOf(j11));
            Iterator<b> it = this.f40342r.get(objQ).iterator();
            while (it.hasNext()) {
                it.next().t(0L, j11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public o.b B(Integer num, o.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void E(Integer num, o oVar, f2 f2Var) {
        if (this.f40345u != null) {
            return;
        }
        if (this.f40343s == -1) {
            this.f40343s = f2Var.m();
        } else if (f2Var.m() != this.f40343s) {
            this.f40345u = new IllegalMergeException(0);
            return;
        }
        if (this.f40344t.length == 0) {
            this.f40344t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f40343s, this.f40338n.length);
        }
        this.f40339o.remove(oVar);
        this.f40338n[num.intValue()] = f2Var;
        if (this.f40339o.isEmpty()) {
            if (this.f40335k) {
                G();
            }
            f2 aVar = this.f40338n[0];
            if (this.f40336l) {
                J();
                aVar = new a(aVar, this.f40341q);
            }
            y(aVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public x0 a() {
        o[] oVarArr = this.f40337m;
        return oVarArr.length > 0 ? oVarArr[0].a() : f40334v;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.o
    public void b() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f40345u;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.b();
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ss.b bVar2, long j11) {
        int length = this.f40337m.length;
        n[] nVarArr = new n[length];
        int iF = this.f40338n[0].f(bVar.f63157a);
        for (int i11 = 0; i11 < length; i11++) {
            nVarArr[i11] = this.f40337m[i11].g(bVar.c(this.f40338n[i11].q(iF)), bVar2, j11 - this.f40344t[iF][i11]);
        }
        r rVar = new r(this.f40340p, this.f40344t[iF], nVarArr);
        if (!this.f40336l) {
            return rVar;
        }
        b bVar3 = new b(rVar, true, 0L, ((Long) ts.a.e(this.f40341q.get(bVar.f63157a))).longValue());
        this.f40342r.put(bVar.f63157a, bVar3);
        return bVar3;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void i(n nVar) {
        if (this.f40336l) {
            b bVar = (b) nVar;
            for (Map.Entry<Object, b> entry : this.f40342r.a()) {
                if (entry.getValue().equals(bVar)) {
                    this.f40342r.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            nVar = bVar.f40357a;
        }
        r rVar = (r) nVar;
        int i11 = 0;
        while (true) {
            o[] oVarArr = this.f40337m;
            if (i11 >= oVarArr.length) {
                return;
            }
            oVarArr[i11].i(rVar.b(i11));
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void x(ss.z zVar) {
        super.x(zVar);
        for (int i11 = 0; i11 < this.f40337m.length; i11++) {
            F(Integer.valueOf(i11), this.f40337m[i11]);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void z() {
        super.z();
        Arrays.fill(this.f40338n, (Object) null);
        this.f40343s = -1;
        this.f40345u = null;
        this.f40339o.clear();
        Collections.addAll(this.f40339o, this.f40337m);
    }

    public MergingMediaSource(boolean z11, o... oVarArr) {
        this(z11, false, oVarArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, o... oVarArr) {
        this(z11, z12, new es.e(), oVarArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, es.d dVar, o... oVarArr) {
        this.f40335k = z11;
        this.f40336l = z12;
        this.f40337m = oVarArr;
        this.f40340p = dVar;
        this.f40339o = new ArrayList<>(Arrays.asList(oVarArr));
        this.f40343s = -1;
        this.f40338n = new f2[oVarArr.length];
        this.f40344t = new long[0][];
        this.f40341q = new HashMap();
        this.f40342r = l0.a().a().e();
    }
}
