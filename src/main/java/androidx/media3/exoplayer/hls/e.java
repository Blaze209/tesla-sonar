package androidx.media3.exoplayer.hls;

import a8.o2;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.collect.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.f0;
import p7.n;
import p7.u;
import p8.m;
import s7.c0;
import s7.i0;
import s7.k0;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
final class e extends m {
    private static final AtomicInteger O = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final o2 C;
    private final long D;
    private f8.f E;
    private l F;
    private int G;
    private boolean H;
    private volatile boolean I;
    private boolean J;
    private x<Integer> K;
    private boolean L;
    private long M;
    private boolean N;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f9983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.media3.datasource.a f9986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v7.j f9987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f8.f f9988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f9989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f9990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final i0 f9991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f8.e f9992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<u> f9993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final n f9994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final k9.h f9995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c0 f9996z;

    private e(f8.e eVar, androidx.media3.datasource.a aVar, v7.j jVar, u uVar, boolean z11, androidx.media3.datasource.a aVar2, v7.j jVar2, boolean z12, Uri uri, List<u> list, int i11, Object obj, long j11, long j12, long j13, int i12, boolean z13, int i13, boolean z14, boolean z15, i0 i0Var, long j14, n nVar, f8.f fVar, k9.h hVar, c0 c0Var, boolean z16, boolean z17, o2 o2Var) {
        super(aVar, jVar, uVar, i11, obj, j11, j12, j13);
        this.A = z11;
        this.f9985o = i12;
        this.M = z13 ? j12 - j11 : -9223372036854775807L;
        this.f9982l = i13;
        this.f9987q = jVar2;
        this.f9986p = aVar2;
        this.H = jVar2 != null;
        this.B = z12;
        this.f9983m = uri;
        this.f9989s = z15;
        this.f9991u = i0Var;
        this.D = j14;
        this.f9990t = z14;
        this.f9992v = eVar;
        this.f9993w = list;
        this.f9994x = nVar;
        this.f9988r = fVar;
        this.f9995y = hVar;
        this.f9996z = c0Var;
        this.N = z16;
        this.f9984n = z17;
        this.C = o2Var;
        this.K = x.r();
        this.f9981k = O.getAndIncrement();
    }

