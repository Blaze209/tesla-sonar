package p9;

import java.math.RoundingMode;
import s7.q0;
import w8.e0;
import w8.j0;

/* JADX INFO: loaded from: classes3.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f101978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f101979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f101980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f101981d;

    public b(long j11, long j12, long j13) {
        this.f101981d = new e0(new long[]{j12}, new long[]{0}, j11);
        this.f101978a = j12;
        this.f101979b = j13;
        int i11 = -2147483647;
        if (j11 == -9223372036854775807L) {
            this.f101980c = -2147483647;
            return;
        }
        long jV1 = q0.v1(j12 - j13, 8L, j11, RoundingMode.HALF_UP);
        if (jV1 > 0 && jV1 <= 2147483647L) {
            i11 = (int) jV1;
        }
        this.f101980c = i11;
    }

    public boolean a(long j11) {
        return this.f101981d.e(j11, 100000L);
    }

    @Override // p9.g
    public long b(long j11) {
        return this.f101981d.b(j11);
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        return this.f101981d.c(j11);
    }

    @Override // w8.j0
    public boolean d() {
        return this.f101981d.d();
    }

    public void e(long j11, long j12) {
        if (a(j11)) {
            return;
        }
        this.f101981d.a(j11, j12);
    }

    @Override // p9.g
    public long f() {
        return this.f101979b;
    }

    @Override // w8.j0
    public long g() {
        return this.f101981d.g();
    }

    void h(long j11) {
        this.f101981d.h(j11);
    }

    @Override // p9.g
    public long k() {
        return this.f101978a;
    }

    @Override // p9.g
    public int m() {
        return this.f101980c;
    }
}
