package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.u0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class b0 implements hr.b0 {
    private u0 A;
    private u0 B;
    private long C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f40367a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f40370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f40371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f40372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0 f40373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DrmSession f40374h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40385s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40389w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f40392z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f40368b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40375i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f40376j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f40377k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f40380n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f40379m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f40378l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private hr.b0.a[] f40381o = new hr.b0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0<c> f40369c = new f0<>(new ts.h() { // from class: com.google.android.exoplayer2.source.a0
        @Override // ts.h
        public final void accept(Object obj) {
            ((b0.c) obj).f40397b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f40386t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f40387u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f40388v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f40391y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40390x = true;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public hr.b0.a f40395c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f40396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.j.b f40397b;

        private c(u0 u0Var, com.google.android.exoplayer2.drm.j.b bVar) {
            this.f40396a = u0Var;
            this.f40397b = bVar;
        }
    }

    public interface d {
        void m(u0 u0Var);
    }

    protected b0(ss.b bVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar) {
        this.f40370d = jVar;
        this.f40371e = aVar;
        this.f40367a = new z(bVar);
    }

    private boolean B() {
        return this.f40385s != this.f40382p;
    }

    private boolean E(int i11) {
        DrmSession drmSession = this.f40374h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f40379m[i11] & 1073741824) == 0 && this.f40374h.b();
    }

    private void G(u0 u0Var, br.r rVar) {
        u0 u0Var2 = this.f40373g;
        boolean z11 = u0Var2 == null;
        com.google.android.exoplayer2.drm.h hVar = z11 ? null : u0Var2.f40715o;
        this.f40373g = u0Var;
        com.google.android.exoplayer2.drm.h hVar2 = u0Var.f40715o;
        com.google.android.exoplayer2.drm.j jVar = this.f40370d;
        rVar.f17943b = jVar != null ? u0Var.c(jVar.d(u0Var)) : u0Var;
        rVar.f17942a = this.f40374h;
        if (this.f40370d == null) {
            return;
        }
        if (z11 || !p0.c(hVar, hVar2)) {
            DrmSession drmSession = this.f40374h;
            DrmSession drmSessionA = this.f40370d.a(this.f40371e, u0Var);
            this.f40374h = drmSessionA;
            rVar.f17942a = drmSessionA;
            if (drmSession != null) {
                drmSession.g(this.f40371e);
            }
        }
    }

    private synchronized int H(br.r rVar, DecoderInputBuffer decoderInputBuffer, boolean z11, boolean z12, b bVar) {
        try {
            decoderInputBuffer.f39721d = false;
            if (!B()) {
                if (!z12 && !this.f40389w) {
                    u0 u0Var = this.B;
                    if (u0Var == null || (!z11 && u0Var == this.f40373g)) {
                        return -3;
                    }
                    G((u0) ts.a.e(u0Var), rVar);
                    return -5;
                }
                decoderInputBuffer.o(4);
                return -4;
            }
            u0 u0Var2 = this.f40369c.e(w()).f40396a;
            if (!z11 && u0Var2 == this.f40373g) {
                int iX = x(this.f40385s);
                if (!E(iX)) {
                    decoderInputBuffer.f39721d = true;
                    return -3;
                }
                decoderInputBuffer.o(this.f40379m[iX]);
                if (this.f40385s == this.f40382p - 1 && (z12 || this.f40389w)) {
                    decoderInputBuffer.e(PKIFailureInfo.duplicateCertReq);
                }
                long j11 = this.f40380n[iX];
                decoderInputBuffer.f39722e = j11;
                if (j11 < this.f40386t) {
                    decoderInputBuffer.e(Integer.MIN_VALUE);
                }
                bVar.f40393a = this.f40378l[iX];
                bVar.f40394b = this.f40377k[iX];
                bVar.f40395c = this.f40381o[iX];
                return -4;
            }
            G(u0Var2, rVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void L() {
        DrmSession drmSession = this.f40374h;
        if (drmSession != null) {
            drmSession.g(this.f40371e);
            this.f40374h = null;
            this.f40373g = null;
        }
    }

    private synchronized void O() {
        this.f40385s = 0;
        this.f40367a.n();
    }

    private synchronized boolean R(u0 u0Var) {
        try {
            this.f40391y = false;
            if (p0.c(u0Var, this.B)) {
                return false;
            }
            if (this.f40369c.g() || !this.f40369c.f().f40396a.equals(u0Var)) {
                this.B = u0Var;
            } else {
                this.B = this.f40369c.f().f40396a;
            }
            u0 u0Var2 = this.B;
            this.D = ts.y.a(u0Var2.f40712l, u0Var2.f40709i);
            this.E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean h(long j11) {
        if (this.f40382p == 0) {
            return j11 > this.f40387u;
        }
        if (u() >= j11) {
            return false;
        }
        q(this.f40383q + j(j11));
        return true;
    }

    private synchronized void i(long j11, int i11, long j12, int i12, hr.b0.a aVar) {
        try {
            int i13 = this.f40382p;
            if (i13 > 0) {
                int iX = x(i13 - 1);
                ts.a.a(this.f40377k[iX] + ((long) this.f40378l[iX]) <= j12);
            }
            this.f40389w = (536870912 & i11) != 0;
            this.f40388v = Math.max(this.f40388v, j11);
            int iX2 = x(this.f40382p);
            this.f40380n[iX2] = j11;
            this.f40377k[iX2] = j12;
            this.f40378l[iX2] = i12;
            this.f40379m[iX2] = i11;
            this.f40381o[iX2] = aVar;
            this.f40376j[iX2] = this.C;
            if (this.f40369c.g() || !this.f40369c.f().f40396a.equals(this.B)) {
                com.google.android.exoplayer2.drm.j jVar = this.f40370d;
                this.f40369c.a(A(), new c((u0) ts.a.e(this.B), jVar != null ? jVar.c(this.f40371e, this.B) : com.google.android.exoplayer2.drm.j.b.f39836a));
            }
            int i14 = this.f40382p + 1;
            this.f40382p = i14;
            int i15 = this.f40375i;
            if (i14 == i15) {
                int i16 = i15 + 1000;
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                long[] jArr3 = new long[i16];
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                hr.b0.a[] aVarArr = new hr.b0.a[i16];
                int i17 = this.f40384r;
                int i18 = i15 - i17;
                System.arraycopy(this.f40377k, i17, jArr2, 0, i18);
                System.arraycopy(this.f40380n, this.f40384r, jArr3, 0, i18);
                System.arraycopy(this.f40379m, this.f40384r, iArr, 0, i18);
                System.arraycopy(this.f40378l, this.f40384r, iArr2, 0, i18);
                System.arraycopy(this.f40381o, this.f40384r, aVarArr, 0, i18);
                System.arraycopy(this.f40376j, this.f40384r, jArr, 0, i18);
                int i19 = this.f40384r;
                System.arraycopy(this.f40377k, 0, jArr2, i18, i19);
                System.arraycopy(this.f40380n, 0, jArr3, i18, i19);
                System.arraycopy(this.f40379m, 0, iArr, i18, i19);
                System.arraycopy(this.f40378l, 0, iArr2, i18, i19);
                System.arraycopy(this.f40381o, 0, aVarArr, i18, i19);
                System.arraycopy(this.f40376j, 0, jArr, i18, i19);
                this.f40377k = jArr2;
                this.f40380n = jArr3;
                this.f40379m = iArr;
                this.f40378l = iArr2;
                this.f40381o = aVarArr;
                this.f40376j = jArr;
                this.f40384r = 0;
                this.f40375i = i16;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int j(long j11) {
        int i11 = this.f40382p;
        int iX = x(i11 - 1);
        while (i11 > this.f40385s && this.f40380n[iX] >= j11) {
            i11--;
            iX--;
            if (iX == -1) {
                iX = this.f40375i - 1;
            }
        }
        return i11;
    }

    public static b0 k(ss.b bVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar) {
        return new b0(bVar, (com.google.android.exoplayer2.drm.j) ts.a.e(jVar), (com.google.android.exoplayer2.drm.i.a) ts.a.e(aVar));
    }

    private synchronized long l(long j11, boolean z11, boolean z12) throws Throwable {
        Throwable th2;
        try {
            try {
                int i11 = this.f40382p;
                if (i11 != 0) {
                    long[] jArr = this.f40380n;
                    int i12 = this.f40384r;
                    if (j11 >= jArr[i12]) {
                        if (z12) {
                            try {
                                int i13 = this.f40385s;
                                if (i13 != i11) {
                                    i11 = i13 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iR = r(i12, i11, j11, z11);
                        if (iR == -1) {
                            return -1L;
                        }
                        return n(iR);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private synchronized long m() {
        int i11 = this.f40382p;
        if (i11 == 0) {
            return -1L;
        }
        return n(i11);
    }

    private long n(int i11) {
        this.f40387u = Math.max(this.f40387u, v(i11));
        this.f40382p -= i11;
        int i12 = this.f40383q + i11;
        this.f40383q = i12;
        int i13 = this.f40384r + i11;
        this.f40384r = i13;
        int i14 = this.f40375i;
        if (i13 >= i14) {
            this.f40384r = i13 - i14;
        }
        int i15 = this.f40385s - i11;
        this.f40385s = i15;
        if (i15 < 0) {
            this.f40385s = 0;
        }
        this.f40369c.d(i12);
        if (this.f40382p != 0) {
            return this.f40377k[this.f40384r];
        }
        int i16 = this.f40384r;
        if (i16 == 0) {
            i16 = this.f40375i;
        }
        int i17 = i16 - 1;
        return this.f40377k[i17] + ((long) this.f40378l[i17]);
    }

    private long q(int i11) {
        int iA = A() - i11;
        boolean z11 = false;
        ts.a.a(iA >= 0 && iA <= this.f40382p - this.f40385s);
        int i12 = this.f40382p - iA;
        this.f40382p = i12;
        this.f40388v = Math.max(this.f40387u, v(i12));
        if (iA == 0 && this.f40389w) {
            z11 = true;
        }
        this.f40389w = z11;
        this.f40369c.c(i11);
        int i13 = this.f40382p;
        if (i13 == 0) {
            return 0L;
        }
        int iX = x(i13 - 1);
        return this.f40377k[iX] + ((long) this.f40378l[iX]);
    }

    private int r(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = this.f40380n[i11];
            if (j12 > j11) {
                break;
            }
            if (!z11 || (this.f40379m[i11] & 1) != 0) {
                if (j12 == j11) {
                    return i14;
                }
                i13 = i14;
            }
            i11++;
            if (i11 == this.f40375i) {
                i11 = 0;
            }
        }
        return i13;
    }

    private long v(int i11) {
        long jMax = Long.MIN_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int iX = x(i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            jMax = Math.max(jMax, this.f40380n[iX]);
            if ((this.f40379m[iX] & 1) != 0) {
                return jMax;
            }
            iX--;
            if (iX == -1) {
                iX = this.f40375i - 1;
            }
        }
        return jMax;
    }

    private int x(int i11) {
        int i12 = this.f40384r + i11;
        int i13 = this.f40375i;
        return i12 < i13 ? i12 : i12 - i13;
    }

    public final int A() {
        return this.f40383q + this.f40382p;
    }

    public final synchronized boolean C() {
        return this.f40389w;
    }

    public synchronized boolean D(boolean z11) {
        u0 u0Var;
        boolean z12 = true;
        if (B()) {
            if (this.f40369c.e(w()).f40396a != this.f40373g) {
                return true;
            }
            return E(x(this.f40385s));
        }
        if (!z11 && !this.f40389w && ((u0Var = this.B) == null || u0Var == this.f40373g)) {
            z12 = false;
        }
        return z12;
    }

    public void F() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.f40374h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) ts.a.e(this.f40374h.a()));
        }
    }

    public void I() {
        p();
        L();
    }

    public int J(br.r rVar, DecoderInputBuffer decoderInputBuffer, int i11, boolean z11) {
        int iH = H(rVar, decoderInputBuffer, (i11 & 2) != 0, z11, this.f40368b);
        if (iH == -4 && !decoderInputBuffer.k()) {
            boolean z12 = (i11 & 1) != 0;
            if ((i11 & 4) == 0) {
                if (z12) {
                    this.f40367a.e(decoderInputBuffer, this.f40368b);
                } else {
                    this.f40367a.l(decoderInputBuffer, this.f40368b);
                }
            }
            if (!z12) {
                this.f40385s++;
            }
        }
        return iH;
    }

    public void K() {
        N(true);
        L();
    }

    public final void M() {
        N(false);
    }

    public void N(boolean z11) {
        this.f40367a.m();
        this.f40382p = 0;
        this.f40383q = 0;
        this.f40384r = 0;
        this.f40385s = 0;
        this.f40390x = true;
        this.f40386t = Long.MIN_VALUE;
        this.f40387u = Long.MIN_VALUE;
        this.f40388v = Long.MIN_VALUE;
        this.f40389w = false;
        this.f40369c.b();
        if (z11) {
            this.A = null;
            this.B = null;
            this.f40391y = true;
        }
    }

    public final synchronized boolean P(long j11, boolean z11) throws Throwable {
        try {
            try {
                O();
                int iX = x(this.f40385s);
                if (!B() || j11 < this.f40380n[iX] || (j11 > this.f40388v && !z11)) {
                    return false;
                }
                int iR = r(iX, this.f40382p - this.f40385s, j11, true);
                if (iR == -1) {
                    return false;
                }
                this.f40386t = j11;
                this.f40385s += iR;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void Q(long j11) {
        this.f40386t = j11;
    }

    public final void S(d dVar) {
        this.f40372f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void T(int i11) {
        boolean z11;
        if (i11 >= 0) {
            try {
                if (this.f40385s + i11 <= this.f40382p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z11 = false;
        }
        ts.a.a(z11);
        this.f40385s += i11;
    }

    @Override // hr.b0
    public final void b(u0 u0Var) {
        u0 u0VarS = s(u0Var);
        this.f40392z = false;
        this.A = u0Var;
        boolean zR = R(u0VarS);
        d dVar = this.f40372f;
        if (dVar == null || !zR) {
            return;
        }
        dVar.m(u0VarS);
    }

    @Override // hr.b0
    public final int c(ss.g gVar, int i11, boolean z11, int i12) {
        return this.f40367a.o(gVar, i11, z11);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // hr.b0
    public void e(long j11, int i11, int i12, int i13, hr.b0.a aVar) {
        int i14;
        if (this.f40392z) {
            b((u0) ts.a.i(this.A));
        }
        int i15 = i11 & 1;
        boolean z11 = i15 != 0;
        if (this.f40390x) {
            if (!z11) {
                return;
            } else {
                this.f40390x = false;
            }
        }
        long j12 = this.F + j11;
        if (!this.D) {
            i14 = i11;
        } else {
            if (j12 < this.f40386t) {
                return;
            }
            if (i15 == 0) {
                if (!this.E) {
                    ts.u.i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i14 = i11 | 1;
            } else {
                i14 = i11;
            }
        }
        if (this.G) {
            if (!z11 || !h(j12)) {
                return;
            } else {
                this.G = false;
            }
        }
        i(j12, i14, (this.f40367a.d() - ((long) i12)) - ((long) i13), i12, aVar);
    }

    @Override // hr.b0
    public final void f(ts.d0 d0Var, int i11, int i12) {
        this.f40367a.p(d0Var, i11);
    }

    public final void o(long j11, boolean z11, boolean z12) {
        this.f40367a.b(l(j11, z11, z12));
    }

    public final void p() {
        this.f40367a.b(m());
    }

    protected u0 s(u0 u0Var) {
        return (this.F == 0 || u0Var.f40716p == Long.MAX_VALUE) ? u0Var : u0Var.b().k0(u0Var.f40716p + this.F).G();
    }

    public final synchronized long t() {
        return this.f40388v;
    }

    public final synchronized long u() {
        return Math.max(this.f40387u, v(this.f40385s));
    }

    public final int w() {
        return this.f40383q + this.f40385s;
    }

    public final synchronized int y(long j11, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int iX = x(this.f40385s);
                if (!B() || j11 < this.f40380n[iX]) {
                    return 0;
                }
                if (j11 <= this.f40388v || !z11) {
                    int iR = r(iX, this.f40382p - this.f40385s, j11, true);
                    if (iR == -1) {
                        return 0;
                    }
                    return iR;
                }
                try {
                    return this.f40382p - this.f40385s;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    public final synchronized u0 z() {
        return this.f40391y ? null : this.B;
    }
}
