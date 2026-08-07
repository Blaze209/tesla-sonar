package com.google.android.exoplayer2.source;

import br.l0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.u0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f40357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n.a f40358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f40359c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f40360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f40361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f40362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f40363g;

    private final class a implements es.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final es.q f40364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40365b;

        public a(es.q qVar) {
            this.f40364a = qVar;
        }

        @Override // es.q
        public void a() {
            this.f40364a.a();
        }

        @Override // es.q
        public int b(long j11) {
            if (b.this.m()) {
                return -3;
            }
            return this.f40364a.b(j11);
        }

        @Override // es.q
        public int c(br.r rVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (b.this.m()) {
                return -3;
            }
            if (this.f40365b) {
                decoderInputBuffer.o(4);
                return -4;
            }
            long jD = b.this.d();
            int iC = this.f40364a.c(rVar, decoderInputBuffer, i11);
            if (iC == -5) {
                u0 u0Var = (u0) ts.a.e(rVar.f17943b);
                int i12 = u0Var.B;
                if (i12 != 0 || u0Var.C != 0) {
                    b bVar = b.this;
                    if (bVar.f40361e != 0) {
                        i12 = 0;
                    }
                    rVar.f17943b = u0Var.b().P(i12).Q(bVar.f40362f == Long.MIN_VALUE ? u0Var.C : 0).G();
                }
                return -5;
            }
            long j11 = b.this.f40362f;
            if (j11 == Long.MIN_VALUE || ((iC != -4 || decoderInputBuffer.f39722e < j11) && !(iC == -3 && jD == Long.MIN_VALUE && !decoderInputBuffer.f39721d))) {
                return iC;
            }
            decoderInputBuffer.f();
            decoderInputBuffer.o(4);
            this.f40365b = true;
            return -4;
        }

        public void d() {
            this.f40365b = false;
        }

        @Override // es.q
        public boolean isReady() {
            return !b.this.m() && this.f40364a.isReady();
        }
    }

    public b(n nVar, boolean z11, long j11, long j12) {
        this.f40357a = nVar;
        this.f40360d = z11 ? j11 : -9223372036854775807L;
        this.f40361e = j11;
        this.f40362f = j12;
    }

    private l0 b(long j11, l0 l0Var) {
        long jR = p0.r(l0Var.f17937a, 0L, j11 - this.f40361e);
        long j12 = l0Var.f17938b;
        long j13 = this.f40362f;
        long jR2 = p0.r(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j11);
        return (jR == l0Var.f17937a && jR2 == l0Var.f17938b) ? l0Var : new l0(jR, jR2);
    }

    private static boolean r(long j11, qs.r[] rVarArr) {
        if (j11 != 0) {
            for (qs.r rVar : rVarArr) {
                if (rVar != null) {
                    u0 u0VarF = rVar.f();
                    if (!ts.y.a(u0VarF.f40712l, u0VarF.f40709i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean a(long j11) {
        return this.f40357a.a(j11);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean c() {
        return this.f40357a.c();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long d() {
        long jD = this.f40357a.d();
        if (jD != Long.MIN_VALUE) {
            long j11 = this.f40362f;
            if (j11 == Long.MIN_VALUE || jD < j11) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void e(long j11) {
        this.f40357a.e(j11);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long f() {
        long jF = this.f40357a.f();
        if (jF != Long.MIN_VALUE) {
            long j11 = this.f40362f;
            if (j11 == Long.MIN_VALUE || jF < j11) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.n
    public long g(long j11) {
        this.f40360d = -9223372036854775807L;
        boolean z11 = false;
        for (a aVar : this.f40359c) {
            if (aVar != null) {
                aVar.d();
            }
        }
        long jG = this.f40357a.g(j11);
        if (jG == j11) {
            z11 = true;
        } else if (jG >= this.f40361e) {
            long j12 = this.f40362f;
            if (j12 == Long.MIN_VALUE || jG <= j12) {
                z11 = true;
            }
        }
        ts.a.g(z11);
        return jG;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long h() {
        if (m()) {
            long j11 = this.f40360d;
            this.f40360d = -9223372036854775807L;
            long jH = h();
            return jH != -9223372036854775807L ? jH : j11;
        }
        long jH2 = this.f40357a.h();
        if (jH2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        ts.a.g(jH2 >= this.f40361e);
        long j12 = this.f40362f;
        ts.a.g(j12 == Long.MIN_VALUE || jH2 <= j12);
        return jH2;
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void j(n nVar) {
        if (this.f40363g != null) {
            return;
        }
        ((n.a) ts.a.e(this.f40358b)).j(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public es.w k() {
        return this.f40357a.k();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j11, l0 l0Var) {
        long j12 = this.f40361e;
        if (j11 == j12) {
            return j12;
        }
        return this.f40357a.l(j11, b(j11, l0Var));
    }

    boolean m() {
        return this.f40360d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f40363g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f40357a.n();
    }

    @Override // com.google.android.exoplayer2.source.n
    public void o(long j11, boolean z11) {
        this.f40357a.o(j11, z11);
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(n nVar) {
        ((n.a) ts.a.e(this.f40358b)).i(this);
    }

    public void q(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f40363g = illegalClippingException;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void s(n.a aVar, long j11) {
        this.f40358b = aVar;
        this.f40357a.s(this, j11);
    }

    public void t(long j11, long j12) {
        this.f40361e = j11;
        this.f40362f = j12;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // com.google.android.exoplayer2.source.n
    public long u(qs.r[] rVarArr, boolean[] zArr, es.q[] qVarArr, boolean[] zArr2, long j11) {
        long j12;
        boolean z11;
        this.f40359c = new a[qVarArr.length];
        es.q[] qVarArr2 = new es.q[qVarArr.length];
        int i11 = 0;
        while (true) {
            es.q qVar = null;
            if (i11 >= qVarArr.length) {
                break;
            }
            a[] aVarArr = this.f40359c;
            a aVar = (a) qVarArr[i11];
            aVarArr[i11] = aVar;
            if (aVar != null) {
                qVar = aVar.f40364a;
            }
            qVarArr2[i11] = qVar;
            i11++;
        }
        long jU = this.f40357a.u(rVarArr, zArr, qVarArr2, zArr2, j11);
        if (m()) {
            long j13 = this.f40361e;
            if (j11 == j13 && r(j13, rVarArr)) {
                j12 = jU;
            } else {
                j12 = -9223372036854775807L;
            }
        } else {
            j12 = -9223372036854775807L;
        }
        this.f40360d = j12;
        if (jU != j11) {
            if (jU >= this.f40361e) {
                long j14 = this.f40362f;
                z11 = j14 == Long.MIN_VALUE || jU <= j14;
            }
        }
        ts.a.g(z11);
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            es.q qVar2 = qVarArr2[i12];
            if (qVar2 == null) {
                this.f40359c[i12] = null;
            } else {
                a[] aVarArr2 = this.f40359c;
                a aVar2 = aVarArr2[i12];
                if (aVar2 == null || aVar2.f40364a != qVar2) {
                    aVarArr2[i12] = new a(qVar2);
                }
            }
            qVarArr[i12] = this.f40359c[i12];
        }
        return jU;
    }
}
