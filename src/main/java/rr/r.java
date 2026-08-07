package rr;

import com.google.android.exoplayer2.u0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class r implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hr.b0 f108999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109000c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f109002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109003f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.d0 f108998a = new ts.d0(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f109001d = -9223372036854775807L;

    @Override // rr.m
    public void a() {
        this.f109000c = false;
        this.f109001d = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        ts.a.i(this.f108999b);
        if (this.f109000c) {
            int iA = d0Var.a();
            int i11 = this.f109003f;
            if (i11 < 10) {
                int iMin = Math.min(iA, 10 - i11);
                System.arraycopy(d0Var.e(), d0Var.f(), this.f108998a.e(), this.f109003f, iMin);
                if (this.f109003f + iMin == 10) {
                    this.f108998a.U(0);
                    if (73 != this.f108998a.H() || 68 != this.f108998a.H() || 51 != this.f108998a.H()) {
                        ts.u.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f109000c = false;
                        return;
                    } else {
                        this.f108998a.V(3);
                        this.f109002e = this.f108998a.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f109002e - this.f109003f);
            this.f108999b.d(d0Var, iMin2);
            this.f109003f += iMin2;
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f109000c = true;
        if (j11 != -9223372036854775807L) {
            this.f109001d = j11;
        }
        this.f109002e = 0;
        this.f109003f = 0;
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        hr.b0 b0VarB = mVar.b(dVar.c(), 5);
        this.f108999b = b0VarB;
        b0VarB.b(new u0.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // rr.m
    public void e() {
        int i11;
        ts.a.i(this.f108999b);
        if (this.f109000c && (i11 = this.f109002e) != 0 && this.f109003f == i11) {
            long j11 = this.f109001d;
            if (j11 != -9223372036854775807L) {
                this.f108999b.e(j11, 1, i11, 0, null);
            }
            this.f109000c = false;
        }
    }
}
