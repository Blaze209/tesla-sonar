package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements o0 {
    private p7.u A;
    private p7.u B;
    private long C;
    private boolean E;
    private long F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10952a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f10955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f10956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f10957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p7.u f10958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DrmSession f10959h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10970s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10974w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10977z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f10953b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10960i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f10961j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f10962k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f10965n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f10964m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f10963l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o0.a[] f10966o = new o0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0<c> f10954c = new j0<>(new s7.n() { // from class: androidx.media3.exoplayer.source.e0
        @Override // s7.n
        public final void accept(Object obj) {
            ((f0.c) obj).f10982b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f10971t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f10972u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f10973v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10976y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10975x = true;
    private boolean D = true;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f10979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o0.a f10980c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7.u f10981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.i.b f10982b;

        private c(p7.u uVar, androidx.media3.exoplayer.drm.i.b bVar) {
            this.f10981a = uVar;
            this.f10982b = bVar;
        }
    }

    public interface d {
        void a(p7.u uVar);
    }

    protected f0(s8.b bVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar) {
        this.f10955d = iVar;
        this.f10956e = aVar;
        this.f10952a = new d0(bVar);
    }

    private long E(int i11) {
        long jMax = Long.MIN_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = G(i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            jMax = Math.max(jMax, this.f10965n[iG]);
            if ((this.f10964m[iG] & 1) != 0) {
                return jMax;
            }
            iG--;
            if (iG == -1) {
                iG = this.f10960i - 1;
            }
        }
        return jMax;
    }

    private int G(int i11) {
        int i12 = this.f10969r + i11;
        int i13 = this.f10960i;
        return i12 < i13 ? i12 : i12 - i13;
    }

    private boolean K() {
        return this.f10970s != this.f10967p;
    }

    private boolean O(int i11) {
        DrmSession drmSession = this.f10959h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f10964m[i11] & 1073741824) == 0 && this.f10959h.b();
    }

    private void Q(p7.u uVar, z7.u uVar2) {
        p7.u uVar3 = this.f10958g;
        boolean z11 = uVar3 == null;
        p7.n nVar = uVar3 == null ? null : uVar3.f101548s;
        this.f10958g = uVar;
        p7.n nVar2 = uVar.f101548s;
        androidx.media3.exoplayer.drm.i iVar = this.f10955d;
        uVar2.f127112b = iVar != null ? uVar.c(iVar.e(uVar)) : uVar;
        uVar2.f127111a = this.f10959h;
        if (this.f10955d == null) {
            return;
        }
        if (z11 || !Objects.equals(nVar, nVar2)) {
            DrmSession drmSession = this.f10959h;
            DrmSession drmSessionD = this.f10955d.d(this.f10956e, uVar);
            this.f10959h = drmSessionD;
            uVar2.f127111a = drmSessionD;
            if (drmSession != null) {
                drmSession.h(this.f10956e);
            }
        }
    }

    private synchronized int R(z7.u uVar, DecoderInputBuffer decoderInputBuffer, boolean z11, boolean z12, b bVar) {
        try {
            decoderInputBuffer.f9287e = false;
            if (!K()) {
                if (!z12 && !this.f10974w) {
                    p7.u uVar2 = this.B;
                    if (uVar2 == null || (!z11 && uVar2 == this.f10958g)) {
                        return -3;
                    }
                    Q((p7.u) s7.a.f(uVar2), uVar);
                    return -5;
                }
                decoderInputBuffer.n(4);
                decoderInputBuffer.f9288f = Long.MIN_VALUE;
                return -4;
            }
            p7.u uVar3 = this.f10954c.e(F()).f10981a;
            if (!z11 && uVar3 == this.f10958g) {
                int iG = G(this.f10970s);
                if (!O(iG)) {
                    decoderInputBuffer.f9287e = true;
                    return -3;
                }
                decoderInputBuffer.n(this.f10964m[iG]);
                if (this.f10970s == this.f10967p - 1 && (z12 || this.f10974w)) {
                    decoderInputBuffer.e(PKIFailureInfo.duplicateCertReq);
                }
                decoderInputBuffer.f9288f = this.f10965n[iG];
                bVar.f10978a = this.f10963l[iG];
                bVar.f10979b = this.f10962k[iG];
                bVar.f10980c = this.f10966o[iG];
                return -4;
            }
            Q(uVar3, uVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void W() {
        DrmSession drmSession = this.f10959h;
        if (drmSession != null) {
            drmSession.h(this.f10956e);
            this.f10959h = null;
            this.f10958g = null;
        }
    }

    private synchronized void Z() {
        this.f10970s = 0;
        this.f10952a.o();
    }

    private synchronized boolean e0(p7.u uVar) {
        try {
            this.f10976y = false;
            if (Objects.equals(uVar, this.B)) {
                return false;
            }
            if (this.f10954c.g() || !this.f10954c.f().f10981a.equals(uVar)) {
                this.B = uVar;
            } else {
                this.B = this.f10954c.f().f10981a;
            }
            boolean z11 = this.D;
            p7.u uVar2 = this.B;
            this.D = z11 & p7.g0.a(uVar2.f101544o, uVar2.f101540k);
            this.E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean i(long j11) {
        if (this.f10967p == 0) {
            return j11 > this.f10972u;
        }
        if (D() >= j11) {
            return false;
        }
        v(this.f10968q + k(j11));
        return true;
    }

    private synchronized void j(long j11, int i11, long j12, int i12, o0.a aVar) {
        try {
            int i13 = this.f10967p;
            if (i13 > 0) {
                int iG = G(i13 - 1);
                s7.a.a(this.f10962k[iG] + ((long) this.f10963l[iG]) <= j12);
            }
            this.f10974w = (536870912 & i11) != 0;
            this.f10973v = Math.max(this.f10973v, j11);
            int iG2 = G(this.f10967p);
            this.f10965n[iG2] = j11;
            this.f10962k[iG2] = j12;
            this.f10963l[iG2] = i12;
            this.f10964m[iG2] = i11;
            this.f10966o[iG2] = aVar;
            this.f10961j[iG2] = this.C;
            if (this.f10954c.g() || !this.f10954c.f().f10981a.equals(this.B)) {
                p7.u uVar = (p7.u) s7.a.f(this.B);
                androidx.media3.exoplayer.drm.i iVar = this.f10955d;
                this.f10954c.a(J(), new c(uVar, iVar != null ? iVar.c(this.f10956e, uVar) : androidx.media3.exoplayer.drm.i.b.f9807a));
            }
            int i14 = this.f10967p + 1;
            this.f10967p = i14;
            int i15 = this.f10960i;
            if (i14 == i15) {
                int i16 = i15 + 1000;
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                long[] jArr3 = new long[i16];
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                o0.a[] aVarArr = new o0.a[i16];
                int i17 = this.f10969r;
                int i18 = i15 - i17;
                System.arraycopy(this.f10962k, i17, jArr2, 0, i18);
                System.arraycopy(this.f10965n, this.f10969r, jArr3, 0, i18);
                System.arraycopy(this.f10964m, this.f10969r, iArr, 0, i18);
                System.arraycopy(this.f10963l, this.f10969r, iArr2, 0, i18);
                System.arraycopy(this.f10966o, this.f10969r, aVarArr, 0, i18);
                System.arraycopy(this.f10961j, this.f10969r, jArr, 0, i18);
                int i19 = this.f10969r;
                System.arraycopy(this.f10962k, 0, jArr2, i18, i19);
                System.arraycopy(this.f10965n, 0, jArr3, i18, i19);
                System.arraycopy(this.f10964m, 0, iArr, i18, i19);
                System.arraycopy(this.f10963l, 0, iArr2, i18, i19);
                System.arraycopy(this.f10966o, 0, aVarArr, i18, i19);
                System.arraycopy(this.f10961j, 0, jArr, i18, i19);
                this.f10962k = jArr2;
                this.f10965n = jArr3;
                this.f10964m = iArr;
                this.f10963l = iArr2;
                this.f10966o = aVarArr;
                this.f10961j = jArr;
                this.f10969r = 0;
                this.f10960i = i16;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int k(long j11) {
        int i11 = this.f10967p;
        int iG = G(i11 - 1);
        while (i11 > this.f10970s && this.f10965n[iG] >= j11) {
            i11--;
            iG--;
            if (iG == -1) {
                iG = this.f10960i - 1;
            }
        }
        return i11;
    }

    public static f0 l(s8.b bVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar) {
        return new f0(bVar, (androidx.media3.exoplayer.drm.i) s7.a.f(iVar), (androidx.media3.exoplayer.drm.h.a) s7.a.f(aVar));
    }

    public static f0 m(s8.b bVar) {
        return new f0(bVar, null, null);
    }

    private synchronized long n(long j11, boolean z11, boolean z12) throws Throwable {
        Throwable th2;
        try {
            try {
                int i11 = this.f10967p;
                if (i11 != 0) {
                    long[] jArr = this.f10965n;
                    int i12 = this.f10969r;
                    if (j11 >= jArr[i12]) {
                        if (z12) {
                            try {
                                int i13 = this.f10970s;
                                if (i13 != i11) {
                                    i11 = i13 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iY = y(i12, i11, j11, z11);
                        if (iY == -1) {
                            return -1L;
                        }
                        return q(iY);
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

    private synchronized long o() {
        int i11 = this.f10967p;
        if (i11 == 0) {
            return -1L;
        }
        return q(i11);
    }

    private long q(int i11) {
        this.f10972u = Math.max(this.f10972u, E(i11));
        this.f10967p -= i11;
        int i12 = this.f10968q + i11;
        this.f10968q = i12;
        int i13 = this.f10969r + i11;
        this.f10969r = i13;
        int i14 = this.f10960i;
        if (i13 >= i14) {
            this.f10969r = i13 - i14;
        }
        int i15 = this.f10970s - i11;
        this.f10970s = i15;
        if (i15 < 0) {
            this.f10970s = 0;
        }
        this.f10954c.d(i12);
        if (this.f10967p != 0) {
            return this.f10962k[this.f10969r];
        }
        int i16 = this.f10969r;
        if (i16 == 0) {
            i16 = this.f10960i;
        }
        int i17 = i16 - 1;
        return this.f10962k[i17] + ((long) this.f10963l[i17]);
    }

    private long v(int i11) {
        int iJ = J() - i11;
        boolean z11 = false;
        s7.a.a(iJ >= 0 && iJ <= this.f10967p - this.f10970s);
        int i12 = this.f10967p - iJ;
        this.f10967p = i12;
        this.f10973v = Math.max(this.f10972u, E(i12));
        if (iJ == 0 && this.f10974w) {
            z11 = true;
        }
        this.f10974w = z11;
        this.f10954c.c(i11);
        int i13 = this.f10967p;
        if (i13 == 0) {
            return 0L;
        }
        int iG = G(i13 - 1);
        return this.f10962k[iG] + ((long) this.f10963l[iG]);
    }

    private int x(int i11, int i12, long j11, boolean z11) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f10965n[i11] >= j11) {
                return i13;
            }
            i11++;
            if (i11 == this.f10960i) {
                i11 = 0;
            }
        }
        if (z11) {
            return i12;
        }
        return -1;
    }

    private int y(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = this.f10965n[i11];
            if (j12 > j11) {
                break;
            }
            if (!z11 || (this.f10964m[i11] & 1) != 0) {
                if (j12 == j11) {
                    return i14;
                }
                i13 = i14;
            }
            i11++;
            if (i11 == this.f10960i) {
                i11 = 0;
            }
        }
        return i13;
    }

    public final int A() {
        return this.f10968q;
    }

    public final synchronized long B() {
        return this.f10967p == 0 ? Long.MIN_VALUE : this.f10965n[this.f10969r];
    }

    public final synchronized long C() {
        return this.f10973v;
    }

    public final synchronized long D() {
        return Math.max(this.f10972u, E(this.f10970s));
    }

    public final int F() {
        return this.f10968q + this.f10970s;
    }

    public final synchronized int H(long j11, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int iG = G(this.f10970s);
                if (!K() || j11 < this.f10965n[iG]) {
                    return 0;
                }
                if (j11 <= this.f10973v || !z11) {
                    int iY = y(iG, this.f10967p - this.f10970s, j11, true);
                    if (iY == -1) {
                        return 0;
                    }
                    return iY;
                }
                try {
                    return this.f10967p - this.f10970s;
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

    public final synchronized p7.u I() {
        return this.f10976y ? null : this.B;
    }

    public final int J() {
        return this.f10968q + this.f10967p;
    }

    protected final void L() {
        this.f10977z = true;
    }

    public final synchronized boolean M() {
        return this.f10974w;
    }

    public synchronized boolean N(boolean z11) {
        p7.u uVar;
        boolean z12 = true;
        if (K()) {
            if (this.f10954c.e(F()).f10981a != this.f10958g) {
                return true;
            }
            return O(G(this.f10970s));
        }
        if (!z11 && !this.f10974w && ((uVar = this.B) == null || uVar == this.f10958g)) {
            z12 = false;
        }
        return z12;
    }

    public void P() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.f10959h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) s7.a.f(this.f10959h.a()));
        }
    }

    public final synchronized long S() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return K() ? this.f10961j[G(this.f10970s)] : this.C;
    }

    public void T() {
        s();
        W();
    }

    public int U(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11, boolean z11) {
        int iR = R(uVar, decoderInputBuffer, (i11 & 2) != 0, z11, this.f10953b);
        if (iR == -4 && !decoderInputBuffer.i()) {
            boolean z12 = (i11 & 1) != 0;
            if ((i11 & 4) == 0) {
                if (z12) {
                    this.f10952a.f(decoderInputBuffer, this.f10953b);
                } else {
                    this.f10952a.m(decoderInputBuffer, this.f10953b);
                }
            }
            if (!z12) {
                this.f10970s++;
            }
        }
        return iR;
    }

    public void V() {
        Y(true);
        W();
    }

    public final void X() {
        Y(false);
    }

    public void Y(boolean z11) {
        this.f10952a.n();
        this.f10967p = 0;
        this.f10968q = 0;
        this.f10969r = 0;
        this.f10970s = 0;
        this.f10975x = true;
        this.f10971t = Long.MIN_VALUE;
        this.f10972u = Long.MIN_VALUE;
        this.f10973v = Long.MIN_VALUE;
        this.f10974w = false;
        this.f10954c.b();
        if (z11) {
            this.A = null;
            this.B = null;
            this.f10976y = true;
            this.D = true;
        }
    }

    @Override // w8.o0
    public final void a(s7.c0 c0Var, int i11, int i12) {
        this.f10952a.q(c0Var, i11);
    }

    public final synchronized boolean a0(int i11) {
        Z();
        int i12 = this.f10968q;
        if (i11 >= i12 && i11 <= this.f10967p + i12) {
            this.f10971t = Long.MIN_VALUE;
            this.f10970s = i11 - i12;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // w8.o0
    public void b(long j11, int i11, int i12, int i13, o0.a aVar) {
        int i14;
        if (this.f10977z) {
            g((p7.u) s7.a.j(this.A));
        }
        int i15 = i11 & 1;
        boolean z11 = i15 != 0;
        if (this.f10975x) {
            if (!z11) {
                return;
            } else {
                this.f10975x = false;
            }
        }
        long j12 = this.F + j11;
        if (!this.D) {
            i14 = i11;
        } else {
            if (j12 < this.f10971t) {
                return;
            }
            if (i15 == 0) {
                if (!this.E) {
                    s7.t.i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i14 = i11 | 1;
            } else {
                i14 = i11;
            }
        }
        if (this.G) {
            if (!z11 || !i(j12)) {
                return;
            } else {
                this.G = false;
            }
        }
        j(j12, i14, (this.f10952a.e() - ((long) i12)) - ((long) i13), i12, aVar);
    }

    public final synchronized boolean b0(long j11, boolean z11) throws Throwable {
        f0 f0Var;
        long j12;
        int iY;
        try {
            try {
                Z();
                int iG = G(this.f10970s);
                if (!K() || j11 < this.f10965n[iG] || (j11 > this.f10973v && !z11)) {
                    return false;
                }
                if (this.D) {
                    f0Var = this;
                    j12 = j11;
                    iY = f0Var.x(iG, this.f10967p - this.f10970s, j12, z11);
                } else {
                    f0Var = this;
                    j12 = j11;
                    iY = f0Var.y(iG, f0Var.f10967p - f0Var.f10970s, j12, true);
                }
                if (iY == -1) {
                    return false;
                }
                f0Var.f10971t = j12;
                f0Var.f10970s += iY;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // w8.o0
    public final int c(p7.j jVar, int i11, boolean z11, int i12) {
        return this.f10952a.p(jVar, i11, z11);
    }

    public final void c0(long j11) {
        if (this.F != j11) {
            this.F = j11;
            L();
        }
    }

    public final void d0(long j11) {
        this.f10971t = j11;
    }

    public final void f0(d dVar) {
        this.f10957f = dVar;
    }

    @Override // w8.o0
    public final void g(p7.u uVar) {
        p7.u uVarZ = z(uVar);
        this.f10977z = false;
        this.A = uVar;
        boolean zE0 = e0(uVarZ);
        d dVar = this.f10957f;
        if (dVar == null || !zE0) {
            return;
        }
        dVar.a(uVarZ);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void g0(int i11) {
        boolean z11;
        if (i11 >= 0) {
            try {
                if (this.f10970s + i11 <= this.f10967p) {
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
        s7.a.a(z11);
        this.f10970s += i11;
    }

    public final void h0(long j11) {
        this.C = j11;
    }

    public final void i0() {
        this.G = true;
    }

    public synchronized long p() {
        int i11 = this.f10970s;
        if (i11 == 0) {
            return -1L;
        }
        return q(i11);
    }

    public final void r(long j11, boolean z11, boolean z12) {
        this.f10952a.b(n(j11, z11, z12));
    }

    public final void s() {
        this.f10952a.b(o());
    }

    public final void t() {
        this.f10952a.b(p());
    }

    public final void u(long j11) {
        if (this.f10967p == 0) {
            return;
        }
        s7.a.a(j11 > D());
        w(this.f10968q + k(j11));
    }

    public final void w(int i11) {
        this.f10952a.c(v(i11));
    }

    protected p7.u z(p7.u uVar) {
        return (this.F == 0 || uVar.f101549t == Long.MAX_VALUE) ? uVar : uVar.b().C0(uVar.f101549t + this.F).P();
    }
}
