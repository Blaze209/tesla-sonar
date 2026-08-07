package da;

import androidx.media3.common.ParserException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.c0 f60052a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f60055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f60056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w8.o0 f60058g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f60062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p7.u f60063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f60065n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f60059h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f60068q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f60053b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60066o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60067p = -1;

    public k(String str, int i11, int i12, String str2) {
        this.f60052a = new s7.c0(new byte[i12]);
        this.f60054c = str;
        this.f60055d = i11;
        this.f60056e = str2;
    }

    private boolean f(s7.c0 c0Var, byte[] bArr, int i11) {
        int iMin = Math.min(c0Var.a(), i11 - this.f60060i);
        c0Var.q(bArr, this.f60060i, iMin);
        int i12 = this.f60060i + iMin;
        this.f60060i = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void g() {
        byte[] bArrF = this.f60052a.f();
        if (this.f60063l == null) {
            p7.u uVarH = w8.o.h(bArrF, this.f60057f, this.f60054c, this.f60055d, this.f60056e, null);
            this.f60063l = uVarH;
            this.f60058g.g(uVarH);
        }
        this.f60064m = w8.o.b(bArrF);
        this.f60062k = ru.f.e(q0.r1(w8.o.g(bArrF), this.f60063l.H));
    }

    @RequiresNonNull({"output"})
    private void h() throws ParserException {
        w8.o.b bVarI = w8.o.i(this.f60052a.f());
        k(bVarI);
        this.f60064m = bVarI.f121383d;
        long j11 = bVarI.f121384e;
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        this.f60062k = j11;
    }

    @RequiresNonNull({"output"})
    private void i() throws ParserException {
        w8.o.b bVarK = w8.o.k(this.f60052a.f(), this.f60053b);
        if (this.f60065n == 3) {
            k(bVarK);
        }
        this.f60064m = bVarK.f121383d;
        long j11 = bVarK.f121384e;
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        this.f60062k = j11;
    }

    private boolean j(s7.c0 c0Var) {
        while (c0Var.a() > 0) {
            int i11 = this.f60061j << 8;
            this.f60061j = i11;
            int iM = i11 | c0Var.M();
            this.f60061j = iM;
            int iC = w8.o.c(iM);
            this.f60065n = iC;
            if (iC != 0) {
                byte[] bArrF = this.f60052a.f();
                int i12 = this.f60061j;
                bArrF[0] = (byte) ((i12 >> 24) & 255);
                bArrF[1] = (byte) ((i12 >> 16) & 255);
                bArrF[2] = (byte) ((i12 >> 8) & 255);
                bArrF[3] = (byte) (i12 & 255);
                this.f60060i = 4;
                this.f60061j = 0;
                return true;
            }
        }
        return false;
    }

    @RequiresNonNull({"output"})
    private void k(w8.o.b bVar) {
        int i11;
        int i12 = bVar.f121381b;
        if (i12 == -2147483647 || (i11 = bVar.f121382c) == -1) {
            return;
        }
        p7.u uVar = this.f60063l;
        if (uVar != null && i11 == uVar.G && i12 == uVar.H && Objects.equals(bVar.f121380a, uVar.f101544o)) {
            return;
        }
        p7.u uVar2 = this.f60063l;
        p7.u uVarP = (uVar2 == null ? new p7.u.b() : uVar2.b()).j0(this.f60057f).W(this.f60056e).y0(bVar.f121380a).T(bVar.f121382c).z0(bVar.f121381b).n0(this.f60054c).w0(this.f60055d).P();
        this.f60063l = uVarP;
        this.f60058g.g(uVarP);
    }

    @Override // da.m
    public void a() {
        this.f60059h = 0;
        this.f60060i = 0;
        this.f60061j = 0;
        this.f60068q = -9223372036854775807L;
        this.f60053b.set(0);
    }

    @Override // da.m
    public void b(s7.c0 c0Var) throws ParserException {
        s7.a.j(this.f60058g);
        while (c0Var.a() > 0) {
            switch (this.f60059h) {
                case 0:
                    if (j(c0Var)) {
                        int i11 = this.f60065n;
                        if (i11 == 3 || i11 == 4) {
                            this.f60059h = 4;
                        } else if (i11 != 1) {
                            this.f60059h = 2;
                        } else {
                            this.f60059h = 1;
                        }
                    }
                    break;
                case 1:
                    if (f(c0Var, this.f60052a.f(), 18)) {
                        g();
                        this.f60052a.b0(0);
                        this.f60058g.f(this.f60052a, 18);
                        this.f60059h = 6;
                    }
                    break;
                case 2:
                    if (f(c0Var, this.f60052a.f(), 7)) {
                        this.f60066o = w8.o.j(this.f60052a.f());
                        this.f60059h = 3;
                    }
                    break;
                case 3:
                    if (f(c0Var, this.f60052a.f(), this.f60066o)) {
                        h();
                        this.f60052a.b0(0);
                        this.f60058g.f(this.f60052a, this.f60066o);
                        this.f60059h = 6;
                    }
                    break;
                case 4:
                    if (f(c0Var, this.f60052a.f(), 6)) {
                        int iL = w8.o.l(this.f60052a.f());
                        this.f60067p = iL;
                        int i12 = this.f60060i;
                        if (i12 > iL) {
                            int i13 = i12 - iL;
                            this.f60060i = i12 - i13;
                            c0Var.b0(c0Var.g() - i13);
                        }
                        this.f60059h = 5;
                    }
                    break;
                case 5:
                    if (f(c0Var, this.f60052a.f(), this.f60067p)) {
                        i();
                        this.f60052a.b0(0);
                        this.f60058g.f(this.f60052a, this.f60067p);
                        this.f60059h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c0Var.a(), this.f60064m - this.f60060i);
                    this.f60058g.f(c0Var, iMin);
                    int i14 = this.f60060i + iMin;
                    this.f60060i = i14;
                    if (i14 == this.f60064m) {
                        s7.a.h(this.f60068q != -9223372036854775807L);
                        this.f60058g.b(this.f60068q, this.f60065n == 4 ? 0 : 1, this.f60064m, 0, null);
                        this.f60068q += this.f60062k;
                        this.f60059h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60068q = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60057f = dVar.b();
        this.f60058g = rVar.b(dVar.c(), 1);
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
