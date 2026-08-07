package rr;

import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import com.plaid.internal.EnumC4419g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0 implements hr.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hr.p f108705l = new hr.p() { // from class: rr.z
        @Override // hr.p
        public final hr.k[] d() {
            return a0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f108706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f108707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.d0 f108708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f108709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f108710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f108711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f108712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f108713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x f108714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private hr.m f108715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f108716k;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f108717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m0 f108718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ts.c0 f108719c = new ts.c0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f108720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f108721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f108722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f108723g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f108724h;

        public a(m mVar, m0 m0Var) {
            this.f108717a = mVar;
            this.f108718b = m0Var;
        }

        private void b() {
            this.f108719c.r(8);
            this.f108720d = this.f108719c.g();
            this.f108721e = this.f108719c.g();
            this.f108719c.r(6);
            this.f108723g = this.f108719c.h(8);
        }

        private void c() {
            this.f108724h = 0L;
            if (this.f108720d) {
                this.f108719c.r(4);
                long jH = ((long) this.f108719c.h(3)) << 30;
                this.f108719c.r(1);
                long jH2 = jH | ((long) (this.f108719c.h(15) << 15));
                this.f108719c.r(1);
                long jH3 = jH2 | ((long) this.f108719c.h(15));
                this.f108719c.r(1);
                if (!this.f108722f && this.f108721e) {
                    this.f108719c.r(4);
                    long jH4 = ((long) this.f108719c.h(3)) << 30;
                    this.f108719c.r(1);
                    long jH5 = jH4 | ((long) (this.f108719c.h(15) << 15));
                    this.f108719c.r(1);
                    long jH6 = jH5 | ((long) this.f108719c.h(15));
                    this.f108719c.r(1);
                    this.f108718b.b(jH6);
                    this.f108722f = true;
                }
                this.f108724h = this.f108718b.b(jH3);
            }
        }

        public void a(ts.d0 d0Var) {
            d0Var.l(this.f108719c.f114975a, 0, 3);
            this.f108719c.p(0);
            b();
            d0Var.l(this.f108719c.f114975a, 0, this.f108723g);
            this.f108719c.p(0);
            c();
            this.f108717a.c(this.f108724h, 4);
            this.f108717a.b(d0Var);
            this.f108717a.e();
        }

        public void d() {
            this.f108722f = false;
            this.f108717a.a();
        }
    }

    public a0() {
        this(new m0(0L));
    }

    public static /* synthetic */ hr.k[] b() {
        return new hr.k[]{new a0()};
    }

    @RequiresNonNull({"output"})
    private void c(long j11) {
        if (this.f108716k) {
            return;
        }
        this.f108716k = true;
        if (this.f108709d.c() == -9223372036854775807L) {
            this.f108715j.p(new hr.z.b(this.f108709d.c()));
            return;
        }
        x xVar = new x(this.f108709d.d(), this.f108709d.c(), j11);
        this.f108714i = xVar;
        this.f108715j.p(xVar.b());
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        boolean z11 = this.f108706a.e() == -9223372036854775807L;
        if (!z11) {
            long jC = this.f108706a.c();
            z11 = (jC == -9223372036854775807L || jC == 0 || jC == j12) ? false : true;
        }
        if (z11) {
            this.f108706a.h(j12);
        }
        x xVar = this.f108714i;
        if (xVar != null) {
            xVar.h(j12);
        }
        for (int i11 = 0; i11 < this.f108707b.size(); i11++) {
            this.f108707b.valueAt(i11).d();
        }
    }

    @Override // hr.k
    public void e(hr.m mVar) {
        this.f108715j = mVar;
    }

    @Override // hr.k
    public boolean h(hr.l lVar) {
        byte[] bArr = new byte[14];
        lVar.e(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.i(bArr[13] & 7);
        lVar.e(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // hr.k
    public int i(hr.l lVar, hr.y yVar) {
        m nVar;
        ts.a.i(this.f108715j);
        long length = lVar.getLength();
        if (length != -1 && !this.f108709d.e()) {
            return this.f108709d.g(lVar, yVar);
        }
        c(length);
        x xVar = this.f108714i;
        if (xVar != null && xVar.d()) {
            return this.f108714i.c(lVar, yVar);
        }
        lVar.g();
        long jH = length != -1 ? length - lVar.h() : -1L;
        if ((jH != -1 && jH < 4) || !lVar.f(this.f108708c.e(), 0, 4, true)) {
            return -1;
        }
        this.f108708c.U(0);
        int iQ = this.f108708c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            lVar.e(this.f108708c.e(), 0, 10);
            this.f108708c.U(9);
            lVar.k((this.f108708c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            lVar.e(this.f108708c.e(), 0, 2);
            this.f108708c.U(0);
            lVar.k(this.f108708c.N() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            lVar.k(1);
            return 0;
        }
        int i11 = iQ & 255;
        a aVar = this.f108707b.get(i11);
        if (!this.f108710e) {
            if (aVar == null) {
                if (i11 == 189) {
                    nVar = new c();
                    this.f108711f = true;
                    this.f108713h = lVar.getPosition();
                } else if ((iQ & 224) == 192) {
                    nVar = new t();
                    this.f108711f = true;
                    this.f108713h = lVar.getPosition();
                } else if ((iQ & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) == 224) {
                    nVar = new n();
                    this.f108712g = true;
                    this.f108713h = lVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f108715j, new i0.d(i11, 256));
                    aVar = new a(nVar, this.f108706a);
                    this.f108707b.put(i11, aVar);
                }
            }
            if (lVar.getPosition() > ((this.f108711f && this.f108712g) ? this.f108713h + FileAppender.DEFAULT_BUFFER_SIZE : 1048576L)) {
                this.f108710e = true;
                this.f108715j.j();
            }
        }
        lVar.e(this.f108708c.e(), 0, 2);
        this.f108708c.U(0);
        int iN = this.f108708c.N() + 6;
        if (aVar == null) {
            lVar.k(iN);
        } else {
            this.f108708c.Q(iN);
            lVar.readFully(this.f108708c.e(), 0, iN);
            this.f108708c.U(6);
            aVar.a(this.f108708c);
            ts.d0 d0Var = this.f108708c;
            d0Var.T(d0Var.b());
        }
        return 0;
    }

    public a0(m0 m0Var) {
        this.f108706a = m0Var;
        this.f108708c = new ts.d0(4096);
        this.f108707b = new SparseArray<>();
        this.f108709d = new y();
    }

    @Override // hr.k
    public void release() {
    }
}
