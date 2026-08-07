package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f10843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q.a f10844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f10845c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f10846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f10847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f10848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f10849g;

    private final class a implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n8.s f10850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10851b;

        public a(n8.s sVar) {
            this.f10850a = sVar;
        }

        @Override // n8.s
        public void a() {
            this.f10850a.a();
        }

        @Override // n8.s
        public int b(long j11) {
            if (b.this.s()) {
                return -3;
            }
            return this.f10850a.b(j11);
        }

        public void c() {
            this.f10851b = false;
        }

        @Override // n8.s
        public boolean isReady() {
            return !b.this.s() && this.f10850a.isReady();
        }

        @Override // n8.s
        public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (b.this.s()) {
                return -3;
            }
            if (this.f10851b) {
                decoderInputBuffer.n(4);
                return -4;
            }
            long jD = b.this.d();
            int iJ = this.f10850a.j(uVar, decoderInputBuffer, i11);
            if (iJ == -5) {
                p7.u uVar2 = (p7.u) s7.a.f(uVar.f127112b);
                int i12 = uVar2.J;
                if (i12 != 0 || uVar2.K != 0) {
                    b bVar = b.this;
                    if (bVar.f10847e != 0) {
                        i12 = 0;
                    }
                    uVar.f127112b = uVar2.b().d0(i12).e0(bVar.f10848f == Long.MIN_VALUE ? uVar2.K : 0).P();
                }
                return -5;
            }
            long j11 = b.this.f10848f;
            if (j11 == Long.MIN_VALUE || ((iJ != -4 || decoderInputBuffer.f9288f < j11) && !(iJ == -3 && jD == Long.MIN_VALUE && !decoderInputBuffer.f9287e))) {
                return iJ;
            }
            decoderInputBuffer.f();
            decoderInputBuffer.n(4);
            this.f10851b = true;
            return -4;
        }
    }

    public b(q qVar, boolean z11, long j11, long j12) {
        this.f10843a = qVar;
        this.f10846d = z11 ? j11 : -9223372036854775807L;
        this.f10847e = j11;
        this.f10848f = j12;
    }

    private z7.b0 b(long j11, z7.b0 b0Var) {
        long jS = q0.s(b0Var.f127078a, 0L, j11 - this.f10847e);
        long j12 = b0Var.f127079b;
        long j13 = this.f10848f;
        long jS2 = q0.s(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j11);
        return (jS == b0Var.f127078a && jS2 == b0Var.f127079b) ? b0Var : new z7.b0(jS, jS2);
    }

    private static long q(long j11, long j12, long j13) {
        long jMax = Math.max(j11, j12);
        return j13 != Long.MIN_VALUE ? Math.min(jMax, j13) : jMax;
    }

    private static boolean w(long j11, long j12, r8.t[] tVarArr) {
        if (j11 < j12) {
            return true;
        }
        if (j11 != 0) {
            for (r8.t tVar : tVarArr) {
                if (tVar != null) {
                    p7.u uVarF = tVar.f();
                    if (!p7.g0.a(uVarF.f101544o, uVarF.f101540k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f10843a.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        long jD = this.f10843a.d();
        if (jD != Long.MIN_VALUE) {
            long j11 = this.f10848f;
            if (j11 == Long.MIN_VALUE || jD < j11) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        this.f10843a.e(j11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        long jF = this.f10843a.f();
        if (jF != Long.MIN_VALUE) {
            long j11 = this.f10848f;
            if (j11 == Long.MIN_VALUE || jF < j11) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        this.f10846d = -9223372036854775807L;
        for (a aVar : this.f10845c) {
            if (aVar != null) {
                aVar.c();
            }
        }
        return q(this.f10843a.g(j11), this.f10847e, this.f10848f);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        if (s()) {
            long j11 = this.f10846d;
            this.f10846d = -9223372036854775807L;
            long jH = h();
            return jH != -9223372036854775807L ? jH : j11;
        }
        long jH2 = this.f10843a.h();
        if (jH2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return q(jH2, this.f10847e, this.f10848f);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void i(q qVar) {
        if (this.f10849g != null) {
            return;
        }
        ((q.a) s7.a.f(this.f10844b)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        return this.f10843a.k();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        return this.f10843a.l(o1Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        long j12 = this.f10847e;
        if (j11 == j12) {
            return j12;
        }
        return this.f10843a.m(j11, b(j11, b0Var));
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f10849g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f10843a.n();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        this.f10843a.o(j11, z11);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        this.f10845c = new a[sVarArr.length];
        n8.s[] sVarArr2 = new n8.s[sVarArr.length];
        int i11 = 0;
        while (true) {
            n8.s sVar = null;
            if (i11 >= sVarArr.length) {
                break;
            }
            a[] aVarArr = this.f10845c;
            a aVar = (a) sVarArr[i11];
            aVarArr[i11] = aVar;
            if (aVar != null) {
                sVar = aVar.f10850a;
            }
            sVarArr2[i11] = sVar;
            i11++;
        }
        long jR = this.f10843a.r(tVarArr, zArr, sVarArr2, zArr2, j11);
        long jQ = q(jR, j11, this.f10848f);
        this.f10846d = (s() && w(jR, j11, tVarArr)) ? jQ : -9223372036854775807L;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            n8.s sVar2 = sVarArr2[i12];
            if (sVar2 == null) {
                this.f10845c[i12] = null;
            } else {
                a[] aVarArr2 = this.f10845c;
                a aVar2 = aVarArr2[i12];
                if (aVar2 == null || aVar2.f10850a != sVar2) {
                    aVarArr2[i12] = new a(sVar2);
                }
            }
            sVarArr[i12] = this.f10845c[i12];
        }
        return jQ;
    }

    boolean s() {
        return this.f10846d != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void j(q qVar) {
        ((q.a) s7.a.f(this.f10844b)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f10844b = aVar;
        this.f10843a.u(this, j11);
    }

    public void v(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f10849g = illegalClippingException;
    }

    public void x(long j11, long j12) {
        this.f10847e = j11;
        this.f10848f = j12;
    }
}