    private static androidx.media3.datasource.a i(androidx.media3.datasource.a aVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return aVar;
        }
        s7.a.f(bArr2);
        return new a(aVar, bArr, bArr2);
    }

    public static e k(f8.e eVar, androidx.media3.datasource.a aVar, u uVar, long j11, androidx.media3.exoplayer.hls.playlist.c cVar, c.e eVar2, Uri uri, List<u> list, int i11, Object obj, boolean z11, f8.i iVar, long j12, e eVar3, byte[] bArr, byte[] bArr2, boolean z12, boolean z13, o2 o2Var, s8.f.C2354f c2354f) {
        boolean z14;
        androidx.media3.datasource.a aVarI;
        v7.j jVarA;
        boolean z15;
        Uri uri2;
        k9.h hVar;
        c0 c0Var;
        f8.f fVar;
        androidx.media3.exoplayer.hls.playlist.c.g gVar = eVar2.f9975a;
        v7.j jVarA2 = new v7.j.b().i(k0.g(cVar.f67468a, gVar.f10215a)).h(gVar.f10223i).g(gVar.f10224j).b(eVar2.f9978d ? 8 : 0).a();
        if (c2354f != null) {
            jVarA2 = c2354f.a().a(jVarA2);
        }
        v7.j jVar = jVarA2;
        boolean z16 = bArr != null;
        androidx.media3.datasource.a aVarI2 = i(aVar, bArr, z16 ? m((String) s7.a.f(gVar.f10222h)) : null);
        androidx.media3.exoplayer.hls.playlist.c.f fVar2 = gVar.f10216b;
        if (fVar2 != null) {
            boolean z17 = bArr2 != null;
            byte[] bArrM = z17 ? m((String) s7.a.f(fVar2.f10222h)) : null;
            z14 = true;
            jVarA = new v7.j.b().i(k0.g(cVar.f67468a, fVar2.f10215a)).h(fVar2.f10223i).g(fVar2.f10224j).a();
            if (c2354f != null) {
                jVarA = c2354f.l(IntegerTokenConverter.CONVERTER_KEY).a().a(jVarA);
            }
            aVarI = i(aVar, bArr2, bArrM);
            z15 = z17;
        } else {
            z14 = true;
            aVarI = null;
            jVarA = null;
            z15 = false;
        }
        long j13 = j11 + gVar.f10219e;
        long j14 = j13 + gVar.f10217c;
        int i12 = cVar.f10156j + gVar.f10218d;
        if (eVar3 != null) {
            v7.j jVar2 = eVar3.f9987q;
            boolean z18 = (jVarA == jVar2 || (jVarA != null && jVar2 != null && jVarA.f118101a.equals(jVar2.f118101a) && jVarA.f118107g == eVar3.f9987q.f118107g)) ? z14 : false;
            uri2 = uri;
            boolean z19 = (uri2.equals(eVar3.f9983m) && eVar3.J) ? z14 : false;
            hVar = eVar3.f9995y;
            c0Var = eVar3.f9996z;
            fVar = (z18 && z19 && !eVar3.L && eVar3.f9982l == i12) ? eVar3.E : null;
        } else {
            uri2 = uri;
            hVar = new k9.h();
            c0Var = new c0(10);
            fVar = null;
        }
        return new e(eVar, aVarI2, jVar, uVar, z16, aVarI, jVarA, z15, uri2, list, i11, obj, j13, j14, eVar2.f9976b, eVar2.f9977c, !eVar2.f9978d, i12, gVar.f10225k, z11, iVar.a(i12), j12, gVar.f10220f, fVar, hVar, c0Var, z12, z13, o2Var);
    }

    @RequiresNonNull({"output"})
    private void l(androidx.media3.datasource.a aVar, v7.j jVar, boolean z11, boolean z12) {
        v7.j jVarE;
        long position;
        boolean z13 = false;
        if (z11) {
            z13 = this.G != 0;
            jVarE = jVar;
        } else {
            jVarE = jVar.e(this.G);
        }
        try {
            w8.j jVarV = v(aVar, jVarE, z12);
            if (z13) {
                jVarV.k(this.G);
            }
            while (!this.I && this.E.a(jVarV)) {
                try {
                    try {
                    } catch (EOFException e11) {
                        if ((this.f101873d.f101535f & 16384) == 0) {
                            throw e11;
                        }
                        this.E.f();
                        position = jVarV.getPosition();
                    }
                } catch (Throwable th2) {
                    this.G = (int) (jVarV.getPosition() - jVar.f118107g);
                    throw th2;
                }
            }
            position = jVarV.getPosition();
            this.G = (int) (position - jVar.f118107g);
            v7.i.a(aVar);
        } catch (Throwable th3) {
            v7.i.a(aVar);
            throw th3;
        }
    }

    private static byte[] m(String str) {
        if (ou.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @RequiresNonNull({"output"})
    private void s() {
        l(this.f101878i, this.f101871b, this.A, true);
    }

    @RequiresNonNull({"output"})
    private void t() {
        if (this.H) {
            s7.a.f(this.f9986p);
            s7.a.f(this.f9987q);
            l(this.f9986p, this.f9987q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    private long u(q qVar) throws Throwable {
        qVar.g();
        try {
            this.f9996z.X(10);
            qVar.e(this.f9996z.f(), 0, 10);
            if (this.f9996z.P() != 4801587) {
                return -9223372036854775807L;
            }
            this.f9996z.c0(3);
            int iL = this.f9996z.L();
            int i11 = iL + 10;
            if (i11 > this.f9996z.b()) {
                byte[] bArrF = this.f9996z.f();
                this.f9996z.X(i11);
                System.arraycopy(bArrF, 0, this.f9996z.f(), 0, 10);
            }
            qVar.e(this.f9996z.f(), 10, iL);
            f0 f0VarE = this.f9995y.e(this.f9996z.f(), iL);
            if (f0VarE == null) {
                return -9223372036854775807L;
            }
            int iE = f0VarE.e();
            for (int i12 = 0; i12 < iE; i12++) {
                f0.a aVarD = f0VarE.d(i12);
                if (aVarD instanceof k9.m) {
                    k9.m mVar = (k9.m) aVarD;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f85436b)) {
                        System.arraycopy(mVar.f85437c, 0, this.f9996z.f(), 0, 8);
                        this.f9996z.b0(0);
                        this.f9996z.a0(8);
                        return this.f9996z.F() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private w8.j v(androidx.media3.datasource.a aVar, v7.j jVar, boolean z11) throws Throwable {
        f8.f fVarE;
        long j11 = aVar.j(jVar);
        if (z11) {
            try {
                this.f9991u.j(this.f9989s, this.f101876g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e11) {
                throw new IOException(e11);
            }
        }
        w8.j jVar2 = new w8.j(aVar, jVar.f118107g, j11);
        if (this.E == null) {
            long jU = u(jVar2);
            jVar2.g();
            f8.f fVar = this.f9988r;
            if (fVar != null) {
                fVarE = fVar.i();
            } else {
                fVarE = this.f9992v.e(jVar.f118101a, this.f101873d, this.f9993w, this.f9991u, aVar.b(), jVar2, this.C);
                jVar2 = jVar2;
            }
            this.E = fVarE;
            if (fVarE.h()) {
                this.F.r0(jU != -9223372036854775807L ? this.f9991u.b(jU) : this.f101876g);
            } else {
                this.F.r0(0L);
            }
            this.F.d0();
            this.E.e(this.F);
        }
        this.F.o0(this.f9994x);
        return jVar2;
    }

    public static boolean y(e eVar, long j11, Uri uri, boolean z11, c.e eVar2, long j12) {
        if (eVar == null) {
            return false;
        }
        if (uri.equals(eVar.f9983m) && eVar.J) {
            return false;
        }
        return !z11 || j12 + eVar2.f9975a.f10219e < j11;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void a() {
        f8.f fVar;
        s7.a.f(this.F);
        if (this.E == null && (fVar = this.f9988r) != null && fVar.g()) {
            this.E = this.f9988r;
            this.H = false;
        }
        t();
        if (this.I) {
            return;
        }
        if (!this.f9990t) {
            s();
        }
        this.J = !this.I;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void b() {
        this.I = true;
    }

    @Override // p8.m
    public boolean h() {
        return this.J;
    }

    public void j() {
        this.N = false;
    }

    public int n(int i11) {
        s7.a.h(!this.N);
        if (i11 >= this.K.size()) {
            return 0;
        }
        return this.K.get(i11).intValue();
    }

    public long o() {
        long j11 = this.M;
        if (j11 != -9223372036854775807L) {
            return this.f101876g + j11;
        }
        return -9223372036854775807L;
    }

    public void p(l lVar, x<Integer> xVar) {
        this.F = lVar;
        this.K = xVar;
    }

    public void q() {
        this.L = true;
    }

    public boolean r() {
        return this.M != -9223372036854775807L;
    }

    public void w(long j11) {
        this.M = j11;
    }

    public boolean x() {
        return this.N;
    }
}
