package io.sentry.android.core;

/* JADX INFO: loaded from: classes9.dex */
final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f79652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f79653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f79654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f79655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f79656e;

    public void a(long j11, long j12, boolean z11, boolean z12) {
        this.f79656e += j11;
        if (z12) {
            this.f79655d += j12;
            this.f79653b++;
        } else if (z11) {
            this.f79654c += j12;
            this.f79652a++;
        }
    }

    public int b() {
        return this.f79653b;
    }

    public long c() {
        return this.f79655d;
    }

    public int d() {
        return this.f79652a;
    }

    public long e() {
        return this.f79654c;
    }

    public int f() {
        return this.f79652a + this.f79653b;
    }

    public long g() {
        return this.f79656e;
    }
}
