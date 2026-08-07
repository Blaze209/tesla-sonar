package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.o.b f39406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f39414i;

    a1(com.google.android.exoplayer2.source.o.b bVar, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        ts.a.a(!z14 || z12);
        ts.a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        ts.a.a(z15);
        this.f39406a = bVar;
        this.f39407b = j11;
        this.f39408c = j12;
        this.f39409d = j13;
        this.f39410e = j14;
        this.f39411f = z11;
        this.f39412g = z12;
        this.f39413h = z13;
        this.f39414i = z14;
    }

    public a1 a(long j11) {
        return j11 == this.f39408c ? this : new a1(this.f39406a, this.f39407b, j11, this.f39409d, this.f39410e, this.f39411f, this.f39412g, this.f39413h, this.f39414i);
    }

    public a1 b(long j11) {
        return j11 == this.f39407b ? this : new a1(this.f39406a, j11, this.f39408c, this.f39409d, this.f39410e, this.f39411f, this.f39412g, this.f39413h, this.f39414i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f39407b == a1Var.f39407b && this.f39408c == a1Var.f39408c && this.f39409d == a1Var.f39409d && this.f39410e == a1Var.f39410e && this.f39411f == a1Var.f39411f && this.f39412g == a1Var.f39412g && this.f39413h == a1Var.f39413h && this.f39414i == a1Var.f39414i && ts.p0.c(this.f39406a, a1Var.f39406a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f39406a.hashCode()) * 31) + ((int) this.f39407b)) * 31) + ((int) this.f39408c)) * 31) + ((int) this.f39409d)) * 31) + ((int) this.f39410e)) * 31) + (this.f39411f ? 1 : 0)) * 31) + (this.f39412g ? 1 : 0)) * 31) + (this.f39413h ? 1 : 0)) * 31) + (this.f39414i ? 1 : 0);
    }
}
