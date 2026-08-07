package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;

/* JADX INFO: loaded from: classes3.dex */
final class k0 implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f11063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q.a f11065c;

    private static final class a implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n8.s f11066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f11067b;

        public a(n8.s sVar, long j11) {
            this.f11066a = sVar;
            this.f11067b = j11;
        }

        @Override // n8.s
        public void a() {
            this.f11066a.a();
        }

        @Override // n8.s
        public int b(long j11) {
            return this.f11066a.b(j11 - this.f11067b);
        }

        public n8.s c() {
            return this.f11066a;
        }

        @Override // n8.s
        public boolean isReady() {
            return this.f11066a.isReady();
        }

        @Override // n8.s
        public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            int iJ = this.f11066a.j(uVar, decoderInputBuffer, i11);
            if (iJ == -4) {
                decoderInputBuffer.f9288f += this.f11067b;
            }
            return iJ;
        }
    }

    public k0(q qVar, long j11) {
        this.f11063a = qVar;
        this.f11064b = j11;
    }

    public q b() {
        return this.f11063a;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f11063a.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        long jD = this.f11063a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f11064b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        this.f11063a.e(j11 - this.f11064b);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        long jF = this.f11063a.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jF + this.f11064b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        return this.f11063a.g(j11 - this.f11064b) + this.f11064b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        long jH = this.f11063a.h();
        if (jH == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jH + this.f11064b;
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void i(q qVar) {
        ((q.a) s7.a.f(this.f11065c)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        return this.f11063a.k();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        return this.f11063a.l(o1Var.a().f(o1Var.f10600a - this.f11064b).d());
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        return this.f11063a.m(j11 - this.f11064b, b0Var) + this.f11064b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
        this.f11063a.n();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        this.f11063a.o(j11 - this.f11064b, z11);
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(q qVar) {
        ((q.a) s7.a.f(this.f11065c)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        n8.s[] sVarArr2 = new n8.s[sVarArr.length];
        int i11 = 0;
        while (true) {
            n8.s sVarC = null;
            if (i11 >= sVarArr.length) {
                break;
            }
            a aVar = (a) sVarArr[i11];
            if (aVar != null) {
                sVarC = aVar.c();
            }
            sVarArr2[i11] = sVarC;
            i11++;
        }
        long jR = this.f11063a.r(tVarArr, zArr, sVarArr2, zArr2, j11 - this.f11064b);
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            n8.s sVar = sVarArr2[i12];
            if (sVar == null) {
                sVarArr[i12] = null;
            } else {
                n8.s sVar2 = sVarArr[i12];
                if (sVar2 == null || ((a) sVar2).c() != sVar) {
                    sVarArr[i12] = new a(sVar, this.f11064b);
                }
            }
        }
        return jR + this.f11064b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f11065c = aVar;
        this.f11063a.u(this, j11 - this.f11064b);
    }
}
