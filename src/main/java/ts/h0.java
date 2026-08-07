package ts;

import com.google.android.exoplayer2.u1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f115002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f115003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f115004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f115005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u1 f115006e = u1.f40753d;

    public h0(d dVar) {
        this.f115002a = dVar;
    }

    public void a(long j11) {
        this.f115004c = j11;
        if (this.f115003b) {
            this.f115005d = this.f115002a.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f115003b) {
            return;
        }
        this.f115005d = this.f115002a.elapsedRealtime();
        this.f115003b = true;
    }

    public void c() {
        if (this.f115003b) {
            a(y());
            this.f115003b = false;
        }
    }

    @Override // ts.w
    public u1 e() {
        return this.f115006e;
    }

    @Override // ts.w
    public void j(u1 u1Var) {
        if (this.f115003b) {
            a(y());
        }
        this.f115006e = u1Var;
    }

    @Override // ts.w
    public long y() {
        long j11 = this.f115004c;
        if (!this.f115003b) {
            return j11;
        }
        long jElapsedRealtime = this.f115002a.elapsedRealtime() - this.f115005d;
        u1 u1Var = this.f115006e;
        return j11 + (u1Var.f40757a == 1.0f ? p0.D0(jElapsedRealtime) : u1Var.b(jElapsedRealtime));
    }
}
