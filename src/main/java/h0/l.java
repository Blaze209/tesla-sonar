package h0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f70137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f70138b;

    l(long j11, long j12) {
        this.f70137a = j11;
        this.f70138b = j12;
    }

    long a() {
        return this.f70138b;
    }

    long b() {
        return this.f70137a;
    }

    @NonNull
    public String toString() {
        return this.f70137a + "/" + this.f70138b;
    }

    l(double d11) {
        this((long) (d11 * 10000.0d), 10000L);
    }
}
