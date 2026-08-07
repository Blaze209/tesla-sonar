package z7;

import p7.i0;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.j f127085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f127086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f127087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f127088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i0 f127089e = i0.f101376d;

    public c0(s7.j jVar) {
        this.f127085a = jVar;
    }

    public void a(long j11) {
        this.f127087c = j11;
        if (this.f127086b) {
            this.f127088d = this.f127085a.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f127086b) {
            return;
        }
        this.f127088d = this.f127085a.elapsedRealtime();
        this.f127086b = true;
    }

    public void c() {
        if (this.f127086b) {
            a(y());
            this.f127086b = false;
        }
    }

    @Override // z7.w
    public i0 e() {
        return this.f127089e;
    }

    @Override // z7.w
    public void j(i0 i0Var) {
        if (this.f127086b) {
            a(y());
        }
        this.f127089e = i0Var;
    }

    @Override // z7.w
    public long y() {
        long j11 = this.f127087c;
        if (!this.f127086b) {
            return j11;
        }
        long jElapsedRealtime = this.f127085a.elapsedRealtime() - this.f127088d;
        i0 i0Var = this.f127089e;
        return j11 + (i0Var.f101379a == 1.0f ? q0.b1(jElapsedRealtime) : i0Var.b(jElapsedRealtime));
    }
}
