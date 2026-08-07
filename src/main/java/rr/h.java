package rr;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h implements hr.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final hr.p f108779m = new hr.p() { // from class: rr.g
        @Override // hr.p
        public final hr.k[] d() {
            return h.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f108781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.d0 f108782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts.d0 f108783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ts.c0 f108784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private hr.m f108785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f108786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f108787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f108788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f108789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f108790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f108791l;

    public h() {
        this(0);
    }

    public static /* synthetic */ hr.k[] b() {
        return new hr.k[]{new h()};
    }

    private void c(hr.l lVar) throws ParserException {
        if (this.f108789j) {
            return;
        }
        this.f108788i = -1;
        lVar.g();
        long j11 = 0;
        if (lVar.getPosition() == 0) {
            j(lVar);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                if (lVar.f(this.f108783d.e(), 0, 2, true)) {
                    this.f108783d.U(0);
                    if (!i.m(this.f108783d.N())) {
                        break;
                    }
                    if (lVar.f(this.f108783d.e(), 0, 4, true)) {
                        this.f108784e.p(14);
                        int iH = this.f108784e.h(13);
                        if (iH <= 6) {
                            this.f108789j = true;
                            throw ParserException.a("Malformed ADTS stream", null);
                        }
                        j11 += (long) iH;
                        i12++;
                        if (i12 != 1000 && lVar.l(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i11 = i12;
            break;
        }
        lVar.g();
        if (i11 > 0) {
            this.f108788i = (int) (j11 / ((long) i11));
        } else {
            this.f108788i = -1;
        }
        this.f108789j = true;
    }

    private static int d(int i11, long j11) {
        return (int) ((((long) i11) * 8000000) / j11);
    }

    private hr.z f(long j11, boolean z11) {
        return new hr.d(j11, this.f108787h, d(this.f108788i, this.f108781b.k()), this.f108788i, z11);
    }

    @RequiresNonNull({"extractorOutput"})
    private void g(long j11, boolean z11) {
        if (this.f108791l) {
            return;
        }
        boolean z12 = (this.f108780a & 1) != 0 && this.f108788i > 0;
        if (z12 && this.f108781b.k() == -9223372036854775807L && !z11) {
            return;
        }
        if (!z12 || this.f108781b.k() == -9223372036854775807L) {
            this.f108785f.p(new hr.z.b(-9223372036854775807L));
        } else {
            this.f108785f.p(f(j11, (this.f108780a & 2) != 0));
        }
        this.f108791l = true;
    }

    private int j(hr.l lVar) {
        int i11 = 0;
        while (true) {
            lVar.e(this.f108783d.e(), 0, 10);
            this.f108783d.U(0);
            if (this.f108783d.K() != 4801587) {
                break;
            }
            this.f108783d.V(3);
            int iG = this.f108783d.G();
            i11 += iG + 10;
            lVar.i(iG);
        }
        lVar.g();
        lVar.i(i11);
        if (this.f108787h == -1) {
            this.f108787h = i11;
        }
        return i11;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.f108790k = false;
        this.f108781b.a();
        this.f108786g = j12;
    }

    @Override // hr.k
    public void e(hr.m mVar) {
        this.f108785f = mVar;
        this.f108781b.d(mVar, new i0.d(0, 1));
        mVar.j();
    }

    @Override // hr.k
    public boolean h(hr.l lVar) {
        int iJ = j(lVar);
        int i11 = iJ;
        int i12 = 0;
        int i13 = 0;
        do {
            lVar.e(this.f108783d.e(), 0, 2);
            this.f108783d.U(0);
            if (i.m(this.f108783d.N())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                lVar.e(this.f108783d.e(), 0, 4);
                this.f108784e.p(14);
                int iH = this.f108784e.h(13);
                if (iH <= 6) {
                    i11++;
                    lVar.g();
                    lVar.i(i11);
                } else {
                    lVar.i(iH - 6);
                    i13 += iH;
                }
            } else {
                i11++;
                lVar.g();
                lVar.i(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - iJ < 8192);
        return false;
    }

    @Override // hr.k
    public int i(hr.l lVar, hr.y yVar) throws ParserException {
        ts.a.i(this.f108785f);
        long length = lVar.getLength();
        int i11 = this.f108780a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            c(lVar);
        }
        int i12 = lVar.read(this.f108782c.e(), 0, 2048);
        boolean z11 = i12 == -1;
        g(length, z11);
        if (z11) {
            return -1;
        }
        this.f108782c.U(0);
        this.f108782c.T(i12);
        if (!this.f108790k) {
            this.f108781b.c(this.f108786g, 4);
            this.f108790k = true;
        }
        this.f108781b.b(this.f108782c);
        return 0;
    }

    public h(int i11) {
        this.f108780a = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.f108781b = new i(true);
        this.f108782c = new ts.d0(2048);
        this.f108788i = -1;
        this.f108787h = -1L;
        ts.d0 d0Var = new ts.d0(10);
        this.f108783d = d0Var;
        this.f108784e = new ts.c0(d0Var.e());
    }

    @Override // hr.k
    public void release() {
    }
}
