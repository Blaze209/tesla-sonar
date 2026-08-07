package rr;

import com.google.android.exoplayer2.u0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f108857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hr.b0 f108858d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f108860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f108862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u0 f108863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f108864j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.d0 f108855a = new ts.d0(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f108859e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f108865k = -9223372036854775807L;

    public k(String str) {
        this.f108856b = str;
    }

    private boolean f(ts.d0 d0Var, byte[] bArr, int i11) {
        int iMin = Math.min(d0Var.a(), i11 - this.f108860f);
        d0Var.l(bArr, this.f108860f, iMin);
        int i12 = this.f108860f + iMin;
        this.f108860f = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void g() {
        byte[] bArrE = this.f108855a.e();
        if (this.f108863i == null) {
            u0 u0VarG = dr.s.g(bArrE, this.f108857c, this.f108856b, null);
            this.f108863i = u0VarG;
            this.f108858d.b(u0VarG);
        }
        this.f108864j = dr.s.a(bArrE);
        this.f108862h = (int) ((((long) dr.s.f(bArrE)) * 1000000) / ((long) this.f108863i.f40726z));
    }

    private boolean h(ts.d0 d0Var) {
        while (d0Var.a() > 0) {
            int i11 = this.f108861g << 8;
            this.f108861g = i11;
            int iH = i11 | d0Var.H();
            this.f108861g = iH;
            if (dr.s.d(iH)) {
                byte[] bArrE = this.f108855a.e();
                int i12 = this.f108861g;
                bArrE[0] = (byte) ((i12 >> 24) & 255);
                bArrE[1] = (byte) ((i12 >> 16) & 255);
                bArrE[2] = (byte) ((i12 >> 8) & 255);
                bArrE[3] = (byte) (i12 & 255);
                this.f108860f = 4;
                this.f108861g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // rr.m
    public void a() {
        this.f108859e = 0;
        this.f108860f = 0;
        this.f108861g = 0;
        this.f108865k = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        ts.a.i(this.f108858d);
        while (d0Var.a() > 0) {
            int i11 = this.f108859e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d0Var.a(), this.f108864j - this.f108860f);
                    this.f108858d.d(d0Var, iMin);
                    int i12 = this.f108860f + iMin;
                    this.f108860f = i12;
                    int i13 = this.f108864j;
                    if (i12 == i13) {
                        long j11 = this.f108865k;
                        if (j11 != -9223372036854775807L) {
                            this.f108858d.e(j11, 1, i13, 0, null);
                            this.f108865k += this.f108862h;
                        }
                        this.f108859e = 0;
                    }
                } else if (f(d0Var, this.f108855a.e(), 18)) {
                    g();
                    this.f108855a.U(0);
                    this.f108858d.d(this.f108855a, 18);
                    this.f108859e = 2;
                }
            } else if (h(d0Var)) {
                this.f108859e = 1;
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108865k = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108857c = dVar.b();
        this.f108858d = mVar.b(dVar.c(), 1);
    }

    @Override // rr.m
    public void e() {
    }
}
