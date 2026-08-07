package da;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements w8.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w8.u f60000m = new w8.u() { // from class: da.g
        @Override // w8.u
        public final w8.p[] d() {
            return h.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f60002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.c0 f60003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7.c0 f60004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s7.b0 f60005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w8.r f60006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f60007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f60008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f60012l;

    public h() {
        this(0);
    }

    public static /* synthetic */ w8.p[] b() {
        return new w8.p[]{new h()};
    }

    private void c(w8.q qVar) throws ParserException {
        if (this.f60010j) {
            return;
        }
        this.f60009i = -1;
        qVar.g();
        long j11 = 0;
        if (qVar.getPosition() == 0) {
            k(qVar);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                if (qVar.f(this.f60004d.f(), 0, 2, true)) {
                    this.f60004d.b0(0);
                    if (!i.m(this.f60004d.U())) {
                        break;
                    }
                    if (qVar.f(this.f60004d.f(), 0, 4, true)) {
                        this.f60005e.p(14);
                        int iH = this.f60005e.h(13);
                        if (iH <= 6) {
                            this.f60010j = true;
                            throw ParserException.a("Malformed ADTS stream", null);
                        }
                        j11 += (long) iH;
                        i12++;
                        if (i12 != 1000 && qVar.l(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i11 = i12;
            break;
        }
        qVar.g();
        if (i11 > 0) {
            this.f60009i = (int) (j11 / ((long) i11));
        } else {
            this.f60009i = -1;
        }
        this.f60010j = true;
    }

    private static int d(int i11, long j11) {
        return (int) ((((long) i11) * 8000000) / j11);
    }

    private w8.j0 f(long j11, boolean z11) {
        return new w8.i(j11, this.f60008h, d(this.f60009i, this.f60002b.k()), this.f60009i, z11);
    }

    @RequiresNonNull({"extractorOutput"})
    private void g(long j11, boolean z11) {
        if (this.f60012l) {
            return;
        }
        boolean z12 = (this.f60001a & 1) != 0 && this.f60009i > 0;
        if (z12 && this.f60002b.k() == -9223372036854775807L && !z11) {
            return;
        }
        if (!z12 || this.f60002b.k() == -9223372036854775807L) {
            this.f60006f.t(new w8.j0.b(-9223372036854775807L));
        } else {
            this.f60006f.t(f(j11, (this.f60001a & 2) != 0));
        }
        this.f60012l = true;
    }

    private int k(w8.q qVar) {
        int i11 = 0;
        while (true) {
            qVar.e(this.f60004d.f(), 0, 10);
            this.f60004d.b0(0);
            if (this.f60004d.P() != 4801587) {
                break;
            }
            this.f60004d.c0(3);
            int iL = this.f60004d.L();
            i11 += iL + 10;
            qVar.i(iL);
        }
        qVar.g();
        qVar.i(i11);
        if (this.f60008h == -1) {
            this.f60008h = i11;
        }
        return i11;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f60011k = false;
        this.f60002b.a();
        this.f60007g = j12;
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        this.f60006f = rVar;
        this.f60002b.d(rVar, new l0.d(0, 1));
        rVar.j();
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) throws ParserException {
        s7.a.j(this.f60006f);
        long length = qVar.getLength();
        int i11 = this.f60001a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            c(qVar);
        }
        int i12 = qVar.read(this.f60003c.f(), 0, 2048);
        boolean z11 = i12 == -1;
        g(length, z11);
        if (z11) {
            return -1;
        }
        this.f60003c.b0(0);
        this.f60003c.a0(i12);
        if (!this.f60011k) {
            this.f60002b.c(this.f60007g, 4);
            this.f60011k = true;
        }
        this.f60002b.b(this.f60003c);
        return 0;
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        int iK = k(qVar);
        int i11 = iK;
        int i12 = 0;
        int i13 = 0;
        do {
            qVar.e(this.f60004d.f(), 0, 2);
            this.f60004d.b0(0);
            if (i.m(this.f60004d.U())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                qVar.e(this.f60004d.f(), 0, 4);
                this.f60005e.p(14);
                int iH = this.f60005e.h(13);
                if (iH <= 6) {
                    i11++;
                    qVar.g();
                    qVar.i(i11);
                } else {
                    qVar.i(iH - 6);
                    i13 += iH;
                }
            } else {
                i11++;
                qVar.g();
                qVar.i(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - iK < 8192);
        return false;
    }

    public h(int i11) {
        this.f60001a = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.f60002b = new i(true, "audio/mp4a-latm");
        this.f60003c = new s7.c0(2048);
        this.f60009i = -1;
        this.f60008h = -1L;
        s7.c0 c0Var = new s7.c0(10);
        this.f60004d = c0Var;
        this.f60005e = new s7.b0(c0Var.f());
    }

    @Override // w8.p
    public void release() {
    }
}
