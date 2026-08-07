package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p7.t0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class h0 implements q, Loader.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7.j f10986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0192a f10987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7.q f10988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.a f10990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n8.y f10991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f10992g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f10993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Loader f10994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final p7.u f10995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f10996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f10997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f10998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f10999n;

    private final class b implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11001b;

        private b() {
        }

        private void c() {
            if (this.f11001b) {
                return;
            }
            h0.this.f10990e.j(p7.g0.k(h0.this.f10995j.f101544o), h0.this.f10995j, 0, null, 0L);
            this.f11001b = true;
        }

        @Override // n8.s
        public void a() throws IOException {
            h0 h0Var = h0.this;
            if (h0Var.f10996k) {
                return;
            }
            h0Var.f10994i.a();
        }

        @Override // n8.s
        public int b(long j11) {
            c();
            if (j11 <= 0 || this.f11000a == 2) {
                return 0;
            }
            this.f11000a = 2;
            return 1;
        }

        public void d() {
            if (this.f11000a == 2) {
                this.f11000a = 1;
            }
        }

        @Override // n8.s
        public boolean isReady() {
            return h0.this.f10997l;
        }

        @Override // n8.s
        public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            c();
            h0 h0Var = h0.this;
            boolean z11 = h0Var.f10997l;
            if (z11 && h0Var.f10998m == null) {
                this.f11000a = 2;
            }
            int i12 = this.f11000a;
            if (i12 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i11 & 2) != 0 || i12 == 0) {
                uVar.f127112b = h0Var.f10995j;
                this.f11000a = 1;
                return -5;
            }
            if (!z11) {
                return -3;
            }
            s7.a.f(h0Var.f10998m);
            decoderInputBuffer.e(1);
            decoderInputBuffer.f9288f = 0L;
            if ((i11 & 4) == 0) {
                decoderInputBuffer.p(h0.this.f10999n);
                ByteBuffer byteBuffer = decoderInputBuffer.f9286d;
                h0 h0Var2 = h0.this;
                byteBuffer.put(h0Var2.f10998m, 0, h0Var2.f10999n);
            }
            if ((i11 & 1) == 0) {
                this.f11000a = 2;
            }
            return -4;
        }
    }

    static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11003a = n8.i.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v7.j f11004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v7.o f11005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f11006d;

        public c(v7.j jVar, androidx.media3.datasource.a aVar) {
            this.f11004b = jVar;
            this.f11005c = new v7.o(aVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void a() {
            this.f11005c.r();
            try {
                this.f11005c.j(this.f11004b);
                int i11 = 0;
                while (i11 != -1) {
                    int iO = (int) this.f11005c.o();
                    byte[] bArr = this.f11006d;
                    if (bArr == null) {
                        this.f11006d = new byte[1024];
                    } else if (iO == bArr.length) {
                        this.f11006d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    v7.o oVar = this.f11005c;
                    byte[] bArr2 = this.f11006d;
                    i11 = oVar.read(bArr2, iO, bArr2.length - iO);
                }
            } finally {
                v7.i.a(this.f11005c);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() {
        }
    }

    public h0(v7.j jVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, v7.q qVar, p7.u uVar, long j11, androidx.media3.exoplayer.upstream.b bVar, s.a aVar, boolean z11, t8.b bVar2) {
        this.f10986a = jVar;
        this.f10987b = interfaceC0192a;
        this.f10988c = qVar;
        this.f10995j = uVar;
        this.f10993h = j11;
        this.f10989d = bVar;
        this.f10990e = aVar;
        this.f10996k = z11;
        this.f10991f = new n8.y(new t0(uVar));
        this.f10994i = bVar2 != null ? new Loader(bVar2) : new Loader("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void s(c cVar, long j11, long j12, boolean z11) {
        v7.o oVar = cVar.f11005c;
        n8.i iVar = new n8.i(cVar.f11003a, cVar.f11004b, oVar.p(), oVar.q(), j11, j12, oVar.o());
        this.f10989d.a(cVar.f11003a);
        this.f10990e.m(iVar, 1, -1, null, 0, null, 0L, this.f10993h);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f10994i.j();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return this.f10997l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return (this.f10997l || this.f10994i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        for (int i11 = 0; i11 < this.f10992g.size(); i11++) {
            this.f10992g.get(i11).d();
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void v(c cVar, long j11, long j12) {
        this.f10999n = (int) cVar.f11005c.o();
        this.f10998m = (byte[]) s7.a.f(cVar.f11006d);
        this.f10997l = true;
        v7.o oVar = cVar.f11005c;
        n8.i iVar = new n8.i(cVar.f11003a, cVar.f11004b, oVar.p(), oVar.q(), j11, j12, this.f10999n);
        this.f10989d.a(cVar.f11003a);
        this.f10990e.p(iVar, 1, -1, this.f10995j, 0, null, 0L, this.f10993h);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Loader.c p(c cVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c cVarH;
        v7.o oVar = cVar.f11005c;
        n8.i iVar = new n8.i(cVar.f11003a, cVar.f11004b, oVar.p(), oVar.q(), j11, j12, oVar.o());
        long jD = this.f10989d.d(new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(1, -1, this.f10995j, 0, null, 0L, q0.O1(this.f10993h)), iOException, i11));
        boolean z11 = jD == -9223372036854775807L || i11 >= this.f10989d.b(1);
        if (this.f10996k && z11) {
            s7.t.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f10997l = true;
            cVarH = Loader.f11137f;
        } else {
            cVarH = jD != -9223372036854775807L ? Loader.h(false, jD) : Loader.f11138g;
        }
        Loader.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f10990e.r(iVar, 1, -1, this.f10995j, 0, null, 0L, this.f10993h, iOException, !zC);
        if (!zC) {
            this.f10989d.a(cVar.f11003a);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        return this.f10991f;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        if (this.f10997l || this.f10994i.j() || this.f10994i.i()) {
            return false;
        }
        androidx.media3.datasource.a aVarA = this.f10987b.a();
        v7.q qVar = this.f10988c;
        if (qVar != null) {
            aVarA.n(qVar);
        }
        this.f10994i.n(new c(this.f10986a, aVarA), this, this.f10989d.b(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            n8.s sVar = sVarArr[i11];
            if (sVar != null && (tVarArr[i11] == null || !zArr[i11])) {
                this.f10992g.remove(sVar);
                sVarArr[i11] = null;
            }
            if (sVarArr[i11] == null && tVarArr[i11] != null) {
                b bVar = new b();
                this.f10992g.add(bVar);
                sVarArr[i11] = bVar;
                zArr2[i11] = true;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void q(c cVar, long j11, long j12, int i11) {
        v7.o oVar = cVar.f11005c;
        this.f10990e.v(i11 == 0 ? new n8.i(cVar.f11003a, cVar.f11004b, j11) : new n8.i(cVar.f11003a, cVar.f11004b, oVar.p(), oVar.q(), j11, j12, oVar.o()), 1, -1, this.f10995j, 0, null, 0L, this.f10993h, i11);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        aVar.i(this);
    }

    public void w() {
        this.f10994i.l();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        return j11;
    }
}
