package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f10628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f10637j;

    q1(androidx.media3.exoplayer.source.r.b bVar, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        s7.a.a(!z15 || z13);
        s7.a.a(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        s7.a.a(z16);
        this.f10628a = bVar;
        this.f10629b = j11;
        this.f10630c = j12;
        this.f10631d = j13;
        this.f10632e = j14;
        this.f10633f = z11;
        this.f10634g = z12;
        this.f10635h = z13;
        this.f10636i = z14;
        this.f10637j = z15;
    }

    public q1 a(long j11) {
        return j11 == this.f10630c ? this : new q1(this.f10628a, this.f10629b, j11, this.f10631d, this.f10632e, this.f10633f, this.f10634g, this.f10635h, this.f10636i, this.f10637j);
    }

    public q1 b(long j11) {
        return j11 == this.f10629b ? this : new q1(this.f10628a, j11, this.f10630c, this.f10631d, this.f10632e, this.f10633f, this.f10634g, this.f10635h, this.f10636i, this.f10637j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f10629b == q1Var.f10629b && this.f10630c == q1Var.f10630c && this.f10631d == q1Var.f10631d && this.f10632e == q1Var.f10632e && this.f10633f == q1Var.f10633f && this.f10634g == q1Var.f10634g && this.f10635h == q1Var.f10635h && this.f10636i == q1Var.f10636i && this.f10637j == q1Var.f10637j && Objects.equals(this.f10628a, q1Var.f10628a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f10628a.hashCode()) * 31) + ((int) this.f10629b)) * 31) + ((int) this.f10630c)) * 31) + ((int) this.f10631d)) * 31) + ((int) this.f10632e)) * 31) + (this.f10633f ? 1 : 0)) * 31) + (this.f10634g ? 1 : 0)) * 31) + (this.f10635h ? 1 : 0)) * 31) + (this.f10636i ? 1 : 0)) * 31) + (this.f10637j ? 1 : 0);
    }
}
