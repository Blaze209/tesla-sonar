package da;

import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import com.plaid.internal.EnumC4419g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements w8.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w8.u f59950l = new w8.u() { // from class: da.b0
        @Override // w8.u
        public final w8.p[] d() {
            return c0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.i0 f59951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f59952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.c0 f59953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f59954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f59957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f59958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f59959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w8.r f59960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59961k;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f59962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s7.i0 f59963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s7.b0 f59964c = new s7.b0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f59965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f59966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f59967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f59968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f59969h;

        public a(m mVar, s7.i0 i0Var) {
            this.f59962a = mVar;
            this.f59963b = i0Var;
        }

        private void b() {
            this.f59964c.r(8);
            this.f59965d = this.f59964c.g();
            this.f59966e = this.f59964c.g();
            this.f59964c.r(6);
            this.f59968g = this.f59964c.h(8);
        }

        private void c() {
            this.f59969h = 0L;
            if (this.f59965d) {
                this.f59964c.r(4);
                long jH = ((long) this.f59964c.h(3)) << 30;
                this.f59964c.r(1);
                long jH2 = jH | ((long) (this.f59964c.h(15) << 15));
                this.f59964c.r(1);
                long jH3 = jH2 | ((long) this.f59964c.h(15));
                this.f59964c.r(1);
                if (!this.f59967f && this.f59966e) {
                    this.f59964c.r(4);
                    long jH4 = ((long) this.f59964c.h(3)) << 30;
                    this.f59964c.r(1);
                    long jH5 = jH4 | ((long) (this.f59964c.h(15) << 15));
                    this.f59964c.r(1);
                    long jH6 = jH5 | ((long) this.f59964c.h(15));
                    this.f59964c.r(1);
                    this.f59963b.b(jH6);
                    this.f59967f = true;
                }
                this.f59969h = this.f59963b.b(jH3);
            }
        }

        public void a(s7.c0 c0Var) {
            c0Var.q(this.f59964c.f110390a, 0, 3);
            this.f59964c.p(0);
            b();
            c0Var.q(this.f59964c.f110390a, 0, this.f59968g);
            this.f59964c.p(0);
            c();
            this.f59962a.c(this.f59969h, 4);
            this.f59962a.b(c0Var);
            this.f59962a.e(false);
        }

        public void d() {
            this.f59967f = false;
            this.f59962a.a();
        }
    }

    public c0() {
        this(new s7.i0(0L));
    }

    public static /* synthetic */ w8.p[] b() {
        return new w8.p[]{new c0()};
    }

    @RequiresNonNull({"output"})
    private void c(long j11) {
        if (this.f59961k) {
            return;
        }
        this.f59961k = true;
        if (this.f59954d.c() == -9223372036854775807L) {
            this.f59960j.t(new w8.j0.b(this.f59954d.c()));
            return;
        }
        z zVar = new z(this.f59954d.d(), this.f59954d.c(), j11);
        this.f59959i = zVar;
        this.f59960j.t(zVar.b());
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        boolean z11 = this.f59951a.f() == -9223372036854775807L;
        if (!z11) {
            long jD = this.f59951a.d();
            z11 = (jD == -9223372036854775807L || jD == 0 || jD == j12) ? false : true;
        }
        if (z11) {
            this.f59951a.i(j12);
        }
        z zVar = this.f59959i;
        if (zVar != null) {
            zVar.h(j12);
        }
        for (int i11 = 0; i11 < this.f59952b.size(); i11++) {
            this.f59952b.valueAt(i11).d();
        }
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        this.f59960j = rVar;
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) {
        m nVar;
        s7.a.j(this.f59960j);
        long length = qVar.getLength();
        if (length != -1 && !this.f59954d.e()) {
            return this.f59954d.g(qVar, i0Var);
        }
        c(length);
        z zVar = this.f59959i;
        if (zVar != null && zVar.d()) {
            return this.f59959i.c(qVar, i0Var);
        }
        qVar.g();
        long jH = length != -1 ? length - qVar.h() : -1L;
        if ((jH != -1 && jH < 4) || !qVar.f(this.f59953c.f(), 0, 4, true)) {
            return -1;
        }
        this.f59953c.b0(0);
        int iV = this.f59953c.v();
        if (iV == 441) {
            return -1;
        }
        if (iV == 442) {
            qVar.e(this.f59953c.f(), 0, 10);
            this.f59953c.b0(9);
            qVar.k((this.f59953c.M() & 7) + 14);
            return 0;
        }
        if (iV == 443) {
            qVar.e(this.f59953c.f(), 0, 2);
            this.f59953c.b0(0);
            qVar.k(this.f59953c.U() + 6);
            return 0;
        }
        if (((iV & (-256)) >> 8) != 1) {
            qVar.k(1);
            return 0;
        }
        int i11 = iV & 255;
        a aVar = this.f59952b.get(i11);
        if (!this.f59955e) {
            if (aVar == null) {
                if (i11 == 189) {
                    nVar = new c("video/mp2p");
                    this.f59956f = true;
                    this.f59958h = qVar.getPosition();
                } else if ((iV & 224) == 192) {
                    nVar = new t("video/mp2p");
                    this.f59956f = true;
                    this.f59958h = qVar.getPosition();
                } else if ((iV & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) == 224) {
                    nVar = new n("video/mp2p");
                    this.f59957g = true;
                    this.f59958h = qVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f59960j, new l0.d(i11, 256));
                    aVar = new a(nVar, this.f59951a);
                    this.f59952b.put(i11, aVar);
                }
            }
            if (qVar.getPosition() > ((this.f59956f && this.f59957g) ? this.f59958h + FileAppender.DEFAULT_BUFFER_SIZE : 1048576L)) {
                this.f59955e = true;
                this.f59960j.j();
            }
        }
        qVar.e(this.f59953c.f(), 0, 2);
        this.f59953c.b0(0);
        int iU = this.f59953c.U() + 6;
        if (aVar == null) {
            qVar.k(iU);
        } else {
            this.f59953c.X(iU);
            qVar.readFully(this.f59953c.f(), 0, iU);
            this.f59953c.b0(6);
            aVar.a(this.f59953c);
            s7.c0 c0Var = this.f59953c;
            c0Var.a0(c0Var.b());
        }
        return 0;
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        byte[] bArr = new byte[14];
        qVar.e(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.i(bArr[13] & 7);
        qVar.e(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public c0(s7.i0 i0Var) {
        this.f59951a = i0Var;
        this.f59953c = new s7.c0(4096);
        this.f59952b = new SparseArray<>();
        this.f59954d = new a0();
    }

    @Override // w8.p
    public void release() {
    }
}
