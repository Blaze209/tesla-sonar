package com.google.android.exoplayer2.source;

import br.l0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d0 implements n, Loader.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ss.l f40410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ss.i.a f40411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ss.z f40412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f40413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p.a f40414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final es.w f40415f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f40417h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final u0 f40419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f40420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f40421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f40422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f40423n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f40416g = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Loader f40418i = new Loader("SingleSampleMediaPeriod");

    private final class b implements es.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f40424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40425b;

        private b() {
        }

        private void d() {
            if (this.f40425b) {
                return;
            }
            d0.this.f40414e.g(ts.y.i(d0.this.f40419j.f40712l), d0.this.f40419j, 0, null, 0L);
            this.f40425b = true;
        }

        @Override // es.q
        public void a() throws IOException {
            d0 d0Var = d0.this;
            if (d0Var.f40420k) {
                return;
            }
            d0Var.f40418i.j();
        }

        @Override // es.q
        public int b(long j11) {
            d();
            if (j11 <= 0 || this.f40424a == 2) {
                return 0;
            }
            this.f40424a = 2;
            return 1;
        }

        @Override // es.q
        public int c(br.r rVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            d();
            d0 d0Var = d0.this;
            boolean z11 = d0Var.f40421l;
            if (z11 && d0Var.f40422m == null) {
                this.f40424a = 2;
            }
            int i12 = this.f40424a;
            if (i12 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i11 & 2) != 0 || i12 == 0) {
                rVar.f17943b = d0Var.f40419j;
                this.f40424a = 1;
                return -5;
            }
            if (!z11) {
                return -3;
            }
            ts.a.e(d0Var.f40422m);
            decoderInputBuffer.e(1);
            decoderInputBuffer.f39722e = 0L;
            if ((i11 & 4) == 0) {
                decoderInputBuffer.q(d0.this.f40423n);
                ByteBuffer byteBuffer = decoderInputBuffer.f39720c;
                d0 d0Var2 = d0.this;
                byteBuffer.put(d0Var2.f40422m, 0, d0Var2.f40423n);
            }
            if ((i11 & 1) == 0) {
                this.f40424a = 2;
            }
            return -4;
        }

        public void e() {
            if (this.f40424a == 2) {
                this.f40424a = 1;
            }
        }

        @Override // es.q
        public boolean isReady() {
            return d0.this.f40421l;
        }
    }

    static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40427a = es.h.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ss.l f40428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ss.y f40429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f40430d;

        public c(ss.l lVar, ss.i iVar) {
            this.f40428b = lVar;
            this.f40429c = new ss.y(iVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            this.f40429c.q();
            try {
                this.f40429c.j(this.f40428b);
                int i11 = 0;
                while (i11 != -1) {
                    int iN = (int) this.f40429c.n();
                    byte[] bArr = this.f40430d;
                    if (bArr == null) {
                        this.f40430d = new byte[1024];
                    } else if (iN == bArr.length) {
                        this.f40430d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    ss.y yVar = this.f40429c;
                    byte[] bArr2 = this.f40430d;
                    i11 = yVar.read(bArr2, iN, bArr2.length - iN);
                }
            } finally {
                ss.k.a(this.f40429c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
        }
    }

    public d0(ss.l lVar, ss.i.a aVar, ss.z zVar, u0 u0Var, long j11, com.google.android.exoplayer2.upstream.b bVar, p.a aVar2, boolean z11) {
        this.f40410a = lVar;
        this.f40411b = aVar;
        this.f40412c = zVar;
        this.f40419j = u0Var;
        this.f40417h = j11;
        this.f40413d = bVar;
        this.f40414e = aVar2;
        this.f40420k = z11;
        this.f40415f = new es.w(new es.u(u0Var));
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean a(long j11) {
        if (this.f40421l || this.f40418i.i() || this.f40418i.h()) {
            return false;
        }
        ss.i iVarA = this.f40411b.a();
        ss.z zVar = this.f40412c;
        if (zVar != null) {
            iVarA.m(zVar);
        }
        c cVar = new c(this.f40410a, iVarA);
        this.f40414e.o(new es.h(cVar.f40427a, this.f40410a, this.f40418i.n(cVar, this, this.f40413d.b(1))), 1, -1, this.f40419j, 0, null, 0L, this.f40417h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean c() {
        return this.f40418i.i();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long d() {
        return this.f40421l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void e(long j11) {
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long f() {
        return (this.f40421l || this.f40418i.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long g(long j11) {
        for (int i11 = 0; i11 < this.f40416g.size(); i11++) {
            this.f40416g.get(i11).e();
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long h() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void q(c cVar, long j11, long j12, boolean z11) {
        ss.y yVar = cVar.f40429c;
        es.h hVar = new es.h(cVar.f40427a, cVar.f40428b, yVar.o(), yVar.p(), j11, j12, yVar.n());
        this.f40413d.a(cVar.f40427a);
        this.f40414e.i(hVar, 1, -1, null, 0, null, 0L, this.f40417h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void r(c cVar, long j11, long j12) {
        this.f40423n = (int) cVar.f40429c.n();
        this.f40422m = (byte[]) ts.a.e(cVar.f40430d);
        this.f40421l = true;
        ss.y yVar = cVar.f40429c;
        es.h hVar = new es.h(cVar.f40427a, cVar.f40428b, yVar.o(), yVar.p(), j11, j12, this.f40423n);
        this.f40413d.a(cVar.f40427a);
        this.f40414e.k(hVar, 1, -1, this.f40419j, 0, null, 0L, this.f40417h);
    }

    @Override // com.google.android.exoplayer2.source.n
    public es.w k() {
        return this.f40415f;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Loader.c t(c cVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c cVarG;
        ss.y yVar = cVar.f40429c;
        es.h hVar = new es.h(cVar.f40427a, cVar.f40428b, yVar.o(), yVar.p(), j11, j12, yVar.n());
        long jC = this.f40413d.c(new com.google.android.exoplayer2.upstream.b.a(hVar, new es.i(1, -1, this.f40419j, 0, null, 0L, p0.Z0(this.f40417h)), iOException, i11));
        boolean z11 = jC == -9223372036854775807L || i11 >= this.f40413d.b(1);
        if (this.f40420k && z11) {
            ts.u.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f40421l = true;
            cVarG = Loader.f41042f;
        } else {
            cVarG = jC != -9223372036854775807L ? Loader.g(false, jC) : Loader.f41043g;
        }
        Loader.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f40414e.m(hVar, 1, -1, this.f40419j, 0, null, 0L, this.f40417h, iOException, !zC);
        if (!zC) {
            this.f40413d.a(cVar.f40427a);
        }
        return cVar2;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n() {
    }

    @Override // com.google.android.exoplayer2.source.n
    public void o(long j11, boolean z11) {
    }

    public void p() {
        this.f40418i.l();
    }

    @Override // com.google.android.exoplayer2.source.n
    public void s(n.a aVar, long j11) {
        aVar.j(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long u(qs.r[] rVarArr, boolean[] zArr, es.q[] qVarArr, boolean[] zArr2, long j11) {
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            es.q qVar = qVarArr[i11];
            if (qVar != null && (rVarArr[i11] == null || !zArr[i11])) {
                this.f40416g.remove(qVar);
                qVarArr[i11] = null;
            }
            if (qVarArr[i11] == null && rVarArr[i11] != null) {
                b bVar = new b();
                this.f40416g.add(bVar);
                qVarArr[i11] = bVar;
                zArr2[i11] = true;
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j11, l0 l0Var) {
        return j11;
    }
}
