package com.google.android.exoplayer2.source;

import br.l0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class r implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f40510a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final es.d f40512c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n.a f40515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private es.w f40516g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c0 f40518i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<n> f40513d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<es.u, es.u> f40514e = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<es.q, Integer> f40511b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n[] f40517h = new n[0];

    private static final class a implements qs.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qs.r f40519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final es.u f40520b;

        public a(qs.r rVar, es.u uVar) {
            this.f40519a = rVar;
            this.f40520b = uVar;
        }

        @Override // qs.u
        public int b(int i11) {
            return this.f40519a.b(i11);
        }

        @Override // qs.r
        public void c() {
            this.f40519a.c();
        }

        @Override // qs.u
        public int d(int i11) {
            return this.f40519a.d(i11);
        }

        @Override // qs.r
        public void disable() {
            this.f40519a.disable();
        }

        @Override // qs.u
        public es.u e() {
            return this.f40520b;
        }

        @Override // qs.r
        public void enable() {
            this.f40519a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40519a.equals(aVar.f40519a) && this.f40520b.equals(aVar.f40520b);
        }

        @Override // qs.r
        public u0 f() {
            return this.f40519a.f();
        }

        @Override // qs.r
        public void g() {
            this.f40519a.g();
        }

        @Override // qs.u
        public u0 h(int i11) {
            return this.f40519a.h(i11);
        }

        public int hashCode() {
            return ((527 + this.f40520b.hashCode()) * 31) + this.f40519a.hashCode();
        }

        @Override // qs.r
        public void i(float f11) {
            this.f40519a.i(f11);
        }

        @Override // qs.r
        public void j(boolean z11) {
            this.f40519a.j(z11);
        }

        @Override // qs.u
        public int length() {
            return this.f40519a.length();
        }
    }

    private static final class b implements n, n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f40521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f40522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n.a f40523c;

        public b(n nVar, long j11) {
            this.f40521a = nVar;
            this.f40522b = j11;
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public boolean a(long j11) {
            return this.f40521a.a(j11 - this.f40522b);
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public boolean c() {
            return this.f40521a.c();
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public long d() {
            long jD = this.f40521a.d();
            if (jD == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return jD + this.f40522b;
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public void e(long j11) {
            this.f40521a.e(j11 - this.f40522b);
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public long f() {
            long jF = this.f40521a.f();
            if (jF == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return jF + this.f40522b;
        }

        @Override // com.google.android.exoplayer2.source.n
        public long g(long j11) {
            return this.f40521a.g(j11 - this.f40522b) + this.f40522b;
        }

        @Override // com.google.android.exoplayer2.source.n
        public long h() {
            long jH = this.f40521a.h();
            if (jH == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return jH + this.f40522b;
        }

        @Override // com.google.android.exoplayer2.source.n.a
        public void j(n nVar) {
            ((n.a) ts.a.e(this.f40523c)).j(this);
        }

        @Override // com.google.android.exoplayer2.source.n
        public es.w k() {
            return this.f40521a.k();
        }

        @Override // com.google.android.exoplayer2.source.n
        public long l(long j11, l0 l0Var) {
            return this.f40521a.l(j11 - this.f40522b, l0Var) + this.f40522b;
        }

        @Override // com.google.android.exoplayer2.source.c0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(n nVar) {
            ((n.a) ts.a.e(this.f40523c)).i(this);
        }

        @Override // com.google.android.exoplayer2.source.n
        public void n() {
            this.f40521a.n();
        }

        @Override // com.google.android.exoplayer2.source.n
        public void o(long j11, boolean z11) {
            this.f40521a.o(j11 - this.f40522b, z11);
        }

        @Override // com.google.android.exoplayer2.source.n
        public void s(n.a aVar, long j11) {
            this.f40523c = aVar;
            this.f40521a.s(this, j11 - this.f40522b);
        }

        @Override // com.google.android.exoplayer2.source.n
        public long u(qs.r[] rVarArr, boolean[] zArr, es.q[] qVarArr, boolean[] zArr2, long j11) {
            es.q[] qVarArr2 = new es.q[qVarArr.length];
            int i11 = 0;
            while (true) {
                es.q qVarD = null;
                if (i11 >= qVarArr.length) {
                    break;
                }
                c cVar = (c) qVarArr[i11];
                if (cVar != null) {
                    qVarD = cVar.d();
                }
                qVarArr2[i11] = qVarD;
                i11++;
            }
            long jU = this.f40521a.u(rVarArr, zArr, qVarArr2, zArr2, j11 - this.f40522b);
            for (int i12 = 0; i12 < qVarArr.length; i12++) {
                es.q qVar = qVarArr2[i12];
                if (qVar == null) {
                    qVarArr[i12] = null;
                } else {
                    es.q qVar2 = qVarArr[i12];
                    if (qVar2 == null || ((c) qVar2).d() != qVar) {
                        qVarArr[i12] = new c(qVar, this.f40522b);
                    }
                }
            }
            return jU + this.f40522b;
        }
    }

    private static final class c implements es.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final es.q f40524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f40525b;

        public c(es.q qVar, long j11) {
            this.f40524a = qVar;
            this.f40525b = j11;
        }

        @Override // es.q
        public void a() {
            this.f40524a.a();
        }

        @Override // es.q
        public int b(long j11) {
            return this.f40524a.b(j11 - this.f40525b);
        }

        @Override // es.q
        public int c(br.r rVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            int iC = this.f40524a.c(rVar, decoderInputBuffer, i11);
            if (iC == -4) {
                decoderInputBuffer.f39722e = Math.max(0L, decoderInputBuffer.f39722e + this.f40525b);
            }
            return iC;
        }

        public es.q d() {
            return this.f40524a;
        }

        @Override // es.q
        public boolean isReady() {
            return this.f40524a.isReady();
        }
    }

    public r(es.d dVar, long[] jArr, n... nVarArr) {
        this.f40512c = dVar;
        this.f40510a = nVarArr;
        this.f40518i = dVar.a(new c0[0]);
        for (int i11 = 0; i11 < nVarArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                this.f40510a[i11] = new b(nVarArr[i11], j11);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean a(long j11) {
        if (this.f40513d.isEmpty()) {
            return this.f40518i.a(j11);
        }
        int size = this.f40513d.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f40513d.get(i11).a(j11);
        }
        return false;
    }

    public n b(int i11) {
        n nVar = this.f40510a[i11];
        return nVar instanceof b ? ((b) nVar).f40521a : nVar;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean c() {
        return this.f40518i.c();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long d() {
        return this.f40518i.d();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void e(long j11) {
        this.f40518i.e(j11);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long f() {
        return this.f40518i.f();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long g(long j11) {
        long jG = this.f40517h[0].g(j11);
        int i11 = 1;
        while (true) {
            n[] nVarArr = this.f40517h;
            if (i11 >= nVarArr.length) {
                return jG;
            }
            if (nVarArr[i11].g(jG) != jG) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public long h() {
        long j11 = -9223372036854775807L;
        for (n nVar : this.f40517h) {
            long jH = nVar.h();
            if (jH == -9223372036854775807L) {
                if (j11 != -9223372036854775807L && nVar.g(j11) != j11) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j11 == -9223372036854775807L) {
                for (n nVar2 : this.f40517h) {
                    if (nVar2 == nVar) {
                        break;
                    }
                    if (nVar2.g(jH) != jH) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j11 = jH;
            } else if (jH != j11) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void j(n nVar) {
        this.f40513d.remove(nVar);
        if (!this.f40513d.isEmpty()) {
            return;
        }
        int i11 = 0;
        for (n nVar2 : this.f40510a) {
            i11 += nVar2.k().f63213a;
        }
        es.u[] uVarArr = new es.u[i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            n[] nVarArr = this.f40510a;
            if (i12 >= nVarArr.length) {
                this.f40516g = new es.w(uVarArr);
                ((n.a) ts.a.e(this.f40515f)).j(this);
                return;
            }
            es.w wVarK = nVarArr[i12].k();
            int i14 = wVarK.f63213a;
            int i15 = 0;
            while (i15 < i14) {
                es.u uVarB = wVarK.b(i15);
                es.u uVarB2 = uVarB.b(i12 + ":" + uVarB.f63206b);
                this.f40514e.put(uVarB2, uVarB);
                uVarArr[i13] = uVarB2;
                i15++;
                i13++;
            }
            i12++;
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public es.w k() {
        return (es.w) ts.a.e(this.f40516g);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j11, l0 l0Var) {
        n[] nVarArr = this.f40517h;
        return (nVarArr.length > 0 ? nVarArr[0] : this.f40510a[0]).l(j11, l0Var);
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(n nVar) {
        ((n.a) ts.a.e(this.f40515f)).i(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n() {
        for (n nVar : this.f40510a) {
            nVar.n();
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public void o(long j11, boolean z11) {
        for (n nVar : this.f40517h) {
            nVar.o(j11, z11);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public void s(n.a aVar, long j11) {
        this.f40515f = aVar;
        Collections.addAll(this.f40513d, this.f40510a);
        for (n nVar : this.f40510a) {
            nVar.s(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public long u(qs.r[] rVarArr, boolean[] zArr, es.q[] qVarArr, boolean[] zArr2, long j11) {
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            es.q qVar = qVarArr[i12];
            Integer num = qVar == null ? null : this.f40511b.get(qVar);
            iArr[i12] = num == null ? -1 : num.intValue();
            qs.r rVar = rVarArr[i12];
            if (rVar != null) {
                String str = rVar.e().f63206b;
                iArr2[i12] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i12] = -1;
            }
        }
        this.f40511b.clear();
        int length = rVarArr.length;
        es.q[] qVarArr2 = new es.q[length];
        es.q[] qVarArr3 = new es.q[rVarArr.length];
        qs.r[] rVarArr2 = new qs.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f40510a.length);
        long j12 = j11;
        int i13 = 0;
        while (i13 < this.f40510a.length) {
            for (int i14 = i11; i14 < rVarArr.length; i14++) {
                qVarArr3[i14] = iArr[i14] == i13 ? qVarArr[i14] : null;
                if (iArr2[i14] == i13) {
                    qs.r rVar2 = (qs.r) ts.a.e(rVarArr[i14]);
                    rVarArr2[i14] = new a(rVar2, (es.u) ts.a.e(this.f40514e.get(rVar2.e())));
                } else {
                    rVarArr2[i14] = null;
                }
            }
            int i15 = i13;
            long jU = this.f40510a[i13].u(rVarArr2, zArr, qVarArr3, zArr2, j12);
            if (i15 == 0) {
                j12 = jU;
            } else if (jU != j12) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < rVarArr.length; i16++) {
                if (iArr2[i16] == i15) {
                    es.q qVar2 = (es.q) ts.a.e(qVarArr3[i16]);
                    qVarArr2[i16] = qVarArr3[i16];
                    this.f40511b.put(qVar2, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr[i16] == i15) {
                    ts.a.g(qVarArr3[i16] == null);
                }
            }
            if (z11) {
                arrayList.add(this.f40510a[i15]);
            }
            i13 = i15 + 1;
            i11 = 0;
        }
        int i17 = i11;
        System.arraycopy(qVarArr2, i17, qVarArr, i17, length);
        n[] nVarArr = (n[]) arrayList.toArray(new n[i17]);
        this.f40517h = nVarArr;
        this.f40518i = this.f40512c.a(nVarArr);
        return j12;
    }
}
